package desafioIPhone.smartPhone;

import desafioIPhone.aparelhoTelefonico.AparelhoTelefonico;
import desafioIPhone.navegadorInternet.NavegadorInternet;
import desafioIPhone.reprodutorMusical.ReprodutorMusical;

public class SmartPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Liga para numero : ");
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada");

    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("Gravar uma correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Mostrar noticas do dia ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir nova aba de pesquisa");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar noticias da Hora");

    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocar música selecionada");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }
}
