package multiple_inheritance;

public class ClassC implements ClassA,ClassB {

    @Override
    public void doing() {
        System.out.println("Hello, I'm Okay");
    }
}
