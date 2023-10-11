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
public final class Interfaz extends javax.swing.JFrame {

    /**
     * @return the Costos
     */
    public JTextField getCostos() {
        return Costos;
    }

    /**
     * @param Costos the Costos to set
     */
    public void setCostos(JTextField Costos) {
        this.Costos = Costos;
    }

    /**
     * @return the brutas
     */
    public JTextField getBrutas() {
        return brutas;
    }

    /**
     * @param brutas the brutas to set
     */
    public void setBrutas(JTextField brutas) {
        this.brutas = brutas;
    }
    
//     public Developer trabajadores [];
     private Thread [] NarrativaDevelopers;
     private Thread [] LevelsDevelopers;
     private Thread [] SpritesDevelopers;
     private Thread [] SistemDevelopers;
     private Thread [] DLCDevelopers;
     private Thread [] IntegradoresDevelopers;
     public Drive drive;
     public Semaphore mutex;
     public Recursos recursos;
     public ContadorProvisional ContadorSpinner;
     int contadorNarrativa;
     int contadorLevels;
     int contadorSprites;
     int contadorSistem;
     int contadorDLC;
     int contadorIntegradores;
     boolean med;

   
    
    public Interfaz(Drive drive,Semaphore mutex,Recursos recursos,Thread hola [],
        ContadorProvisional ContadorN) {
        initComponents();
        this.drive=drive;
        this.mutex= mutex;
        this.recursos =recursos;
        this.ContadorSpinner = ContadorN;
        contadorNarrativa=0;
        contadorLevels=0;
        contadorSprites=0;
        contadorSistem=0;
        contadorDLC=0;
        contadorIntegradores=0;
        this.med=true;
        this.NarrativaDevelopers= new Thread[13];
        this.LevelsDevelopers= new Thread[13];
        this.SpritesDevelopers= new Thread[13];
        this.SistemDevelopers= new Thread[13];
        this.DLCDevelopers= new Thread[13];
        this.IntegradoresDevelopers= new Thread[13];
        
        

      
//        Actualizar();
        LLenar(0,NarrativaDevelopers,0.25f);
        LLenar(1,LevelsDevelopers,0.25f);
        LLenar(2,SpritesDevelopers,1);
        LLenar(3,SistemDevelopers,1);
        LLenar(4,DLCDevelopers,0.5f);
        LLenar(5,IntegradoresDevelopers,0.25f);
//        PonerTrabajadores();
        setLocationRelativeTo(null);
 
    }
    
//    public void PonerTrabajadores(){
//        
//        this.Narrativa.setValue(ContadorSpinner.narrative);
//        this.Levels.setValue(ContadorSpinner.levels);
//        this.Sprites.setValue(ContadorSpinner.sprite);
//        this.DLC.setValue(ContadorSpinner.DLC);
//        this.Integradores.setValue(ContadorSpinner.integrador);
//    }

