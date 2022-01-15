package src;

public class MethodReferenceExample {
    
    public static void main(String[] args) {
        Thread t  = new Thread(MethodReferenceExample::printMessage);
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello world");
    }
}


/**
 * Can use method reference inside lambda in following cases
 * 1. () -> someFunc() 
 * 2. (p) -> someFunc(p)
 * 
 * Depending on type of function, syntax for method reference changes
 * className.staticMethod -> className :: staticMethod
 * instance.nonStaticMethod -> instance :: nonStaticMethod
 */