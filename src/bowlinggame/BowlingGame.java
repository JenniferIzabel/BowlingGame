/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlinggame;

/**
 *
 * @author a1136976 - Jennifer
 */
public class BowlingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private int jogada = 0;
    private int pontos[] = new int[21];

    public int getScore() {
        int somaTotal = 0;
        for (int i = 0; i < pontos.length - 1; i++) {
            somaTotal += pontos[i];
            
            if (pontos[i] == 10) {
                int somaRodada = 0;
                somaRodada += pontos[i + 1];
                somaRodada += pontos[i + 2];
                somaTotal += somaRodada;

            } else if (i % 2 == 1) {
                int somaRodada = 0;
                somaRodada += pontos[i];
                somaRodada += pontos[i - 1];
                if (somaRodada == 10) {
                    somaTotal += pontos[i + 1];
                }
            }
        }
        return somaTotal;
    }

    public void roll(int i) {
        pontos[jogada] = i;

        if (i == 10) {
            pontos[jogada + 1] = 0;
            jogada++;
        }
        jogada++;

    }

}
