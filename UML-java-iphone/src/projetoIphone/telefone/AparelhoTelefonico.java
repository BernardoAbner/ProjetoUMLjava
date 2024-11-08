package projetoIphone.telefone;

public class AparelhoTelefonico implements Telefone{

    public void ligar(String numero){
        System.out.println("Ligando para o número "+ numero +" ... ");
    }
    

    public void atender (){
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
}
