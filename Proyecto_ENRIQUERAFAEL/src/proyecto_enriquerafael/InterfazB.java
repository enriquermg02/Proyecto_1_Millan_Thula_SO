package proyecto_enriquerafael;

import java.util.concurrent.Semaphore;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author enriq
 */
public class InterfazB extends javax.swing.JFrame {
    
     Thread NarrativaDevelopers [];
     Drive drive;
     Semaphore mutex;
     Recursos recursos;
     ContadorProvisional ContadorSpinner;
    
    public InterfazB(Drive drive,Semaphore mutex,Recursos recursos,Thread NarrativaDevelopers [],
            ContadorProvisional ContadorSpinner) {
        initComponents();
        this.drive=drive;
        this.mutex= mutex;
        this.recursos =recursos;
        this.NarrativaDevelopers=NarrativaDevelopers ;
        this.ContadorSpinner=ContadorSpinner;
//        Actualizar();
        setLocationRelativeTo(null);
//        verificar(DLC);
//  
 
    }

    public JSpinner getDLC() {
        return DLC;
    }

    public void setDLC(JSpinner DLC) {
        this.DLC = DLC;
    }

    public JTextField getEstadoPM() {
        return EstadoPM;
    }

    public void setEstadoPM(JTextField EstadoPM) {
        this.EstadoPM = EstadoPM;
    }

    public JSpinner getLevels() {
        return Levels;
    }

    public void setLevels(JSpinner Levels) {
        this.Levels = Levels;
    }

    public JSpinner getNarrativa() {
        return Narrativa;
    }

    public void setNarrativa(JSpinner Narrativa) {
        this.Narrativa = Narrativa;
    }

    public JTextField getTexto0() {
        return Texto0;
    }

    public void setTexto0(JTextField Texto0) {
        this.Texto0 = Texto0;
    }

    public JTextField getTexto1() {
        return Texto1;
    }

    public void setTexto1(JTextField Texto1) {
        this.Texto1 = Texto1;
    }

    public JTextField getTexto2() {
        return Texto2;
    }

    public void setTexto2(JTextField Texto2) {
        this.Texto2 = Texto2;
    }

    public JTextField getTexto3() {
        return Texto3;
    }

    public void setTexto3(JTextField Texto3) {
        this.Texto3 = Texto3;
    }

    public JTextField getTexto4() {
        return Texto4;
    }

    public void setTexto4(JTextField Texto4) {
        this.Texto4 = Texto4;
    }

    public JTextField getConDLC() {
        return conDLC;
    }

    public void setConDLC(JTextField conDLC) {
        this.conDLC = conDLC;
    }

    public JTextField getSinDLC() {
        return sinDLC;
    }

