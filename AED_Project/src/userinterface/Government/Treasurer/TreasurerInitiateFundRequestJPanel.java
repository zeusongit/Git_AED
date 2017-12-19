/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Government.Treasurer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.MayorOrganization;
import Business.Organization.Organization;
import Business.Organization.TreasurerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InitiateFundRequest;
import Business.WorkQueue.LabRequestEquipment;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Constants;

/**
 *
 * @author Ashish
 */
public class TreasurerInitiateFundRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private TreasurerOrganization to;
    private Enterprise enterprise;
    public TreasurerInitiateFundRequestJPanel(JPanel userProcessContainer, UserAccount account,TreasurerOrganization to,Enterprise enterprise ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.business=business;
        this.to=to;
        this.enterprise=enterprise;
        populateRequest();
    }
public void populateRequest()
{
    DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
    SimpleDateFormat dtFormat =  new SimpleDateFormat ("MM/dd/yyyy");
    model.setRowCount(0); 
    for (WorkRequest request : to.getFundReqIniQueue().getWorkRequestList())
    {
        Object[] row = new Object[5];
        row[0] = request;
        row[1] = request.getRequestedFor().getName();
        row[2] = request.getTrail().getSender(Constants.TrailLevel.Level4)==null?"--":request.getTrail().getSender(Constants.TrailLevel.Level4);       
        row[3] = request.getTrail().getRequestDate(Constants.TrailLevel.Level4)==null?"--":dtFormat.format(request.getTrail().getRequestDate(Constants.TrailLevel.Level4));
        row[4] = request.getStatus() == null ? "Waiting" : request.getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Initate Fund Transfer");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Beneficiary", "Approved By", "Approved On", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequest);

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnComplete.setText("Complete Request");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComplete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblRequest.getSelectedRow();

        if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select atleast one row.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

        WorkRequest request = (WorkRequest)tblRequest.getValueAt(selectedRow, 0);
        if(request.getStatus()==Constants.Status.Forwarded_M)
        {
                request.getTrail().updateTrail(Constants.Status.Processing_T, account,null);
                request.setReceiver(account);
                request.setStatus(Constants.Status.Processing_T);
                populateRequest();
            }
        else
        {
                JOptionPane.showMessageDialog(null, "Request is not pending to be assigned anymore.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select atleast one row.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
        }
        WorkRequest request = (WorkRequest)tblRequest.getValueAt(selectedRow, 0);
        if(request.getStatus()==Constants.Status.Processing_T)
        {
            long totalFunds=0;
            Organization org=null;
            for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(o instanceof MayorOrganization)
                {
                    org=o;
                    totalFunds=((MayorOrganization) o).getTotalFunds();
                }
            }
            if(totalFunds>0)
            {
                if(((InitiateFundRequest)request).getRequestedFunds()<=totalFunds)
                {
                    if(org!=null)
                    {
                        ((MayorOrganization) org).updateTotalFunds(((InitiateFundRequest)request).getRequestedFunds(),0);
                        request.getRequestedFor().updateTotalFunds(((InitiateFundRequest)request).getRequestedFunds(),1);
                        request.getTrail().updateTrail(Constants.Status.Completed, null,null);
                        request.setStatus(Constants.Status.Completed);
                        if(request.getReqType().equals(Constants.ReqType.InitTransfer.toString()))
                        {
                            request.getRequestedFor().setLastAllocation(new Date());
                        }
                    }
                }
            }
            populateRequest();
        }
        else
        {
                JOptionPane.showMessageDialog(null, "Request is not pending to be assigned anymore.", "Warning", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
}