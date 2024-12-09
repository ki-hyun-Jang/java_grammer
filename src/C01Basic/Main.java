package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static class User{
        String name;
        int age;
        int index;

        User(String name, int age, int index){
            this.name = name;
            this.age = age;
            this.index = index;
        }

        public int getAge() {
            return age;
        }

        public int getIndex() {
            return index;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<User> users = new ArrayList<>();

        for(int i = 0; i<n; i++){
            String[] inputs = br.readLine().split(" ");
            users.add(new User(inputs[1], Integer.parseInt(inputs[0]), 1));
        }

//        Comparator<User> reverseName = Comparator.comparing(User::getName).reversed();
        users.sort(Comparator.comparing(User::getAge).thenComparing(User::getIndex));

        StringBuilder sb = new StringBuilder();

        for(User user: users) sb.append(Integer.toString(user.age)+" "+user.name+"\n");

        System.out.println(sb);

    }
}
