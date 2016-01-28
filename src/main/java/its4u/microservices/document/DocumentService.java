package lu.its4u.microservices.document;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("document")
@Produces({MediaType.APPLICATION_JSON})
public class DocumentService {

    @GET
    @Path("{documentId}")
    public Document getDocument(@PathParam("documentId") String id) {
        Document document = new Document();
        document.setId(id);
        document.setTitle("Title " + id);
        document.setText("Blablabla " + id);
        return document;
    }
}
