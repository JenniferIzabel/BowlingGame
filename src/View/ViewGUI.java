/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.BowlingGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author a1136976
 */
public class ViewGUI extends JFrame implements View {

    Container cp = getContentPane();

    JPanel pnCentro = new JPanel();

    JLabel lbBoliche = new JLabel("JOGO DE BOLICHE");
    JLabel lbJogada = new JLabel("Digite o valor da jogada: ");
    JTextField tfJogada = new JTextField();
    JLabel lbErro = new JLabel("");
    JButton btOk = new JButton("Jogar!");
    JLabel lbAJogada = new JLabel("");
    JLabel lbAAJogada = new JLabel("Faça uma jogada");
    JLabel lbPontos = new JLabel("Total de Pontos:");
    JLabel lbOsPontos = new JLabel("0");
    JLabel lbAcao = new JLabel("");
    JLabel lbStrikeSpare = new JLabel("");

    int contador = 0;

    public void  atualizarCampos(boolean erro, boolean ajogada, boolean aajogada, boolean pontos, boolean acao){
        //implementar
    }
    
    public ViewGUI() {

        setSize(600, 450);
        setTitle("Jogo de Boliche");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        pnCentro.setBackground(Color.WHITE);
        pnCentro.setOpaque(true);

        pnCentro.setLayout(new GridBagLayout());
        pnCentro.setPreferredSize(new Dimension(200, 0));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(30, 5, 30, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
//        gbc.anchor = GridBagConstraints.CENTER; 
        pnCentro.add(lbBoliche, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        pnCentro.add(lbJogada, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        pnCentro.add(tfJogada, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.ipadx = 20;
        pnCentro.add(btOk, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        pnCentro.add(lbErro, gbc);

        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        pnCentro.add(lbAJogada, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        pnCentro.add(lbAAJogada, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        pnCentro.add(lbPontos, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        pnCentro.add(lbOsPontos, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        lbAcao.setOpaque(true);
        lbAcao.setBackground(Color.green);
        gbc.insets = new Insets(30, 5, 60, 5);
        pnCentro.add(lbStrikeSpare, gbc);///colocar os negocios aqui
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        lbAcao.setOpaque(true);
        lbAcao.setBackground(Color.green);
        pnCentro.add(lbAcao, gbc);

        cp.setLayout(new BorderLayout());
        cp.add(pnCentro, BorderLayout.CENTER);

        setVisible(true);
        

        BowlingGame bowlingGame = new BowlingGame();
        btOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfJogada.requestFocus();
                tfJogada.selectAll();
                try {
                    int aux = Integer.parseInt(tfJogada.getText());
                    lbErro.setText("");
                    if (Integer.parseInt(tfJogada.getText()) > 10) {
                        lbErro.setText("Digite um valor válido para a jogada");
                    } else {
                        contador++;
                        bowlingGame.roll(Integer.parseInt(tfJogada.getText()));
                        lbOsPontos.setText(bowlingGame.getScore() + "");
                        lbAJogada.setText("Jogada: ");
                        lbAAJogada.setText(contador + "");
                        lbAcao.setText(bowlingGame.getAcao());
                        if (contador == 21) {
                            lbPontos.setBackground(Color.green);
                            lbOsPontos.setBackground(Color.green);
                            lbAJogada.setBackground(Color.green);
                            lbAAJogada.setBackground(Color.green);
                            lbAJogada.setText("FIM DE JOGO");
                            lbAAJogada.setText("");
                            tfJogada.setEnabled(false);
                            btOk.setEnabled(false);
                        }
                    }
                } catch (Exception e1) {
                    lbErro.setText("Digite um número Inteiro");
                    tfJogada.requestFocus();
                    tfJogada.selectAll();
                }

            }
        });
    }

    @Override
    public void start() {
        setVisible(true);

    }

    @Override
    public void addController(ActionListener controller) {

    }

    @Override
    public void update(Observable obs, Object obj) {

    }
    
    public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		}
	}

}
