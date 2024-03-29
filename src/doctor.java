
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vidhi
 */

/* This form will allow the user to choose/enter the name of a dog in the system and enter the details of the veterinarian appointment –the date, doctor’s comments, and the doctor’s report. 
   Data will be saved in the system
*/

public class doctor extends javax.swing.JPanel {

    /**
     * Creates new form doctor
     */
    public doctor() {
        initComponents();
        combo.removeAllItems();
        combo.addItem("Select Reason");
        combo.addItem("Vaccination");
        combo.addItem("Neutering");
        combo.addItem("Microchipping");
        combo.addItem("Ear Infection");
        combo.addItem("Skin Allergies");
        combo.addItem("Skin Growth");
        combo.addItem("Skin Infection");
        combo.addItem("Dental");
        combo.addItem("Arthritis");
        combo.addItem("Diarrhea");
        combo.addItem("Routine Check-up");
        combo.addItem("Other Reasons");
        nacombo.removeAllItems();
        others.setVisible(false);
        nacombo.addItem("Select Dog");

        try {
            FileReader dog = new FileReader("New Dogs.txt");
            BufferedReader dogs = new BufferedReader(dog);
            String no = "";
            while ((no = dogs.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();

                nacombo.addItem(d);

            }

        } catch (Exception err) {

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

        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reason = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        others = new javax.swing.JTextField();
        na1 = new javax.swing.JLabel();
        na = new javax.swing.JTextField();
        nacombo = new javax.swing.JComboBox();
        det1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dets = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        rep = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Dat = new javax.swing.JLabel();
        da = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel9.setText("*Will save data");

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 36)); // NOI18N
        jLabel3.setText("Vet Appointments");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        reason.setText("Reason for appointment:");
        add(reason, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 123, -1, -1));

