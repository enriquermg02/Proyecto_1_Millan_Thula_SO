/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_enriquerafael;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 

/**
 *
 * @author leste
 */
public final class InterfazG extends javax.swing.JFrame {
    
    
        Semaphore mutex = new Semaphore(1);
        Semaphore mutex2 = new Semaphore(1);
        //Area Nintendo//
        Recursos recursosN= new Recursos(0,0,0,0,0);
        Drive drive = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorN = new ContadorProvisional();
        Interfaz interN = new Interfaz(drive,mutex,recursosN,ContadorN);
        Compania nintendo =new Compania (interN, mutex, recursosN, drive);
//        //Fin//
//        //Area Bethesda//
        Recursos recursosB = new Recursos(0,0,0,0,0);
        Drive driveB = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorB = new ContadorProvisional();
        InterfazB interB = new InterfazB(driveB, mutex, recursosB, ContadorB);
        CompaniaB bethesda =new CompaniaB (interB ,mutex2, recursosB, driveB);
        
        
        //graficos
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        DefaultCategoryDataset dataset2= new DefaultCategoryDataset();
        
        
        JFreeChart linea= ChartFactory.createLineChart("Nintendo VS Bethesda","Tiempo","Beneficos",dataset);
        ChartPanel panel= new ChartPanel(linea);
         
      
    
