package br.com.fiap.porto.controller;

import java.io.IOException;
import br.com.fiap.porto.model.entity.Cliente;
import br.com.fiap.porto.model.repository.ClienteRepository;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;
import jakarta.ws.rs.ext.Provider;

@Provider
@Path("/porto/cliente")
public class ClienteResource  implements ContainerResponseFilter {

	@POST
	@Path("/porto/cliente")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Cliente cliente) {
		Cliente resposta = ClienteRepository.save(cliente);
		ResponseBuilder response = null;
		if (resposta != null) {
			response = Response.created(null); // 201 - Created
		} else {
			response = Response.status(400); // 400 - Bad Request 
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
