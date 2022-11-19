/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package unal.appmenu;

/**
 *
 * @author sebastian
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        saludo = new javax.swing.JMenuItem();
        pitagoras = new javax.swing.JMenu();
        calcularPitagoras = new javax.swing.JMenuItem();
        ohm = new javax.swing.JMenu();
        calcularVoltaje = new javax.swing.JMenuItem();
        calcularCorriente = new javax.swing.JMenuItem();
        info = new javax.swing.JMenu();
        integrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación de Menus");

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        file.setText("File");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        edit.setText("Edit");

        saludo.setText("Buenos días");
        edit.add(saludo);

        jMenuBar1.add(edit);

        pitagoras.setText("Pitagoras");

        calcularPitagoras.setText("Calcular Pitagoras");
        calcularPitagoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPitagorasActionPerformed(evt);
            }
        });
        pitagoras.add(calcularPitagoras);

        jMenuBar1.add(pitagoras);

        ohm.setText("Ohm");

        calcularVoltaje.setText("Calcular voltaje");
        calcularVoltaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularVoltajeActionPerformed(evt);
            }
        });
        ohm.add(calcularVoltaje);

        calcularCorriente.setText("Calcular corriente");
        calcularCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularCorrienteActionPerformed(evt);
            }
        });
        ohm.add(calcularCorriente);

        jMenuBar1.add(ohm);

        info.setText("Info");

        integrantes.setText("Integrantes");
        integrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrantesActionPerformed(evt);
            }
        });
        info.add(integrantes);

        jMenuBar1.add(info);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void integrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integrantesActionPerformed
        Info Integrantes = new Info();
        dp.add(Integrantes);
        pitagoras.setVisible(true);
    }//GEN-LAST:event_integrantesActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void calcularPitagorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPitagorasActionPerformed

        frmPitagoras pitagoras = new frmPitagoras();
        dp.add(pitagoras);
        pitagoras.setVisible(true);
    }//GEN-LAST:event_calcularPitagorasActionPerformed

    private void calcularVoltajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularVoltajeActionPerformed
        frmVoltaje ohm = new frmVoltaje();
        dp.add(ohm);
        ohm.setVisible(true);
    }//GEN-LAST:event_calcularVoltajeActionPerformed

    private void calcularCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularCorrienteActionPerformed
        frmCorriente ohm = new frmCorriente();
        dp.add(ohm);
        ohm.setVisible(true);
    }//GEN-LAST:event_calcularCorrienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem calcularCorriente;
    private javax.swing.JMenuItem calcularPitagoras;
    private javax.swing.JMenuItem calcularVoltaje;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu info;
    private javax.swing.JMenuItem integrantes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu ohm;
    private javax.swing.JMenu pitagoras;
    private javax.swing.JMenuItem saludo;
    // End of variables declaration//GEN-END:variables
}