    public InterfazG() {
       
        
        initComponents();
        this.loadSetDaysJson();
        this.loadSetEmployeesJson();
        this.segundos.setText(Integer.toString(recursosN.getDayDuration()));
        this.dias.setText(Integer.toString(recursosN.getDias()));
        nintendo.fundar();
        bethesda.fundar();
        
        setLocationRelativeTo(null);
      
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                writeJson();
                e.getWindow().dispose();
                System.exit(0);
            }
        });
       
       panel.setPreferredSize(new Dimension(400,200));
       
         grafico.setLayout(new BorderLayout());
        grafico.add(panel,BorderLayout.NORTH);
        
         
         
      

    }
    
   

    public JPanel getGrafico() {
        return grafico;
    }

    public void setGrafico(JPanel grafico) {
        this.grafico = grafico;
    }
    
    
    
    
    public void loadSetDaysJson() {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("C:test\\valores.json")) {

            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            int dayDuration = ((Long) jsonObject.get("SimulacionSegundos")).intValue();
            int dayCounter = ((Long) jsonObject.get("IntervaloEntregas")).intValue();
          
            interN.recursos.setDayDuration(dayDuration);
            interN.recursos.setDiasSobrantes(dayCounter);
            interB.recursos.setDayDuration(dayDuration);
            interN.recursos.setDias(dayCounter);
            interB.recursos.setDias(dayCounter);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    public void loadSetEmployeesJson() {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("C:test\\valores.json")) {

            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            

            JSONObject initialEmployeeCountN = (JSONObject) jsonObject.get("initialEmployeeCountN");
            int narrativaN = ((Long) initialEmployeeCountN.get("narrativa")).intValue();
            int nivelesN = ((Long) initialEmployeeCountN.get("niveles")).intValue();
            int spriteN = ((Long) initialEmployeeCountN.get("sprites")).intValue();
            int sistemaN = ((Long) initialEmployeeCountN.get("sistemas")).intValue();
            int dlcN = ((Long) initialEmployeeCountN.get("DLC")).intValue();
            int integradorN = ((Long) initialEmployeeCountN.get("integrador")).intValue();
            
            interN.Narrativa.setValue(narrativaN);
            interN.Levels.setValue(nivelesN);
            interN.Sprites.setValue(spriteN);
            interN.sistems.setValue(sistemaN);
            interN.DLC.setValue(dlcN);
            interN.Integradores.setValue(integradorN);
            
            JSONObject initialEmployeeCountB = (JSONObject) jsonObject.get("initialEmployeeCountB");
            int narrativaB = ((Long) initialEmployeeCountB.get("narrativa")).intValue();
            int nivelesB = ((Long) initialEmployeeCountB.get("niveles")).intValue();
            int spriteB = ((Long) initialEmployeeCountB.get("sprites")).intValue();
            int sistemaB = ((Long) initialEmployeeCountB.get("sistemas")).intValue();
            int dlcB = ((Long) initialEmployeeCountB.get("DLC")).intValue();
            int integradorB = ((Long) initialEmployeeCountB.get("integrador")).intValue();
            
            interB.Narrativa.setValue(narrativaB);
            interB.Levels.setValue(nivelesB);
            interB.Sprites.setValue(spriteB);
            interB.sistems.setValue(sistemaB);
            interB.DLC.setValue(dlcB);
            interB.Integradores.setValue(integradorB);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    public void writeJson() {
        int dayDurationB = Integer.parseInt(this.segundos.getText());
        int daysForDeliveryB = Integer.parseInt(this.dias.getText());
        
        //Nintendo
       int narrativaN = (Integer) interN.Narrativa.getValue();
       int nivelesN = (Integer) interN.Levels.getValue();
       int spriteN = (Integer) interN.Sprites.getValue();
       int sistemaN = (Integer) interN.sistems.getValue();
       int dlcN = (Integer) interN.DLC.getValue();
       int integradorN = (Integer) interN.Integradores.getValue();
       
       //Bethesda
       int narrativaB = (Integer) interB.Narrativa.getValue();
       int nivelesB = (Integer) interB.Levels.getValue();
       int spriteB = (Integer) interB.Sprites.getValue();
       int sistemaB = (Integer) interB.sistems.getValue();
       int dlcB = (Integer) interB.DLC.getValue();
       int integradorB = (Integer) interB.Integradores.getValue();
       
        JSONParser parser = new JSONParser();
        try (FileReader fileReader = new FileReader("C:test\\valores.json")) {
            Object obj = parser.parse(fileReader);
            JSONObject existingJsonObject = (JSONObject) obj;

            existingJsonObject.put("SimulacionSegundos", dayDurationB);
            existingJsonObject.put("IntervaloEntregas", daysForDeliveryB );

            JSONObject initialEmployeeCountN = (JSONObject) existingJsonObject.get("initialEmployeeCountN");
            initialEmployeeCountN.put("narrativa", narrativaN);
            initialEmployeeCountN.put("niveles", nivelesN);
            initialEmployeeCountN.put("sprites", spriteN);
            initialEmployeeCountN.put("sistemas", sistemaN);
            initialEmployeeCountN.put("DLC", dlcN);
            initialEmployeeCountN.put("integrador", integradorN);

            JSONObject initialEmployeeCountB = (JSONObject) existingJsonObject.get("initialEmployeeCountB");
            initialEmployeeCountB.put("narrativa", narrativaB);
            initialEmployeeCountB.put("niveles", nivelesB);
            initialEmployeeCountB.put("sprites", spriteB);
            initialEmployeeCountB.put("sistemas", sistemaB);
            initialEmployeeCountB.put("DLC", dlcB);
            initialEmployeeCountB.put("integrador", integradorB);

            String jsonString = existingJsonObject.toJSONString();

            try (FileWriter fileWriter = new FileWriter("C:test\\valores.json")) {
                fileWriter.write(jsonString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nintendo = new javax.swing.JButton();
        Bethesda = new javax.swing.JButton();
        grafico = new javax.swing.JPanel();
        TitleProject = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TitleProject1 = new javax.swing.JPanel();
        dias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        segundos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nintendo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Nintendo.setForeground(new java.awt.Color(255, 51, 255));
        Nintendo.setText("Nintendo");
        Nintendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NintendoActionPerformed(evt);
            }
        });
        jPanel1.add(Nintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 120, 40));

        Bethesda.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Bethesda.setForeground(new java.awt.Color(102, 102, 255));
        Bethesda.setText("Bethesda");
        Bethesda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BethesdaActionPerformed(evt);
            }
        });
        jPanel1.add(Bethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 120, 40));

        grafico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graficoLayout = new javax.swing.GroupLayout(grafico);
        grafico.setLayout(graficoLayout);
        graficoLayout.setHorizontalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        graficoLayout.setVerticalGroup(
            graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 360, 230));

        TitleProject.setBackground(new java.awt.Color(51, 51, 51));
        TitleProject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Proyecto 1 Sistemas Operativos");
        TitleProject.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 280, 40));

        jPanel1.add(TitleProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        TitleProject1.setBackground(new java.awt.Color(102, 102, 255));
        TitleProject1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TitleProject1.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DiasEntrega");
        TitleProject1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        segundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundosActionPerformed(evt);
            }
        });
        TitleProject1.add(segundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SegundosPorDia");
        TitleProject1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel1.add(TitleProject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, 430));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/mariokart.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 200, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/doom.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 220, 390));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/thumbs-up-nice.gif"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 200, 160));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 80, 160));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getGRAFICO() {
        return grafico;
    }

    public void setGRAFICO(JPanel GRAFICO) {
        this.grafico = GRAFICO;
    }

    private void NintendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NintendoActionPerformed
        interN.setVisible(true);
        
    }//GEN-LAST:event_NintendoActionPerformed

    private void BethesdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BethesdaActionPerformed
        interB.setVisible(true);
    }//GEN-LAST:event_BethesdaActionPerformed

    private void segundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundosActionPerformed
    
    }//GEN-LAST:event_segundosActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new InterfazG(interfaz, interfazb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bethesda;
    private javax.swing.JButton Nintendo;
    private javax.swing.JPanel TitleProject;
    private javax.swing.JPanel TitleProject1;
    private javax.swing.JTextField dias;
    private javax.swing.JPanel grafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField segundos;
    // End of variables declaration//GEN-END:variables
}
