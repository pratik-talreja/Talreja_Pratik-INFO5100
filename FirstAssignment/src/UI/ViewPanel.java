/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import firstassignment.PersonProfile;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author talre
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    
    PersonProfile person;
            
            
    public ViewPanel() {
        initComponents();
    }
    
    ViewPanel(PersonProfile person){
        initComponents();
        this.person = person;
        ViewProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        NameLable = new javax.swing.JLabel();
        AddressLable = new javax.swing.JLabel();
        DoBLable = new javax.swing.JLabel();
        PhoneNumberLable = new javax.swing.JLabel();
        FaxNumberLable = new javax.swing.JLabel();
        EmailAddressLable = new javax.swing.JLabel();
        SSNLable = new javax.swing.JLabel();
        MedicalRecordLable = new javax.swing.JLabel();
        HealthPlanLable = new javax.swing.JLabel();
        BankAccountLable = new javax.swing.JLabel();
        CertificateLable = new javax.swing.JLabel();
        VehicleLable = new javax.swing.JLabel();
        DeviceLable = new javax.swing.JLabel();
        LinkedinLable = new javax.swing.JLabel();
        IpAddressLable = new javax.swing.JLabel();
        PhotoIdLable = new javax.swing.JLabel();
        UniqueIdLable = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Profile Data");

        jLabel1.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("DoB:");

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Fax Number:");

        jLabel7.setText("Email Address:");

        jLabel8.setText("Social Security Number:");

        jLabel9.setText("Medical Record Number:");

        jLabel10.setText("Health Plan Number:");

        jLabel11.setText("Bank Account Number:");

        jLabel13.setText("Certificate Number:");

        jLabel14.setText("Vehicle Id Number:");

        jLabel15.setText("Device Id Number:");

        jLabel16.setText("LinkedIn Link:");

        jLabel17.setText("Ip Address:");

        jLabel18.setText("Photo Id:");

        jLabel19.setText("Unique Id:");

        NameLable.setText("jLabel12");

        AddressLable.setText("jLabel12");

        DoBLable.setText("jLabel12");

        PhoneNumberLable.setText("jLabel12");

        FaxNumberLable.setText("jLabel12");

        EmailAddressLable.setText("jLabel12");

        SSNLable.setText("jLabel12");

        MedicalRecordLable.setText("jLabel12");

        HealthPlanLable.setText("jLabel12");

        BankAccountLable.setText("jLabel12");

        CertificateLable.setText("jLabel12");

        VehicleLable.setText("jLabel12");

        DeviceLable.setText("jLabel12");

        LinkedinLable.setText("jLabel12");

        IpAddressLable.setText("jLabel12");

        PhotoIdLable.setMaximumSize(new java.awt.Dimension(1200, 1200));

        UniqueIdLable.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DoBLable))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddressLable))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PhoneNumberLable))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(NameLable)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EmailAddressLable))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FaxNumberLable)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SSNLable))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(BankAccountLable))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HealthPlanLable)
                                    .addComponent(MedicalRecordLable))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PhotoIdLable, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(145, 145, 145)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DeviceLable)
                                        .addComponent(VehicleLable)
                                        .addComponent(CertificateLable)
                                        .addComponent(LinkedinLable)
                                        .addComponent(IpAddressLable)))
                                .addComponent(UniqueIdLable)))
                        .addGap(120, 120, 120))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(381, 381, 381)
                            .addComponent(jLabel13)
                            .addGap(0, 203, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(NameLable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(CertificateLable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLable)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14)
                    .addComponent(VehicleLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoBLable)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15)
                    .addComponent(DeviceLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PhoneNumberLable)
                    .addComponent(jLabel16)
                    .addComponent(LinkedinLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FaxNumberLable)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(IpAddressLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailAddressLable)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(SSNLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(MedicalRecordLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(HealthPlanLable)))
                    .addComponent(PhotoIdLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(BankAccountLable)
                    .addComponent(jLabel19)
                    .addComponent(UniqueIdLable))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel13))
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLable;
    private javax.swing.JLabel BankAccountLable;
    private javax.swing.JLabel CertificateLable;
    private javax.swing.JLabel DeviceLable;
    private javax.swing.JLabel DoBLable;
    private javax.swing.JLabel EmailAddressLable;
    private javax.swing.JLabel FaxNumberLable;
    private javax.swing.JLabel HealthPlanLable;
    private javax.swing.JLabel IpAddressLable;
    private javax.swing.JLabel LinkedinLable;
    private javax.swing.JLabel MedicalRecordLable;
    private javax.swing.JLabel NameLable;
    private javax.swing.JLabel PhoneNumberLable;
    private javax.swing.JLabel PhotoIdLable;
    private javax.swing.JLabel SSNLable;
    private javax.swing.JLabel UniqueIdLable;
    private javax.swing.JLabel VehicleLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void ViewProfile() {
            NameLable.setText(person.getFullName());
            AddressLable.setText(person.getAddress());
            BankAccountLable.setText(String.valueOf(person.getBankAccountNumber()));
            CertificateLable.setText(String.valueOf(person.getCertificateNumber()));
            DeviceLable.setText(person.getDeviceIdentifier());
            DoBLable.setText(person.getDoB());
            EmailAddressLable.setText(person.getEmailAddress());
            FaxNumberLable.setText(String.valueOf(person.getFaxNumber()));
            HealthPlanLable.setText(String.valueOf(person.getHealthPlanNumber()));
            IpAddressLable.setText(person.getIpAddress());
            LinkedinLable.setText(person.getLinkedinLink());
            MedicalRecordLable.setText(String.valueOf(person.getMedicalRecordNumber()));
            PhoneNumberLable.setText(String.valueOf(person.getPhoneNumber()));
            SSNLable.setText((person.getSocialSecurityNumber()));
            UniqueIdLable.setText(person.getUniqueIdentification());
            VehicleLable.setText(person.getVehicleIdentifier());
            ImageIcon image = new ImageIcon(person.getPhotoFilePath());
            Image img = image.getImage();
            Image newImg = img.getScaledInstance(120,120, java.awt.Image.SCALE_SMOOTH);
            image = new ImageIcon(newImg);
            PhotoIdLable.setIcon(image);
            
            
            
            
    }
}