    public void setSinDLC(JTextField sinDLC) {
        this.sinDLC = sinDLC;
    }

    
 
    
   
    
    
    
//     public void verificar(javax.swing.JSpinner DLC){
//         
//         while(true){
//
//             if (Integer.parseInt(DLC.getValue().toString())<0){
//                 DLC.setValue(1);
//             }
//         }
//         
//         
//     }
// 
//    
//    
//     public javax.swing.JTextField getTextField() {
//        return Texto0;
//    }
//
//
//     
//  
//     
//     
//     
//     public void projectmanager(){
//         
//         ProjectManager lester = new ProjectManager(recursos,EstadoPM);
//
//         lester.start();
//         
//     }
//     
//    
//    public void Actualizar(){
//        
//        HilosGui actu = new HilosGui(drive,Texto0,Texto1,Texto2,Texto3,Texto4,sinDLC,conDLC);
//        actu.start();
//     
//    }
//    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Levels = new javax.swing.JSpinner();
        Sprites = new javax.swing.JSpinner();
        sistems = new javax.swing.JSpinner();
        Narrativa = new javax.swing.JSpinner();
        Texto0 = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Texto2 = new javax.swing.JTextField();
        Texto3 = new javax.swing.JTextField();
        Texto4 = new javax.swing.JTextField();
        sinDLC = new javax.swing.JTextField();
        conDLC = new javax.swing.JTextField();
        faltas = new javax.swing.JTextField();
        Menu = new javax.swing.JButton();
        EstadoPM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Integradores = new javax.swing.JSpinner();
        DLC = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Levels.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        Levels.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LevelsStateChanged(evt);
            }
        });
        jPanel1.add(Levels, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        Sprites.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        Sprites.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpritesStateChanged(evt);
            }
        });
        jPanel1.add(Sprites, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        sistems.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        sistems.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sistemsStateChanged(evt);
            }
        });
        jPanel1.add(sistems, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        Narrativa.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        Narrativa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NarrativaStateChanged(evt);
            }
        });
        jPanel1.add(Narrativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        Texto0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto0ActionPerformed(evt);
            }
        });
        jPanel1.add(Texto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 80, -1));

        Texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto1ActionPerformed(evt);
            }
        });
        jPanel1.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 80, -1));
        jPanel1.add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 80, -1));
        jPanel1.add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 80, -1));
        jPanel1.add(Texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 80, -1));

        sinDLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinDLCActionPerformed(evt);
            }
        });
        jPanel1.add(sinDLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, -1));
        jPanel1.add(conDLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));
        jPanel1.add(faltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 80, -1));

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));
        jPanel1.add(EstadoPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel1.setText("Project Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        Integradores.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        Integradores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                IntegradoresStateChanged(evt);
            }
        });
        jPanel1.add(Integradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        DLC.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        DLC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DLCStateChanged(evt);
            }
        });
        jPanel1.add(DLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel2.setText("Desarrolladores");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel3.setText("Integradores");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel4.setText("Narrativa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setText("Niveles");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel6.setText("Sprite");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel7.setText("Sistema");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel8.setText("DLC");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 20));

        jLabel9.setText("Cantidad en drive");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel10.setText("Videojuegos listos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel11.setText("Sin DLC");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel12.setText("Con DLC");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel13.setText("Faltas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 840, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto1ActionPerformed

    private void Texto0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto0ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_MenuActionPerformed

    private void sinDLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinDLCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinDLCActionPerformed

    private void NarrativaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NarrativaStateChanged
    
        if ((Integer.valueOf(Narrativa.getValue().toString())+Integer.valueOf(DLC.getValue().toString())+ Integer.valueOf(Levels.getValue().toString())+Integer.valueOf(sistems.getValue().toString())+Integer.valueOf(Sprites.getValue().toString())+Integer.valueOf(Integradores.getValue().toString()))>17){
            Narrativa.setValue(12);
        }
        
//        if(ContadorSpinner.getNarrative()<Integer.valueOf(Narrativa.getValue().toString())){
//            if(NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
//                NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].resume();
//            ContadorSpinner.setNarrative(ContadorSpinner.getNarrative()+1);
//                System.out.println("hola");
//                System.out.println(ContadorSpinner.getNarrative());
//            }else {
//                   NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].start();
//                ContadorSpinner.setNarrative(ContadorSpinner.getNarrative()+1);
//                System.out.println(ContadorSpinner.getNarrative());
//            }
//            
//
//        }else{
//            
//     
//            
//            NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].suspend();
//            System.out.println(NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].getState());
//            ContadorSpinner.setNarrative(ContadorSpinner.getNarrative()-1);
//            System.out.println(ContadorSpinner.getNarrative());
//            
//        }
//    
//    
        
              
    }//GEN-LAST:event_NarrativaStateChanged

    private void LevelsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LevelsStateChanged
        // TODO add your handling code here:
        
        if ((Integer.valueOf(Narrativa.getValue().toString())+Integer.valueOf(DLC.getValue().toString())+ Integer.valueOf(Levels.getValue().toString())+Integer.valueOf(sistems.getValue().toString())+Integer.valueOf(Sprites.getValue().toString())+Integer.valueOf(Integradores.getValue().toString()))>17){
            Levels.setValue(12);
        }
    }//GEN-LAST:event_LevelsStateChanged

    private void SpritesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpritesStateChanged
if ((Integer.valueOf(Narrativa.getValue().toString())+Integer.valueOf(DLC.getValue().toString())+ Integer.valueOf(Levels.getValue().toString())+Integer.valueOf(sistems.getValue().toString())+Integer.valueOf(Sprites.getValue().toString())+Integer.valueOf(Integradores.getValue().toString()))>17){
            Sprites.setValue(12);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SpritesStateChanged

    private void sistemsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sistemsStateChanged
        // TODO add your handling code here:
        if ((Integer.valueOf(Narrativa.getValue().toString())+Integer.valueOf(DLC.getValue().toString())+ Integer.valueOf(Levels.getValue().toString())+Integer.valueOf(sistems.getValue().toString())+Integer.valueOf(Sprites.getValue().toString())+Integer.valueOf(Integradores.getValue().toString()))>17){
            sistems.setValue(12);
        }
    }//GEN-LAST:event_sistemsStateChanged

    private void DLCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DLCStateChanged
        // TODO add your handling code here:
        
        if ((Integer.valueOf(Narrativa.getValue().toString())+Integer.valueOf(DLC.getValue().toString())+ Integer.valueOf(Levels.getValue().toString())+Integer.valueOf(sistems.getValue().toString())+Integer.valueOf(Sprites.getValue().toString())+Integer.valueOf(Integradores.getValue().toString()))>17){
            DLC.setValue(12);
        }
    }//GEN-LAST:event_DLCStateChanged

    private void IntegradoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_IntegradoresStateChanged
        // TODO add your handling code here:
        if ((Integer.valueOf(Narrativa.getValue().toString())+Integer.valueOf(DLC.getValue().toString())+ Integer.valueOf(Levels.getValue().toString())+Integer.valueOf(sistems.getValue().toString())+Integer.valueOf(Sprites.getValue().toString())+Integer.valueOf(Integradores.getValue().toString()))>17){
            Integradores.setValue(12);
        }
    }//GEN-LAST:event_IntegradoresStateChanged

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
            java.util.logging.Logger.getLogger(InterfazB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new InterfazB( drive,mutex,recursos, NarrativaDevelopers ,ContadorSpinner).setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner DLC;
    private javax.swing.JTextField EstadoPM;
    private javax.swing.JSpinner Integradores;
    private javax.swing.JSpinner Levels;
    private javax.swing.JButton Menu;
    private javax.swing.JSpinner Narrativa;
    private javax.swing.JSpinner Sprites;
    private javax.swing.JTextField Texto0;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    private javax.swing.JTextField Texto3;
    private javax.swing.JTextField Texto4;
    private javax.swing.JTextField conDLC;
    private javax.swing.JTextField faltas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sinDLC;
    private javax.swing.JSpinner sistems;
    // End of variables declaration//GEN-END:variables
}