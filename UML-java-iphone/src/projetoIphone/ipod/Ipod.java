package projetoIphone.ipod;

public class Ipod implements ReprodutorMusica {

    public void tocar(){
    System.out.println("Tocando música no dispotivo...");
    }

    public void pausar(){
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada." + musica);
    }
    
}
