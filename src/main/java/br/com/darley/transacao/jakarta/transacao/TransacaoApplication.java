package br.com.darley.transacao.jakarta.transacao;

import jakarta.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

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
@ApplicationPath("/rest")
public class TransacaoApplication extends Application {
    // CORS configurado via CORSFilter
}
