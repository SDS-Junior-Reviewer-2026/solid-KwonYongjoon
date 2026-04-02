package greeter;

public class Greeter {
    String formality;

    public String greet() {
        GreeterStringFactory factory = new GreeterStringFactory();
        return factory.create(formality).getGreeterString();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}