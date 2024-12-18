package C05AnonymousLambda;

import java.util.*;

public class C0504StreamApi {
    public static void main(String[] args) {

////        Stream의 소모 foreach(출력) reduce(누적) sum(합)
//        int[] intarr= {10,20,30,40};
//        Arrays.stream(intarr).forEach(a-> System.out.println(a));
//        int total = Arrays.stream(intarr).sum();
//        System.out.println(total);
////        optional객체: 값이 있을 수도 없을 수도 있음을 명시한 객체
//        int max = Arrays.stream(intarr).max().getAsInt();
//        int min = Arrays.stream(intarr).min().getAsInt();
//        long count = Arrays.stream(intarr).count();
//
////        reduce: 누적연산, reduce(초기값,연산식)
//        int allAdd = Arrays.stream(intarr).reduce(0, (a,b) -> a+b);
//        System.out.println(allAdd);
//        String[] strArr = {"hello","java","world"};
//        String myStr = Arrays.stream(strArr).reduce("",(a,b) -> a+b+" ");
//        System.out.println(myStr);
////        findFirst: 첫 번째 요소 반환
//        String first = Arrays.stream(strArr).filter(a-> a.length()>=5).findFirst().get();
//        System.out.println(first);
//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim",20));
//        students.add(new Student("choi",32));
//        students.add(new Student("lee",35));
//        students.add(new Student("park",22));
//        Double avgAge =  students.stream().mapToInt(Student::getAge).average().getAsDouble();
//        Student minAge = students.stream().sorted((a,b) -> a.getAge()-b.getAge()).findFirst().get();
//        String[] strArr2= students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(a->new String[a]);
//        System.out.println(Arrays.toString(strArr2));
//
//        //        메소드참조 :하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식, 클래스명::메서드명
//        students.stream().forEach(System.out::println);
//        String[] arr = students.stream().map(a->a.getName()).toArray(String[]::new);
//
////        Optional객체: 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        String st1 = null;
//        Optional<String> opt1 = Optional.ofNullable("hello");
//        if(st1 != null){
//            System.out.println(st1.compareTo("hello"));
//        }else{
//            System.out.println("값이 없음");
//        }
//
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }else {
//            System.out.println("값이 없음");
//        }

//        Optional객체 생성 방법 3가지
//        Optional<String> opt1 = Optional.empty(); // 비어있는 Optional객체 생성
//        Optional<String> opt2 = Optional.ofNullable(null); // 비어있는 Optional객체 생성
//        Optional<String> opt2_1 = Optional.ofNullable("hello"); // 값이 있는 Optional객체 생성
//        Optional<String> opt3 = Optional.of("hello"); // 값이 있는 경우만 Optional.of 생성 가능

//        Optional객체 처리 방법 4가지
////        방법1. isPresent()를 통해 확인 후에 get()
//        if(opt2.isPresent()){
//            System.out.println(opt2.get());
//        }else{
//            System.out.println("값이 없습니다.");
//        }
//
////        방법2. orElse(): 값이 있으면 있는 값 리턴, 없으면 지정 값 리턴
//        System.out.println(opt2.orElse("none"));
//
////        방법3. orElseGet(): 값이 있으면 있는 값 리턴, 없으면 람다함수 실행
//        System.out.println(opt2.orElseGet(()-> new String("none")));
//
////        방법4. orElseThrow: 값이 있으면 있는 값 리턴, 없으면 지정된 예외 강제 발생.
////        개발에서 사용자에게 적절한 메세지 전달 목적과 의도된 코드중단을 목표로 강제로 예외를 발생시키는 경우가 많음.
//        System.out.println(opt2.orElseThrow(()-> new NoSuchElementException("값이 없어요")));

//        예시1.
        List<Student> students = new ArrayList<>();
//        OptionalDouble opt_avg = students.stream().mapToInt(a->a.getAge()).average();
//        if(opt_avg.isPresent()){
//            System.out.println(opt_avg.getAsDouble());
//        }else{
//            throw new NoSuchElementException("값이 없습니다.");
//        }
        System.out.println(students.stream().mapToInt(a->a.getAge()).average().orElseThrow(()-> new NoSuchElementException("값이 없습니다.")));

//        예시2. DB조회 상황
        System.out.println("조회할 id입력");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        Optional<Student> myStudent;
        if(id<10){
            myStudent = Optional.of(new Student("hong",20));
        }else{
            myStudent = Optional.empty();
        }
//        Student가 있으면 student출력. 없으면 "해당학생은 없습니다."라고 에러메세지와 함께 에러 강제 발생
        System.out.println(myStudent.orElseThrow(()-> new NoSuchElementException("값이 없습니다.")));
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

////    정렬은 결국 2개의 값을 비교하는 것이므로, a와 b 대상 2개만 있으면 충분.
////    두 수(또는 문자) 비교의 경우 음수, 0, 양수 세 값중에 하나만 return되게 되고, 이를 통해 정렬이 이루어짐.
////    기준이 되는 A(this)가 앞에 있을땐 오름차순, 뒤에 있으면 내림차순으로 내부적으로 정렬로직 동작.
//    @Override
//    public int compareTo(Student o) {
//        return o.getName().compareTo(this.getName());
//    }

    //    객체 호출시에 자동으로 메모리주소가 아닌 내용이 출력되게 하려면 toString메서드 구현.
//    java의 모든 클래스는 조상클래스인 Object클래스를 상속하고, 아래의 override는 Object클래스의 toString메서드를 구현한것.
    @Override
    public String toString() {
        return "이름은 " + this.name + " 나이는 "+ this.age;
    }
}