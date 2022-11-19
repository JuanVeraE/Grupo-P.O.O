/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package unal.appmenu;

/**
 *
 * @author sebastian
 */
public class frmPitagoras extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPitagoras
     */
    public frmPitagoras() {
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

        inputA = new javax.swing.JTextField();
        inputB = new javax.swing.JTextField();
        inputH = new javax.swing.JTextField();
        calcularHipotenusa = new javax.swing.JButton();
        textA = new javax.swing.JLabel();
        textB = new javax.swing.JLabel();
        textH = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Calcular Hipotenusa");

        inputA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAActionPerformed(evt);
            }
        });

        inputH.setEnabled(false);
        inputH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHActionPerformed(evt);
            }
        });

        calcularHipotenusa.setText("Calcular");
        calcularHipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularHipotenusaActionPerformed(evt);
            }
        });

        textA.setText("Lado A");

        textB.setText("Lado B");

        textH.setText("Hipotenusa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(calcularHipotenusa)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(textH))
                    .addComponent(textB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputB)
                    .addComponent(inputH)
                    .addComponent(inputA))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcularHipotenusa)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAActionPerformed

    private void inputHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHActionPerformed

    private void calcularHipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularHipotenusaActionPerformed
        double hipotenusa,a,b;
        a=Double.parseDouble(inputA.getText());
        b=Double.parseDouble(inputB.getText());
        
        hipotenusa=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        inputH.setText(String.valueOf(hipotenusa));
    }//GEN-LAST:event_calcularHipotenusaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularHipotenusa;
    private javax.swing.JTextField inputA;
    private javax.swing.JTextField inputB;
    private javax.swing.JTextField inputH;
    private javax.swing.JLabel textA;
    private javax.swing.JLabel textB;
    private javax.swing.JLabel textH;
    // End of variables declaration//GEN-END:variables
}
