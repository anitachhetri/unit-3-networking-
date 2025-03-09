import java.net.*;

// import javax.print.DocFlavor.URL;

public class ConvertingToString {
    public static void main(String[] args)throws Exception {

        URI uri = new URI("https://example.com:808/blog/article.html");

        URL url = uri.toURL();

        System.out.println("To String:"+ url.toString());
        System.out.println("To External form:"+ url.toExternalForm());
        

        
    }
}