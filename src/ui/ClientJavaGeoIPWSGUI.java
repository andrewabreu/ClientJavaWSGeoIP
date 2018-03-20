/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import newdatasets.GeoIP;
import parser.ParserSimpleXML;

/**
 *
 * @author Andrew
 */
public class ClientJavaGeoIPWSGUI extends javax.swing.JFrame {

    public ClientJavaGeoIPWSGUI() {
        initComponents();
    }

    public void showGeoIPResults(String ip){
        GeoIP geoIp = ParserSimpleXML.getGeoIPObject(ip);
        returnCodeTextField1.setText(geoIp.getReturnCode());
        dirIPTextField1.setText(geoIp.getIp());
        returnCodeDetails1.setText(geoIp.getReturnCodeDetails());
        countryNameTextField1.setText(geoIp.getCountryName());
        countryCodeTextField1.setText(geoIp.getCountryCode());
        if(geoIp == null){
            System.out.println("Hola");
        }
    }
    
    public void showGeoIPContextResults(){
        GeoIP geoIp = ParserSimpleXML.getGeoIPContextObject();
        returnCodeTextField2.setText(geoIp.getReturnCode());
        dirIPTextField2.setText(geoIp.getIp());
        returnCodeDetailsTextField2.setText(geoIp.getReturnCodeDetails());
        countryNameTextField2.setText(geoIp.getCountryName());
        countryCodeTextField2.setText(geoIp.getCountryCode());        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geoIPLabelPanel = new javax.swing.JPanel();
        geoIPLabel = new javax.swing.JLabel();
        getGeoIpPanel = new javax.swing.JPanel();
        getIPLabel = new javax.swing.JLabel();
        geoIPTextField = new javax.swing.JTextField();
        returnCodeTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dirIPTextField1 = new javax.swing.JTextField();
        returnCodeDetails1 = new javax.swing.JTextField();
        countryNameTextField1 = new javax.swing.JTextField();
        countryCodeTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        geoIPButton = new javax.swing.JButton();
        getGeoIpContextPanel = new javax.swing.JPanel();
        geoIPContextLabel = new javax.swing.JLabel();
        geoIPContextButtonGenerate = new javax.swing.JButton();
        dirIPTextField2 = new javax.swing.JTextField();
        returnCodeDetailsTextField2 = new javax.swing.JTextField();
        countryNameTextField2 = new javax.swing.JTextField();
        countryCodeTextField2 = new javax.swing.JTextField();
        returnCodeTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        geoIPContextButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        geoIPLabel.setText("Web Service - GeoIP");

        javax.swing.GroupLayout geoIPLabelPanelLayout = new javax.swing.GroupLayout(geoIPLabelPanel);
        geoIPLabelPanel.setLayout(geoIPLabelPanelLayout);
        geoIPLabelPanelLayout.setHorizontalGroup(
            geoIPLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoIPLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geoIPLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        geoIPLabelPanelLayout.setVerticalGroup(
            geoIPLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geoIPLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        getIPLabel.setText("Introduce una dirección IP:");

        returnCodeTextField1.setEditable(false);

        jLabel1.setText("Código de retorno:");

        dirIPTextField1.setEditable(false);

        returnCodeDetails1.setEditable(false);

        countryNameTextField1.setEditable(false);

        countryCodeTextField1.setEditable(false);

        jLabel2.setText("Dirección IP");

        jLabel3.setText("Detalles del código de retorno:");

        jLabel4.setText("Nombre del país:");

        jLabel5.setText("Código del país:");

        geoIPButton.setText("Mostrar");
        geoIPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geoIPButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getGeoIpPanelLayout = new javax.swing.GroupLayout(getGeoIpPanel);
        getGeoIpPanel.setLayout(getGeoIpPanelLayout);
        getGeoIpPanelLayout.setHorizontalGroup(
            getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getGeoIpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getIPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(geoIPTextField)
                    .addComponent(geoIPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(countryCodeTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(countryNameTextField1)
                    .addComponent(returnCodeDetails1)
                    .addComponent(dirIPTextField1)
                    .addComponent(returnCodeTextField1))
                .addContainerGap())
        );
        getGeoIpPanelLayout.setVerticalGroup(
            getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getGeoIpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getIPLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geoIPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnCodeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirIPTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(geoIPButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnCodeDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryCodeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        geoIPContextLabel.setText("Pulse para ver el contexto de su dirección IP:");

        geoIPContextButtonGenerate.setText("Contexto IP");
        geoIPContextButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geoIPContextButtonGenerateActionPerformed(evt);
            }
        });

        dirIPTextField2.setEditable(false);

        returnCodeDetailsTextField2.setEditable(false);

        countryNameTextField2.setEditable(false);

        countryCodeTextField2.setEditable(false);

        returnCodeTextField2.setEditable(false);

        jLabel7.setText("Código de retorno:");

        jLabel8.setText("Dirección IP");

        jLabel9.setText("Detalles del código de retorno:");

        jLabel10.setText("Nombre del país:");

        jLabel11.setText("Código del país:");

        geoIPContextButtonClear.setText("Limpiar");
        geoIPContextButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geoIPContextButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getGeoIpContextPanelLayout = new javax.swing.GroupLayout(getGeoIpContextPanel);
        getGeoIpContextPanel.setLayout(getGeoIpContextPanelLayout);
        getGeoIpContextPanelLayout.setHorizontalGroup(
            getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getGeoIpContextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(getGeoIpContextPanelLayout.createSequentialGroup()
                        .addComponent(geoIPContextLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getGeoIpContextPanelLayout.createSequentialGroup()
                        .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(geoIPContextButtonGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(geoIPContextButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(getGeoIpContextPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(countryCodeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(getGeoIpContextPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(countryNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getGeoIpContextPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnCodeDetailsTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getGeoIpContextPanelLayout.createSequentialGroup()
                                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dirIPTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(returnCodeTextField2))))))
                .addContainerGap())
        );
        getGeoIpContextPanelLayout.setVerticalGroup(
            getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getGeoIpContextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geoIPContextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geoIPContextButtonGenerate)
                    .addComponent(returnCodeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirIPTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(geoIPContextButtonClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnCodeDetailsTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getGeoIpContextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryCodeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geoIPLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getGeoIpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getGeoIpContextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geoIPLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getGeoIpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getGeoIpContextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geoIPContextButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geoIPContextButtonGenerateActionPerformed
        // TODO add your handling code here:
        showGeoIPContextResults();
    }//GEN-LAST:event_geoIPContextButtonGenerateActionPerformed

    private void geoIPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geoIPButtonActionPerformed
        // TODO add your handling code here:
        String ip = geoIPTextField.getText();
        if(ip.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "No ha introducido ninguna dirección IP.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);             
        }else{
            String IPADDRESS_PATTERN =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
            //Pattern p = Pattern.compile("[0-255].[0-255].[0-255].[0-255]");
            Pattern p = Pattern.compile(IPADDRESS_PATTERN);
            Matcher m = p.matcher(ip);
            if(!m.find()){
                JOptionPane.showMessageDialog(this,
                    "El dato que ha introducido no es una dirección IP.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);             
            }else{
                if(ip.equals("255.255.255.255")){
                    JOptionPane.showMessageDialog(this,
                        "Ha introducido 255.255.255.255, no se considera una dirección IP.",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE); 
                }else{
                    showGeoIPResults(ip);
                }
            }
        }
    }//GEN-LAST:event_geoIPButtonActionPerformed

    private void geoIPContextButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geoIPContextButtonClearActionPerformed
        // TODO add your handling code here:
        returnCodeTextField2.setText("");
        dirIPTextField2.setText("");
        returnCodeDetailsTextField2.setText("");
        countryNameTextField2.setText("");
        countryCodeTextField2.setText("");         
    }//GEN-LAST:event_geoIPContextButtonClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField countryCodeTextField1;
    private javax.swing.JTextField countryCodeTextField2;
    private javax.swing.JTextField countryNameTextField1;
    private javax.swing.JTextField countryNameTextField2;
    private javax.swing.JTextField dirIPTextField1;
    private javax.swing.JTextField dirIPTextField2;
    private javax.swing.JButton geoIPButton;
    private javax.swing.JButton geoIPContextButtonClear;
    private javax.swing.JButton geoIPContextButtonGenerate;
    private javax.swing.JLabel geoIPContextLabel;
    private javax.swing.JLabel geoIPLabel;
    private javax.swing.JPanel geoIPLabelPanel;
    private javax.swing.JTextField geoIPTextField;
    private javax.swing.JPanel getGeoIpContextPanel;
    private javax.swing.JPanel getGeoIpPanel;
    private javax.swing.JLabel getIPLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField returnCodeDetails1;
    private javax.swing.JTextField returnCodeDetailsTextField2;
    private javax.swing.JTextField returnCodeTextField1;
    private javax.swing.JTextField returnCodeTextField2;
    // End of variables declaration//GEN-END:variables
}
