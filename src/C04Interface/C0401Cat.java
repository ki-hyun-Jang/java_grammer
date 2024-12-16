package C04Interface;

public class C0401Cat implements C0401AnimalInterface1{

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class C0401CatMultiImpl implements C0401AnimalInterface1, C0401AnimalInterface2{

    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }

    @Override
    public String play(String a, String b) {
        return a+"와 "+b+"가 서로 그루밍을 합니다.";
    }
}