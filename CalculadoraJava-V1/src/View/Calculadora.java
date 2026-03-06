package View;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        this.setUndecorated(true); //quita la barra blanca que sale en la intergaz
        initComponents();
        setLocationRelativeTo(null); //centra el panel
        txtResultado.setEditable(false);
        txtOperacion.setEditable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    
    public void keyPressed(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
if (Character.isDigit(c)) {
    String d = String.valueOf(c);
    if (nuevaOperacion) {
        txtResultado.setText(d);
        nuevaOperacion = false;
    } else {
        String actual = txtResultado.getText();
        if (actual.equals("0")) txtResultado.setText(d);
        else txtResultado.setText(actual + d);
    }
}
        else if (c == '+') { if(operador.isEmpty()){ numero1 = Double.parseDouble(txtResultado.getText()); operador = "+"; txtOperacion.setText(numero1 + " +"); nuevaOperacion = true; txtResultado.setText("0"); }}
        else if (c == '-') { if(operador.isEmpty()){ numero1 = Double.parseDouble(txtResultado.getText()); operador = "-"; txtOperacion.setText(numero1 + " -"); nuevaOperacion = true; txtResultado.setText("0"); }}
        else if (c == '*') { if(operador.isEmpty()){ numero1 = Double.parseDouble(txtResultado.getText()); operador = "*"; txtOperacion.setText(numero1 + " x"); nuevaOperacion = true; txtResultado.setText("0"); }}
        else if (c == '/') { if(operador.isEmpty()){ numero1 = Double.parseDouble(txtResultado.getText()); operador = "/"; txtOperacion.setText(numero1 + " /"); nuevaOperacion = true; txtResultado.setText("0"); }}
        else if (c == '%') bnporcientoActionPerformed(null);
        else if (c == '.' || c == ',') bnpuntoActionPerformed(null);
        else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) bnresultadoActionPerformed(null);
        else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) bndeleteActionPerformed(null);
        else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) bnlimpiarActionPerformed(null);
    }
});
        this.setFocusable(true);
        this.requestFocusInWindow();

        //permite mover el programa sin necesidad de tener la ventana predeterminada de neatbeans
    jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mousePressed(java.awt.event.MouseEvent evt) {
        mouseX = evt.getX();
        mouseY = evt.getY();
    }
});
jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
    public void mouseDragged(java.awt.event.MouseEvent evt) {
        setLocation(getX() + evt.getX() - mouseX, getY() + evt.getY() - mouseY);
    }
});

//Permite darle un color rojo de advertencia al usuario que se cerrara el programa
Exit.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        Exit.setBackground(new java.awt.Color(200, 50, 50));
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        Exit.setBackground(new java.awt.Color(51, 51, 51));
    }
});

//Quita las rayas molestas al dar clic en los botones
MinimizarBoton.setFocusPainted(false);
Exit.setFocusPainted(false);
bn0.setFocusPainted(false);
bn1.setFocusPainted(false);
bn2.setFocusPainted(false);
bn3.setFocusPainted(false);
bn4.setFocusPainted(false);
bn5.setFocusPainted(false);
bn6.setFocusPainted(false);
bn7.setFocusPainted(false);
bn8.setFocusPainted(false);
bn9.setFocusPainted(false);
bnpunto.setFocusPainted(false);
bnresultado.setFocusPainted(false);
bnsuma.setFocusPainted(false);
bnresta.setFocusPainted(false);
bndivision.setFocusPainted(false);
bnmulti.setFocusPainted(false);
bndelete.setFocusPainted(false);
bnlimpiar.setFocusPainted(false);
bnpotencia.setFocusPainted(false);
bnporciento.setFocusPainted(false);

