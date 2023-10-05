package desafioIPhone.funcionalidades;

import desafioIPhone.aparelhoTelefonico.AparelhoTelefonico;
import desafioIPhone.navegadorInternet.NavegadorInternet;
import desafioIPhone.reprodutorMusical.ReprodutorMusical;
import desafioIPhone.smartPhone.SmartPhone;

public class Iphone {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        NavegadorInternet navegadorInternet = smartPhone;
        AparelhoTelefonico aparelhoTelefonico = smartPhone;
        ReprodutorMusical reprodutorMusical = smartPhone;

        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.inciarCorreioVoz();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
    }
}
