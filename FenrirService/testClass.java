import static spark.Spark.*;

public class testClass {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}