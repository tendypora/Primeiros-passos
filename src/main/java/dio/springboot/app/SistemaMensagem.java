package dio.springboot.app;

import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    public void enviarConfirmacaoCadastro() {
        System.out.println("Confirmação de cadastro enviada com sucesso!");
    }

    public void enviarMensagemBoasVindas() {
        System.out.println("Bem-vindo ao sistema!");
    }
}
