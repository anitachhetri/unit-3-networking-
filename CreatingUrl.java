import java.net.*;

public class CreatingUrl{
    public static void main (String[] args){
        try{
            URI uri=new URI("https://example.com/page.html");
            URL url = uri.toURL();
            System.out.println("URL:" +url);
            // this is adeded
        }
        catch(Exception e){
       System.out.println("An error occurred:" + e.getMessage());
        }
    }
}