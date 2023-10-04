/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_enriquerafael;

import java.util.concurrent.Semaphore;

/**
 *
 * @author leste
 */
public class InterfazG extends javax.swing.JFrame {

    static Interfaz interfaz;
    static InterfazB interfazb;
    
    public InterfazG(Interfaz interfaz, InterfazB interfazb) {
        initComponents();
        this.interfaz = interfaz;
        this.interfazb = interfazb;
        setLocationRelativeTo(null);
        
    }
        //SECCION NINTENDO//
//        Semaphore mutex = new Semaphore(1);
//        Recursos recursosnintendo= new Recursos(0,0,14,0,0);
//        Drive driveN = new Drive(0,0,0,0,0,0,0);
//        ContadorProvisional ContadorSpinner = new ContadorProvisional();
//        Thread NarrativaDevelopers []= new Thread[20];
//        Interfaz interNintendo = new Interfaz(driveN,mutex,recursosnintendo,NarrativaDevelopers,ContadorSpinner);        
//        Compania nintendo =new Compania (interNintendo,driveN,recursosnintendo,mutex );
        //FINALIZA NINTENDO//
        //SECCION BETHESDA//
        
        //FINALIZA BETHESDA//

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nintendo = new javax.swing.JButton();
        Bethesda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nintendo.setText("Nintendo");
        Nintendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NintendoActionPerformed(evt);
            }
        });
        jPanel1.add(Nintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        Bethesda.setText("Bethesda");
        Bethesda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BethesdaActionPerformed(evt);
            }
        });
        jPanel1.add(Bethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NintendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NintendoActionPerformed
        interfaz.setVisible(true);
        
    }//GEN-LAST:event_NintendoActionPerformed

    private void BethesdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BethesdaActionPerformed
        interfazb.setVisible(true);
    }//GEN-LAST:event_BethesdaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazG(interfaz, interfazb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bethesda;
    private javax.swing.JButton Nintendo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
