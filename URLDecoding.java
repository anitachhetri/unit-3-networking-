import java.net.*;
import java.nio.charset.StandardCharsets;

public class URLDecoding {
    
    public static void main(String[] args) {
        try {
            String encodedFilename = "report+%231.pdf";
            String decodedFilename = URLDecoder.decode(encodedFilename, StandardCharsets.UTF_8);
            
            System.out.println("Encoded Filename:" + encodedFilename);
            System.out.println("Decoded filename:" + decodedFilename);
            
        } catch (Exception e) {
            System.err.println("An error occured:"+e.getMessage());
        }
    }
}
