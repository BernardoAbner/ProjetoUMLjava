package projetoIphone.celular;

import projetoIphone.ipod.ReprodutorMusica;
import projetoIphone.navegador.Navegador;
import projetoIphone.telefone.Telefone;

public class Celular  implements ReprodutorMusica, Navegador, Telefone {

    
    public void tocar(){
    System.out.println("Tocando música no dispotivo celular...");
    }

    public void pausar(){
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }




     public void exibirPagina(String url){
        System.out.println("Exibindo página web: " + url);
    }
    
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no Safari...");
    }
    
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }

    


    public void ligar(String numero){
    System.out.println("Ligando para o número "+ numero +"... ");
}


public void atender (){
    System.out.println("Atendendo chamada...");
}

public void iniciarCorreioVoz(){
    System.out.println("Iniciando correio de voz...");
}
        
    }
    

    

