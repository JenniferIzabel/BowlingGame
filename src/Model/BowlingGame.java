/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Observable;

/**
 *
 * @author a1136976 - Jennifer
 */
public class BowlingGame extends Observable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private int jogada = 0;
    private int pontos[] = new int[21];
    public String acao = "";
    public String strikeSpare = "";

    public String getStrikeSpare() {
        return strikeSpare;
    }

    public String getAcao() {
        return acao;
    }

    public int[] getPontos() {
        return pontos;
    }

    public int getUmDosPontos(int i) {
        return pontos[i];
    }
    int contStrike = 0;
    int contSpare = 0;

    public int getScore() {
        int somaTotal = 0;
        for (int i = 0; i < jogada; i++) {
            somaTotal += pontos[i];
            acao = "";
            if (pontos[i] == 10) {
                int somaRodada = 0;
                somaRodada += pontos[i + 1];
                somaRodada += pontos[i + 2];
                somaTotal += somaRodada;
                contStrike++;
                acao = "Strike!!";

            } else if (i % 2 == 1) {
                int somaRodada = 0;
                somaRodada += pontos[i];
                somaRodada += pontos[i - 1];
                if (somaRodada == 10) {
                    somaTotal += pontos[i + 1];
                    contSpare++;
                    acao = "Spare!!";
                }
            }
            strikeSpare = "Spare:  " + contSpare + "\nStrike: " + contStrike;

        }
        return somaTotal;
    }

    public void roll(int i) {
        if (jogada == 20) {
            return;
        }
        pontos[jogada] = i;

        if (i == 10) {
            pontos[jogada + 1] = 0;
            jogada++;
        }
        jogada++;

    }

}
