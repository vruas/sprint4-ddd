package br.com.fiap.porto.controller;

import java.io.IOException;

import br.com.fiap.porto.model.entity.Bicicleta;
import br.com.fiap.porto.model.repository.BicicletaRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/porto/bicicleta")
public class BicicletaResource implements ContainerResponseFilter {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Bicicleta bicicleta) {
		Bicicleta resposta = BicicletaRepository.save(bicicleta);
		ResponseBuilder response = null;
		if (resposta != null) {
			response = Response.created(null); // 201 - Created
		} else {
			response = Response.status(400);
		}
		response.entity(resposta);
		return response.build();
	}
	
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext ResponseContext) 
			throws IOException {
			ResponseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
			ResponseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
			ResponseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
			ResponseContext.getHeaders().add("Access-Control-Allow-Methods", "POST, OPTIONS, HEAD");
	}
}
