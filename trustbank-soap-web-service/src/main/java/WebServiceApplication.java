import jakarta.xml.ws.Endpoint;
import service.AddServiceImpl;

public class WebServiceApplication {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/add", new AddServiceImpl());
    }


}
