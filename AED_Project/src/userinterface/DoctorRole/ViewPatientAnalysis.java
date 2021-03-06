/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Patient.Encounter;
import Business.Patient.Patient;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Ashish
 */
public class ViewPatientAnalysis extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Encounter encounter;
    private Patient patient;
    public ViewPatientAnalysis(JPanel userProcessContainer, Encounter encounter, Patient patient) {
        initComponents();
        this.patient=patient;
        this.encounter=encounter;
        this.userProcessContainer=userProcessContainer;
                
//        Encounter te=this.patient.getEncounterList().addEncounter();
//        te.getVitals().setBphigh(Integer.parseInt("56"));
//        te.getVitals().setBplow(Integer.parseInt("76"));
//        te.getVitals().setWeight(Integer.parseInt("89"));
//        te.getVitals().setHeight(Integer.parseInt("190"));
//        te.getVitals().setTemperature(Integer.parseInt("43"));
//        te.getVitals().setPulse(Integer.parseInt("45"));
//        te.getVitals().setCholestrol(Integer.parseInt("567"));
//        te.getVitals().setInsulinLevel(Integer.parseInt("343"));
//        te.getVitals().setBmi(Double.parseDouble("4"));
//        
//        te=this.patient.getEncounterList().addEncounter();
//        te.getVitals().setBphigh(Integer.parseInt("86"));
//        te.getVitals().setBplow(Integer.parseInt("71"));
//        te.getVitals().setWeight(Integer.parseInt("109"));
//        te.getVitals().setHeight(Integer.parseInt("10"));
//        te.getVitals().setTemperature(Integer.parseInt("143"));
//        te.getVitals().setPulse(Integer.parseInt("452"));
//        te.getVitals().setCholestrol(Integer.parseInt("57"));
//        te.getVitals().setInsulinLevel(Integer.parseInt("43"));
//        te.getVitals().setBmi(Double.parseDouble("9"));
        
        SimpleDateFormat dtFormat =  new SimpleDateFormat ("MM/dd/yyyy HH:mm");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Encounter e:patient.getEncounterList().getEncounterList())
        {
            dataset.setValue(e.getVitals().getInsulinLevel(),dtFormat.format(e.getRecordDate()),"Record Date");          
        }
        JFreeChart barChart = ChartFactory.createBarChart(
        "Vitals Over Time for PID:"+patient.getPatientId(),           
        "Insulin Level On:",            
        "Level",            
        dataset,         
        PlotOrientation.VERTICAL,           
        true, true, false);

       barChart.setBackgroundPaint(Color.white);
       chartPanel.setLayout(new java.awt.BorderLayout());
       ChartPanel CP =new ChartPanel(barChart);
       chartPanel.add(CP,BorderLayout.CENTER);
       chartPanel.validate();   
        
        showHidePreloaders(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        chartPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblPreloader = new javax.swing.JLabel();
        lblWait = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("View Patient Analysis Report");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chartPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Vitals Over Time"));

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Recommendation specific to the current vitals:");

        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel3.setText("Click below to run the model:");

        lblPreloader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreloader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/preloader.gif"))); // NOI18N

        lblWait.setText("Please wait....");

        lblResult.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWait))
                            .addComponent(jLabel3)
                            .addComponent(lblResult)
                            .addComponent(lblPreloader, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWait))
                        .addGap(18, 18, 18)
                        .addComponent(lblResult)
                        .addGap(18, 18, 18)
                        .addComponent(lblPreloader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed
public void showHidePreloaders(boolean flag)
{
        lblPreloader.setVisible(flag);
        lblWait.setVisible(flag);
        lblResult.setVisible(!flag);
        
}
    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        showHidePreloaders(true);    
       btnRun.setEnabled(false);
            new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                try
                {    
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(patient.getDateofBirth());
                    int year = cal.get(Calendar.YEAR);
                    int age=Calendar.getInstance().get(Calendar.YEAR)-year;

                    ArrayList<String> v=new ArrayList<>();
                    v.add(String.valueOf(encounter.getVitals().getGlucose()));
                    v.add(String.valueOf(encounter.getVitals().getBphigh()));
                    v.add(String.valueOf(encounter.getVitals().getInsulinLevel()));
                    v.add(String.valueOf(encounter.getVitals().getBmi()));
                    v.add(String.valueOf(age));

                    //generate CSV
                    utility.Validator.generateCsvFile(v,1);

                    //Run SCRIPT 79.2% accuracy
                    //"python "+cmd + py + ".py"
                    String target = new String("cmd.exe /c python Classifier.py");
                    Runtime rt = Runtime.getRuntime();
                    Process proc = rt.exec(target);
                    proc.waitFor();
                    StringBuffer output = new StringBuffer();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                    String line = "";                       
                    while ((line = reader.readLine())!= null) {
                            output.append(line + "\n");
                    }
                    System.out.println("### " + output);
                    if(String.valueOf(output).contains("0"))
                    {
                        lblResult.setText("No/Low Risk of diabetes prediicted given the current vitals!");
                        lblResult.setForeground(Color.decode("#26C281"));
                    }
                    else
                    {
                        lblResult.setText("Average/High Risk of diabetes prediicted given the current vitals!");
                        lblResult.setForeground(Color.decode("#D24D57"));
                    }

                } catch (Throwable t)
                {
                    t.printStackTrace();
                }
            return null;
            }
            @Override
            protected void done() {
                showHidePreloaders(false); 
                btnRun.setEnabled(true);
            }
            }.execute();
               
    }//GEN-LAST:event_btnRunActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRun;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPreloader;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblWait;
    // End of variables declaration//GEN-END:variables
}
