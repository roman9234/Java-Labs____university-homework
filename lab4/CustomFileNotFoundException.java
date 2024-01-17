import java.io.FileNotFoundException;
public class CustomFileNotFoundException extends FileNotFoundException {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}
