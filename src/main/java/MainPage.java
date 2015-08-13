import static spark.Spark.*;
public class MainPage {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
