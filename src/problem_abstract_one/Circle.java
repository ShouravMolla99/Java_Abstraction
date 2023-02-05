package problem_abstract_one;

public class Circle extends Shape {

    Circle(double r){
        super(r,r);
    }

    @Override
    void area() {
        double result = Math.PI * num1 * num2;
        System.out.println("Triangle is: "+result);
    }
}