        combo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboFocusGained(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 119, -1, -1));

        others.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                othersFocusGained(evt);
            }
        });
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });
        add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 150, 155, -1));

        na1.setText("Name of the dog:");
        add(na1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 180, -1, 30));

        na.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        na.setForeground(java.awt.Color.lightGray);
        na.setText("Search");
        na.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                naFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                naFocusLost(evt);
            }
        });
        na.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                naKeyReleased(evt);
            }
        });
        add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 180, 139, -1));

        nacombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nacomboFocusGained(evt);
            }
        });
        nacombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacomboActionPerformed(evt);
            }
        });
        add(nacombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 180, 133, -1));

        det1.setText("Details:");
        add(det1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 270, -1, -1));

        dets.setColumns(20);
        dets.setRows(5);
        dets.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                detsFocusGained(evt);
            }
        });
        dets.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                detsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(dets);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 260, 315, 70));

        jButton1.setText("Upload Doctor's Report");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 340, -1, -1));
        add(rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 340, 191, -1));

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 380, -1, -1));

        Dat.setText("Date:");
        add(Dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 210, -1, 40));

        da.setDateFormatString("dd/MM/yyyy");
        da.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                daPropertyChange(evt);
            }
        });
        add(da, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 216, 140, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/Rajul/Downloads/logo.gif")); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 16, -1, -1));

        jLabel4.setFont(new java.awt.Font("Chalkboard SE", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Keep track of your sick puppies");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 69, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_othersActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String y = "" + combo.getSelectedItem();
        if (y.equals("Other Reasons")) {
            others.setVisible(true);
        }
        if (!(y.equals("Other Reasons"))) {
            others.setVisible(false);
        }


    }//GEN-LAST:event_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        rep.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String x;
        String y = "" + combo.getSelectedItem();

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date da1 = da.getDate();
        String name = "" + nacombo.getSelectedItem();
        String de = dets.getText();
        String report = rep.getText();
        boolean er = false;
        if (y.equals("Other Reasons")) {
            x = others.getText();

        } else {
            x = y;
        }
        if (x.equals("Select Reason")||x.equals("")) {
            er = true;
            reason.setText("* Reason for appointment:");
            reason.setForeground(Color.red);
        }
        if (name.equals(("Select Dog"))) {
            er = true;
            na1.setText("* Name of the dog:");
            na1.setForeground(Color.red);
        }
        if (da1 == null) {
            er = true;
            Dat.setText("* Date:");
            Dat.setForeground(Color.red);
        }
        if (de.equals("")) {
            er = true;
            det1.setText("* Details:");
            det1.setForeground(Color.red);
        }
        if (report.equals("")) {
            er = true;
            rep.setBackground(Color.red);
        }
        if (er == true) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please complete all fields", "Message:ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);

        }
        if (er == false) {
            String dates = format.format(da1);
            try {
                FileReader dog = new FileReader("New Dogs.txt");
                BufferedReader dogs = new BufferedReader(dog);
                String no = "";
                while ((no = dogs.readLine()) != null) {
                    StringTokenizer ot = new StringTokenizer(no, "|");
                    String c = ot.nextToken();
                    String d = ot.nextToken();
                    if (d.equals(name)) {
                        try {

                            FileWriter report1 = new FileWriter("Doctor's Reports.txt", true);
                            PrintWriter reports1 = new PrintWriter(report1);
                            reports1.println(x + "|" + c + "|" + dates + "|" + de + "|" + report);

                            reports1.close();

                        } catch (Exception error) {

                        }
                    }
                }
            } catch (Exception error) {

            }
            rep.setText("");
            dets.setText("");
            na.setText("");
            combo.removeAllItems();
            combo.addItem("Select Reason");
            combo.addItem("Vaccination");
            combo.addItem("Neutering");
            combo.addItem("Microchipping");
            combo.addItem("Ear Infection");
            combo.addItem("Skin Allergies");
            combo.addItem("Skin Growth");
            combo.addItem("Skin Infection");
            combo.addItem("Dental");
            combo.addItem("Arthritis");
            combo.addItem("Diarrhea");
            combo.addItem("Routine Check-up");
            combo.addItem("Other Reasons");
            nacombo.removeAllItems();
            others.setVisible(false);
            nacombo.addItem("Select Dog");

            try {
                FileReader dog = new FileReader("New Dogs.txt");
                BufferedReader dogs = new BufferedReader(dog);
                String no = "";
                while ((no = dogs.readLine()) != null) {
                    StringTokenizer ot = new StringTokenizer(no, "|");
                    String c = ot.nextToken();
                    String d = ot.nextToken();

                    nacombo.addItem(d);

                }

            } catch (Exception err) {

            }
            da.setDate(null);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void nacomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacomboActionPerformed


    }//GEN-LAST:event_nacomboActionPerformed

    private void naKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naKeyReleased
        String n = na.getText();
        int le = n.length();
        nacombo.removeAllItems();

        String x = "";
        try {
            FileReader dog = new FileReader("New Dogs.txt");
            BufferedReader dogs = new BufferedReader(dog);
            String no = "";
            while ((no = dogs.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();

                x = "";
                for (int i = 0; i < le; i++) {
                    x = x + d.substring(i, i + 1);

                    if ((x).equals(n) || x.toUpperCase().equals(n) || x.toLowerCase().equals(n)) {
                        nacombo.addItem(d);
                    }

                }

            }
        } catch (Exception err) {

        }
        if (n.equals("")) {
            nacombo.removeAllItems();
            nacombo.addItem("Select Dog");
            try {
                FileReader dog = new FileReader("New Dogs.txt");
                BufferedReader dogs = new BufferedReader(dog);
                String no = "";
                while ((no = dogs.readLine()) != null) {
                    StringTokenizer ot = new StringTokenizer(no, "|");
                    String c = ot.nextToken();

                    String d = ot.nextToken();

                    nacombo.addItem(d);
                }

            } catch (Exception err) {

            }
        }


      }//GEN-LAST:event_naKeyReleased

    private void naFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusGained
        na1.setText("Name of the dog:");
        na1.setForeground(Color.black);    
         na.setText("");
        na.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_naFocusGained

    private void comboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboFocusGained
        reason.setText("Reason for appointment:");
        reason.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_comboFocusGained

    private void othersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_othersFocusGained
        reason.setText("Reason for appointment:");
        reason.setForeground(Color.black);      // TODO add your handling code here:
    }//GEN-LAST:event_othersFocusGained

    private void nacomboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nacomboFocusGained
        na1.setText("Name of the dog:");
        na1.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_nacomboFocusGained

    private void daPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_daPropertyChange
        Dat.setText("Date:");
        Dat.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_daPropertyChange

    private void detsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detsFocusGained
        det1.setText("Details:");
        det1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_detsFocusGained

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        rep.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void detsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detsKeyReleased
String t = dets.getText();
        if (!(t.equals(""))){

        int l1 = t.length();
        String  x = (t.substring(0,1)).toUpperCase();

        String y = "";
        for (int i= 1;i<l1;i++){
        y = y + (t.substring(i,i+1)) ;  
            

        }
        dets.setText(x+y); }       // TODO add your handling code here:
    }//GEN-LAST:event_detsKeyReleased

    private void naFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusLost
if ((na.getText()).equals("")){
    na.setText("Search");
    na.setForeground(Color.lightGray);}
    // TODO add your handling code here:
    }//GEN-LAST:event_naFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dat;
    private javax.swing.JComboBox combo;
    private com.toedter.calendar.JDateChooser da;
    private javax.swing.JLabel det1;
    private javax.swing.JTextArea dets;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField na;
    private javax.swing.JLabel na1;
    private javax.swing.JComboBox nacombo;
    private javax.swing.JTextField others;
    private javax.swing.JLabel reason;
    private javax.swing.JTextField rep;
    // End of variables declaration//GEN-END:variables
}
