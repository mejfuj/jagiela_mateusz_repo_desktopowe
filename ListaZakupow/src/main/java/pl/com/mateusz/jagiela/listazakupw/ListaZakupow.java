/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.mateusz.jagiela.listazakupw;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Szymon
 */
public class ListaZakupow extends javax.swing.JFrame {

    /**
     * Creates new form ListaZakupow
     */
    public ListaZakupow() {
        initComponents();
        addKeyListenerTo_jTextField_insertName();
        //addKeyListenerTo_jTextField_insertValue();
        //addKeyListenerTo_jTextField_insertValue2();
        addKeyListenerTo_jTextField_date();
        addToolTipToElements();
        addToolTipToElements2();
        addToolTipToElements3();
        addToolTipToElements4();
        filljCBProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel_insertData = new javax.swing.JPanel();
        jLabel_insertName = new javax.swing.JLabel();
        jTextField_insertName = new javax.swing.JTextField();
        jLabel_insertValue = new javax.swing.JLabel();
        jTextField_insertValue = new javax.swing.JTextField();
        jLabel_today = new javax.swing.JLabel();
        jLabel_typeOfProduct = new javax.swing.JLabel();
        jComboBox_typeOfProduct = new javax.swing.JComboBox<>();
        jLabel_date = new javax.swing.JLabel();
        jTextField_date = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jLabel_todayCost = new javax.swing.JLabel();
        jLabel_weeklyCost = new javax.swing.JLabel();
        jTextField_weeklyCost = new javax.swing.JTextField();
        jTextField_todayCost = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jTextArea_today = new javax.swing.JTextArea();
        jPanel_insert = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        sr_jMenu_file = new javax.swing.JMenu();
        sr_jMenu_edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_insertName.setText("Wpisz co kupiłeś");

        jTextField_insertName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_insertNameActionPerformed(evt);
            }
        });

        jLabel_insertValue.setText("Podaj wartość");

        jTextField_insertValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_insertValueActionPerformed(evt);
            }
        });

        jLabel_today.setText("Dzisiejsze zakupy");

        jLabel_typeOfProduct.setText("Typ zakupionego towaru");

        jComboBox_typeOfProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_date.setText("Data zakupu");

        jTextField_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dateActionPerformed(evt);
            }
        });

        jButton_save.setText("ZAPISZ");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jLabel_todayCost.setText("Wydatki z dzisiaj:");

        jLabel_weeklyCost.setText("Wydatki z tygodnia:");

        jTextField_todayCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_todayCostActionPerformed(evt);
            }
        });

        jTextArea_today.setColumns(20);
        jTextArea_today.setRows(5);
        jScrollPane.setViewportView(jTextArea_today);

        javax.swing.GroupLayout jPanel_insertDataLayout = new javax.swing.GroupLayout(jPanel_insertData);
        jPanel_insertData.setLayout(jPanel_insertDataLayout);
        jPanel_insertDataLayout.setHorizontalGroup(
            jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                        .addComponent(jLabel_today)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_typeOfProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_typeOfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_date)))
                            .addComponent(jButton_save, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                                        .addComponent(jLabel_insertName)
                                        .addGap(0, 176, Short.MAX_VALUE))
                                    .addComponent(jTextField_insertName))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_insertValue)
                                    .addComponent(jTextField_insertValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                                .addComponent(jLabel_todayCost)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField_todayCost))
                            .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                                .addComponent(jLabel_weeklyCost, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_weeklyCost, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel_insertDataLayout.setVerticalGroup(
            jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_insertName)
                            .addComponent(jLabel_insertValue)
                            .addComponent(jLabel_typeOfProduct)
                            .addComponent(jLabel_date))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_insertName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_insertValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_typeOfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel_today))
                    .addComponent(jButton_save))
                .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_todayCost)
                            .addComponent(jTextField_todayCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_insertDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_weeklyCost)
                            .addComponent(jTextField_weeklyCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_insertDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane.addTab("Wprowadź zakupy", jPanel_insertData);

        javax.swing.GroupLayout jPanel_insertLayout = new javax.swing.GroupLayout(jPanel_insert);
        jPanel_insert.setLayout(jPanel_insertLayout);
        jPanel_insertLayout.setHorizontalGroup(
            jPanel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel_insertLayout.setVerticalGroup(
            jPanel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Lista zakupów", jPanel_insert);

        sr_jMenu_file.setText("File");
        jMenuBar.add(sr_jMenu_file);

        sr_jMenu_edit.setText("Edit");
        jMenuBar.add(sr_jMenu_edit);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_todayCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_todayCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_todayCostActionPerformed

    private void jTextField_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dateActionPerformed

    private void jTextField_insertNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_insertNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_insertNameActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        jTextArea_today.setText(jTextArea_today.getText()+jTextField_insertName.getText()+"; "+jTextField_insertValue.getText()+"; "+jComboBox_typeOfProduct.getSelectedItem()+"; "+jTextField_date.getText()+";\n");
        //clear();
        //saveSettings();
        FileUtils stf = new FileUtils();
        stf.saveToFile(jTextField_insertName.getText());
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jTextField_insertValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_insertValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_insertValueActionPerformed

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
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaZakupow().setVisible(true);
            }
        });
    }

    private void addKeyListenerTo_jTextField_insertName(){
        jTextField_insertName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
//                if(e.getKeyChar() == KeyEvent.VK_ENTER){
//                    System.out.println("Wprowadzono dane: ");
//                    sr_jTextField_insertName.setText(sr_jTextField_insertName.getText());
//                }
                char ch = e.getKeyChar();
                if((ch >= 'A' && ch <= 'z') || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE){
                    jTextField_insertName.setEditable(true);
                    System.out.println("Nacisnieto: "+ch);
                }else jTextField_insertName.setEditable(false);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    /*private void addKeyListenerTo_jTextField_insertValue(){
        jTextField_insertValue.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9') || ch == KeyEvent.VK_BACK_SPACE){
                    jTextField_insertValue.setEditable(true);
                    System.out.println("Nacisnieto cyfre "+ch);
                }else jTextField_insertValue.setEditable(false);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    } */
    
    /*private void addKeyListenerTo_jTextField_insertValue2(){
        //Dodanie kropki i wprow. dwoch znakow po
        jTextField_insertValue.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                String temp = jTextField_insertValue.getText();
                
                System.out.println("Przecinek "+temp.indexOf(",")+" dlugosc tekstu: "+temp.length());
                String [] splitted = temp.split(",");
                if(splitted.length > 1){
                    System.out.println(splitted[0]+" po przecinku "+splitted[1]);
                }
                
                System.out.println(temp.indexOf(","));
                
                if(temp.contains(",")){
                    if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE){
                        System.out.println("NACISNIETO CYFRE "+ch);
                        jTextField_insertValue.setEditable(true);
                    }else{
                        jTextField_insertValue.setEditable(false);
                    }
                }else{
                    if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE || ch == ','){
                        jTextField_insertValue.setEditable(true);
                    }else{
                        jTextField_insertValue.setEditable(false);
                    }
                }
            }
        });
    } */
    
    private void addKeyListenerTo_jTextField_date(){
        jTextField_date.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextField_date.getText();
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE) && (temp.length()<10 || ch == KeyEvent.VK_BACK_SPACE)){
                    jTextField_date.setEditable(true);
                    if((temp.length() == 4 || temp.length() == 7) && ch != KeyEvent.VK_BACK_SPACE){
                        jTextField_date.setText(temp+"-");
                    }
                    //System.out.println("Nacisnieto cyfre "+ch);
                }else jTextField_date.setEditable(false);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    private void addToolTipToElements(){
        jTextField_insertName.setToolTipText("<html>"
                + "<h3>Wprowadz tekst</h3>"
                + "<p>nie uzywaj polskich znakow</p>"
                + "</html>");
    }
    
    private void addToolTipToElements2(){
        jTextField_insertValue.setToolTipText("<html>"
                + "<h3>Wprowadz wartosc</h3>"
                + "<p>Uzyj liczby</p>"
                + "</html>");
    }
    
    private void addToolTipToElements3(){
        jComboBox_typeOfProduct.setToolTipText("<html>"
                + "<h3>Wybierz typ produktu</h3>"
                + "<p>Wybierz jeden z powyzszych</p>"
                + "</html>");
    }
    
    private void addToolTipToElements4(){
        jTextField_date.setToolTipText("<html>"
                + "<h3>Wpisz date</h3>"
                + "<p>ROK-MIESIAC-DZIEN</p>"
                + "</html>");
    }
    
    private void saveSettings(){
        try{
           File f = new File("Zapis_MJ.txt");  
           FileWriter fw = new FileWriter(f);          
            String a = (String) jTextField_insertName.getText();
            String b = (String) jTextField_insertValue.getText();
            String c = (String) jComboBox_typeOfProduct.getSelectedItem();
            String d = (String) jTextField_date.getText();
            
            fw.write(""+a+"-"+b+"-"+c+"-"+d);
            fw.close();
           }catch(IOException e){
            System.out.println("Błąd: "+e.toString());
           }
    }
    
    private void filljCBProducts(){
        ArticleTypeUtils atu = new ArticleTypeUtils();
        //TODO read procucts from file!!!
        jComboBox_typeOfProduct.removeAllItems();
        try {
            Scanner sc = new Scanner(new File("produkty.txt"));
            while(sc.hasNext()){
                String item = sc.nextLine();
                jComboBox_typeOfProduct.addItem(item);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
    
    private void clear(){
        jTextField_insertName.setText("");
        jTextField_insertValue.setText("");
        jTextField_date.setText("");
    }
    
    private String file_name = "lista_zakupow.csv";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_save;
    private javax.swing.JComboBox<String> jComboBox_typeOfProduct;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_insertName;
    private javax.swing.JLabel jLabel_insertValue;
    private javax.swing.JLabel jLabel_today;
    private javax.swing.JLabel jLabel_todayCost;
    private javax.swing.JLabel jLabel_typeOfProduct;
    private javax.swing.JLabel jLabel_weeklyCost;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel_insert;
    private javax.swing.JPanel jPanel_insertData;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextArea_today;
    private javax.swing.JTextField jTextField_date;
    private javax.swing.JTextField jTextField_insertName;
    private javax.swing.JTextField jTextField_insertValue;
    private javax.swing.JTextField jTextField_todayCost;
    private javax.swing.JTextField jTextField_weeklyCost;
    private javax.swing.JMenu sr_jMenu_edit;
    private javax.swing.JMenu sr_jMenu_file;
    // End of variables declaration//GEN-END:variables
}
