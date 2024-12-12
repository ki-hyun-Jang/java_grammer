package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class BoardService {
    private boolean bool = true;
    static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    Map<String,Author> authorMap = new HashMap<>();
    Map<Integer,Post> postMap = new HashMap<>();
    Set<String> authorEmails = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BoardService boardService = new BoardService();
        while(boardService.bool){
            System.out.println("서비스 번호를 입력해주세요.");
            System.out.println("1.회원가입 2.회원 전체조회 3.회원 상세조회 4.게시글 작성 5.게시물 목록조회 6.게시물 상세조회 7.종료");
            int serviceNum = Integer.parseInt(boardService.checkNum(br.readLine()));
            switch (serviceNum){
                case 1: boardService.signUp(); break;
                case 2: boardService.authorFullSearch(); break;
                case 3: boardService.authorDetailInquiry(); break;
                case 4: boardService.writePost(); break;
                case 5: boardService.postFullSearch(); break;
                case 6: boardService.postDetailSearch(); break;
                case 7: boardService.bool = false; break;
                default: System.out.println("잘못 입력했습니다.");
            }
        }
    }

//    1.회원가입
    void signUp() throws IOException {
        System.out.println("회원가입을 선택하셨습니다.");
        System.out.println("사용하실 이메일을 작성해주세요.");
        String email = emailPattern(br.readLine());
        System.out.println("사용 가능한 이메일입니다.");
        System.out.println("---------------------");
        System.out.println("성함을 입력해주세요.");
        String name = namePattern(br.readLine());
        System.out.println("---------------------");
        System.out.println("패스워드를 입력해주세요.");
        String password = checkNullString(br.readLine());
        System.out.println("패스워드 확인. 다시 한 번 입력해주세요.");
        String password2= br.readLine();
        password = passwordCheck(password,password2);
        System.out.println("---------------------");
        authorMap.put(email,new Author(name,email,password));
        authorEmails.add(email);
        System.out.println("회원가입이 완료되었습니다.");
    }

//    2. 회원 전체조회
    void authorFullSearch(){
        System.out.println("회원 전체조회를 선택하셨습니다.");
        System.out.println("현재 회원 내역입니다.");
        if (authorMap.isEmpty()) System.out.println("회원이 없습니다.");
        for(Author a : authorMap.values()) {
            System.out.println("---------------------");
            System.out.println("ID: "+ a.getId());
            System.out.println("E-Mail: " + a.getEmail());
        }
    }

//    3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
    void authorDetailInquiry() throws IOException {
        System.out.println("회원 상세조회를 선택하셨습니다.");
        System.out.println("조회하실 회원 ID를 입력해주세요.");
        int authorId = Integer.parseInt(checkNum(br.readLine()));
        String email = "";
        for(Author a: authorMap.values()){
            if (authorId==a.getId()) email=a.getEmail();
        }
        if (!authorMap.containsKey(email)) System.out.println("해당 회원은 존재하지 않습니다.");
        else {
            Author a = authorMap.get(email);
            System.out.println("회원 ID: " + a.getId());
            System.out.println("회원 email: " + a.getEmail());
            System.out.println("회원 이름: " + a.getName());
            System.out.println("회원 비밀번호: " + a.getPassword());
            System.out.println("회원의 글 작성 수: " +a.getPostCount());

        }

    }

//    4. 게시글 작성
//     제목, 내용, 작성자Email -> author_id를 찾아서 author_id로
    void writePost() throws IOException {
        System.out.println("작성자 이메일을 입력해주세요.");
        String email = checkContainEmail(br.readLine());
        System.out.println("제목을 입력해주세요.");
        String title = checkNullString(br.readLine());
        System.out.println("내용을 입력해주세요.");
        String contents = checkNullString(br.readLine());
        int id = authorMap.get(email).getId();
        postMap.put(Post.staticId,new Post(id,title,contents));
        authorMap.get(email).PlusPostCount();
        System.out.println("글 작성이 완료되었습니다.");
    }

//    5.게시물 목록 조회 : id(post), title
    void postFullSearch(){
        if (postMap.isEmpty()) System.out.println("작성된 글이 없습니다.");
        for(Post p : postMap.values()){
            System.out.println("---------------------");
            System.out.println("작성자 ID: "+ p.getId());
            System.out.println("글 제목: " + p.getTitle());
        }
    }

//    6.게시물 상세 조회 : id(post), title, contents, 작성자email
    void postDetailSearch() throws IOException {
        System.out.println("게시물 상세조회를 선택하셨습니다.");
        System.out.println("조회하실 게시물 ID를 입력해주세요.");
        int postId = Integer.parseInt(checkNum(br.readLine()));
        if (!postMap.containsKey(postId)) System.out.println("해당 게시물은 없습니다.");
        else {
            Post p = postMap.get(postId);
            String email = "";
            for(Author a: authorMap.values()){
                if (p.getAuthorId()==a.getId()) email=a.getEmail();
            }
            System.out.println("글ID: " + p.getId());
            System.out.println("글 제목: " + p.getTitle());
            System.out.println("글 내용: " + p.getContents());
            System.out.println("작성자 email: " + email);
        }
    }

    //    유효성 검사
//    이메일 정규식 및 중복검사
    String emailPattern(String email) throws IOException {
        String pattern = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
        while(!Pattern.matches(pattern,email)|| authorEmails.contains(email)){
            System.out.println("올바른 이메일 형식이 아니거나 중복된 이메일입니다.");
            email = br.readLine();
        }
        return email;
    }

//    이름 정규식 검사
    String namePattern(String name) throws IOException {
        String pattern = "^[가-힣]*$";
        while(!Pattern.matches(pattern,name)){
            System.out.println("이름은 한글만 가능합니다.");
            name = br.readLine();
        }
        return name;
    }

//    비밀번호 확인
    String passwordCheck(String password, String password2) throws IOException {
        while (!password.equals(password2)){
            System.out.println("비밀번호가 일치하지 않습니다.");
            System.out.println("비밀번호를 입력해주세요.");
            password = checkNullString(br.readLine());
            System.out.println("비밀번호 확인. 다시 한 번 입력해주세요.");
            password2= br.readLine();
        }
        System.out.println("비밀번호가 일치합니다.");
        return password;
    }

//    값이 비었는지 확인
    String checkNullString(String str) throws IOException {
        while (str.isEmpty()){
            System.out.println("값이 비어있습니다. 다시 입력해주세요.");
            str = br.readLine();
        }
        return str;
    }

//    해당 이메일이 있는지 확인
    String checkContainEmail(String email) throws IOException {
        while (!authorEmails.contains(email)){
            System.out.println("없는 이메일입니다. 다시 입력해주세요.");
            email = br.readLine();
        }
        return email;
    }

//    정수인지 확인
    String checkNum(String n) throws IOException {
        String pattern = "^[0-9]+$";
        while(!Pattern.matches(pattern,n)){
            System.out.println("숫자만 입력이 가능합니다.");
            n = br.readLine();
        }
        return n;
    }

}

class Author{
    static int staticId;
    private int id;
    private String name;
    private String email;
    private String password;
    private int postCount;

    public Author(String name, String email, String password) {
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        staticId += 1;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void PlusPostCount(){
        this.postCount += 1;
    }
}

class Post{
    static int staticId;
    private int id;
    private int authorId;
    private String title;
    private String contents;

    public Post(int authorId, String title, String contents) {
        this.id = staticId;
        this.authorId = authorId;
        this.title = title;
        this.contents = contents;
        staticId += 1;
    }

    public int getId() {
        return id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
}

