package problem_abstract_one;

public class Main {

    public static void main(String[] args) {
        Shape shape;
        shape = new Ractangle(10,20);
        shape.area();

        shape = new Triangle(10,20);
        shape.area();

        shape = new Circle(10);
        shape.area();
    }

}
