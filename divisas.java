package Principal;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
//import javax.swing.*;
public class divisas extends javax.swing.JFrame {
    //double valor;
    /**
     * Creates new form divisas
     */
    public divisas() {
        initComponents();
//        divisa1.setUI(Propiedades.createUI(rootPane));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        divisa2 = new javax.swing.JComboBox<>();
        divisa1 = new javax.swing.JComboBox<>();
        texto_divisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon - logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 110, 73));
        jLabel3.setText("CONVERSOR DE MONEDAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, -1));

        divisa2.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        divisa2.setForeground(new java.awt.Color(44, 110, 73));
        divisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EURO", "GBP", "YEN", "KRW", "MXN" }));
        divisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa2ActionPerformed(evt);
            }
        });
        jPanel1.add(divisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 90, -1));

        divisa1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        divisa1.setForeground(new java.awt.Color(44, 110, 73));
        divisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EURO", "GBP", "YEN", "KRW", "MXN" }));
        divisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa1ActionPerformed(evt);
            }
        });
        jPanel1.add(divisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, -1));

        texto_divisa.setBackground(new java.awt.Color(254, 254, 227));
        texto_divisa.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        texto_divisa.setForeground(new java.awt.Color(44, 110, 73));
        texto_divisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto_divisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 110, 73)));
        texto_divisa.setCaretColor(new java.awt.Color(44, 110, 73));
        texto_divisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_divisaActionPerformed(evt);
            }
        });
        jPanel1.add(texto_divisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 60));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        resultado.setEditable(false);
        resultado.setBackground(new java.awt.Color(44, 110, 73));
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        resultado.setForeground(new java.awt.Color(254, 254, 227));
        resultado.setLineWrap(true);
        resultado.setRows(5);
        resultado.setText("\n");
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 280, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 227));
        jLabel8.setText("© Developed by Marconi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelota (4).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 40, 40));

        convertir.setBackground(new java.awt.Color(254, 254, 227));
        convertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garrapata.png"))); // NOI18N
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });
        jPanel1.add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 60, 60));

        jLabel5.setFont(new java.awt.Font("Myriad CAD", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 227));
        jLabel5.setText("Moneda a convertir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Myriad CAD", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 110, 73));
        jLabel6.setText("Ingrese la cantidad en:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa (3).png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 323, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box 1 - moeda 1 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box 2 - moeda 2 (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void divisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa2ActionPerformed

                // TODO add your handling code here:
    }//GEN-LAST:event_divisa2ActionPerformed

    private void divisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa1ActionPerformed
        
    // TODO add your handling code here:
    }//GEN-LAST:event_divisa1ActionPerformed

    private void texto_divisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_divisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_divisaActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Menu_principal menu=new Menu_principal(); //Evento para regresar al menu principal
        menu.setVisible(true);  
        this.dispose();                                  
    }//GEN-LAST:event_jButton2MouseClicked

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        //Variables para capturar los datos 
        double valor = Double.parseDouble(texto_divisa.getText());
        int divisa = divisa1.getSelectedIndex(); //Solo numero, devuelve un arreglo
        int divisafinal = divisa2.getSelectedIndex(); //Solo numero, devuelve un arreglo
        
        
        Operaciones puente = new Operaciones();
        //Enviamos los valores que capturamos
        puente.setValor(valor);
        puente.setDivisa(divisa);
        puente.setDivisafinal(divisafinal);
        
        //ejecutar el metodo
        double resultado_d = puente.convertir();
        
        resultado.setText(""); //Limpia el textbox
        resultado.append(""+resultado_d); // Mostrar
    }//GEN-LAST:event_convertirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir;
    private javax.swing.JComboBox<String> divisa1;
    private javax.swing.JComboBox<String> divisa2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField texto_divisa;
    // End of variables declaration//GEN-END:variables

    
    }

