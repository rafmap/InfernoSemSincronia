package com.example.client_servertcp_pingpong.model;

import java.io.Serializable;

public class Jogador implements Serializable {
    private String IP;//endereço IP do jogador
    private String porta;//porta do jogador
    private String CEP;//CEP onde está o jogador
    private String CEPOponente;//CEP passado pelo jogador oponente
    private int nPontos;//número de pontos do jogador
    private int nPontosOponente;//número de pontos do jogador oponente
    private int nTentativas;//número de tentativas do jogador
    private int tempoDoJogador;//tempo que se passou desde que o jogador começou a jogar até acertar o CEP
    private boolean isServer;//se o jogador não for servidor, é um cliente
    private boolean isOpponentConnected;//se o jogador oponente está conectado
    private boolean isMorlock;//se o jogador não for um Morlock, é um Eloi
    private boolean isReady;//se o jogador está pronto para iniciar o jogo
    private boolean isOpponentReady;//se o oponente está pronto para iniciar o jogo
    private boolean isFinished;//se o jogador já acertou o CEP
    private boolean isOpponentFinished;//se o jogador oponente já acertou o CEP
    private boolean isGameStarted;//se o jogador server já iniciou o jogo

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCEPOponente() {
        return CEPOponente;
    }

    public void setCEPOponente(String CEPOponente) {
        this.CEPOponente = CEPOponente;
    }

    public int getnPontos() {
        return nPontos;
    }

    public void setnPontos(int nPontos) {
        this.nPontos = nPontos;
    }

    public int getnPontosOponente() {
        return nPontosOponente;
    }

    public void setnPontosOponente(int nPontosOponente) {
        this.nPontosOponente = nPontosOponente;
    }

    public int getnTentativas() {
        return nTentativas;
    }

    public void setnTentativas(int nTentativas) {
        this.nTentativas = nTentativas;
    }

    public int getTempoDoJogador() {
        return tempoDoJogador;
    }

    public void setTempoDoJogador(int tempoDoJogador) {
        this.tempoDoJogador = tempoDoJogador;
    }

    public boolean isServer() {
        return isServer;
    }

    public void setServer(boolean server) {
        isServer = server;
    }

    public boolean isOpponentConnected() {
        return isOpponentConnected;
    }

    public void setOpponentConnected(boolean opponentConnected) {
        isOpponentConnected = opponentConnected;
    }

    public boolean isMorlock() {
        return isMorlock;
    }

    public void setMorlock(boolean morlock) {
        isMorlock = morlock;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public boolean isOpponentReady() {
        return isOpponentReady;
    }

    public void setOpponentReady(boolean opponentReady) {
        isOpponentReady = opponentReady;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public boolean isOpponentFinished() {
        return isOpponentFinished;
    }

    public void setOpponentFinished(boolean opponentFinished) {
        isOpponentFinished = opponentFinished;
    }

    public boolean isGameStarted() {
        return isGameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        isGameStarted = gameStarted;
    }
}
