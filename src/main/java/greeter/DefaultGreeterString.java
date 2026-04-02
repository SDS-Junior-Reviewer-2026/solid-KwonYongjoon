package greeter;

public class DefaultGreeterString implements GreeterString {

    @Override
    public String getGreeterString() {
        return "Hello.";
    }
}
