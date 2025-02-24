package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;
import dio.springboot.app.SistemaMensagem;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}

	@Bean
	public CommandLineRunner consultaCep(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		
		};
	}

	@Bean
	public CommandLineRunner mensagensSistema(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();

		};



	}

	
}
