/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Citizen;

import Business.Enterprise.Enterprise;
import Business.Enterprise.RemoteClinicEnterprise;
import Business.Organization.remoteClinicManagerOrganization;
import Business.Travel.TravelSchedule;
import Business.Travel.TravelScheduleDirectory;
import Business.UserAccount.UserAccount;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author haroonperveez
 */
public class TravelScheduleView extends javax.swing.JPanel {

    /**
     * Creates new form TravelScheduleView
     */
    Enterprise enterprise;
      
      JPanel userProcessContainer;
      UserAccount account;
      remoteClinicManagerOrganization travelOrganization;
      RemoteClinicEnterprise e;
      public static final int MIN_ZOOM = 0;
       public static final int MAX_ZOOM = 21;
       private String[] locArr=new String[4];
       private String[] latArr=new String[4];
       private String[] lonArr=new String[4];
       
       private static int zoomValue = 4;
      
       
    public TravelScheduleView(JPanel userProcessContainer, RemoteClinicEnterprise e) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.e=e;
        this.account=account;
        
        populatetravelTable();
    }
      public void populatetravelTable()
        {

            DefaultTableModel model = (DefaultTableModel) traveltbl.getModel();   
            model.setRowCount(0);
            
            for (TravelSchedule ts: e.getTravelScheduleDirectory().getTravelScheduleList())
                    {
                Object[] row = new Object[9];
                row[0] = ts;
                row[1] = ts.getStop1Time();
                row[2] = ts.getStop1();
                row[3] = ts.getStop2Time();
                row[4] = ts.getStop2();
                row[5] = ts.getStop3Time();
                row[6] = ts.getStop3();
                row[7] = ts.getStop4Time();
                row[8] = ts.getStop4();
                model.addRow(row); 

            }
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        traveltbl = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        sourceTxtField = new javax.swing.JTextField();
        searchRouteBTn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 62, 80));

        traveltbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bus Number", "Duration", "Stop1", "Duration", "Stop 2", "Duration", "Stop3", "Duration", "Stop4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(traveltbl);

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("View on Map");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        sourceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTxtFieldActionPerformed(evt);
            }
        });

        searchRouteBTn.setText("Search");
        searchRouteBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRouteBTnActionPerformed(evt);
            }
        });

        jLabel3.setText("Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton4)
                .addGap(218, 218, 218)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(sourceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchRouteBTn)
                .addGap(204, 204, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sourceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchRouteBTn)
                    .addComponent(jButton4))
                .addGap(282, 282, 282))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jButton2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(333, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         // TODO add your handling code here:
        //http://maps.googleapis.com/maps/api/geocode/json?address=Sayaji+Hotel+Near+balewadi+stadium+pune&sensor=true
        int row = traveltbl.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a route!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        TravelSchedule ts = (TravelSchedule)traveltbl.getValueAt(row, 0);
        locArr[0]=ts.getStop1();
        locArr[1]=ts.getStop2();
        locArr[2]=ts.getStop3();
        locArr[3]=ts.getStop4();
        for(int i=0;i<locArr.length;i++)
        {
            locArr[i]=locArr[i].trim().replaceAll(" ","+");
        }
        ////
        for(int i=0;i<locArr.length;i++)
        {
        URL url = null;
        try {
            url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address="+locArr[i]+"&sensor=true");
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        
        String output = "", full = "";
        while ((output = br.readLine()) != null) {
        System.out.println(output);
        full += output;
        }
        try{
        JSONObject obj = new JSONObject(full);
    if (! obj.getString("status").equals("OK"))
        return;
 
    // get the first result
    JSONObject res = obj.getJSONArray("results").getJSONObject(0);
    System.out.println(res.getString("formatted_address"));
    JSONObject loc =
        res.getJSONObject("geometry").getJSONObject("location");
    System.out.println("lat: " + loc.getDouble("lat") +
                        ", lng: " + loc.getDouble("lng"));
    latArr[i]=String.valueOf(loc.getDouble("lat"));
    lonArr[i]=String.valueOf(loc.getDouble("lng"));
        }
        catch(JSONException e)
        {e.printStackTrace();}
        
        } catch (MalformedURLException e) {
        e.printStackTrace();
    }
       catch (IOException e) {
        e.printStackTrace();
    }
        }
        
        
        /////String lat1='';
        final Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

        JButton setMarkerButton = new JButton("Set Marker");
        setMarkerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<locArr.length;i++)
                {
                browser.executeJavaScript("var myLatlng = new google.maps.LatLng("+
                        latArr[i]+
                        ","+
                        lonArr[i]+
                        ");\n" +
                    "var marker = new google.maps.Marker({\n" +
                    "    position: myLatlng,\n" +
                    "    map: map,\n" +
                    "    title: 'View On Map!'\n" +
                    "});");
                
//                browser.executeJavaScript("var myLatlng = new google.maps.LatLng("+lat2+","+lon2+");\n" +
//                    "var marker = new google.maps.Marker({\n" +
//                    "    position: myLatlng,\n" +
//                    "    map: map,\n" +
//                    "    title: 'View On Map!'\n" +
//                    "});");
//                browser.executeJavaScript("var myLatlng = new google.maps.LatLng("+lat3+","+lon3+");\n" +
//                    "var marker = new google.maps.Marker({\n" +
//                    "    position: myLatlng,\n" +
//                    "    map: map,\n" +
//                    "    title: 'View On Map!'\n" +
//                    "});");
//                browser.executeJavaScript("var myLatlng = new google.maps.LatLng("+lat4+","+lon4+");\n" +
//                    "var marker = new google.maps.Marker({\n" +
//                    "    position: myLatlng,\n" +
//                    "    map: map,\n" +
//                    "    title: 'View On Map!'\n" +
//                    "});");
                }
            }
            
            
            
        });

        JButton zoomInButton = new JButton("Zoom In");
        zoomInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zoomValue < MAX_ZOOM) {
                    browser.executeJavaScript("map.setZoom(" + ++zoomValue + ")");
                }
            }
        });

        JButton zoomOutButton = new JButton("Zoom Out");
        zoomOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zoomValue > MIN_ZOOM) {
                    browser.executeJavaScript("map.setZoom(" + --zoomValue + ")");
                }
            }
        });

        JPanel toolBar = new JPanel();
        toolBar.add(zoomInButton);
        toolBar.add(zoomOutButton);

        toolBar.add(setMarkerButton);

        JFrame frame = new JFrame("Map.html");
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.add(toolBar, BorderLayout.SOUTH);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(900, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //browser.loadURL("file:///Users/haroonperveez/Downloads/Map.html");
        browser.loadURL("D://ashis//Downloads//MS//SEM1//AED//Assignments//Repository//aed_project_repo//AED_Project//Map.html");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void sourceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTxtFieldActionPerformed

    private void searchRouteBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRouteBTnActionPerformed
        // TODO add your handling code here:
         if(searchRouteBTn.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"Please enter a name and password");
        }

        TravelScheduleDirectory tsd =  ((RemoteClinicEnterprise)enterprise).getTravelScheduleDirectory();
        TravelSchedule t = tsd.searchTrvel(sourceTxtField.getText());

        if((sourceTxtField.getText().isEmpty())){

            JOptionPane.showMessageDialog(null, "Please enter location");

        }

        else if(t==null){
            JOptionPane.showMessageDialog(null, "No remote clininc for this area");
        }

        else{

            DefaultTableModel model = (DefaultTableModel) traveltbl.getModel();
            model.setRowCount(0);

            Object[] row = new Object[5];
            row[0] = t;
            row[1] = t.getStop1();
            row[2] = t.getStop2();
            row[3] = t.getStop3();
            row[4] = t.getStop4();
            model.addRow(row);

        }

    }//GEN-LAST:event_searchRouteBTnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchRouteBTn;
    private javax.swing.JTextField sourceTxtField;
    private javax.swing.JTable traveltbl;
    // End of variables declaration//GEN-END:variables
}