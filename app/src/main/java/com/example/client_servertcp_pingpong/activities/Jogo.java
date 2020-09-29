package com.example.client_servertcp_pingpong.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.client_servertcp_pingpong.R;
import com.example.client_servertcp_pingpong.model.Jogador;

public class Jogo extends AppCompatActivity {
    Jogador jogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        //Dados da Intent anterior
        Intent quemChamou = this.getIntent();
        if (quemChamou != null) {
            Bundle params = quemChamou.getExtras();
            if (params != null) {
                //Recuperando o Usuário
                jogador = (Jogador) params.getSerializable("jogador");
                if (jogador != null) {
                    Log.v("PDM", "É servidor? "+jogador.isServer());
                    Log.v("PDM", "É Morlock? "+ jogador.isMorlock());
                    Log.v("PDM", "CEP Jogador: "+ jogador.getCEP());
                    Log.v("PDM", "CEP Oponente: "+ jogador.getCEPOponente());
                    Log.v("PDM", "Nº de Pontos Jogador: "+ jogador.getnPontos());
                    Log.v("PDM", "Nº de Pontos Oponente: "+ jogador.getnPontosOponente());
                    Log.v("PDM", "Nº Tentativas: "+ jogador.getnTentativas());
                    Log.v("PDM", "Tempo: "+ jogador.getTempoDoJogador());
                    Log.v("PDM", "Jogador Terminou? "+ jogador.isFinished());
                    Log.v("PDM", "Oponente Terminou? "+ jogador.isOpponentFinished());
                }
            }
        }
    }
}