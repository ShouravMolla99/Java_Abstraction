package problem_abstract_one;

public class Triangle extends Shape {

    Triangle(double num1, double num2){
        super(num1, num2);

    }

    @Override
    void area() {
        double result = 0.5 * num1 * num2;
        System.out.println("Triangle is: "+ result);
    }
}
