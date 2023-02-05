package abstraction_basic;

//Abstract Class MobileUser
public abstract class MobileUser {

    //Non Abstract method
    void call(){
        System.out.println("Ringing");
    }

    ///Abstract Method
    abstract void sendMessage();
}
