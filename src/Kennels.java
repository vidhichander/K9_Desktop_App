
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vidhi
 */
/* This form will display the kennels in the shelter through a table, placing the dogs in their respective kennels. 
   It will also allow users to specify their search by finding the kennel for a specific dog of a dog in a specific kennel.
*/
public class Kennels extends javax.swing.JPanel {

    DefaultTableModel model;

    /**
     * Creates new form Kennels
     */
    public Kennels() {
        initComponents();
        na.setVisible(false);
        nacombo.setVisible(false);
        c1.setVisible(false);
        lab.setVisible(false);
        field.setVisible(false);
        model = (DefaultTableModel) tab.getModel();
        //tab.setEnabled(false);
        tab.setEnabled(false);
        String x1 = "";
        String y1 = "";
        int z1 = 0;
        String p3 = "";
        String kennels[] = new String[120];
        String names[] = new String[120];
        int i = 0;
        int pz = 0;
        try {
            FileReader tid = new FileReader("New Dogs.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
                StringTokenizer oto = new StringTokenizer(no, "|");
                String c2 = oto.nextToken();
                String d2 = oto.nextToken();
                String a = oto.nextToken();
                String c = oto.nextToken();
                String d = oto.nextToken();
                String e = oto.nextToken();
                String f = oto.nextToken();
                String g = oto.nextToken();
                String h = oto.nextToken();
                kennels[i] = h;
                names[i] = d2;
                i++;
            }
        } catch (Exception error) {

        }

        try {
            FileReader tid = new FileReader("New Dogs.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";

            while ((no = tdata.readLine()) != null) {
                StringTokenizer oto = new StringTokenizer(no, "|");
                String c2 = oto.nextToken();
                String d2 = oto.nextToken();
                String a = oto.nextToken();
                String c = oto.nextToken();
                String d = oto.nextToken();
                String e = oto.nextToken();
                String f = oto.nextToken();
                String g = oto.nextToken();
                String h = oto.nextToken();
                p3 = "";
                pz = 0;
                for (int j = 0; j < i; j++) {
                    if (h.equals(kennels[j])) {
                        p3 = p3 + names[j] + "  |  ";
                        pz = pz + 1;
                    }

                }

            }
        } catch (Exception error) {
        }

        try {
            FileReader tid = new FileReader("New Dogs.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";

            while ((no = tdata.readLine()) != null) {
                StringTokenizer oto = new StringTokenizer(no, "|");
                String c2 = oto.nextToken();
                String d2 = oto.nextToken();
                String a = oto.nextToken();
                String c = oto.nextToken();
                String d = oto.nextToken();
                String e = oto.nextToken();
                String f = oto.nextToken();
                String g = oto.nextToken();
                String h = oto.nextToken();

                int le = h.length();
                x1 = "";
                y1 = "";
                if (le == 2) {
                    x1 = h.substring(0, 1);
                    y1 = h.substring(1, 2);
                }
                if (le == 3) {
                    x1 = h.substring(0, 1) + h.substring(1, 2);
                    y1 = h.substring(2, 3);
                }
                if (y1.equals("A")) {
                    z1 = 1;
                }
                if (y1.equals("B")) {
                    z1 = 2;
                }
                if (y1.equals("C")) {
                    z1 = 3;
                }
                if (y1.equals("D")) {
                    z1 = 4;
                }
                int p = Integer.parseInt(x1) - 1;
                if (pz == 2) {
                    StringTokenizer otp = new StringTokenizer(p3, "  |  ");
                    String a1 = otp.nextToken();
                    String a2 = otp.nextToken();
                    if (d2.equals(a1) || d2.equals(a2)) {
                        model.setValueAt(p3, p, z1);

                    } else if (!(d2.equals(a1)) || !(d2.equals(a2))) {
                        model.setValueAt(d2, p, z1);

                    }
                }
                else{
                     model.setValueAt(d2, p, z1);
                }

            }
        } catch (Exception err) {

        }
        c1.removeAllItems();
        c1.addItem("Select Method");
        c1.addItem("Search by dog");
        c1.addItem("Search by kennel");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        sp = new javax.swing.JRadioButton();
        c1 = new javax.swing.JComboBox();
        na = new javax.swing.JTextField();
        nacombo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        field = new javax.swing.JTextField();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tab.setAutoCreateRowSorter(true);
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"            1", "", null, null, null},
                {"            2", "", null, null, null},
                {"            3", null, null, null, null},
                {"            4", null, null, null, null},
                {"            5", null, null, null, null},
                {"            6 ", null, null, null, null},
                {"            7", null, null, null, null},
                {"            8", null, null, null, null},
                {"            9", null, null, null, null},
                {"           10", null, null, null, null},
                {"           11", null, null, null, null},
                {"           12", null, null, null, null},
                {"           13", null, null, null, null},
                {"           14", null, null, null, null},
                {"           15", null, null, null, null}
            },
            new String [] {
                "", "          A", "          B", "          C", "          D"
            }
        ));
        tab.setCellSelectionEnabled(true);
        tab.setEnabled(false);
        tab.setGridColor(new java.awt.Color(204, 204, 204));
        tab.setRowHeight(25);
        tab.setShowGrid(true);
        jScrollPane1.setViewportView(tab);

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 36)); // NOI18N
        jLabel3.setText("KENNELS ");

        sp.setText("Specific Search");
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

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

        nacombo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                nacomboComponentRemoved(evt);
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

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/Rajul/Downloads/logo.gif")); // NOI18N

        lab.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nacombo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sp)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nacombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        if (sp.isSelected()) {
            c1.setVisible(true);

        } else if (!(sp.isSelected())) {
            c1.setVisible(false);
            na.setVisible(false);
            nacombo.setVisible(false);
            lab.setVisible(false);
            field.setVisible(false);
        }

    }//GEN-LAST:event_spActionPerformed

    private void naKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naKeyReleased
        String method = "" + c1.getSelectedItem();
        if (method.equals("Search by dog")) {
            String n = na.getText();
            int le = n.length();
            nacombo.removeAllItems();
            lab.setText("Kennel Number");
            lab.setVisible(true);
            field.setVisible(true);
            String x = "";
            try {
                FileReader tid = new FileReader("New Dogs.txt");
                BufferedReader tdata = new BufferedReader(tid);
                String no = "";
                while ((no = tdata.readLine()) != null) {
                    StringTokenizer oto = new StringTokenizer(no, "|");
                    String c2 = oto.nextToken();
                    String d2 = oto.nextToken();
                    String a = oto.nextToken();
                    String c = oto.nextToken();
                    String d = oto.nextToken();
                    String e = oto.nextToken();
                    String f = oto.nextToken();
                    String g = oto.nextToken();
                    String h = oto.nextToken();

                    x = "";
                    for (int i = 0; i < le; i++) {
                        x = x + d2.substring(i, i + 1);

                        if ((x).equals(n) || x.toUpperCase().equals(n) || x.toLowerCase().equals(n)) {
                            nacombo.addItem(d2);
                        }

                    }
                    String text = "" + nacombo.getSelectedItem();
                    if (d2.equals(text)) {
                        field.setText(h);
                    }
                    if (text.equals("Select Dog") || text.equals("")) {
                        field.setText("");
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
            }

        }
        String text = "" + nacombo.getSelectedItem();

        if (method.equals("Search by kennel")) {
            lab.setText("Dog Name");
            lab.setVisible(true);
            field.setVisible(true);
            String y1 = "";
            String x1 = "";
            try {
                FileReader tid = new FileReader("New Dogs.txt");
                BufferedReader tdata = new BufferedReader(tid);
                String no = "";
                while ((no = tdata.readLine()) != null) {
                    StringTokenizer oto = new StringTokenizer(no, "|");
                    String c2 = oto.nextToken();
                    String d2 = oto.nextToken();
                    String a = oto.nextToken();
                    String c = oto.nextToken();
                    String d = oto.nextToken();
                    String e = oto.nextToken();
                    String f = oto.nextToken();
                    String g = oto.nextToken();
                    String h = oto.nextToken();
                    int le = h.length();
                    x1 = "";
                    y1 = "";
                    if (le == 2) {
                        x1 = h.substring(0, 1);
                        y1 = h.substring(1, 2);
                    }
                    if (le == 3) {
                        x1 = h.substring(0, 1) + h.substring(1, 2);
                        y1 = h.substring(2, 3);
                    }
                    if (y1.equals(text) && x1.equals(na.getText())) {

                        field.setText(d2);
                    }

                }
            } catch (Exception err) {

            }

        }

        if (text.equals("Select Dog") || text.equals("") || (na.getText().equals(""))) {
            field.setText("");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_naKeyReleased

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        String method = "" + c1.getSelectedItem();
        if (method.equals("Select Method")) {
            na.setVisible(false);
            nacombo.setVisible(false);
            lab.setVisible(false);
            field.setVisible(false);

        }
        if (method.equals("Search by dog")) {
            na.setVisible(true);
            lab.setText("Kennel Number");

            nacombo.setVisible(true);
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
        if (method.equals("Search by kennel")) {
            na.setVisible(true);
            nacombo.setVisible(true);
            nacombo.removeAllItems();
            nacombo.addItem("A");
            nacombo.addItem("B");
            nacombo.addItem("C");
            nacombo.addItem("D");
            lab.setText("Dog Name");

        }    }//GEN-LAST:event_c1ActionPerformed

    private void nacomboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nacomboPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_nacomboPropertyChange

    private void nacomboComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_nacomboComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_nacomboComponentRemoved

    private void nacomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacomboActionPerformed
        String method = "" + c1.getSelectedItem();
        String text = "" + nacombo.getSelectedItem();
        String x1 = "";
        String y1 = "";
        if (method.equals("Search by dog")) {
            lab.setText("Kennel Number");
            lab.setVisible(true);
            field.setVisible(true);
            try {
                FileReader tid = new FileReader("New Dogs.txt");
                BufferedReader tdata = new BufferedReader(tid);
                String no = "";
                while ((no = tdata.readLine()) != null) {
                    StringTokenizer oto = new StringTokenizer(no, "|");
                    String c2 = oto.nextToken();
                    String d2 = oto.nextToken();
                    String a = oto.nextToken();
                    String c = oto.nextToken();
                    String d = oto.nextToken();
                    String e = oto.nextToken();
                    String f = oto.nextToken();
                    String g = oto.nextToken();
                    String h = oto.nextToken();

                    if (d2.equals(text)) {
                        field.setText(h);
                    }

                }
            } catch (Exception err) {

            }
        }
        if (method.equals("Search by kennel")) {
            lab.setText("Dog Name");
            lab.setVisible(true);
            field.setVisible(true);
            try {
                FileReader tid = new FileReader("New Dogs.txt");
                BufferedReader tdata = new BufferedReader(tid);
                String no = "";
                while ((no = tdata.readLine()) != null) {
                    StringTokenizer oto = new StringTokenizer(no, "|");
                    String c2 = oto.nextToken();
                    String d2 = oto.nextToken();
                    String a = oto.nextToken();
                    String c = oto.nextToken();
                    String d = oto.nextToken();
                    String e = oto.nextToken();
                    String f = oto.nextToken();
                    String g = oto.nextToken();
                    String h = oto.nextToken();
                    int le = h.length();
                    x1 = "";
                    y1 = "";
                    if (le == 2) {
                        x1 = h.substring(0, 1);
                        y1 = h.substring(1, 2);
                    }
                    if (le == 3) {
                        x1 = h.substring(0, 1) + h.substring(1, 2);
                        y1 = h.substring(2, 3);
                    }
                    if (y1.equals(text) && x1.equals(na.getText())) {

                        field.setText(d2);
                    }

                }
            } catch (Exception err) {

            }

        }

        if (text.equals("Select Dog") || text.equals("") || (na.getText().equals(""))) {
            field.setText("");
        }


    }//GEN-LAST:event_nacomboActionPerformed

    private void naFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusLost
if ((na.getText()).equals("")){
    na.setText("Search");
    na.setForeground(Color.lightGray);}         // TODO add your handling code here:
    }//GEN-LAST:event_naFocusLost

    private void naFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusGained
    na.setText("");
    na.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_naFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JTextField field;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab;
    private javax.swing.JTextField na;
    private javax.swing.JComboBox nacombo;
    private javax.swing.JRadioButton sp;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
