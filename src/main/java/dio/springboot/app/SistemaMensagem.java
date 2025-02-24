package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        enviarMensagemBoasVindas();
        enviarConfirmacaoCadastro();
    }

    public void enviarMensagemBoasVindas() {
        System.out.println("Bem-vindo ao sistema, " + remetente.getNome() + "!");
    }

    public void enviarConfirmacaoCadastro() {
        System.out.println("Mensagem enviada por: " + remetente.getNome()
                + "\nE-mail: " + remetente.getEmail() + "\nCom telefones para contato: "
                + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado!");
    }


}



/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
*/

//import org.springframework.beans.factory.annotation.Value;
//import javax.management.ConstructorParameters;
//import org.springframework.beans.factory.annotation.Autowired;
    
    /* 
    @Value("${name:NoReply-DIO}")
    private String nome;

    @Value("${remetente.nome}")
    private String email;

    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList(5555555555L));
    */
 
 
    /*    
    private String nome = "TED";
    private String email = "ted@Dio.com.br";
    private List<Long> telefone = new ArrayList<>(Arrays.asList(88L, 55L, 93333333L));
    */
 
    /*
    @Override
    public void run(String... args) throws Exception {
        enviarMensagemBoasVindas(); 
        enviarConfirmacaoCadastro(); 

    */
        
      /*   System.out.println( "Mensagem enviada por: " + nome + "\nEmail: " +  email + "\nTelefone: " + telefone);
        System.out.println("Seu Cadastro foi Aprovado");   
    }

        public void enviarMensagemBoasVindas() {
            System.out.println("Bem-vindo ao sistema, " + nome + "!");
        }

        public void enviarConfirmacaoCadastro() {
            System .out.println("Mensagem enviada por: " + nome + 
            "\nEmail: " + email + "\nTelefone" + telefones );
            System.out.println("Seu cadastro foi aprovado!");
        }
             
        */
        

        /* 
        @Autowired
        private Remetente noreply;
        */

        /*
        @Autowired
        private Remetente timeTech;
    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        timeTech.setEmail("tech@dio.com.br");
        System.out.println(timeTech);
        System.out.println("Bem-vindo ao sistema!");
    }
   */ 

