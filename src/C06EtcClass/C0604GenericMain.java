package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {
        String[] strArr = {"java", "python", "C"};
        strChange(strArr,0,1);
        System.out.println(Arrays.toString(strArr));

        Integer[] intArr = {10,20,30};
        intChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr));

//        제네릭을 활용한 메서드
        genericChange(intArr, 1, 2);
        genericChange(strArr, 1, 2);

        Person p1 = new Person("hong");
        System.out.println(p1.getValue());

//        제네릭을 사용하여 범용적 클래스(객체) 생성
        GenericPerson<Integer> p2 = new GenericPerson<>(10);
        System.out.println(p2.getValue());

//        제네릭의 사용예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        Optional<Integer> optionalInt;
    }


//    제네릭메서드는 반환타입 왼쪽에 <T>을 선언해야 한다.
//    유의점으로는 T에는 참조형변수인 객체타입이 들어와야 함.
    static <T> void genericChange(T[] arr, int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void strChange(String[] arr, int index1, int index2){
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void intChange(Integer[] arr, int index1, int index2){
        Integer temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

// 제네릭클래스는 클래스명 옆에 <T>선언
class GenericPerson <T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Person{
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
