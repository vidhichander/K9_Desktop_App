
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vidhi
 */
/*
This form will allow the user to select a particular dog and then display all the dates that the dog was taken for a vet appointment. 
Once a date is selected, the data of the appointment will be displayed on the form. 
 */
public class docreport extends javax.swing.JPanel {

    /**
     * Creates new form docreport
     */
    public docreport() {
        initComponents();
        nacombo.removeAllItems();
        nacombo.addItem("Select Dog");

        try {
            FileReader tid = new FileReader("New Dogs.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        na = new javax.swing.JTextField();
        nacombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dets = new javax.swing.JTextArea();
        img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        da = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        res = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 36)); // NOI18N
        jLabel3.setText("Doctor's Reports");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setText("Name of dog:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

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
        add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 139, -1));

        nacombo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                nacomboComponentAdded(evt);
            }
        });
        nacombo.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                nacomboHierarchyChanged(evt);
            }
        });
        nacombo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                nacomboAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nacomboAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        nacombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nacomboFocusGained(evt);
            }
        });
        nacombo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                nacomboCaretPositionChanged(evt);
            }
        });
        nacombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacomboActionPerformed(evt);
            }
        });
        nacombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nacomboPropertyChange(evt);
            }
        });
        add(nacombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel6.setText("Details:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 38));

        dets.setColumns(20);
        dets.setRows(5);
        jScrollPane1.setViewportView(dets);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 264, -1));
        add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 327, 353, 190));

        jLabel2.setText("Date: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daActionPerformed(evt);
            }
        });
        add(da, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 139, -1));

        jLabel7.setText("Reason For Appointment: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 186, -1, 30));
        add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 174, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/Rajul/Downloads/logo.gif")); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void naKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naKeyReleased
        nacombo.removeAllItems();
        String n = na.getText();
        int le = n.length();

        String x = "";
        try {
            FileReader tid = new FileReader("New Dogs.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();

                x = "";
                for (int i = 0; i < le; i++) {
                    x = x + d.substring(i, i + 1);
                    if ((x).equals(n) || (x.toLowerCase().equals(n)) || x.toUpperCase().equals(n)) {

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
                FileReader tid = new FileReader("New Dogs.txt");
                BufferedReader tdata = new BufferedReader(tid);
                String no = "";
                while ((no = tdata.readLine()) != null) {
                    StringTokenizer ot = new StringTokenizer(no, "|");
                    String c = ot.nextToken();

                    String d = ot.nextToken();

                    nacombo.addItem(d);
                }

            } catch (Exception err) {
            }
            }    }//GEN-LAST:event_naKeyReleased

    private void nacomboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nacomboPropertyChange

    }//GEN-LAST:event_nacomboPropertyChange

    private void nacomboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nacomboFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nacomboFocusGained

    private void nacomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacomboActionPerformed
        String dates = "" + nacombo.getSelectedItem();
        da.removeAllItems();
        da.addItem("Select Date");
        try {
            FileReader tid = new FileReader("New Dogs.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();
                if (d.equals(dates)) {
                    FileReader tida = new FileReader("Doctor's Reports.txt");
                    BufferedReader tdataa = new BufferedReader(tida);
                    String on = "";
                    while ((on = tdataa.readLine()) != null) {
                        StringTokenizer to = new StringTokenizer(on, "|");
                        String f = to.nextToken();
                        String g = to.nextToken();
                        String h = to.nextToken();
                        if (g.equals(c)) {
                            da.addItem(h);
                        }
                    }
                }
            }
        } catch (Exception error) {

        }

    }//GEN-LAST:event_nacomboActionPerformed

    private void nacomboAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nacomboAncestorAdded
    }//GEN-LAST:event_nacomboAncestorAdded

    private void nacomboAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nacomboAncestorMoved
    }//GEN-LAST:event_nacomboAncestorMoved

    private void nacomboComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_nacomboComponentAdded
    }//GEN-LAST:event_nacomboComponentAdded

    private void nacomboHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_nacomboHierarchyChanged
    }//GEN-LAST:event_nacomboHierarchyChanged

    private void nacomboCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nacomboCaretPositionChanged
    }//GEN-LAST:event_nacomboCaretPositionChanged

    private void daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daActionPerformed
        String dat = "" + da.getSelectedItem();
        String name = "" + nacombo.getSelectedItem();
        try {
            FileReader tids = new FileReader("New Dogs.txt");
            BufferedReader tdatas = new BufferedReader(tids);
            String nos = "";
            while ((nos = tdatas.readLine()) != null) {
                StringTokenizer ots = new StringTokenizer(nos, "|");
                String s = ots.nextToken();
                String t = ots.nextToken();
                if (t.equals(name)) {
                    try {
                        FileReader tid = new FileReader("Doctor's Reports.txt");
                        BufferedReader tdata = new BufferedReader(tid);
                        String no = "";
                        while ((no = tdata.readLine()) != null) {
                            StringTokenizer ot = new StringTokenizer(no, "|");
                            String c = ot.nextToken();
                            String d = ot.nextToken();
                            String e = ot.nextToken();
                            String f = ot.nextToken();
                            String l = ot.nextToken();
                            if (e.equals(dat) && d.equals(s)) {

                                res.setText(c);
                                dets.setText(f);
                                ImageIcon icon = new ImageIcon(l, "");
                                img.setIcon(icon);

                            }
                        }
                    } catch (Exception error) {

                    }
                }
            }
        } catch (Exception error) {

        }

    }//GEN-LAST:event_daActionPerformed

    private void naFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusLost
        if ((na.getText()).equals("")) {
            na.setText("Search");
            na.setForeground(Color.lightGray);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_naFocusLost

    private void naFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusGained
        na.setText("");
        na.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_naFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox da;
    private javax.swing.JTextArea dets;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField na;
    private javax.swing.JComboBox nacombo;
    private javax.swing.JTextField res;
    // End of variables declaration//GEN-END:variables
}