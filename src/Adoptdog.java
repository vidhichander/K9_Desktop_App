
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vidhi
 */

/* This form allows the user to choose/enter the name of a dog in the system. 
   The dog’s name, generated date, and adopter’s details will be saved. 
*/

public class Adoptdog extends javax.swing.JPanel {

    Adopt adoptd[] = new Adopt[1000];

    /**
     * Creates new form Adoptdog
     */
    public Adoptdog() {
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
        today1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        nam1 = new javax.swing.JLabel();
        na = new javax.swing.JTextField();
        nacombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        da1 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        na1 = new javax.swing.JTextField();
        na2 = new javax.swing.JTextField();
        na3 = new javax.swing.JTextField();
        na4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        today = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        today1 = new javax.swing.JRadioButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 36)); // NOI18N
        jLabel3.setText("Adopt a Dog ");

        nam1.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        nam1.setText("Name of the dog:");

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
        na.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                naMouseEntered(evt);
            }
        });
        na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naActionPerformed(evt);
            }
        });
        na.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                naKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                naKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                naKeyReleased(evt);
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

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/Rajul/Downloads/logo.gif")); // NOI18N

        da1.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        da1.setText("Date: ");

        date.setDateFormatString("dd/MM/yyyy");
        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel8.setText("Adopter's Details:");

        n.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        n.setText("Name:");

        a.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        a.setText("Address:");

        m.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        m.setText("Mobile Number:");

        e.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        e.setText("Email ID: ");

        na1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                na1FocusGained(evt);
            }
        });
        na1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                na1MouseEntered(evt);
            }
        });
        na1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                na1ActionPerformed(evt);
            }
        });
        na1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                na1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                na1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                na1KeyReleased(evt);
            }
        });

        na2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                na2FocusGained(evt);
            }
        });
        na2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                na2MouseEntered(evt);
            }
        });
        na2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                na2ActionPerformed(evt);
            }
        });
        na2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                na2KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                na2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                na2KeyReleased(evt);
            }
        });

        na3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                na3FocusGained(evt);
            }
        });
        na3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                na3MouseEntered(evt);
            }
        });
        na3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                na3ActionPerformed(evt);
            }
        });
        na3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                na3KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                na3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                na3KeyReleased(evt);
            }
        });

        na4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                na4FocusGained(evt);
            }
        });
        na4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                na4MouseEntered(evt);
            }
        });
        na4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                na4ActionPerformed(evt);
            }
        });
        na4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                na4KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                na4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                na4KeyReleased(evt);
            }
        });

        jButton1.setText("ADOPT!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(today);
        today.setText("Today");
        today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Chalkboard SE", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Give a dog a new home ");

        buttonGroup1.add(today1);
        today1.setText("Today");
        today1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                today1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(n)
                                .addGap(18, 18, 18)
                                .addComponent(na1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(da1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(today))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nam1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacombo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(na2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(e)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(na4))
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(m)
                                    .addGap(18, 18, 18)
                                    .addComponent(na3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(today1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nam1)
                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nacombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(da1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(today))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(today1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(na1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(na2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(na3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(na4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void naMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naMouseEntered

    }//GEN-LAST:event_naMouseEntered

    private void naActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naActionPerformed

    private void naKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naKeyTyped

    }//GEN-LAST:event_naKeyTyped

    private void naKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naKeyPressed

    }//GEN-LAST:event_naKeyPressed

    private void naKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naKeyReleased
        String n = na.getText();
        int le = n.length();
        nacombo.removeAllItems();

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

    }//GEN-LAST:event_naKeyReleased

    private void nacomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacomboActionPerformed
        nam1.setForeground(Color.black);
        nam1.setText("Name of the dog:");
    }//GEN-LAST:event_nacomboActionPerformed

    private void nacomboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nacomboPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_nacomboPropertyChange

    private void na1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_na1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_na1MouseEntered

    private void na1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_na1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_na1ActionPerformed

    private void na1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_na1KeyTyped

    private void na1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_na1KeyPressed

    private void na1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na1KeyReleased
        String t = na1.getText();
                if (!(t.equals(""))){

        int l1 = t.length();
        String x = (t.substring(0, 1)).toUpperCase();

        String y = "";
        for (int i = 1; i < l1; i++) {
            y = y + (t.substring(i, i + 1));

        }
        na1.setText(x + y); }       // TODO add your handling code here:
    }//GEN-LAST:event_na1KeyReleased

    private void na2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_na2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_na2MouseEntered

    private void na2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_na2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_na2ActionPerformed

    private void na2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_na2KeyTyped

    private void na2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_na2KeyPressed

    private void na2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na2KeyReleased
        String t = na2.getText();
                if (!(t.equals(""))){

        int l1 = t.length();
        String x = (t.substring(0, 1)).toUpperCase();

        String y = "";
        for (int i = 1; i < l1; i++) {
            y = y + (t.substring(i, i + 1));

        }
        na2.setText(x + y);  }      // TODO add your handling code here:
    }//GEN-LAST:event_na2KeyReleased

    private void na3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_na3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_na3MouseEntered

    private void na3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_na3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_na3ActionPerformed

    private void na3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_na3KeyTyped

    private void na3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_na3KeyPressed

    private void na3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_na3KeyReleased

    private void na4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_na4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_na4MouseEntered

    private void na4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_na4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_na4ActionPerformed

    private void na4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_na4KeyTyped

    private void na4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_na4KeyPressed

    private void na4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_na4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_na4KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = "" + nacombo.getSelectedItem();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date db1 = date.getDate();
        String adname = na1.getText();
        String add = na2.getText();
        String numb = na3.getText();
        String email = na4.getText();
        String q1 = "";
        String q2 = "";
        String q3 = "";
        String q4 = "";
        String q6 = "";
        String q7 = "";
        String q8 = "";
        String q9 = "";
        String q10 = "";
        String q11 = "";
        String q12 = "";
        String q13 = "";

        Adopt p = null;
        boolean er = false;
        boolean ess = false;
        int es = 0;
        int l = numb.length();
        int l5 = email.length();
        String x;
        for (int i = 0; i < l; i++) {
            x = numb.substring(i, i + 1);
            if (x.matches("[a-zA-Z]+")) {
                ess = true;

            }
        }
        for (int i = 0; i < l5; i++) {
            x = email.substring(i, i + 1);
            if (x.equals("@")) {
                es = es+1;

            }
        }
        if (es==0){
            er = true;
            javax.swing.JOptionPane.showMessageDialog(null, "Email ID is Invalid", "Message:ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);
       
            e.setText("* Email ID:");
            e.setForeground(Color.red);
        }
        if (ess == true) {
            er = true;
            javax.swing.JOptionPane.showMessageDialog(null, "Mobile Number is Invalid", "Message:ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);
            m.setText("* Mobile Number:");
            m.setForeground(Color.red);
        }

        if (name.equals(("Select Dog"))) {
            er = true;
            nam1.setText("* Name of the dog:");
            nam1.setForeground(Color.red);
        }
        if (db1 == null) {
            er = true;
            da1.setText("* Date:");
            da1.setForeground(Color.red);
        }
        if (adname.equals("")) {
            er = true;
            n.setText("* Name:");
            n.setForeground(Color.red);
        }
        if (add.equals("")) {
            er = true;
            a.setText("* Address:");
            a.setForeground(Color.red);
        }
        if (numb.equals("")) {
            er = true;
            m.setText("* Mobile number:");
            m.setForeground(Color.red);
        }
        if (email.equals("")) {
            er = true;
            e.setText("* Email ID:");
            e.setForeground(Color.red);
        }
        if (er == true) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please complete all fields", "Message:ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);

        }
        if (er == false) {
            String ds = format.format(db1);
            try {
                FileReader stud = new FileReader("New Dogs.txt");
                BufferedReader studa = new BufferedReader(stud);
                String no = "";
                while ((no = studa.readLine()) != null) {
                    StringTokenizer pz = new StringTokenizer(no, "|");
                    String o = pz.nextToken();
                    String g = pz.nextToken();
                    String o1 = pz.nextToken();
                    String o2 = pz.nextToken();
                    String o4 = pz.nextToken();
                    String o5 = pz.nextToken();
                    String o6 = pz.nextToken();
                    String o7 = pz.nextToken();
                    String o8 = pz.nextToken();
                    String o9 = pz.nextToken();
                    String o10 = pz.nextToken();
                    String o11 = pz.nextToken();

                    if (name.equals(g)) {
                        q1 = o;
                        q2 = g;
                        q3 = o1;
                        q4 = o2;
                        q6 = o4;
                        q7 = o5;
                        q8 = o6;
                        q9 = o7;
                        q10 = o8;
                        q11 = o9;
                        q12 = o10;
                        q13 = o11;

                    }
                }

            } catch (Exception error) {

            }
            try {
                FileWriter soc = new FileWriter("Adopted dogs.txt", true);
                PrintWriter social = new PrintWriter(soc);
                p = new Adopt(q1, q2, q3, q4,q6, q7, q8, q9, q10, q11, q12, q13);
                social.println(p.getID() + "|" + p.getName() + "|" + p.getDOB() + "|" + p.getED() + "|" + p.getGen() + "|" + p.getBreed() + "|" + p.getColor() + "|" + p.getSize() + "|" + p.getKennel() + "|" + p.getPers() + "|" + p.getHist() + "|" + p.getPic());
                social.close();

            } catch (Exception error) {

            }
            try {
                FileWriter soc = new FileWriter("Adopters.txt", true);
                PrintWriter social = new PrintWriter(soc);
                social.println(name + "|" + ds + "|" + adname + "|" + add + "|" + numb + "|" + email);
                social.close();

            } catch (Exception error) {

            }
            try {
                FileWriter soc = new FileWriter("New Dogs.txt", true);
                PrintWriter social = new PrintWriter(soc);

                try {
                    FileReader stud = new FileReader("New Dogs.txt");
                    BufferedReader studa = new BufferedReader(stud);
                    String no = "";
                    while ((no = studa.readLine()) != null) {
                        StringTokenizer pz = new StringTokenizer(no, "|");
                        String f1 = pz.nextToken();
                        String g1 = pz.nextToken();
                        String h1 = pz.nextToken();
                        String l1 = pz.nextToken();
                        String n1 = pz.nextToken();
                        String o1 = pz.nextToken();
                        String o2 = pz.nextToken();
                        String o3 = pz.nextToken();
                        String o4 = pz.nextToken();
                        String o5 = pz.nextToken();
                        String o6 = pz.nextToken();
                        String o7 = pz.nextToken();

                        if ((name.equals(g1))) {
                                            p = new Adopt(q1, q2, q3, q4,q6, q7, q8, q9, q10, q11, q12, q13);
                            FileWriter soca = new FileWriter("New Dogs.txt", false);

                            
                        }
                        else{
                            p = new Adopt(f1, g1, h1, l1,  n1, o1, o2, o3, o4, o5, o6, o7);
                            FileWriter soca = new FileWriter("New Dogs.txt", false);
                            social.println(p.getID() + "|" + p.getName() + "|" + p.getDOB() + "|" + p.getED() + "|" + p.getGen() + "|" + p.getBreed() + "|" + p.getColor() + "|" + p.getSize() + "|" + p.getKennel() + "|" + p.getPers() + "|" + p.getHist() + "|" + p.getPic());

                        }

                    }
                } catch (Exception error) {

                }
                                                    social.close();


            } catch (Exception error) {

            }

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
            na.setText("");
            date.setDate(null);
            na1.setText("");
            na2.setText("");
            na3.setText("");
            na4.setText("");
            today1.setSelected(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayActionPerformed
        if (today.isSelected()) {
            Date date1 = new Date();
            date.setDate(date1);
        }
    }//GEN-LAST:event_todayActionPerformed

    private void naFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusGained
        nam1.setForeground(Color.black);
        nam1.setText("Name of the dog:");
    na.setText("");
    na.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_naFocusGained

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        da1.setForeground(Color.black);
        da1.setText("Date:");        // TODO add your handling code here:
    }//GEN-LAST:event_datePropertyChange

    private void na1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_na1FocusGained
        n.setForeground(Color.black);
        n.setText("Name:");        // TODO add your handling code here:
    }//GEN-LAST:event_na1FocusGained

    private void na2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_na2FocusGained
        a.setForeground(Color.black);
        a.setText("Address:");        // TODO add your handling code here:
    }//GEN-LAST:event_na2FocusGained

    private void na3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_na3FocusGained
        m.setForeground(Color.black);
        m.setText("Mobile Number:");    }//GEN-LAST:event_na3FocusGained

    private void na4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_na4FocusGained
        e.setForeground(Color.black);
        e.setText("Email ID:");    }//GEN-LAST:event_na4FocusGained

    private void today1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_today1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_today1ActionPerformed

    private void naFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naFocusLost
if ((na.getText()).equals("")){
    na.setText("Search");
    na.setForeground(Color.lightGray);}          // TODO add your handling code here:
    }//GEN-LAST:event_naFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel da1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel e;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel m;
    private javax.swing.JLabel n;
    private javax.swing.JTextField na;
    private javax.swing.JTextField na1;
    private javax.swing.JTextField na2;
    private javax.swing.JTextField na3;
    private javax.swing.JTextField na4;
    private javax.swing.JComboBox nacombo;
    private javax.swing.JLabel nam1;
    private javax.swing.JRadioButton today;
    private javax.swing.JRadioButton today1;
    // End of variables declaration//GEN-END:variables
}
