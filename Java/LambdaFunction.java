import javax.crypto.AEADBadTagException;

interface car {
    void drive(int age);
}

// lambda Expression
// we can use lambda expression only to the Functional interface -> which have
// only one abstract method
// and for the less coding
// syntax
// (parameter list) -> {};i

public class LambdaFunction {
    public static void main(String[] args) {
        car c = (int age) -> {
            System.out.println("Driving at age" + age);

        };

        c.drive(18);
    }
}
