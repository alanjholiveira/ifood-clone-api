package com.gihub.alanjholiveira.ifood.cadastro.rest;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gihub.alanjholiveira.ifood.cadastro.entity.Restaurante;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Path("/restaurantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestauranteResource {

	@GET
	public List<Restaurante> hello() {
		return Restaurante.listAll();
	}
	
	@POST
	@Transactional
	public void adicionar(Restaurante dto) {
		dto.persist();
	}
	
	@PUT
	@Path("{id}")
	@Transactional
	public void atualizar(@PathParam("id") Long id, Restaurante dto) {
		Optional<PanacheEntityBase> restaurante = Restaurante.findByIdOptional(id);
		
		if(restaurante.isEmpty()) {

		}
		
	}
}
