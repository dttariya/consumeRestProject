package consumeRestProject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;



public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //1.create a client instance using the default ClientBuilder implementation class.
		Client client=ClientBuilder.newClient();
		
		//2.set a target to the client.
		//The WebTarget interface represents a specific URI you want to invoke on. 
		//Through the Client interface, you can create a WebTarget 
		//using one of the target() methods
		
		WebTarget target=client.target("http://localhost:8080/simple-service-webapp/game/score");
		
		//3.getting response from the resource.
		System.out.println(
				target.request(MediaType.TEXT_XML).get(String.class)
		);
		}

}
