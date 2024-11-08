package projetoIphone.navegador;

public class Safari implements Navegador {

    public void exibirPagina(String url){
        System.out.println("Exibindo página web" + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no Safari...");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
    
}
