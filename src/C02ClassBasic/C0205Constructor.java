package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calender c = new Calender(2024,12,11);
        System.out.println("오늘은 "+ c.getYear() +"연도 " + c.getMonth() + "월 " + c.getDay() + "일입니다.");
    }
}

class Calender{
    private int year;
    private int month;
    private int day;
//    생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
//    생성자를 통해 객체변수 값들을 객체가 만들어지는 시점에 초기화(세팅)

    public Calender(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    별도의 생성자를 만들 경우, 초기 생성자는 더 이상 사용할 수 없으므로 별도로 추가해야함.
    public Calender(){}

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }


    public int getDay() {
        return day;
    }

}