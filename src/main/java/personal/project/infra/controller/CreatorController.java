package personal.project.infra.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import personal.project.domain.dto.CreatorDTO;
import personal.project.domain.service.CreatorService;

@Path("/v1/creator")
@Consumes(MediaType.APPLICATION_JSON)
public class CreatorController {

    @Inject
    CreatorService creatorService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CreatorDTO create() {
        return creatorService.create();
    }
}
