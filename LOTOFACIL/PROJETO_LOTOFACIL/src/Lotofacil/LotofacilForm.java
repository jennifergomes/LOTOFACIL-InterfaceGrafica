package Lotofacil;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LotofacilForm extends JFrame {

    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");

    // Construtor
    public LotofacilForm() {
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String numero = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ");
                int numeroSorteado = new Random().nextInt(101);
                int numeroDigitado = Integer.parseInt(numero);

                if (numeroDigitado > 100 || numeroDigitado < 0) {

                    JOptionPane.showMessageDialog(null, "Aposta inválida\n");

                } else if (numeroSorteado == numeroDigitado) {
                    JOptionPane.showMessageDialog(null, "\nParabéns! Você ganhou R$1000,00!\n");

                } else {
                    JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: %d\n".formatted(numeroSorteado));
                }
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char letraSorteada = 'J';
                String letraDigitada = null;

                String letra = JOptionPane.showInputDialog(null, "Escreva uma letra de A à Z: ");

                if (Character.isLetter(letraDigitada.charAt(0))) {
                    if (letraDigitada.charAt(0) == letra.charAt(0)) {
                        JOptionPane.showMessageDialog(null, "\nParabéns! Você ganhou R$500,00!\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: %s\n".formatted(letra));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Aposta inválida\n");
                }

            }
        });

        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }

    public static void main(String[] args) {
        new LotofacilForm();
    }
}

