
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
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
/*This form will be a copy of the homepage of the program, displaying the logo and introduction of the organization, in addition to the list of notifications/outstanding items.

*/ 
public class home2 extends javax.swing.JPanel {
    DefaultTableModel model;

    /**
     * Creates new form home2
     */
    public home2() {
        initComponents();
        model = (DefaultTableModel) test.getModel();
        //tab.setEnabled(false);
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("NOTIFICATIONS!");
        test.setEnabled(false);
        try {
            FileReader tid = new FileReader("Schedules.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();
                String e = ot.nextToken();
                String f = ot.nextToken();
                String g = ot.nextToken();
                String i = ot.nextToken();
                String j = ot.nextToken();
                Date date1 = new Date();
                DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                String dat2 = format.format(date1);
                Date date2 = format.parse(dat2);
                Date d2 = format.parse(d);
                Date f2 = format.parse(f);
                Date i2 = format.parse(i);

                try {
                    FileReader tida = new FileReader("New Dogs.txt");
                    BufferedReader tdataa = new BufferedReader(tida);
                    String noa = "";
                    while ((noa = tdataa.readLine()) != null) {
                        StringTokenizer ota = new StringTokenizer(noa, "|");
                        String ca = ota.nextToken();
                        String da = ota.nextToken();
                        if (c.equals(ca)) {

                            String diff = "";
                            long timeDiff = Math.abs(date2.getTime() - d2.getTime());
                            long hours1 = TimeUnit.MILLISECONDS.toHours(timeDiff);
                            long difference = (hours1 / 24);
                            diff = String.format("%d", difference);

                            if (Integer.parseInt(diff) >= 3) {
                                model.insertRow(model.getRowCount(), new Object[]{da + " needs to be socialized"});

                            }
                            diff = "";
                            timeDiff = Math.abs(date2.getTime() - f2.getTime());
                            hours1 = TimeUnit.MILLISECONDS.toHours(timeDiff);
                            difference = (hours1 / 24);
                            diff = String.format("%d", difference);
                            if (Integer.parseInt(diff) >= 3) {
                                model.insertRow(model.getRowCount(), new Object[]{da + " needs to be groomed"});

                            }
                            diff = "";
                            timeDiff = Math.abs(date2.getTime() - i2.getTime());
                            hours1 = TimeUnit.MILLISECONDS.toHours(timeDiff);
                            difference = (hours1 / 24);
                            diff = String.format("%d", difference);
                            if (Integer.parseInt(diff) >= 3) {
                                model.insertRow(model.getRowCount(), new Object[]{da + " needs to be bathed"});

                            }

                        }

                    }

                } catch (Exception err) {

                }

            }

        } catch (Exception err) {

        }

        try {
            FileReader tid = new FileReader("Upcoming Events.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();
                String e = ot.nextToken();
                String f = ot.nextToken();
                Date date1 = new Date();
                DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                String dat2 = format.format(date1);
                Date date2 = format.parse(dat2);
                Date d2 = format.parse(f);
                String diff = "";
                double timeDiff2 = Math.rint(d2.getTime() - date2.getTime());
                long hours1 = TimeUnit.MILLISECONDS.toHours((long) timeDiff2);
                long difference = (hours1 / 24);
                diff = String.format("%d", difference);

                if (diff.equals("1")) {
                    model.insertRow(model.getRowCount(), new Object[]{d + " starts tomorrow!"});
                } else if (diff.equals("0")) {
                    model.insertRow(model.getRowCount(), new Object[]{d + " starts today!"});

                }
            }

        } catch (Exception err) {
        }
        try {
            FileReader tid = new FileReader("Dog Walking.txt");
            BufferedReader tdata = new BufferedReader(tid);
            String no = "";
            while ((no = tdata.readLine()) != null) {
                StringTokenizer ot = new StringTokenizer(no, "|");
                String c = ot.nextToken();
                String d = ot.nextToken();
                String c1 = ot.nextToken();
                String d1 = ot.nextToken();
                String c2 = ot.nextToken();
                String d3 = ot.nextToken();
                DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date d2 = format.parse(d);
                model.insertRow(model.getRowCount(), new Object[]{c + " has not been returned to kennel by " + c2 + "!"});

                try {
                    FileReader tida = new FileReader("Dogs checkin.txt");
                    BufferedReader tdataa = new BufferedReader(tida);
                    String noa = "";
                    while ((noa = tdataa.readLine()) != null) {
                        StringTokenizer ota = new StringTokenizer(noa, "|");
                        String ca = ota.nextToken();
                        String da = ota.nextToken();
                        String ca1 = ota.nextToken();
                        String da1 = ota.nextToken();
                        String ca2 = ota.nextToken();
                        String da3 = ota.nextToken();
                        Date da2 = format.parse(ca);
                        int dda;
                        int ddd;
                        if ((Integer.parseInt(ca2) + Integer.parseInt(ca1)) >= 24) {
                            dda = Math.round(Integer.parseInt(ca2) / 24);
                            ddd = dda + 1;

                        } else {
                            dda = 0;
                            ddd = 0;
                        }
                        Date dateBefore = new Date(da2.getTime() - dda * 24 * 3600 * 1000);
                        String db = format.format(dateBefore);
                        Date dateBefore1 = new Date(da2.getTime() - ddd * 24 * 3600 * 1000);
                        String db1 = format.format(dateBefore1);
                        if (da.equals(c)) {
                            if (db.equals(d) || (db1.equals(d))) {
                                int x = model.getRowCount();
                                model.setRowCount(x - 1);
                            }

                        }

                    }

                } catch (Exception err) {

                }

            }

        } catch (Exception err) {

        }

        if (test.getRowCount() == 0) {
            model.insertRow(model.getRowCount(), new Object[]{"NO OUTSTANDING ITEMS"});
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        test = new javax.swing.JTable();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/Rajul/Downloads/logo-2.gif")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Chalkboard", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Welcome to the K9 Friends Desktop ");

        jLabel4.setFont(new java.awt.Font("Chalkboard", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Application! Kindly choose what you   ");

        jLabel5.setFont(new java.awt.Font("Chalkboard", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("would like to do from the menu above");

        test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(test);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable test;
    // End of variables declaration//GEN-END:variables
}
