package C07Exception.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    public void register(Author author) {
        authorList.add(author);
    }

    public Optional<Author> findByEmail(String email) {
        return authorList.stream().filter(a -> a.getEmail().equals(email)).findFirst();
    }

    public List<Author> findAll() {
        return authorList;
    }

}
