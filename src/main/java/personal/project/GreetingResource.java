package personal.project;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import personal.project.domain.Creator;
import personal.project.domain.Document;
import personal.project.domain.enums.DocumentType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Document hello() {
        return new Document(
                1L, 12345678910L, DocumentType.CPF, new Creator()
        );
    }
}
