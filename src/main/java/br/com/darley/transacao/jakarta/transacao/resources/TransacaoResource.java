package br.com.darley.transacao.jakarta.transacao.resources;

import java.time.LocalDateTime;

import javax.sql.DataSource;
import br.com.darley.transacao.jakarta.transacao.model.Transacao;
import jakarta.annotation.Resource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("financeiro")
public class TransacaoResource {

    @Resource(lookup = "jdbc/postgres_ds")
    private DataSource dataSource;

    @PersistenceContext
    private EntityManager em;

    @Path("/bemvindo")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Transacao bemVindo() {
        System.out.println("Recebendo requisição de transação");
        em.persist( new Transacao(12.34, LocalDateTime.now().atOffset(java.time.ZoneOffset.UTC)));
        return new Transacao(12.34, LocalDateTime.now().atOffset(java.time.ZoneOffset.UTC));
    }
}
