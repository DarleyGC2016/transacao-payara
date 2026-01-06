package br.com.darley.transacao.jakarta.transacao.resources;

import java.time.LocalDateTime;

import br.com.darley.transacao.jakarta.transacao.model.Transacao;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("financeiro")
public class TransacaoResource {

    @Path("/bemvindo")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Transacao bemVindo() {
      
        return new Transacao(12.34, LocalDateTime.now().atOffset(java.time.ZoneOffset.UTC));
    }
}
