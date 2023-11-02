package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static java.lang.Double.parseDouble;

/**
 * VentanaCalculadora es una clase que representa la interfaz de una calculadora simple.
 */
public class VentanaCalculadora extends JFrame {
    /**
     * Primer número = (a) para operaciones matemáticas.
     * Segundo número = (b) para operaciones matemáticas.
     * Resultado = (resultado) de las operaciones matemáticas.
     */
    double a, b, resultado;

    /**
     * Operador actual (suma, resta, multiplicación, división, etc.).
     */
    String op;

    /**
     * Panel principal de la ventana de la calculadora.
     */
    private JPanel VentanaCalculadora;
    private JButton ACButton;
    private JButton buttonPorcentaje;
    private JButton a8Button;
    private JButton buttonMasMenos;
    private JButton a9Button;
    private JButton buttonRaiz;
    private JButton a7Button;
    private JButton buttonBorrar;
    private JButton buttonSuma;
    private JButton buttonResta;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton buttonDecimal;
    private JButton a6Button;
    private JButton ButtonMultiplicacion;
    private JButton a3Button;
    private JButton buttonDivision;
    private JButton buttonIgual;
    private JTextField textDisplay;
    private JPanel secondPanel;

    /**
     * Constructor de la clase VentanaCalculadora.
     * Inicializa la interfaz de la calculadora y configura los ActionListener para los botones.
     */
    public VentanaCalculadora() {
        this.setContentPane(VentanaCalculadora);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });

        buttonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = textDisplay.getText();
                int longitud = entrada.length();

                if (longitud > 0) {
                    String nuevaEntrada = entrada.substring(0, longitud - 1);
                    textDisplay.setText(nuevaEntrada);
                }
            }
        });
        buttonRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = textDisplay.getText();
                if (!entrada.isEmpty()) {
                    double num = parseDouble(entrada);
                    double resultadoRaiz = Math.sqrt(num);
                    textDisplay.setText(Double.toString(resultadoRaiz));
                }
            }
        });
        buttonMasMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = textDisplay.getText();
                if (!entrada.isEmpty()) {
                    double num = parseDouble(entrada);
                    double numConSignoCambiado = -num;
                    textDisplay.setText(Double.toString(numConSignoCambiado));
                }
            }
        });
        buttonPorcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = textDisplay.getText();
                if (!entrada.isEmpty()) {
                    double numEntrada = parseDouble(entrada);
                    double porcentaje = numEntrada / 100.0;
                    textDisplay.setText(Double.toString(porcentaje));
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresa un número antes de calcular el porcentaje.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(textDisplay.getText());
                op = "+";
                textDisplay.setText((""));
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button.getText());
            }
        });
        buttonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(textDisplay.getText());
                op = "-";
                textDisplay.setText((""));
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button.getText());
            }
        });
        ButtonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(textDisplay.getText());
                op = "*";
                textDisplay.setText((""));

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button.getText());
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(textDisplay.getText());
                op = "/";
                textDisplay.setText((""));
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());
            }
        });
        buttonDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textDisplay.getText().contains(("."))) {
                    textDisplay.setText(textDisplay.getText() + buttonDecimal.getText());
                }
            }
        });
        buttonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = textDisplay.getText();
                if (!entrada.isEmpty() && !op.isEmpty()) {
                    b = parseDouble(entrada);
                    switch (op) {
                        case "+":
                            resultado = a + b;
                            break;
                        case "-":
                            resultado = a - b;
                            break;
                        case "*":
                            resultado = a * b;
                            break;
                        case "/":
                            if (b != 0) {
                                resultado = a / b;
                            } else {
                                textDisplay.setText("ERROR: No se puede dividir por cero");
                                textDisplay.setFont(new Font("Arial", Font.BOLD, 12));
                                textDisplay.setForeground(Color.red);
                                return;
                            }
                            break;
                    }
                    if (resultado == (long) resultado) {
                        textDisplay.setText(String.format("%d", (long) resultado));
                    } else {
                        textDisplay.setText(String.format("%s", resultado));
                    }
                } else {
                    textDisplay.setText("Error: Ingrese un número y seleccione una operación antes de realizar el cálculo.");
                }
            }
        });


        ImageIcon iconno = new ImageIcon(Objects.requireNonNull(VentanaCalculadora.class.getResource("/Img/calculadora.png")));
        setIconImage(iconno.getImage());

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        Icon icon = new ImageIcon(Objects.requireNonNull(VentanaCalculadora.class.getResource("/Img/menu4.png")));
        JButton configuracionButton = new JButton(icon);
        configuracionButton.setBorderPainted(false);
        configuracionButton.setFocusPainted(false);
        configuracionButton.setContentAreaFilled(false);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem modoClaroItem = new JMenuItem("Modo Claro");
        JMenuItem modoOscuroItem = new JMenuItem("Modo Oscuro");


        modoClaroItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarModoClaro();
            }
        });

        modoOscuroItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarModoOscuro();
            }
        });
        JMenuItem estandarItem = new JMenuItem("Estandar");
        popupMenu.add(modoClaroItem);
        popupMenu.add(modoOscuroItem);


        configuracionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupMenu.show(configuracionButton, 0, configuracionButton.getHeight());
            }
        });

        menuBar.add(configuracionButton);
        menuBar.add(estandarItem);
    }

    /**
     * Carga y muestra la ventana de la calculadora.
     */
    public void load() {
        setVisible(true);
    }

    /**
     * Cambia el fondo de la ventana a modo claro.
     */
    private void cambiarModoClaro() {
        getContentPane().setBackground(new Color(0xC1C9CC));
        secondPanel.setBackground(new Color(0xC1C9CC));
        repaint();
    }

    /**
     * Cambia el fondo de la ventana a modo oscuro
     */
    private void cambiarModoOscuro() {
        getContentPane().setBackground(Color.BLACK);
        secondPanel.setBackground(Color.BLACK);
        repaint();


    }

}
