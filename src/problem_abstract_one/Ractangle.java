package problem_abstract_one;

public class Ractangle extends Shape {

    //num1, num2 here
    Ractangle(double num1, double num2){
        super(num1 , num2);
    }

    @Override
    void area() {
        double result = num1 * num2;
        System.out.println("Ractangle is: "+result);
    }
}
