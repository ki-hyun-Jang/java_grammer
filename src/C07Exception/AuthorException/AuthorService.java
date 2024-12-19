package C07Exception.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심 로직을 구현하는 계층
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService() {
        this.authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password) {
        if (authorRepository.findByEmail(email).isPresent()) {
            throw new NoSuchElementException("중복된 이메일입니다.");
        } else if (password.length() < 8) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다. 8자리 이상으로 설정해주세요.");
        } else {
            Author author = new Author(name, email, password);
            this.authorRepository.register(author);
            System.out.println("회원가입이 완료되었습니다.");
        }

    }

    public void login(String email, String password) {
        Optional<Author> optAuthor = this.authorRepository.findByEmail(email);
        if (optAuthor.isPresent()) {
            Author a = optAuthor.get();
            if (a.getPassword().equals(password)) {
                System.out.println("로그인 성공");
            } else {
                throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
            }
        } else {
            throw new IllegalArgumentException("없는 아이디입니다.");
        }
    }

    public void findAll() {
        List<Author> authors = this.authorRepository.findAll();
        for (Author a : authors) {
            System.out.println(a.toString());
        }
    }

}
