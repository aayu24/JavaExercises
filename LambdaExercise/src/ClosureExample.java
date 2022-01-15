package src;
public class ClosureExample {

    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 20; // b is "effectively final" since it is part of a lambda closure i.e. it is referenced in following lambda expression
        
        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
