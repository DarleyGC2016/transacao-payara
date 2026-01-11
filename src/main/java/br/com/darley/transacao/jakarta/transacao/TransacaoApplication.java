package br.com.darley.transacao.jakarta.transacao;

import jakarta.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ws.rs.ApplicationPath;

@OpenAPIDefinition(
    info = @Info(title = "Transacao API",
     version = "1.0.0",
     description = "API para gerenciamento de transações bancarias",
     contact = @Contact(
         name = "Darley",
         email = "garciacardoso.darley@gmail.com")
         )
     )
     @DataSourceDefinition(
    name = "jdbc/postgres_ds",
    className = "org.postgresql.ds.PGSimpleDataSource", 
    portNumber = 5432,
    serverName = "localhost",   
    databaseName = "transacao_db",
    user = "postgres",
    password = "sqlp_890a"
     )
@ApplicationPath("/rest")
public class TransacaoApplication extends Application {
    // CORS configurado via CORSFilter
    public static void main(String[] args) {
        
    }
}
