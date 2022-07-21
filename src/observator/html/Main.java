package observator.html;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.subscribe(() -> System.out.println("click!"));
    }
}
