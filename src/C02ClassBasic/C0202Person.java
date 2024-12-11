package C02ClassBasic;

public class C0202Person {
//    private접근제어자는 해당 클래스내에서만 접근 가능
//    클래스에서 객체변수는 인발적으로 변수의 안정성을 위해 private으로 설정
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void eating(){
        System.out.println(this.name+"님이 식사를 하고 있습니다.");
    }

    public String whoIs(){
        return "이름은 "+ this.name+"입니다." + "나이는 "+ this.age+"살 입니다." + "이메일은"+ this.email+"입니다.";
    }
}
