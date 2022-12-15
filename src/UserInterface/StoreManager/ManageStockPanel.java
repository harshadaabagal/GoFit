/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StoreManager;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Products;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harshada
 */
public class ManageStockPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStockPanel
     */
    
    
    private JPanel userContainer;
    private UserAccount userAcc;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private Ecosystem system;
   
    public ManageStockPanel(JPanel userContainer, Organization organization, Ecosystem system, Enterprise enterprise, UserAccount account) {
        initComponents();
          this.organization=organization;
        this.enterprise=enterprise;
        this.account=account;
        this.system=system;
        this.userContainer= userContainer;
                populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTbl = new javax.swing.JTable();
        delBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        itemNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        menuTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTbl);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 91));

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 130, 40));

        jLabel5.setText("Item Type");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 100, 30));

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipments", "Supplements" }));
        kGradientPanel1.add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 150, 30));

        itemNameTxt.setMinimumSize(new java.awt.Dimension(7, 25));
        kGradientPanel1.add(itemNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Item Name");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 100, 30));

        priceTxt.setMinimumSize(new java.awt.Dimension(7, 25));
        kGradientPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 150, 30));

        addBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 100, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 130, 30));

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel1.setText("MANAGE STOCK");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
     

            for(Products product:enterprise.getProductsList()) {
                if(itemNameTxt.getText().equals(product.getProductName())){

                    JOptionPane.showMessageDialog(this, "Product already exists.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if(itemNameTxt.getText().equals("")||itemNameTxt.getText()==null){
                JOptionPane.showMessageDialog(this, "Field(s) cannot be empty.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!itemNameTxt.getText().matches("^[a-zA-Z0-9 ]*$")){
                JOptionPane.showMessageDialog(this, "Invalid Item Name.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                Double.parseDouble(priceTxt.getText());
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, "Invalid Price.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(Double.parseDouble(priceTxt.getText()) <= 0){
                JOptionPane.showMessageDialog(null, "Price should be greater than zero.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = itemNameTxt.getText();
            String type = (String) typeComboBox.getSelectedItem();
            int price = Integer.parseInt(priceTxt.getText());
            Products p = enterprise.createMenuItem();
            p.setProductName(name);
            p.setProductType(type);
            p.setPrice(price);
            JOptionPane.showMessageDialog(null, "Item Added Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
            populateTable();
            itemNameTxt.setText("");
            priceTxt.setText("");
            typeComboBox.setSelectedIndex(0);
         

//        else{
//            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
//        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        try{
        int selectedRow = menuTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            Products product = (Products)menuTbl.getValueAt(selectedRow, 0);
            enterprise.deleteItem(product);
            JOptionPane.showMessageDialog(this, "Item deleted successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          try{
        userContainer.remove(this);
        CardLayout layout = (CardLayout)userContainer.getLayout();
        layout.previous(userContainer);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField itemNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable menuTbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel dtm = (DefaultTableModel) menuTbl.getModel();
        dtm.setRowCount(0);
      
        for(Products store:enterprise.getProductsList()) {
            Object row[] = new Object[3];
            row[0] = store;
            row[1] = store.getProductType();
            row[2] = store.getPrice();
            dtm.addRow(row);
        }
    }
}
