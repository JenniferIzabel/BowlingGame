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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author a1136976
 */
public class GUI extends JFrame {

    Container cp = getContentPane();

    JPanel pnCentro = new JPanel();

    JLabel lbBoliche = new JLabel("JOGO DE BOLICHE");
    JLabel lbJogada = new JLabel("Digite o valor da jogada: ");
    JTextField tfJogada = new JTextField();
    JLabel lbErro = new JLabel("");
    JButton btOk = new JButton("OK");
    JLabel lbPontos = new JLabel("Total de Pontos:");
    JLabel lbOsPontos = new JLabel("0");

    public GUI() {

        setSize(500, 300);
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

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridwidth = 1;
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        pnCentro.add(lbPontos, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        pnCentro.add(lbOsPontos, gbc);

        cp.setLayout(new BorderLayout());
        cp.add(pnCentro, BorderLayout.CENTER);

        setVisible(true);

        btOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int aux = Integer.parseInt(tfJogada.getText());
                    lbErro.setText("");
                } catch (Exception e1) {
                    lbErro.setText("Digite um número Inteiro");
                    tfJogada.requestFocus();
                    tfJogada.selectAll();
                }
                BowlingGame bowlingGame = new BowlingGame();
                bowlingGame.roll(Integer.parseInt(tfJogada.getText()));
                lbOsPontos.setText(bowlingGame.getScore()+"");

            }
        });
    }

}
