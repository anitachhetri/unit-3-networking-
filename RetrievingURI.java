import java.net.*;

public class RetrievingURI {
    public RetrievingURI (){
        
    }
    public static void main(String[] args) throws Exception {
        
            URI uri = new URI("https://example.com/page.html");
            System.out.println("Scheme:  " + uri.getScheme());
            System.out.println("Query:  " + uri.getQuery());
            System.out.println("Port:  " + uri.getPort());
            System.out.println("Host:  " + uri.getHost());
            System.out.println("Authority:  " + uri.getAuthority());
        
            
        }
    }
