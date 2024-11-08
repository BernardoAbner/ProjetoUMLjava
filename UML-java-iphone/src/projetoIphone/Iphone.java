package projetoIphone;

import projetoIphone.celular.Celular;

public class Iphone {
 public static void main(String[] args) {
    Celular iphone = new Celular();

    iphone.ligar("27 99999-9999");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.selecionarMusica("HUMBLE. Kendrick Lamar");
    iphone.tocar();
    iphone.pausar();

    iphone.exibirPagina("//https:www.dio.me");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

 }

}