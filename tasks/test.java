import java.io.IOException;

public class test {
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");
            } finally {
                throw new IOException("b");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
}
