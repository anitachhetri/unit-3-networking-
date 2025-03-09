import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoding{
    public static void main(String[] args) {
        try {
            String filename = "report #1.pdf";
            String encodedFilename = URLEncoder.encode(filename,StandardCharsets.UTF_8);
            System.out.println("Original Filename:"+filename);
            System.out.println("Encoded filename:"+encodedFilename);
            
        } catch (Exception e) {
            System.err.println("An error occured:"+e.getMessage());
        }
    }
}