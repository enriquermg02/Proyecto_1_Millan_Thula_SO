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
        //Area Nintendo//
        Recursos recursosN= new Recursos(0,0,0,0,0);
        Drive drive = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorN = new ContadorProvisional();
        Thread DevelopersN []= new Thread[20];
        Interfaz interN = new Interfaz(drive,mutex,recursosN,DevelopersN,ContadorN);
        Compania nintendo =new Compania (interN, mutex, recursosN, drive);
//        //Fin//
//        //Area Bethesda//
        Recursos recursosB = new Recursos(0,0,0,0,0);
        Drive driveB = new Drive(0,0,0,0,0,0,0);
        ContadorProvisional ContadorB = new ContadorProvisional();
        Thread DevelopersB []= new Thread[20];
        InterfazB interB = new InterfazB(driveB, mutex, recursosB, DevelopersB, ContadorB);
        CompaniaB bethesda =new CompaniaB (interB ,mutex, recursosB, driveB);
        
        
        //graficos
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        DefaultCategoryDataset dataset2= new DefaultCategoryDataset();
        
        
        JFreeChart linea= ChartFactory.createLineChart("hads","Tiempo","Beneficos",dataset);
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
            
            interN.ContadorSpinner.setNarrative(narrativaN);
            interN.ContadorSpinner.setLevels(nivelesN);
            interN.ContadorSpinner.setSprite(spriteN);
            interN.ContadorSpinner.setSistem(sistemaN);
            interN.ContadorSpinner.setDLC(dlcN);
            interN.ContadorSpinner.setIntegrador(integradorN);
            
            JSONObject initialEmployeeCountB = (JSONObject) jsonObject.get("initialEmployeeCountB");
            int narrativaB = ((Long) initialEmployeeCountB.get("narrativa")).intValue();
            int nivelesB = ((Long) initialEmployeeCountB.get("niveles")).intValue();
            int spriteB = ((Long) initialEmployeeCountB.get("sprites")).intValue();
            int sistemaB = ((Long) initialEmployeeCountB.get("sistemas")).intValue();
            int dlcB = ((Long) initialEmployeeCountB.get("DLC")).intValue();
            int integradorB = ((Long) initialEmployeeCountB.get("integrador")).intValue();
            
            ContadorB.setNarrative(narrativaB);
            ContadorB.setLevels(nivelesB);
            ContadorB.setSprite(spriteB);
            ContadorB.setSistem(sistemaB);
            ContadorB.setDLC(dlcB);
            ContadorB.setIntegrador(integradorB);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    public void writeJson() {
        int dayDurationB = Integer.parseInt(this.segundos.getText());
        int daysForDeliveryB = Integer.parseInt(this.dias.getText());
        
        //Nintendo
       int narrativaN = interN.ContadorSpinner.narrative;
       int nivelesN = interN.ContadorSpinner.levels;
       int spriteN = interN.ContadorSpinner.sprite;
       int sistemaN = interN.ContadorSpinner.sistem;
       int dlcN = interN.ContadorSpinner.DLC;
       int integradorN = interN.ContadorSpinner.integrador;
       
       //Bethesda
       int narrativaB = ContadorB.narrative;
       int nivelesB = ContadorB.levels;
       int spriteB = ContadorB.sprite;
       int sistemaB = ContadorB.sistem;
       int dlcB = ContadorB.DLC;
       int integradorB = ContadorB.integrador;
       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        segundos = new javax.swing.JTextField();
        dias = new javax.swing.JTextField();
        grafico = new javax.swing.JPanel();

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

        jLabel1.setText("SegundosPorDia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel2.setText("DiasParaEntrega");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        segundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundosActionPerformed(evt);
            }
        });
        jPanel1.add(segundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        dias.setText("30");
        jPanel1.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

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

        jPanel1.add(grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 360, 230));

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
    private javax.swing.JTextField dias;
    private javax.swing.JPanel grafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField segundos;
    // End of variables declaration//GEN-END:variables
}
