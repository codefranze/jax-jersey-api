package exemplo.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/exemplo")
public class Hello {

	@GET
	@Produces({MediaType.APPLICATION_JSON })
	public Response getMessage(){
		
		return Response.status(200)
		               .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
		               .entity("{\"data\":[{\"produto\": \"teste\"},{\"produto\": \"teste\"}]}")
		               .build();
		
	}
	
}