    public void LLenar(int type,Thread [] array,float pp){
        for (int i = 0; i < 13; i++) {
   
             Developer nuevo = new Developer("Nintendo",type, pp, drive,mutex,recursos);
             array[i]=nuevo;
        }
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
    

    public JTextField getDescontado() {
        return Descontado;
    }

    public void setDescontado(JTextField Descontado) {
        this.Descontado = Descontado;
    }

    public JTextField getEstadoD() {
        return EstadoD;
    }

    public void setEstadoD(JTextField EstadoD) {
        this.EstadoD = EstadoD;
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

    public JTextField getFaltas() {
        return faltas;
    }

    public void setFaltas(JTextField faltas) {
        this.faltas = faltas;
    }

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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        EstadoD = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        EstadoPM = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Descontado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        Entrega = new javax.swing.JTextField();
        Costos = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        brutas = new javax.swing.JTextField();
        netas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

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

        faltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faltasActionPerformed(evt);
            }
        });
        jPanel1.add(faltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 100, -1));

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jLabel1.setText("Project Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

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
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel14.setText("Director");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel15.setText("¿Que esta haciendo?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        EstadoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoDActionPerformed(evt);
            }
        });
        jPanel1.add(EstadoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 100, -1));

        jLabel16.setText("¿Que esta haciendo?");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 20));

        EstadoPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoPMActionPerformed(evt);
            }
        });
        jPanel1.add(EstadoPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 100, -1));

        jLabel17.setText("Dinero Descontado");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        Descontado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescontadoActionPerformed(evt);
            }
        });
        jPanel1.add(Descontado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 90, -1));

        jLabel18.setText("Dias Totales");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel19.setText("Dias para la Entrega");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        Entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregaActionPerformed(evt);
            }
        });
        jPanel1.add(Entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        Costos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosActionPerformed(evt);
            }
        });
        jPanel1.add(Costos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 80, -1));

        jLabel20.setText("Costos");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));
        jPanel1.add(brutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 70, -1));
        jPanel1.add(netas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 70, -1));

        jLabel21.setText("Ganancias brutas");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        jLabel22.setText("Ganancias netas");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 870, 460));

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
        //ContadorSpinner.getDevelopers()[0]= Integer.valueOf(Narrativa.getValue().toString());
        
        
        int numero=0;
        
        for (int i = 0; i < ContadorSpinner.getDevelopers().length; i++) {
            numero+=ContadorSpinner.getDevelopers()[i];
        }
        
        
        if (Integer.valueOf(Narrativa.getValue().toString())<ContadorSpinner.getDevelopers()[0]){
            System.out.println("jaja");
            ContadorSpinner.getDevelopers()[0]= Integer.valueOf(Narrativa.getValue().toString());
        }else if(numero==17 && med== true ){
            Narrativa.setValue(ContadorSpinner.getDevelopers()[0]);
        }else{
            ContadorSpinner.getDevelopers()[0]= Integer.valueOf(Narrativa.getValue().toString());
         
        }
        

         
           
        if(contadorNarrativa<Integer.valueOf(Narrativa.getValue().toString())){
            
            if(NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
                NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].resume();
            contadorNarrativa++;
                
          
            }else {
                   NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].start();
                contadorNarrativa++;
                
            }
            

        }else{
            
            NarrativaDevelopers[ Integer.valueOf(Narrativa.getValue().toString())  ].suspend();
            
            contadorNarrativa--;
            
            
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
        


           int numero=0;
        
        for (int i = 0; i < ContadorSpinner.getDevelopers().length; i++) {
            numero+=ContadorSpinner.getDevelopers()[i];
        }
        
        
        if (Integer.valueOf(Levels.getValue().toString())<ContadorSpinner.getDevelopers()[1]){
           
            ContadorSpinner.getDevelopers()[1]= Integer.valueOf(Levels.getValue().toString());
        }else if (numero>=17  ){
            Levels.setValue(ContadorSpinner.getDevelopers()[1]);
          
        }else{
            ContadorSpinner.getDevelopers()[1]= Integer.valueOf(Levels.getValue().toString());
            
          
        }
        
        
        
        
        if(contadorLevels<Integer.valueOf(Levels.getValue().toString())){
            
            if(LevelsDevelopers[ Integer.valueOf(Levels.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
                LevelsDevelopers[ Integer.valueOf(Levels.getValue().toString())  ].resume();
            contadorLevels++;
                
          
            }else {
                   LevelsDevelopers[ Integer.valueOf(Levels.getValue().toString())  ].start();
                contadorLevels++;
                
            }
            

        }else{
            
            LevelsDevelopers[ Integer.valueOf(Levels.getValue().toString())  ].suspend();
            
            contadorLevels--;
            
            
        }
    }//GEN-LAST:event_LevelsStateChanged

    private void SpritesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpritesStateChanged

        
         int numero=0;
        
        for (int i = 0; i < ContadorSpinner.getDevelopers().length; i++) {
            numero+=ContadorSpinner.getDevelopers()[i];
        }
        
        
        if (Integer.valueOf(Sprites.getValue().toString())<ContadorSpinner.getDevelopers()[2]){
            System.out.println("jaja");
            ContadorSpinner.getDevelopers()[2]= Integer.valueOf(Sprites.getValue().toString());
        }else if (numero>=17  ){
            Sprites.setValue(ContadorSpinner.getDevelopers()[2]);
           
        }else{
            ContadorSpinner.getDevelopers()[2]= Integer.valueOf(Sprites.getValue().toString());
         
        }
        
        
        
        if(contadorSprites<Integer.valueOf(Sprites.getValue().toString())){
            
            if(SpritesDevelopers[ Integer.valueOf(Sprites.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
                SpritesDevelopers[ Integer.valueOf(Sprites.getValue().toString())  ].resume();
            contadorSprites++;
                
          
            }else {
                   SpritesDevelopers[ Integer.valueOf(Sprites.getValue().toString())  ].start();
                contadorSprites++;
                
            }
            

        }else{
            
            SpritesDevelopers[ Integer.valueOf(Sprites.getValue().toString())  ].suspend();
            
            contadorSprites--;
            
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SpritesStateChanged

    private void sistemsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sistemsStateChanged
        // TODO add your handling code here:
          int numero=0;
        
        for (int i = 0; i < ContadorSpinner.getDevelopers().length; i++) {
            numero+=ContadorSpinner.getDevelopers()[i];
        }
        
        
        if (Integer.valueOf(sistems.getValue().toString())<ContadorSpinner.getDevelopers()[3]){
            System.out.println("jaja");
            ContadorSpinner.getDevelopers()[3]= Integer.valueOf(sistems.getValue().toString());
        }else if (numero>=17){
            sistems.setValue(ContadorSpinner.getDevelopers()[3]);
           
        }else{
            ContadorSpinner.getDevelopers()[3]= Integer.valueOf(sistems.getValue().toString());
         
        }
        
        
        if(contadorSprites<Integer.valueOf(sistems.getValue().toString())){
            
            if(SistemDevelopers[ Integer.valueOf(sistems.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
                SistemDevelopers[ Integer.valueOf(sistems.getValue().toString())  ].resume();
            contadorSprites++;
                
          
            }else {
                   SistemDevelopers[ Integer.valueOf(sistems.getValue().toString())  ].start();
                contadorSprites++;
                
            }
            

        }else{
            
            SistemDevelopers[ Integer.valueOf(sistems.getValue().toString())  ].suspend();
            
            contadorSprites--;
            
            
        }
    }//GEN-LAST:event_sistemsStateChanged

    private void DLCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DLCStateChanged
        // TODO add your handling code here:
        int numero=0;
        
        for (int i = 0; i < ContadorSpinner.getDevelopers().length; i++) {
            numero+=ContadorSpinner.getDevelopers()[i];
        }
        
        
        if (Integer.valueOf(DLC.getValue().toString())<ContadorSpinner.getDevelopers()[4]){
            System.out.println("jaja");
            ContadorSpinner.getDevelopers()[4]= Integer.valueOf(DLC.getValue().toString());
        }else if (numero>=17 && med== true ){
            DLC.setValue(ContadorSpinner.getDevelopers()[4]);
         
        }else{
            ContadorSpinner.getDevelopers()[4]= Integer.valueOf(DLC.getValue().toString());
         
        }
        
        
        if(contadorDLC<Integer.valueOf(DLC.getValue().toString())){
            
            if(DLCDevelopers[ Integer.valueOf(DLC.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
                DLCDevelopers[ Integer.valueOf(DLC.getValue().toString())  ].resume();
            contadorDLC++;
                
          
            }else {
                   DLCDevelopers[ Integer.valueOf(DLC.getValue().toString())  ].start();
                contadorDLC++;
                
            }
            

        }else{
            
            DLCDevelopers[ Integer.valueOf(DLC.getValue().toString())  ].suspend();
            
            contadorDLC--;
            
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_DLCStateChanged

    private void IntegradoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_IntegradoresStateChanged
        // TODO add your handling code here:
       int numero=0;
        
        for (int i = 0; i < ContadorSpinner.getDevelopers().length; i++) {
            numero+=ContadorSpinner.getDevelopers()[i];
        }
        
        
        if (Integer.valueOf(Integradores.getValue().toString())<ContadorSpinner.getDevelopers()[5]){
            System.out.println("jaja");
            ContadorSpinner.getDevelopers()[5]= Integer.valueOf(Integradores.getValue().toString());
        }else if (numero>=17  ){
            Integradores.setValue(ContadorSpinner.getDevelopers()[5]);
           
        }else{
            ContadorSpinner.getDevelopers()[5]= Integer.valueOf(Integradores.getValue().toString());
         
        }
        
        if(contadorIntegradores<Integer.valueOf(Integradores.getValue().toString())){
            
            if(IntegradoresDevelopers[ Integer.valueOf(Integradores.getValue().toString())  ].getState()== Thread.State.TIMED_WAITING){
                IntegradoresDevelopers[ Integer.valueOf(Integradores.getValue().toString())  ].resume();
            contadorIntegradores++;
                
          
            }else {
                   IntegradoresDevelopers[ Integer.valueOf(Integradores.getValue().toString())  ].start();
                contadorIntegradores++;
                
            }
            

        }else{
            
            IntegradoresDevelopers[ Integer.valueOf(Integradores.getValue().toString())  ].suspend();
            
            contadorIntegradores--;
            
            
        }
        
    }//GEN-LAST:event_IntegradoresStateChanged

    private void EstadoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoDActionPerformed

    private void faltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faltasActionPerformed

    private void EstadoPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoPMActionPerformed
        
    }//GEN-LAST:event_EstadoPMActionPerformed

    private void DescontadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescontadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescontadoActionPerformed

    private void EntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntregaActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void CostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostosActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Interfaz( drive,mutex,recursos, trabajadores ,ContadorSpinner,enrique).setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costos;
    private javax.swing.JSpinner DLC;
    private javax.swing.JTextField Descontado;
    private javax.swing.JTextField Entrega;
    private javax.swing.JTextField EstadoD;
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
    private javax.swing.JTextField Total;
    private javax.swing.JTextField brutas;
    private javax.swing.JTextField conDLC;
    private javax.swing.JTextField faltas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField netas;
    private javax.swing.JTextField sinDLC;
    private javax.swing.JSpinner sistems;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the Entrega
     */
    public JTextField getEntrega() {
        return Entrega;
    }

    /**
     * @param Entrega the Entrega to set
     */
    public void setEntrega(JTextField Entrega) {
        this.Entrega = Entrega;
    }

    /**
     * @return the Total
     */
    public JTextField getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(JTextField Total) {
        this.Total = Total;
    }

    /**
     * @return the netas
     */
    public JTextField getNetas() {
        return netas;
    }

    /**
     * @param netas the netas to set
     */
    public void setNetas(JTextField netas) {
        this.netas = netas;
    }
}