//Llama al metodo que permite sombrear los botones al pasar el cursor
aplicarEfectoHover(bn0);
aplicarEfectoHover(bn1);
aplicarEfectoHover(bn2);
aplicarEfectoHover(bn3);
aplicarEfectoHover(bn4);
aplicarEfectoHover(bn5);
aplicarEfectoHover(bn6);
aplicarEfectoHover(bn7);
aplicarEfectoHover(bn8);
aplicarEfectoHover(bn9);
aplicarEfectoHover(bnpunto);
aplicarEfectoHover(bnresultado);
aplicarEfectoHover(bnsuma);
aplicarEfectoHover(bnresta);
aplicarEfectoHover(bndivision);
aplicarEfectoHover(bnmulti);
aplicarEfectoHover(bndelete);
aplicarEfectoHover(bnlimpiar);
aplicarEfectoHover(bnpotencia);
aplicarEfectoHover(bnporciento);
aplicarEfectoHover(MinimizarBoton);
aplicarEfectoHover(Exit);

    }
    
    // Método para aplicar efecto hover a botones
    private void aplicarEfectoHover(javax.swing.JButton boton) {
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
        boton.setOpaque(true);
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
        java.awt.Color colorOriginal = boton.getBackground();
        
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        boton.setBackground(boton.getBackground().brighter());
        }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        boton.setBackground(colorOriginal);
        }
    });
}
    //Valores
        private double numero1 = 0;
        private String operador = "";
        private boolean nuevaEntrada = true;
        private boolean nuevaOperacion = false;
        private int mouseX, mouseY;
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        MinimizarBoton = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        bn7 = new javax.swing.JButton();
        bn4 = new javax.swing.JButton();
        bn1 = new javax.swing.JButton();
        bn8 = new javax.swing.JButton();
        bn5 = new javax.swing.JButton();
        bn2 = new javax.swing.JButton();
        bn9 = new javax.swing.JButton();
        bn6 = new javax.swing.JButton();
        bn3 = new javax.swing.JButton();
        bn0 = new javax.swing.JButton();
        bnpunto = new javax.swing.JButton();
        bnresultado = new javax.swing.JButton();
        bnsuma = new javax.swing.JButton();
        bnresta = new javax.swing.JButton();
        bndivision = new javax.swing.JButton();
        bndelete = new javax.swing.JButton();
        bnlimpiar = new javax.swing.JButton();
        bnporciento = new javax.swing.JButton();
        bnpotencia = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();
        bnmulti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        Exit.setBackground(new java.awt.Color(51, 51, 51));
        Exit.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_small.png"))); // NOI18N
        Exit.setBorderPainted(false);
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.setMargin(new java.awt.Insets(4, 14, 4, 14));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        MinimizarBoton.setBackground(new java.awt.Color(51, 51, 51));
        MinimizarBoton.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        MinimizarBoton.setForeground(new java.awt.Color(255, 255, 255));
        MinimizarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        MinimizarBoton.setBorderPainted(false);
        MinimizarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MinimizarBoton.setMargin(new java.awt.Insets(-8, 10, 4, 10));
        MinimizarBoton.setMaximumSize(new java.awt.Dimension(37, 16));
        MinimizarBoton.setMinimumSize(new java.awt.Dimension(37, 16));
        MinimizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarBotonActionPerformed(evt);
            }
        });

        txtResultado.setBackground(new java.awt.Color(51, 51, 51));
        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setText("0");
        txtResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        bn7.setBackground(new java.awt.Color(102, 102, 102));
        bn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn7.setForeground(new java.awt.Color(255, 255, 255));
        bn7.setText("7");
        bn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn7ActionPerformed(evt);
            }
        });

        bn4.setBackground(new java.awt.Color(102, 102, 102));
        bn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn4.setForeground(new java.awt.Color(255, 255, 255));
        bn4.setText("4");
        bn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn4ActionPerformed(evt);
            }
        });

        bn1.setBackground(new java.awt.Color(102, 102, 102));
        bn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn1.setForeground(new java.awt.Color(255, 255, 255));
        bn1.setText("1");
        bn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn1ActionPerformed(evt);
            }
        });

        bn8.setBackground(new java.awt.Color(102, 102, 102));
        bn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn8.setForeground(new java.awt.Color(255, 255, 255));
        bn8.setText("8");
        bn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn8ActionPerformed(evt);
            }
        });

        bn5.setBackground(new java.awt.Color(102, 102, 102));
        bn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn5.setForeground(new java.awt.Color(255, 255, 255));
        bn5.setText("5");
        bn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn5ActionPerformed(evt);
            }
        });

        bn2.setBackground(new java.awt.Color(102, 102, 102));
        bn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn2.setForeground(new java.awt.Color(255, 255, 255));
        bn2.setText("2");
        bn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn2ActionPerformed(evt);
            }
        });

        bn9.setBackground(new java.awt.Color(102, 102, 102));
        bn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn9.setForeground(new java.awt.Color(255, 255, 255));
        bn9.setText("9");
        bn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn9ActionPerformed(evt);
            }
        });

        bn6.setBackground(new java.awt.Color(102, 102, 102));
        bn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn6.setForeground(new java.awt.Color(255, 255, 255));
        bn6.setText("6");
        bn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn6ActionPerformed(evt);
            }
        });

        bn3.setBackground(new java.awt.Color(102, 102, 102));
        bn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn3.setForeground(new java.awt.Color(255, 255, 255));
        bn3.setText("3");
        bn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn3ActionPerformed(evt);
            }
        });

        bn0.setBackground(new java.awt.Color(102, 102, 102));
        bn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bn0.setForeground(new java.awt.Color(255, 255, 255));
        bn0.setText("0");
        bn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn0ActionPerformed(evt);
            }
        });

        bnpunto.setBackground(new java.awt.Color(102, 102, 102));
        bnpunto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnpunto.setForeground(new java.awt.Color(255, 255, 255));
        bnpunto.setText(".");
        bnpunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpuntoActionPerformed(evt);
            }
        });

        bnresultado.setBackground(new java.awt.Color(102, 102, 102));
        bnresultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnresultado.setForeground(new java.awt.Color(255, 255, 255));
        bnresultado.setText("=");
        bnresultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnresultadoActionPerformed(evt);
            }
        });

        bnsuma.setBackground(new java.awt.Color(102, 102, 102));
        bnsuma.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnsuma.setForeground(new java.awt.Color(255, 255, 255));
        bnsuma.setText("+");
        bnsuma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsumaActionPerformed(evt);
            }
        });

        bnresta.setBackground(new java.awt.Color(102, 102, 102));
        bnresta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnresta.setForeground(new java.awt.Color(255, 255, 255));
        bnresta.setText("-");
        bnresta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnrestaActionPerformed(evt);
            }
        });

        bndivision.setBackground(new java.awt.Color(102, 102, 102));
        bndivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bndivision.setForeground(new java.awt.Color(255, 255, 255));
        bndivision.setText("/");
        bndivision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndivisionActionPerformed(evt);
            }
        });

        bndelete.setBackground(new java.awt.Color(102, 102, 102));
        bndelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bndelete.setForeground(new java.awt.Color(255, 255, 255));
        bndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        bndelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndeleteActionPerformed(evt);
            }
        });

        bnlimpiar.setBackground(new java.awt.Color(102, 102, 102));
        bnlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        bnlimpiar.setText("C");
        bnlimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnlimpiarActionPerformed(evt);
            }
        });

        bnporciento.setBackground(new java.awt.Color(102, 102, 102));
        bnporciento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnporciento.setForeground(new java.awt.Color(255, 255, 255));
        bnporciento.setText("%");
        bnporciento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnporciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnporcientoActionPerformed(evt);
            }
        });

        bnpotencia.setBackground(new java.awt.Color(102, 102, 102));
        bnpotencia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnpotencia.setForeground(new java.awt.Color(255, 255, 255));
        bnpotencia.setText("^");
        bnpotencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpotenciaActionPerformed(evt);
            }
        });

        txtOperacion.setBackground(new java.awt.Color(51, 51, 51));
        txtOperacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(255, 255, 255));
        txtOperacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOperacion.setText("0");
        txtOperacion.setBorder(null);

        bnmulti.setBackground(new java.awt.Color(102, 102, 102));
        bnmulti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bnmulti.setForeground(new java.awt.Color(255, 255, 255));
        bnmulti.setText("x");
        bnmulti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnmultiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOperacion))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bn4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bn5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bn6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bnporciento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bn0, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bn1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bn2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bn3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bnresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bn7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bn8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bn9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bnpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MinimizarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MinimizarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnporciento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    System.exit(0);System.exit(0);    }//GEN-LAST:event_ExitActionPerformed

    private void MinimizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarBotonActionPerformed
    setState(JFrame.ICONIFIED);
    bndelete.setFocusable(false);
    }//GEN-LAST:event_MinimizarBotonActionPerformed

    private void bn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn4ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("4");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "4");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn4ActionPerformed

    private void bnporcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnporcientoActionPerformed
    double num = Double.parseDouble(txtResultado.getText());
    double resultado;
    if (operador.equals("*") || operador.equals("/")) {
        resultado = num / 100;
    } else {
        resultado = numero1 * (num / 100);
    }
    if (resultado == (long) resultado)
        txtResultado.setText(String.valueOf((long) resultado));
    else
        txtResultado.setText(String.format("%.2f", resultado));
    nuevaOperacion = false;
    this.requestFocus();
    if (txtResultado.getText().equals("Error")) return;
    }//GEN-LAST:event_bnporcientoActionPerformed

    private void bn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn0ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("0");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "0");
    }
    }//GEN-LAST:event_bn0ActionPerformed

    private void bnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpuntoActionPerformed
    String actual = txtResultado.getText();
    if (!actual.contains(".")) {
        txtResultado.setText(actual + ".");
    }
        this.requestFocus();
    }//GEN-LAST:event_bnpuntoActionPerformed

    private void bnresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnresultadoActionPerformed
    if (operador.isEmpty()) return; // nada que calcular
    if (txtOperacion.getText().contains("=")) return; // evita repetir =
    
    double numero2 = Double.parseDouble(txtResultado.getText());
    double resultado = 0;
    
    switch (operador) {
        case "+": resultado = numero1 + numero2; break;
        case "-": resultado = numero1 - numero2; break;
        case "*": resultado = numero1 * numero2; break;
        case "^": resultado = Math.pow(numero1, numero2); break;
    case "/":
    if (numero2 == 0) { 
        txtResultado.setText("Error");
        operador = "";
        numero1 = 0;
        nuevaOperacion = true;
        return; 
    }
    resultado = numero1 / numero2;
    break;
    }
    
    txtOperacion.setText(numero1 + " " + operador + " " + numero2 + " = " + 
        (resultado == (long) resultado ? (long) resultado : resultado));
    
    if (resultado == (long) resultado)
        txtResultado.setText(String.valueOf((long) resultado));
    else
        txtResultado.setText(String.format("%.2f", resultado));
    
    operador = "";
    nuevaOperacion = true;
        this.requestFocus();
        if (txtResultado.getText().equals("Error")) return;
    }//GEN-LAST:event_bnresultadoActionPerformed

    private void bn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn1ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("1");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "1");
    }
    this.requestFocus();
    }//GEN-LAST:event_bn1ActionPerformed

    private void bn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn2ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("2");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "2");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn2ActionPerformed

    private void bn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn3ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("3");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "3");
    }    
    this.requestFocus();
    }//GEN-LAST:event_bn3ActionPerformed

    private void bnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsumaActionPerformed
    if (!operador.isEmpty()) return; // evita doble operador
    numero1 = Double.parseDouble(txtResultado.getText());
    operador = "+";
    txtOperacion.setText(numero1 + " +");
    nuevaOperacion = true;
    if (txtResultado.getText().equals("Error")) return;
    }//GEN-LAST:event_bnsumaActionPerformed

    private void bnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnrestaActionPerformed
    if (!operador.isEmpty()) return;
    numero1 = Double.parseDouble(txtResultado.getText());
    operador = "-";
    txtOperacion.setText(numero1 + " -");
    nuevaOperacion = true;
    txtResultado.setText("0");
    this.requestFocus();
    if (txtResultado.getText().equals("Error")) return;
    }//GEN-LAST:event_bnrestaActionPerformed

    private void bn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn6ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("6");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "6");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn6ActionPerformed

    private void bn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn5ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("5");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "5");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn5ActionPerformed

    private void bn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn7ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("7");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "7");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn7ActionPerformed

    private void bn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn8ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("8");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "8");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn8ActionPerformed

    private void bn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn9ActionPerformed
    if (nuevaOperacion || txtResultado.getText().equals("0")) {
        txtResultado.setText("9");
        nuevaOperacion = false;
    } else {
        txtResultado.setText(txtResultado.getText() + "9");
    }
        this.requestFocus();
    }//GEN-LAST:event_bn9ActionPerformed

    private void bndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndivisionActionPerformed
    if (txtResultado.getText().equals("Error")) return;
    if (!operador.isEmpty()) return;
    numero1 = Double.parseDouble(txtResultado.getText());
    operador = "/";
    txtOperacion.setText(numero1 + " /");
    nuevaOperacion = true;
    txtResultado.setText("0");
    this.requestFocus();
    }//GEN-LAST:event_bndivisionActionPerformed

    private void bndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndeleteActionPerformed
    String actual = txtResultado.getText();
    if (actual.length() <= 1 || actual.equals("Error")) {
        txtResultado.setText("0");
    } else {
        txtResultado.setText(actual.substring(0, actual.length() - 1));
    }
        this.requestFocus();
    }//GEN-LAST:event_bndeleteActionPerformed

    private void bnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnlimpiarActionPerformed
    txtResultado.setText("0");
    txtOperacion.setText("");
    numero1 = 0;
    operador = "";
    nuevaOperacion = false;
        this.requestFocus();
    }//GEN-LAST:event_bnlimpiarActionPerformed

    private void bnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnmultiActionPerformed
    if (!operador.isEmpty()) return;
    numero1 = Double.parseDouble(txtResultado.getText());
    operador = "*";
    txtOperacion.setText(numero1 + " x");
    nuevaOperacion = true;
    txtResultado.setText("0");
    this.requestFocus();
    if (txtResultado.getText().equals("Error")) return;
    }//GEN-LAST:event_bnmultiActionPerformed

    private void bnpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpotenciaActionPerformed
    if (!operador.isEmpty()) return;
    numero1 = Double.parseDouble(txtResultado.getText());
    operador = "^";
    txtOperacion.setText(numero1 + " ^");
    nuevaOperacion = true;
    txtResultado.setText("0");
    this.requestFocus();
    if (txtResultado.getText().equals("Error")) return;
    }//GEN-LAST:event_bnpotenciaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton MinimizarBoton;
    private javax.swing.JButton bn0;
    private javax.swing.JButton bn1;
    private javax.swing.JButton bn2;
    private javax.swing.JButton bn3;
    private javax.swing.JButton bn4;
    private javax.swing.JButton bn5;
    private javax.swing.JButton bn6;
    private javax.swing.JButton bn7;
    private javax.swing.JButton bn8;
    private javax.swing.JButton bn9;
    private javax.swing.JButton bndelete;
    private javax.swing.JButton bndivision;
    private javax.swing.JButton bnlimpiar;
    private javax.swing.JButton bnmulti;
    private javax.swing.JButton bnporciento;
    private javax.swing.JButton bnpotencia;
    private javax.swing.JButton bnpunto;
    private javax.swing.JButton bnresta;
    private javax.swing.JButton bnresultado;
    private javax.swing.JButton bnsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
