
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rajul
 */
/*
This form is presented as a calendar. The days when the shelter has events will be highlighted and the user will be able to navigate through the calendar. 
If a date is clicked, a table will display the events on that day, if any.
*/
public class Calendar extends javax.swing.JPanel {

    DefaultTableModel model;

    /**
     * Creates new form Calendar
     */
    public Calendar() {
        initComponents();
        model = (DefaultTableModel) tab.getModel();
        //tab.setEnabled(false);
        model.setRowCount(0);
        model.setColumnCount(0);
        tab.setVisible(false);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        invisible.setVisible(false);
        Date m = invisible.getDate();
        String m1 = format.format(m);
        StringTokenizer pz1 = new StringTokenizer(String.valueOf(m), " ");
        String a = pz1.nextToken();
        String b = pz1.nextToken();
        String c = pz1.nextToken();
        int c1 = Integer.parseInt(c);
        String d = pz1.nextToken();
        String e = pz1.nextToken();
        String f = pz1.nextToken();
        int f1 = Integer.parseInt(f);
        d1.setText("");
        d2.setText("");
        d3.setText("");
        d4.setText("");
        d5.setText("");
        d6.setText("");
        d7.setText("");
        d8.setText("");
        d9.setText("");
        d10.setText("");
        d11.setText("");
        d12.setText("");
        d13.setText("");
        d14.setText("");
        d15.setText("");
        d16.setText("");
        d17.setText("");
        d18.setText("");
        d19.setText("");
        d20.setText("");
        d21.setText("");
        d22.setText("");
        d23.setText("");
        d24.setText("");
        d25.setText("");
        d26.setText("");
        d27.setText("");
        d28.setText("");
        d29.setText("");
        d30.setText("");
        d31.setText("");
        d32.setText("");
        d33.setText("");
        d34.setText("");
        d35.setText("");
        d36.setText("");
        d37.setText("");

        while (c1 > 1) {
            c1 = c1 - 1;
            if (a.equals("Sun")) {
                a = "Sat";
            } else if (a.equals("Sat")) {
                a = "Fri";
            } else if (a.equals("Fri")) {
                a = "Thu";
            } else if (a.equals("Thu")) {
                a = "Wed";
            } else if (a.equals("Wed")) {
                a = "Tue";
            } else if (a.equals("Tue")) {
                a = "Mon";
            } else if (a.equals("Mon")) {
                a = "Sun";
            }

        }
        if (a.equals("Sun")) {
            d1.setText("1");
            d2.setText("2");
            d3.setText("3");
            d4.setText("4");
            d5.setText("5");
            d6.setText("6");
            d7.setText("7");
            d8.setText("8");
            d9.setText("9");
            d10.setText("10");
            d11.setText("11");
            d12.setText("12");
            d13.setText("13");
            d14.setText("14");
            d15.setText("15");
            d16.setText("16");
            d17.setText("17");
            d18.setText("18");
            d19.setText("19");
            d20.setText("20");
            d21.setText("21");
            d22.setText("22");
            d23.setText("23");
            d24.setText("24");
            d25.setText("25");
            d26.setText("26");
            d27.setText("27");
            d28.setText("28");
            if (f1 % 4 == 0 && (b.equals("Feb"))) {
                d29.setText("29");
                d30.setVisible(false);
                d31.setVisible(false);

            } else if (b.equals("Feb") && f1 % 4 != 0) {
                d29.setVisible(false);
                d30.setVisible(false);
                d31.setVisible(false);

            }
            if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
                d29.setVisible(true);
                d29.setText("29");
                d30.setVisible(true);
                d30.setText("30");
                d31.setVisible(false);

            } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
                d29.setVisible(true);
                d29.setText("29");
                d30.setVisible(true);
                d30.setText("30");
                d31.setVisible(true);
                d31.setText("31");

            }
            d32.setVisible(false);
            d33.setVisible(false);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (a.equals("Mon")) {
            d1.setVisible(false);
            d2.setText("1");
            d3.setText("2");
            d4.setText("3");
            d5.setText("4");
            d6.setText("5");
            d7.setText("6");
            d8.setText("7");
            d9.setText("8");
            d10.setText("9");
            d11.setText("10");
            d12.setText("11");
            d13.setText("12");
            d14.setText("13");
            d15.setText("14");
            d16.setText("15");
            d17.setText("16");
            d18.setText("17");
            d19.setText("18");
            d20.setText("19");
            d21.setText("20");
            d22.setText("21");
            d23.setText("22");
            d24.setText("23");
            d25.setText("24");
            d26.setText("25");
            d27.setText("26");
            d28.setText("27");
            d29.setText("28");
            if (f1 % 4 == 0 && (b.equals("Feb"))) {
                d30.setText("29");
                d31.setVisible(false);
                d32.setVisible(false);

            } else if (b.equals("Feb") && f1 % 4 != 0) {
                d30.setVisible(false);
                d31.setVisible(false);
                d32.setVisible(false);

            }
            if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(true);
                d31.setText("30");
                d32.setVisible(false);

            } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(true);
                d31.setText("30");
                d32.setVisible(true);
                d32.setText("31");

            }
            d33.setVisible(false);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (a.equals("Tue")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setText("1");
            d4.setText("2");
            d5.setText("3");
            d6.setText("4");
            d7.setText("5");
            d8.setText("6");
            d9.setText("7");
            d10.setText("8");
            d11.setText("9");
            d12.setText("10");
            d13.setText("11");
            d14.setText("12");
            d15.setText("13");
            d16.setText("14");
            d17.setText("15");
            d18.setText("16");
            d19.setText("17");
            d20.setText("18");
            d21.setText("19");
            d22.setText("20");
            d23.setText("21");
            d24.setText("22");
            d25.setText("23");
            d26.setText("24");
            d27.setText("25");
            d28.setText("26");
            d29.setText("27");
            d30.setText("28");
            if (f1 % 4 == 0 && (b.equals("Feb"))) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(false);
                d33.setVisible(false);

            } else if (b.equals("Feb") && f1 % 4 != 0) {
                d31.setVisible(false);
                d32.setVisible(false);
                d33.setVisible(false);

            }
            if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(true);
                d32.setText("30");
                d33.setVisible(false);

            } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(true);
                d32.setText("30");
                d33.setVisible(true);
                d33.setText("31");

            }
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }

        if (a.equals("Wed")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setText("1");
            d5.setText("2");
            d6.setText("3");
            d7.setText("4");
            d8.setText("5");
            d9.setText("6");
            d10.setText("7");
            d11.setText("8");
            d12.setText("9");
            d13.setText("10");
            d14.setText("11");
            d15.setText("12");
            d16.setText("13");
            d17.setText("14");
            d18.setText("15");
            d19.setText("16");
            d20.setText("17");
            d21.setText("18");
            d22.setText("19");
            d23.setText("20");
            d24.setText("21");
            d25.setText("22");
            d26.setText("23");
            d27.setText("24");
            d28.setText("25");
            d29.setText("26");
            d30.setText("27");
            d31.setText("28");
            d31.setVisible(true);

            if (f1 % 4 == 0 && (b.equals("Feb"))) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(false);
                d34.setVisible(false);

            } else if (b.equals("Feb") && f1 % 4 != 0) {
                d32.setVisible(false);
                d33.setVisible(false);
                d34.setVisible(false);

            }
            if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(true);
                d33.setText("30");
                d34.setVisible(false);

            } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(true);
                d33.setText("30");
                d34.setVisible(true);
                d34.setText("31");

            }
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (a.equals("Thu")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setText("1");
            d6.setText("2");
            d7.setText("3");
            d8.setText("4");
            d9.setText("5");
            d10.setText("6");
            d11.setText("7");
            d12.setText("8");
            d13.setText("9");
            d14.setText("10");
            d15.setText("11");
            d16.setText("12");
            d17.setText("13");
            d18.setText("14");
            d19.setText("15");
            d20.setText("16");
            d21.setText("17");
            d22.setText("18");
            d23.setText("19");
            d24.setText("20");
            d25.setText("21");
            d26.setText("22");
            d27.setText("23");
            d28.setText("24");
            d29.setText("25");
            d30.setText("26");
            d31.setText("27");
            d32.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            if (f1 % 4 == 0 && (b.equals("Feb"))) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(false);
                d35.setVisible(false);

            } else if (b.equals("Feb") && f1 % 4 != 0) {
                d33.setVisible(false);
                d34.setVisible(false);
                d35.setVisible(false);

            }
            if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(true);
                d34.setText("30");
                d35.setVisible(false);
                d36.setVisible(false);
                d37.setVisible(false);

            } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(true);
                d34.setText("30");
                d35.setVisible(true);
                d35.setText("31");
                d36.setVisible(false);
                d37.setVisible(false);

            }
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (a.equals("Fri")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setText("1");
            d7.setText("2");
            d8.setText("3");
            d9.setText("4");
            d10.setText("5");
            d11.setText("6");
            d12.setText("7");
            d13.setText("8");
            d14.setText("9");
            d15.setText("10");
            d16.setText("11");
            d17.setText("12");
            d18.setText("13");
            d19.setText("14");
            d20.setText("15");
            d21.setText("16");
            d22.setText("17");
            d23.setText("18");
            d24.setText("19");
            d25.setText("20");
            d26.setText("21");
            d27.setText("22");
            d28.setText("23");
            d29.setText("24");
            d30.setText("25");
            d31.setText("26");
            d32.setText("27");
            d33.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            if (f1 % 4 == 0 && (b.equals("Feb"))) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(false);
                d36.setVisible(false);

            } else if (b.equals("Feb") && f1 % 4 != 0) {
                d34.setVisible(false);
                d35.setVisible(false);
                d36.setVisible(false);

            }
            if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(true);
                d35.setText("30");
                d36.setVisible(false);

            } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(true);
                d35.setText("30");
                d36.setVisible(true);
                d36.setText("31");

            }
            d37.setVisible(false);

        }
        if (a.equals("Sat")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setVisible(false);
            d7.setText("1");
            d8.setText("2");
            d9.setText("3");
            d10.setText("4");
            d11.setText("5");
            d12.setText("6");
            d13.setText("7");
            d14.setText("8");
            d15.setText("9");
            d16.setText("10");
            d17.setText("11");
            d18.setText("12");
            d19.setText("13");
            d20.setText("14");
            d21.setText("15");
            d22.setText("16");
            d23.setText("17");
            d24.setText("18");
            d25.setText("19");
            d26.setText("20");
            d27.setText("21");
            d28.setText("22");
            d29.setText("23");
            d30.setText("24");
            d31.setText("25");
            d32.setText("26");
            d33.setText("27");
            d34.setText("28");
        }
        if (f1 % 4 == 0 && (b.equals("Feb"))) {
            d35.setText("29");
            d36.setVisible(false);
            d37.setVisible(false);

        } else if (b.equals("Feb") && f1 % 4 != 0) {
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (b.equals("Apr") || b.equals("Sep") || b.equals("Nov") || b.equals("Jun")) {
            d35.setVisible(true);
            d35.setText("29");
            d36.setVisible(true);
            d36.setText("30");
            d37.setVisible(false);

        } else if (b.equals("Jan") || b.equals("Mar") || b.equals("May") || b.equals("Jul") || b.equals("Aug") || b.equals("Oct") || b.equals("Dec")) {
            d35.setVisible(true);
            d35.setText("29");
            d36.setVisible(true);
            d36.setText("30");
            d37.setVisible(true);
            d37.setText("31");

        }
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e1 = pz.nextToken();
                String a1 = pz.nextToken();
                String b1 = pz.nextToken();
                String c2 = pz.nextToken();
                String da10 = pz.nextToken();
                String j1 = pz.nextToken();
                String f2 = pz.nextToken();
                Date b2 = format.parse(b1);
                Date j2 = format.parse(j1);
                int m2 = month.getMonth();
                int y1 = year.getYear();

                if (!(d1.getText()).equals("")) {
                    int x = Integer.parseInt(d1.getText());

                    String dat = x + "/" + (m2 + 1) + "/" + y1;
                    Date datt = null;
                    try {
                        datt = format.parse(dat);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt = format.format(datt);

                    if ((datt.after(b2) && datt.before(j2)) || dattt.equals(b1) || dattt.equals(j1)) {
                        d1.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d2.getText()).equals("")) {

                    int x2 = Integer.parseInt(d2.getText());
                    String dat1 = x2 + "/" + (m2 + 1) + "/" + y1;
                    Date datt1 = null;
                    try {
                        datt1 = format.parse(dat1);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt1 = format.format(datt1);
                    if ((datt1.after(b2) && datt1.before(j2)) || dattt1.equals(b1) || dattt1.equals(j1)) {
                        d2.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d3.getText()).equals("")) {

                    int x3 = Integer.parseInt(d3.getText());
                    String dat2 = x3 + "/" + (m2 + 1) + "/" + y1;
                    Date datt2 = null;
                    try {
                        datt2 = format.parse(dat2);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt2 = format.format(datt2);
                    if ((datt2.after(b2) && datt2.before(j2)) || dattt2.equals(b1) || dattt2.equals(j1)) {
                        d3.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d4.getText()).equals("")) {

                    int x4 = Integer.parseInt(d4.getText());
                    String dat3 = x4 + "/" + (m2 + 1) + "/" + y1;
                    Date datt3 = null;
                    try {
                        datt3 = format.parse(dat3);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt3 = format.format(datt3);
                    if ((datt3.after(b2) && datt3.before(j2)) || dattt3.equals(b1) || dattt3.equals(j1)) {
                        d4.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d5.getText()).equals("")) {

                    int x5 = Integer.parseInt(d5.getText());
                    String dat4 = x5 + "/" + (m2 + 1) + "/" + y1;
                    Date datt4 = null;
                    try {
                        datt4 = format.parse(dat4);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt4 = format.format(datt4);
                    if ((datt4.after(b2) && datt4.before(j2)) || dattt4.equals(b1) || dattt4.equals(j1)) {
                        d5.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d6.getText()).equals("")) {

                    int x6 = Integer.parseInt(d6.getText());
                    String dat5 = x6 + "/" + (m2 + 1) + "/" + y1;
                    Date datt5 = null;
                    try {
                        datt5 = format.parse(dat5);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt5 = format.format(datt5);
                    if ((datt5.after(b2) && datt5.before(j2)) || dattt5.equals(b1) || dattt5.equals(j1)) {
                        d6.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d7.getText()).equals("")) {
                    int x7 = Integer.parseInt(d7.getText());
                    String dat6 = x7 + "/" + (m2 + 1) + "/" + y1;
                    Date datt6 = null;
                    try {
                        datt6 = format.parse(dat6);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt6 = format.format(datt6);
                    if ((datt6.after(b2) && datt6.before(j2)) || dattt6.equals(b1) || dattt6.equals(j1)) {
                        d7.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d8.getText()).equals("")) {
                    int x8 = Integer.parseInt(d8.getText());
                    String dat7 = x8 + "/" + (m2 + 1) + "/" + y1;
                    Date datt7 = null;
                    try {
                        datt7 = format.parse(dat7);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt7 = format.format(datt7);
                    if ((datt7.after(b2) && datt7.before(j2)) || dattt7.equals(b1) || dattt7.equals(j1)) {
                        d8.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d9.getText()).equals("")) {
                    int x9 = Integer.parseInt(d9.getText());
                    String dat8 = x9 + "/" + (m2 + 1) + "/" + y1;
                    Date datt8 = null;
                    try {
                        datt8 = format.parse(dat8);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt8 = format.format(datt8);
                    if ((datt8.after(b2) && datt8.before(j2)) || dattt8.equals(b1) || dattt8.equals(j1)) {
                        d9.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d10.getText()).equals("")) {
                    int x10 = Integer.parseInt(d10.getText());
                    String dat9 = x10 + "/" + (m2 + 1) + "/" + y1;
                    Date datt9 = null;
                    try {
                        datt9 = format.parse(dat9);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt9 = format.format(datt9);
                    if ((datt9.after(b2) && datt9.before(j2)) || dattt9.equals(b1) || dattt9.equals(j1)) {
                        d10.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d11.getText()).equals("")) {
                    int x11 = Integer.parseInt(d11.getText());
                    String dat10 = x11 + "/" + (m2 + 1) + "/" + y1;
                    Date datt10 = null;
                    try {
                        datt10 = format.parse(dat10);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt10 = format.format(datt10);
                    if ((datt10.after(b2) && datt10.before(j2)) || dattt10.equals(b1) || dattt10.equals(j1)) {
                        d11.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d12.getText()).equals("")) {
                    int x12 = Integer.parseInt(d12.getText());
                    String dat11 = x12 + "/" + (m2 + 1) + "/" + y1;
                    Date datt11 = null;
                    try {
                        datt11 = format.parse(dat11);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt11 = format.format(datt11);
                    if ((datt11.after(b2) && datt11.before(j2)) || dattt11.equals(b1) || dattt11.equals(j1)) {
                        d12.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d13.getText()).equals("")) {

                    int x13 = Integer.parseInt(d13.getText());
                    String dat12 = x13 + "/" + (m2 + 1) + "/" + y1;
                    Date datt12 = null;
                    try {
                        datt12 = format.parse(dat12);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt12 = format.format(datt12);
                    if ((datt12.after(b2) && datt12.before(j2)) || dattt12.equals(b1) || dattt12.equals(j1)) {
                        d13.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d14.getText()).equals("")) {

                    int x14 = Integer.parseInt(d14.getText());
                    String dat13 = x14 + "/" + (m2 + 1) + "/" + y1;
                    Date datt13 = null;
                    try {
                        datt13 = format.parse(dat13);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt13 = format.format(datt13);
                    if ((datt13.after(b2) && datt13.before(j2)) || dattt13.equals(b1) || dattt13.equals(j1)) {
                        d14.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d15.getText()).equals("")) {

                    int x15 = Integer.parseInt(d15.getText());
                    String dat14 = x15 + "/" + (m2 + 1) + "/" + y1;
                    Date datt14 = null;
                    try {
                        datt14 = format.parse(dat14);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt14 = format.format(datt14);
                    if ((datt14.after(b2) && datt14.before(j2)) || dattt14.equals(b1) || dattt14.equals(j1)) {
                        d15.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d16.getText()).equals("")) {

                    int x16 = Integer.parseInt(d16.getText());
                    String dat15 = x16 + "/" + (m2 + 1) + "/" + y1;
                    Date datt15 = null;
                    try {
                        datt15 = format.parse(dat15);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt15 = format.format(datt15);
                    if ((datt15.after(b2) && datt15.before(j2)) || dattt15.equals(b1) || dattt15.equals(j1)) {
                        d16.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d17.getText()).equals("")) {

                    int x17 = Integer.parseInt(d17.getText());
                    String dat16 = x17 + "/" + (m2 + 1) + "/" + y1;
                    Date datt16 = null;
                    try {
                        datt16 = format.parse(dat16);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt16 = format.format(datt16);
                    if ((datt16.after(b2) && datt16.before(j2)) || dattt16.equals(b1) || dattt16.equals(j1)) {
                        d17.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d18.getText()).equals("")) {

                    int x18 = Integer.parseInt(d18.getText());
                    String dat17 = x18 + "/" + (m2 + 1) + "/" + y1;
                    Date datt17 = null;
                    try {
                        datt17 = format.parse(dat17);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt17 = format.format(datt17);
                    if ((datt17.after(b2) && datt17.before(j2)) || dattt17.equals(b1) || dattt17.equals(j1)) {
                        d18.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d19.getText()).equals("")) {

                    int x19 = Integer.parseInt(d19.getText());
                    String dat18 = x19 + "/" + (m2 + 1) + "/" + y1;
                    Date datt18 = null;
                    try {
                        datt18 = format.parse(dat18);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt18 = format.format(datt18);
                    if ((datt18.after(b2) && datt18.before(j2)) || dattt18.equals(b1) || dattt18.equals(j1)) {
                        d19.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d20.getText()).equals("")) {

                    int x20 = Integer.parseInt(d20.getText());
                    String dat19 = x20 + "/" + (m2 + 1) + "/" + y1;
                    Date datt19 = null;
                    try {
                        datt19 = format.parse(dat19);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt19 = format.format(datt19);
                    if ((datt19.after(b2) && datt19.before(j2)) || dattt19.equals(b1) || dattt19.equals(j1)) {
                        d20.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d21.getText()).equals("")) {

                    int x21 = Integer.parseInt(d21.getText());
                    String dat20 = x21 + "/" + (m2 + 1) + "/" + y1;
                    Date datt20 = null;
                    try {
                        datt20 = format.parse(dat20);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt20 = format.format(datt20);
                    if ((datt20.after(b2) && datt20.before(j2)) || dattt20.equals(b1) || dattt20.equals(j1)) {
                        d21.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d22.getText()).equals("")) {

                    int x22 = Integer.parseInt(d22.getText());
                    String dat21 = x22 + "/" + (m2 + 1) + "/" + y1;
                    Date datt21 = null;
                    try {
                        datt21 = format.parse(dat21);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt21 = format.format(datt21);
                    if ((datt21.after(b2) && datt21.before(j2)) || dattt21.equals(b1) || dattt21.equals(j1)) {
                        d22.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d23.getText()).equals("")) {

                    int x23 = Integer.parseInt(d23.getText());
                    String dat22 = x23 + "/" + (m2 + 1) + "/" + y1;
                    Date datt22 = null;
                    try {
                        datt22 = format.parse(dat22);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt22 = format.format(datt22);
                    if ((datt22.after(b2) && datt22.before(j2)) || dattt22.equals(b1) || dattt22.equals(j1)) {
                        d23.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d24.getText()).equals("")) {

                    int x24 = Integer.parseInt(d24.getText());
                    String dat23 = x24 + "/" + (m2 + 1) + "/" + y1;
                    Date datt23 = null;
                    try {
                        datt23 = format.parse(dat23);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt23 = format.format(datt23);
                    if ((datt23.after(b2) && datt23.before(j2)) || dattt23.equals(b1) || dattt23.equals(j1)) {
                        d24.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d25.getText()).equals("")) {

                    int x25 = Integer.parseInt(d25.getText());
                    String dat24 = x25 + "/" + (m2 + 1) + "/" + y1;
                    Date datt24 = null;
                    try {
                        datt24 = format.parse(dat24);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt24 = format.format(datt24);
                    if ((datt24.after(b2) && datt24.before(j2)) || dattt24.equals(b1) || dattt24.equals(j1)) {
                        d25.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d26.getText()).equals("")) {

                    int x26 = Integer.parseInt(d26.getText());
                    String dat25 = x26 + "/" + (m2 + 1) + "/" + y1;
                    Date datt25 = null;
                    try {
                        datt25 = format.parse(dat25);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt25 = format.format(datt25);
                    if ((datt25.after(b2) && datt25.before(j2)) || dattt25.equals(b1) || dattt25.equals(j1)) {
                        d26.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d27.getText()).equals("")){
                int x27 = Integer.parseInt(d27.getText());
                String dat26 = x27 + "/" + (m2 + 1) + "/" + y1;
                Date datt26 = null;
                try {
                    datt26 = format.parse(dat26);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt26 = format.format(datt26);
                if ((datt26.after(b2) && datt26.before(j2)) || dattt26.equals(b1) || dattt26.equals(j1)) {
                    d27.setForeground(Color.MAGENTA);
                }}
                if (!(d28.getText()).equals("")){
                int x28 = Integer.parseInt(d28.getText());
                String dat27 = x28 + "/" + (m2 + 1) + "/" + y1;
                Date datt27 = null;
                try {
                    datt27 = format.parse(dat27);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt27 = format.format(datt27);
                if ((datt27.after(b2) && datt27.before(j2)) || dattt27.equals(b1) || dattt27.equals(j1)) {
                    d28.setForeground(Color.MAGENTA);
                }}
                if (!(d29.getText()).equals("")){
                int x29 = Integer.parseInt(d29.getText());
                String dat28 = x29 + "/" + (m2 + 1) + "/" + y1;
                Date datt28 = null;
                try {
                    datt28 = format.parse(dat28);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt28 = format.format(datt28);
                if ((datt28.after(b2) && datt28.before(j2)) || dattt28.equals(b1) || dattt28.equals(j1)) {
                    d29.setForeground(Color.MAGENTA);
                }}
                if (!(d30.getText()).equals("")){
                int x30 = Integer.parseInt(d30.getText());
                String dat29 = x30 + "/" + (m2 + 1) + "/" + y1;
                Date datt29 = null;
                try {
                    datt29 = format.parse(dat29);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt29 = format.format(datt29);
                if ((datt29.after(b2) && datt29.before(j2)) || dattt29.equals(b1) || dattt29.equals(j1)) {
                    d30.setForeground(Color.MAGENTA);
                }}
                if (!(d31.getText()).equals("")){
                int x31 = Integer.parseInt(d31.getText());
                String dat30 = x31 + "/" + (m2 + 1) + "/" + y1;
                Date datt30 = null;
                try {
                    datt30 = format.parse(dat30);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt30 = format.format(datt30);
                if ((datt30.after(b2) && datt30.before(j2)) || dattt30.equals(b1) || dattt30.equals(j1)) {
                    d31.setForeground(Color.MAGENTA);
                }}
                if (!(d32.getText()).equals("")){
                int x32 = Integer.parseInt(d32.getText());
                String dat31 = x32 + "/" + (m2 + 1) + "/" + y1;
                Date datt31 = null;
                try {
                    datt31 = format.parse(dat31);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt31 = format.format(datt31);
                if ((datt31.after(b2) && datt31.before(j2)) || dattt31.equals(b1) || dattt31.equals(j1)) {
                    d32.setForeground(Color.MAGENTA);
                }}
                if (!(d33.getText()).equals("")){
                int x33 = Integer.parseInt(d33.getText());
                String dat32 = x33 + "/" + (m2 + 1) + "/" + y1;
                Date datt32 = null;
                try {
                    datt32 = format.parse(dat32);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt32 = format.format(datt32);
                if ((datt32.after(b2) && datt32.before(j2)) || dattt32.equals(b1) || dattt32.equals(j1)) {
                    d33.setForeground(Color.MAGENTA);
                }}
                if (!(d34.getText()).equals("")){
                int x34 = Integer.parseInt(d34.getText());
                String dat33 = x34 + "/" + (m2 + 1) + "/" + y1;
                Date datt33 = null;
                try {
                    datt33 = format.parse(dat33);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt33 = format.format(datt33);
                if ((datt33.after(b2) && datt33.before(j2)) || dattt33.equals(b1) || dattt33.equals(j1)) {
                    d34.setForeground(Color.MAGENTA);
                }}
                if (!(d35.getText()).equals("")){
                int x35 = Integer.parseInt(d35.getText());
                String dat34 = x35 + "/" + (m2 + 1) + "/" + y1;
                Date datt34 = null;
                try {
                    datt34 = format.parse(dat34);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt34 = format.format(datt34);
                if ((datt34.after(b2) && datt34.before(j2)) || dattt34.equals(b1) || dattt34.equals(j1)) {
                    d35.setForeground(Color.MAGENTA);
                }}
                if (!(d36.getText()).equals("")){
                int x36 = Integer.parseInt(d36.getText());
                String dat35 = x36 + "/" + (m2 + 1) + "/" + y1;
                Date datt35 = null;
                try {
                    datt35 = format.parse(dat35);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt35 = format.format(datt35);
                if ((datt35.after(b2) && datt35.before(j2)) || dattt35.equals(b1) || dattt35.equals(j1)) {
                    d36.setForeground(Color.MAGENTA);
                }}
                if (!(d37.getText()).equals("")){

                int x37 = Integer.parseInt(d37.getText());
                String dat36 = x37 + "/" + (m2 + 1) + "/" + y1;
                Date datt36 = null;
                try {
                    datt36 = format.parse(dat36);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt36 = format.format(datt36);
                if ((datt36.after(b2) && datt36.before(j2)) || dattt36.equals(b1) || dattt36.equals(j1)) {
                    d37.setForeground(Color.MAGENTA);
                }}
            }
        } catch (Exception error) {

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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        month = new com.toedter.calendar.JMonthChooser();
        year = new com.toedter.calendar.JYearChooser();
        da1 = new javax.swing.JLabel();
        da2 = new javax.swing.JLabel();
        tue = new javax.swing.JLabel();
        wed = new javax.swing.JLabel();
        thu = new javax.swing.JLabel();
        fri = new javax.swing.JLabel();
        sat = new javax.swing.JLabel();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        d7 = new javax.swing.JButton();
        d8 = new javax.swing.JButton();
        d9 = new javax.swing.JButton();
        d10 = new javax.swing.JButton();
        d11 = new javax.swing.JButton();
        d12 = new javax.swing.JButton();
        d13 = new javax.swing.JButton();
        d14 = new javax.swing.JButton();
        d15 = new javax.swing.JButton();
        d16 = new javax.swing.JButton();
        d17 = new javax.swing.JButton();
        d18 = new javax.swing.JButton();
        d19 = new javax.swing.JButton();
        d20 = new javax.swing.JButton();
        d21 = new javax.swing.JButton();
        d22 = new javax.swing.JButton();
        d23 = new javax.swing.JButton();
        d24 = new javax.swing.JButton();
        d25 = new javax.swing.JButton();
        d26 = new javax.swing.JButton();
        d27 = new javax.swing.JButton();
        d28 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        d29 = new javax.swing.JButton();
        d30 = new javax.swing.JButton();
        d31 = new javax.swing.JButton();
        d32 = new javax.swing.JButton();
        d33 = new javax.swing.JButton();
        d34 = new javax.swing.JButton();
        d35 = new javax.swing.JButton();
        d36 = new javax.swing.JButton();
        d37 = new javax.swing.JButton();
        invisible = new com.toedter.calendar.JCalendar();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 36)); // NOI18N
        jLabel3.setText("Event's Calendar");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 22, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/Rajul/Downloads/logo.gif")); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 6, -1, -1));

        month.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                monthPropertyChange(evt);
            }
        });
        add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        year.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearPropertyChange(evt);
            }
        });
        add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 109, 372, -1));

        da1.setText("Sun");
        add(da1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 141, -1, -1));

        da2.setText("Mon");
        add(da2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 141, -1, -1));

        tue.setText("Tue");
        add(tue, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 141, -1, -1));

        wed.setText("Wed");
        add(wed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 141, -1, -1));

        thu.setText("Thu");
        add(thu, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 141, -1, -1));

        fri.setText("Fri");
        add(fri, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 141, -1, -1));

        sat.setText("Sat");
        add(sat, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 141, -1, -1));

        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 163, 55, -1));

        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 163, 55, -1));

        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });
        add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 163, 55, -1));

        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });
        add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 163, 55, -1));

        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });
        add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 163, 55, -1));

        d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ActionPerformed(evt);
            }
        });
        add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 163, 55, -1));

        d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7ActionPerformed(evt);
            }
        });
        add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 163, 55, -1));

        d8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8ActionPerformed(evt);
            }
        });
        add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 204, 55, -1));

        d9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d9ActionPerformed(evt);
            }
        });
        add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 204, 55, -1));

        d10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10ActionPerformed(evt);
            }
        });
        add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 204, 55, -1));

        d11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d11ActionPerformed(evt);
            }
        });
        add(d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 204, 55, -1));

        d12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d12ActionPerformed(evt);
            }
        });
        add(d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 204, 55, -1));

        d13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d13ActionPerformed(evt);
            }
        });
        add(d13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 204, 55, -1));

        d14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d14ActionPerformed(evt);
            }
        });
        add(d14, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 204, 55, -1));

        d15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d15ActionPerformed(evt);
            }
        });
        add(d15, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 245, 55, -1));

        d16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d16ActionPerformed(evt);
            }
        });
        add(d16, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 245, 55, -1));

        d17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d17ActionPerformed(evt);
            }
        });
        add(d17, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 245, 55, -1));

        d18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d18ActionPerformed(evt);
            }
        });
        add(d18, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 245, 55, -1));

        d19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d19ActionPerformed(evt);
            }
        });
        add(d19, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 245, 55, -1));

        d20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d20ActionPerformed(evt);
            }
        });
        add(d20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 245, 55, -1));

        d21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d21ActionPerformed(evt);
            }
        });
        add(d21, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 245, 55, -1));

        d22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d22ActionPerformed(evt);
            }
        });
        add(d22, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 286, 55, -1));

        d23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d23ActionPerformed(evt);
            }
        });
        add(d23, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 286, 55, -1));

        d24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d24ActionPerformed(evt);
            }
        });
        add(d24, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 286, 55, -1));

        d25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d25ActionPerformed(evt);
            }
        });
        add(d25, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 286, 55, -1));

        d26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d26ActionPerformed(evt);
            }
        });
        add(d26, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 286, 55, -1));

        d27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d27ActionPerformed(evt);
            }
        });
        add(d27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 286, 55, -1));

        d28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d28ActionPerformed(evt);
            }
        });
        add(d28, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 286, 55, -1));

        tab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tab);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 500, 107));

        d29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d29ActionPerformed(evt);
            }
        });
        add(d29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 55, -1));

        d30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d30ActionPerformed(evt);
            }
        });
        add(d30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 55, -1));

        d31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d31ActionPerformed(evt);
            }
        });
        add(d31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 55, -1));

        d32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d32ActionPerformed(evt);
            }
        });
        add(d32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 55, -1));

        d33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d33ActionPerformed(evt);
            }
        });
        add(d33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 55, -1));

        d34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d34ActionPerformed(evt);
            }
        });
        add(d34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 55, -1));

        d35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d35ActionPerformed(evt);
            }
        });
        add(d35, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 55, -1));

        d36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d36ActionPerformed(evt);
            }
        });
        add(d36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 55, -1));

        d37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d37ActionPerformed(evt);
            }
        });
        add(d37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 55, -1));
        add(invisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d1.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d2.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d3.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d4.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d5.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d5ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d6.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d6ActionPerformed

    private void d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d7.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d7ActionPerformed

    private void d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d8.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d8ActionPerformed

    private void d9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d9ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d9.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d9ActionPerformed

    private void d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d10.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d10ActionPerformed

    private void d11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d11ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d11.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }

    }//GEN-LAST:event_d11ActionPerformed

    private void d12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d12ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d12.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d12ActionPerformed

    private void d13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d13ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d13.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d13ActionPerformed

    private void d14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d14ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d14.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d14ActionPerformed

    private void d15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d15ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d15.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d15ActionPerformed

    private void d16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d16ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d16.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d16ActionPerformed

    private void d17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d17ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d17.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d17ActionPerformed

    private void d18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d18ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d18.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d18ActionPerformed

    private void d19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d19ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d19.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d19ActionPerformed

    private void d20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d20.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d20ActionPerformed

    private void d21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d21ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d21.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d21ActionPerformed

    private void d22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d22ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d22.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d22ActionPerformed

    private void d23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d23ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d23.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d23ActionPerformed

    private void d24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d24ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d24.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d24ActionPerformed

    private void d25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d25ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d25.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d25ActionPerformed

    private void d26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d26ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d26.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d26ActionPerformed

    private void d27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d27ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d27.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d27ActionPerformed

    private void d28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d28ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d28.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d28ActionPerformed

    private void d29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d29ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d29.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d29ActionPerformed

    private void d30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d30ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d30.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d30ActionPerformed

    private void d31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d31ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d31.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d31ActionPerformed

    private void d32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d32ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d32.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d32ActionPerformed

    private void d33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d33ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d33.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d33ActionPerformed

    private void d34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d34ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d34.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d34ActionPerformed

    private void d35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d35ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d35.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d35ActionPerformed

    private void yearPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearPropertyChange
  d1.setForeground(Color.black);
                d2.setForeground(Color.black);
        d3.setForeground(Color.black);
        d4.setForeground(Color.black);
        d5.setForeground(Color.black);
        d6.setForeground(Color.black);
        d7.setForeground(Color.black);
        d8.setForeground(Color.black);
        d9.setForeground(Color.black);
        d10.setForeground(Color.black);
        d11.setForeground(Color.black);
        d12.setForeground(Color.black);
        d13.setForeground(Color.black);
        d14.setForeground(Color.black);
        d15.setForeground(Color.black);
        d16.setForeground(Color.black);
        d17.setForeground(Color.black);
        d18.setForeground(Color.black);
        d19.setForeground(Color.black);
        d20.setForeground(Color.black);
        d21.setForeground(Color.black);
        d22.setForeground(Color.black);
        d23.setForeground(Color.black);
        d24.setForeground(Color.black);
        d25.setForeground(Color.black);
        d26.setForeground(Color.black);
        d27.setForeground(Color.black);
        d28.setForeground(Color.black);
        d29.setForeground(Color.black);
        d30.setForeground(Color.black);
        d31.setForeground(Color.black);
        d32.setForeground(Color.black);
        d33.setForeground(Color.black);
        d34.setForeground(Color.black);
        d35.setForeground(Color.black);
        d36.setForeground(Color.black);
        d37.setForeground(Color.black);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        invisible.setVisible(false);
        int year1 = year.getYear();
        Date m = invisible.getDate();
        String m1 = format.format(m);
        StringTokenizer pz2 = new StringTokenizer(String.valueOf(m1), "/");
        String a10 = pz2.nextToken();
        String b10 = pz2.nextToken();
        String c20 = pz2.nextToken();
        StringTokenizer pz1 = new StringTokenizer(String.valueOf(m), " ");
        String a = pz1.nextToken();
        String b = pz1.nextToken();
        String c = pz1.nextToken();
        int c1 = Integer.parseInt(c);
        String d = pz1.nextToken();
        String e = pz1.nextToken();
        String f = pz1.nextToken();
        int f1 = Integer.parseInt(f);
        String inv = a10 + "/" + b10 + "/" + year1;
        Date inv1 = null;
        try {
            inv1 = (Date) format.parse(inv);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        StringTokenizer pz3 = new StringTokenizer(String.valueOf(inv1), " ");
        String a3 = pz3.nextToken();
        String b3 = pz3.nextToken();
        String c3 = pz3.nextToken();
        int c4 = Integer.parseInt(c3);
        String da = pz3.nextToken();
        String e3 = pz3.nextToken();
        String f3 = pz3.nextToken();
        int f4 = Integer.parseInt(f3);

        d1.setText("");
        d2.setText("");
        d3.setText("");
        d4.setText("");
        d5.setText("");
        d6.setText("");
        d7.setText("");
        d8.setText("");
        d9.setText("");
        d10.setText("");
        d11.setText("");
        d12.setText("");
        d13.setText("");
        d14.setText("");
        d15.setText("");
        d16.setText("");
        d17.setText("");
        d18.setText("");
        d19.setText("");
        d20.setText("");
        d21.setText("");
        d22.setText("");
        d23.setText("");
        d24.setText("");
        d25.setText("");
        d26.setText("");
        d27.setText("");
        d28.setText("");
        d29.setText("");
        d30.setText("");
        d31.setText("");
        d32.setText("");
        d33.setText("");
        d34.setText("");
        d35.setText("");
        d36.setText("");
        d37.setText("");

        while (c4 > 1) {
            c4 = c4 - 1;
            if (a3.equals("Sun")) {
                a3 = "Sat";
            } else if (a3.equals("Sat")) {
                a3 = "Fri";
            } else if (a3.equals("Fri")) {
                a3 = "Thu";
            } else if (a3.equals("Thu")) {
                a3 = "Wed";
            } else if (a3.equals("Wed")) {
                a3 = "Tue";
            } else if (a3.equals("Tue")) {
                a3 = "Mon";
            } else if (a3.equals("Mon")) {
                a3 = "Sun";
            }

        }
        if (a3.equals("Sun")) {
            d1.setVisible(true);
            d2.setVisible(true);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d1.setText("1");
            d2.setText("2");
            d3.setText("3");
            d4.setText("4");
            d5.setText("5");
            d6.setText("6");
            d7.setText("7");
            d8.setText("8");
            d9.setText("9");
            d10.setText("10");
            d11.setText("11");
            d12.setText("12");
            d13.setText("13");
            d14.setText("14");
            d15.setText("15");
            d16.setText("16");
            d17.setText("17");
            d18.setText("18");
            d19.setText("19");
            d20.setText("20");
            d21.setText("21");
            d22.setText("22");
            d23.setText("23");
            d24.setText("24");
            d25.setText("25");
            d26.setText("26");
            d27.setText("27");
            d28.setText("28");
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d29.setText("29");
                d30.setVisible(false);
                d31.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d29.setVisible(false);
                d30.setVisible(false);
                d31.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d29.setVisible(true);
                d29.setText("29");
                d30.setVisible(true);
                d30.setText("30");
                d31.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d29.setVisible(true);
                d29.setText("29");
                d30.setVisible(true);
                d30.setText("30");
                d31.setVisible(true);
                d31.setText("31");

            }
            d32.setVisible(false);
            d33.setVisible(false);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (a3.equals("Mon")) {
            d1.setVisible(false);
            d2.setVisible(true);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d2.setText("1");
            d3.setText("2");
            d4.setText("3");
            d5.setText("4");
            d6.setText("5");
            d7.setText("6");
            d8.setText("7");
            d9.setText("8");
            d10.setText("9");
            d11.setText("10");
            d12.setText("11");
            d13.setText("12");
            d14.setText("13");
            d15.setText("14");
            d16.setText("15");
            d17.setText("16");
            d18.setText("17");
            d19.setText("18");
            d20.setText("19");
            d21.setText("20");
            d22.setText("21");
            d23.setText("22");
            d24.setText("23");
            d25.setText("24");
            d26.setText("25");
            d27.setText("26");
            d28.setText("27");
            d29.setText("28");

            d32.setVisible(true);
            d33.setVisible(false);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(false);
                d32.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d30.setVisible(false);
                d31.setVisible(false);
                d32.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(true);
                d31.setText("30");
                d32.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(true);
                d31.setText("30");
                d32.setVisible(true);
                d32.setText("31");

            }

        }
        if (a3.equals("Tue")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d3.setText("1");
            d4.setText("2");
            d5.setText("3");
            d6.setText("4");
            d7.setText("5");
            d8.setText("6");
            d9.setText("7");
            d10.setText("8");
            d11.setText("9");
            d12.setText("10");
            d13.setText("11");
            d14.setText("12");
            d15.setText("13");
            d16.setText("14");
            d17.setText("15");
            d18.setText("16");
            d19.setText("17");
            d20.setText("18");
            d21.setText("19");
            d22.setText("20");
            d23.setText("21");
            d24.setText("22");
            d25.setText("23");
            d26.setText("24");
            d27.setText("25");
            d28.setText("26");
            d29.setText("27");
            d30.setText("28");
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(false);
                d33.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d31.setVisible(false);
                d32.setVisible(false);
                d33.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(true);
                d32.setText("30");
                d33.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(true);
                d32.setText("30");
                d33.setVisible(true);
                d33.setText("31");

            }

        }

        if (a3.equals("Wed")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d4.setText("1");
            d5.setText("2");
            d6.setText("3");
            d7.setText("4");
            d8.setText("5");
            d9.setText("6");
            d10.setText("7");
            d11.setText("8");
            d12.setText("9");
            d13.setText("10");
            d14.setText("11");
            d15.setText("12");
            d16.setText("13");
            d17.setText("14");
            d18.setText("15");
            d19.setText("16");
            d20.setText("17");
            d21.setText("18");
            d22.setText("19");
            d23.setText("20");
            d24.setText("21");
            d25.setText("22");
            d26.setText("23");
            d27.setText("24");
            d28.setText("25");
            d29.setText("26");
            d30.setText("27");
            d31.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(false);
                d34.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d32.setVisible(false);
                d33.setVisible(false);
                d34.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(true);
                d33.setText("30");
                d34.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(true);
                d33.setText("30");
                d34.setVisible(true);
                d34.setText("31");

            }

        }
        if (a3.equals("Thu")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(true);
            d6.setVisible(true);
            d5.setText("1");
            d6.setText("2");
            d7.setText("3");
            d8.setText("4");
            d9.setText("5");
            d10.setText("6");
            d11.setText("7");
            d12.setText("8");
            d13.setText("9");
            d14.setText("10");
            d15.setText("11");
            d16.setText("12");
            d17.setText("13");
            d18.setText("14");
            d19.setText("15");
            d20.setText("16");
            d21.setText("17");
            d22.setText("18");
            d23.setText("19");
            d24.setText("20");
            d25.setText("21");
            d26.setText("22");
            d27.setText("23");
            d28.setText("24");
            d29.setText("25");
            d30.setText("26");
            d31.setText("27");
            d32.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(true);
            d36.setVisible(false);
            d37.setVisible(false);

            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(false);
                d35.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d33.setVisible(false);
                d34.setVisible(false);
                d35.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(true);
                d34.setText("30");
                d35.setVisible(false);
                d36.setVisible(false);
                d37.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(true);
                d34.setText("30");
                d35.setVisible(true);
                d35.setText("31");
                d36.setVisible(false);
                d37.setVisible(false);

            }

        }
        if (a3.equals("Fri")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setVisible(true);
            d6.setText("1");
            d7.setText("2");
            d8.setText("3");
            d9.setText("4");
            d10.setText("5");
            d11.setText("6");
            d12.setText("7");
            d13.setText("8");
            d14.setText("9");
            d15.setText("10");
            d16.setText("11");
            d17.setText("12");
            d18.setText("13");
            d19.setText("14");
            d20.setText("15");
            d21.setText("16");
            d22.setText("17");
            d23.setText("18");
            d24.setText("19");
            d25.setText("20");
            d26.setText("21");
            d27.setText("22");
            d28.setText("23");
            d29.setText("24");
            d30.setText("25");
            d31.setText("26");
            d32.setText("27");
            d33.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(true);
            d36.setVisible(true);
            d37.setVisible(false);

            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(false);
                d36.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d34.setVisible(false);
                d35.setVisible(false);
                d36.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(true);
                d35.setText("30");
                d36.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(true);
                d35.setText("30");
                d36.setVisible(true);
                d36.setText("31");

            }

        }
        if (a3.equals("Sat")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setVisible(false);
            d7.setText("1");
            d8.setText("2");
            d9.setText("3");
            d10.setText("4");
            d11.setText("5");
            d12.setText("6");
            d13.setText("7");
            d14.setText("8");
            d15.setText("9");
            d16.setText("10");
            d17.setText("11");
            d18.setText("12");
            d19.setText("13");
            d20.setText("14");
            d21.setText("15");
            d22.setText("16");
            d23.setText("17");
            d24.setText("18");
            d25.setText("19");
            d26.setText("20");
            d27.setText("21");
            d28.setText("22");
            d29.setText("23");
            d30.setText("24");
            d31.setText("25");
            d32.setText("26");
            d33.setText("27");
            d34.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(true);
            d36.setVisible(true);
            d37.setVisible(true);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d35.setVisible(true);
                d35.setText("29");
                d36.setVisible(false);
                d37.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d35.setVisible(false);
                d36.setVisible(false);
                d37.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d35.setVisible(true);
                d35.setText("29");
                d36.setVisible(true);
                d36.setText("30");
                d37.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d35.setVisible(true);
                d35.setText("29");
                d36.setVisible(true);
                d36.setText("30");
                d37.setVisible(true);
                d37.setText("31");

            }
        }
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e1 = pz.nextToken();
                String a1 = pz.nextToken();
                String b1 = pz.nextToken();
                String c2 = pz.nextToken();
                String da10 = pz.nextToken();
                String j1 = pz.nextToken();
                String f2 = pz.nextToken();
                Date b2 = format.parse(b1);
                Date j2 = format.parse(j1);
                int m2 = month.getMonth();
                int y1 = year.getYear();

                if (!(d1.getText()).equals("")) {
                    int x = Integer.parseInt(d1.getText());

                    String dat = x + "/" + (m2 + 1) + "/" + y1;
                    Date datt = null;
                    try {
                        datt = format.parse(dat);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt = format.format(datt);

                    if ((datt.after(b2) && datt.before(j2)) || dattt.equals(b1) || dattt.equals(j1)) {
                        d1.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d2.getText()).equals("")) {

                    int x2 = Integer.parseInt(d2.getText());
                    String dat1 = x2 + "/" + (m2 + 1) + "/" + y1;
                    Date datt1 = null;
                    try {
                        datt1 = format.parse(dat1);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt1 = format.format(datt1);
                    if ((datt1.after(b2) && datt1.before(j2)) || dattt1.equals(b1) || dattt1.equals(j1)) {
                        d2.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d3.getText()).equals("")) {

                    int x3 = Integer.parseInt(d3.getText());
                    String dat2 = x3 + "/" + (m2 + 1) + "/" + y1;
                    Date datt2 = null;
                    try {
                        datt2 = format.parse(dat2);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt2 = format.format(datt2);
                    if ((datt2.after(b2) && datt2.before(j2)) || dattt2.equals(b1) || dattt2.equals(j1)) {
                        d3.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d4.getText()).equals("")) {

                    int x4 = Integer.parseInt(d4.getText());
                    String dat3 = x4 + "/" + (m2 + 1) + "/" + y1;
                    Date datt3 = null;
                    try {
                        datt3 = format.parse(dat3);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt3 = format.format(datt3);
                    if ((datt3.after(b2) && datt3.before(j2)) || dattt3.equals(b1) || dattt3.equals(j1)) {
                        d4.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d5.getText()).equals("")) {

                    int x5 = Integer.parseInt(d5.getText());
                    String dat4 = x5 + "/" + (m2 + 1) + "/" + y1;
                    Date datt4 = null;
                    try {
                        datt4 = format.parse(dat4);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt4 = format.format(datt4);
                    if ((datt4.after(b2) && datt4.before(j2)) || dattt4.equals(b1) || dattt4.equals(j1)) {
                        d5.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d6.getText()).equals("")) {

                    int x6 = Integer.parseInt(d6.getText());
                    String dat5 = x6 + "/" + (m2 + 1) + "/" + y1;
                    Date datt5 = null;
                    try {
                        datt5 = format.parse(dat5);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt5 = format.format(datt5);
                    if ((datt5.after(b2) && datt5.before(j2)) || dattt5.equals(b1) || dattt5.equals(j1)) {
                        d6.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d7.getText()).equals("")) {
                    int x7 = Integer.parseInt(d7.getText());
                    String dat6 = x7 + "/" + (m2 + 1) + "/" + y1;
                    Date datt6 = null;
                    try {
                        datt6 = format.parse(dat6);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt6 = format.format(datt6);
                    if ((datt6.after(b2) && datt6.before(j2)) || dattt6.equals(b1) || dattt6.equals(j1)) {
                        d7.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d8.getText()).equals("")) {
                    int x8 = Integer.parseInt(d8.getText());
                    String dat7 = x8 + "/" + (m2 + 1) + "/" + y1;
                    Date datt7 = null;
                    try {
                        datt7 = format.parse(dat7);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt7 = format.format(datt7);
                    if ((datt7.after(b2) && datt7.before(j2)) || dattt7.equals(b1) || dattt7.equals(j1)) {
                        d8.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d9.getText()).equals("")) {
                    int x9 = Integer.parseInt(d9.getText());
                    String dat8 = x9 + "/" + (m2 + 1) + "/" + y1;
                    Date datt8 = null;
                    try {
                        datt8 = format.parse(dat8);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt8 = format.format(datt8);
                    if ((datt8.after(b2) && datt8.before(j2)) || dattt8.equals(b1) || dattt8.equals(j1)) {
                        d9.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d10.getText()).equals("")) {
                    int x10 = Integer.parseInt(d10.getText());
                    String dat9 = x10 + "/" + (m2 + 1) + "/" + y1;
                    Date datt9 = null;
                    try {
                        datt9 = format.parse(dat9);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt9 = format.format(datt9);
                    if ((datt9.after(b2) && datt9.before(j2)) || dattt9.equals(b1) || dattt9.equals(j1)) {
                        d10.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d11.getText()).equals("")) {
                    int x11 = Integer.parseInt(d11.getText());
                    String dat10 = x11 + "/" + (m2 + 1) + "/" + y1;
                    Date datt10 = null;
                    try {
                        datt10 = format.parse(dat10);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt10 = format.format(datt10);
                    if ((datt10.after(b2) && datt10.before(j2)) || dattt10.equals(b1) || dattt10.equals(j1)) {
                        d11.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d12.getText()).equals("")) {
                    int x12 = Integer.parseInt(d12.getText());
                    String dat11 = x12 + "/" + (m2 + 1) + "/" + y1;
                    Date datt11 = null;
                    try {
                        datt11 = format.parse(dat11);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt11 = format.format(datt11);
                    if ((datt11.after(b2) && datt11.before(j2)) || dattt11.equals(b1) || dattt11.equals(j1)) {
                        d12.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d13.getText()).equals("")) {

                    int x13 = Integer.parseInt(d13.getText());
                    String dat12 = x13 + "/" + (m2 + 1) + "/" + y1;
                    Date datt12 = null;
                    try {
                        datt12 = format.parse(dat12);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt12 = format.format(datt12);
                    if ((datt12.after(b2) && datt12.before(j2)) || dattt12.equals(b1) || dattt12.equals(j1)) {
                        d13.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d14.getText()).equals("")) {

                    int x14 = Integer.parseInt(d14.getText());
                    String dat13 = x14 + "/" + (m2 + 1) + "/" + y1;
                    Date datt13 = null;
                    try {
                        datt13 = format.parse(dat13);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt13 = format.format(datt13);
                    if ((datt13.after(b2) && datt13.before(j2)) || dattt13.equals(b1) || dattt13.equals(j1)) {
                        d14.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d15.getText()).equals("")) {

                    int x15 = Integer.parseInt(d15.getText());
                    String dat14 = x15 + "/" + (m2 + 1) + "/" + y1;
                    Date datt14 = null;
                    try {
                        datt14 = format.parse(dat14);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt14 = format.format(datt14);
                    if ((datt14.after(b2) && datt14.before(j2)) || dattt14.equals(b1) || dattt14.equals(j1)) {
                        d15.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d16.getText()).equals("")) {

                    int x16 = Integer.parseInt(d16.getText());
                    String dat15 = x16 + "/" + (m2 + 1) + "/" + y1;
                    Date datt15 = null;
                    try {
                        datt15 = format.parse(dat15);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt15 = format.format(datt15);
                    if ((datt15.after(b2) && datt15.before(j2)) || dattt15.equals(b1) || dattt15.equals(j1)) {
                        d16.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d17.getText()).equals("")) {

                    int x17 = Integer.parseInt(d17.getText());
                    String dat16 = x17 + "/" + (m2 + 1) + "/" + y1;
                    Date datt16 = null;
                    try {
                        datt16 = format.parse(dat16);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt16 = format.format(datt16);
                    if ((datt16.after(b2) && datt16.before(j2)) || dattt16.equals(b1) || dattt16.equals(j1)) {
                        d17.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d18.getText()).equals("")) {

                    int x18 = Integer.parseInt(d18.getText());
                    String dat17 = x18 + "/" + (m2 + 1) + "/" + y1;
                    Date datt17 = null;
                    try {
                        datt17 = format.parse(dat17);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt17 = format.format(datt17);
                    if ((datt17.after(b2) && datt17.before(j2)) || dattt17.equals(b1) || dattt17.equals(j1)) {
                        d18.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d19.getText()).equals("")) {

                    int x19 = Integer.parseInt(d19.getText());
                    String dat18 = x19 + "/" + (m2 + 1) + "/" + y1;
                    Date datt18 = null;
                    try {
                        datt18 = format.parse(dat18);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt18 = format.format(datt18);
                    if ((datt18.after(b2) && datt18.before(j2)) || dattt18.equals(b1) || dattt18.equals(j1)) {
                        d19.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d20.getText()).equals("")) {

                    int x20 = Integer.parseInt(d20.getText());
                    String dat19 = x20 + "/" + (m2 + 1) + "/" + y1;
                    Date datt19 = null;
                    try {
                        datt19 = format.parse(dat19);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt19 = format.format(datt19);
                    if ((datt19.after(b2) && datt19.before(j2)) || dattt19.equals(b1) || dattt19.equals(j1)) {
                        d20.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d21.getText()).equals("")) {

                    int x21 = Integer.parseInt(d21.getText());
                    String dat20 = x21 + "/" + (m2 + 1) + "/" + y1;
                    Date datt20 = null;
                    try {
                        datt20 = format.parse(dat20);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt20 = format.format(datt20);
                    if ((datt20.after(b2) && datt20.before(j2)) || dattt20.equals(b1) || dattt20.equals(j1)) {
                        d21.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d22.getText()).equals("")) {

                    int x22 = Integer.parseInt(d22.getText());
                    String dat21 = x22 + "/" + (m2 + 1) + "/" + y1;
                    Date datt21 = null;
                    try {
                        datt21 = format.parse(dat21);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt21 = format.format(datt21);
                    if ((datt21.after(b2) && datt21.before(j2)) || dattt21.equals(b1) || dattt21.equals(j1)) {
                        d22.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d23.getText()).equals("")) {

                    int x23 = Integer.parseInt(d23.getText());
                    String dat22 = x23 + "/" + (m2 + 1) + "/" + y1;
                    Date datt22 = null;
                    try {
                        datt22 = format.parse(dat22);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt22 = format.format(datt22);
                    if ((datt22.after(b2) && datt22.before(j2)) || dattt22.equals(b1) || dattt22.equals(j1)) {
                        d23.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d24.getText()).equals("")) {

                    int x24 = Integer.parseInt(d24.getText());
                    String dat23 = x24 + "/" + (m2 + 1) + "/" + y1;
                    Date datt23 = null;
                    try {
                        datt23 = format.parse(dat23);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt23 = format.format(datt23);
                    if ((datt23.after(b2) && datt23.before(j2)) || dattt23.equals(b1) || dattt23.equals(j1)) {
                        d24.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d25.getText()).equals("")) {

                    int x25 = Integer.parseInt(d25.getText());
                    String dat24 = x25 + "/" + (m2 + 1) + "/" + y1;
                    Date datt24 = null;
                    try {
                        datt24 = format.parse(dat24);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt24 = format.format(datt24);
                    if ((datt24.after(b2) && datt24.before(j2)) || dattt24.equals(b1) || dattt24.equals(j1)) {
                        d25.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d26.getText()).equals("")) {

                    int x26 = Integer.parseInt(d26.getText());
                    String dat25 = x26 + "/" + (m2 + 1) + "/" + y1;
                    Date datt25 = null;
                    try {
                        datt25 = format.parse(dat25);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt25 = format.format(datt25);
                    if ((datt25.after(b2) && datt25.before(j2)) || dattt25.equals(b1) || dattt25.equals(j1)) {
                        d26.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d27.getText()).equals("")){
                int x27 = Integer.parseInt(d27.getText());
                String dat26 = x27 + "/" + (m2 + 1) + "/" + y1;
                Date datt26 = null;
                try {
                    datt26 = format.parse(dat26);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt26 = format.format(datt26);
                if ((datt26.after(b2) && datt26.before(j2)) || dattt26.equals(b1) || dattt26.equals(j1)) {
                    d27.setForeground(Color.MAGENTA);
                }}
                if (!(d28.getText()).equals("")){
                int x28 = Integer.parseInt(d28.getText());
                String dat27 = x28 + "/" + (m2 + 1) + "/" + y1;
                Date datt27 = null;
                try {
                    datt27 = format.parse(dat27);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt27 = format.format(datt27);
                if ((datt27.after(b2) && datt27.before(j2)) || dattt27.equals(b1) || dattt27.equals(j1)) {
                    d28.setForeground(Color.MAGENTA);
                }}
                if (!(d29.getText()).equals("")){
                int x29 = Integer.parseInt(d29.getText());
                String dat28 = x29 + "/" + (m2 + 1) + "/" + y1;
                Date datt28 = null;
                try {
                    datt28 = format.parse(dat28);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt28 = format.format(datt28);
                if ((datt28.after(b2) && datt28.before(j2)) || dattt28.equals(b1) || dattt28.equals(j1)) {
                    d29.setForeground(Color.MAGENTA);
                }}
                if (!(d30.getText()).equals("")){
                int x30 = Integer.parseInt(d30.getText());
                String dat29 = x30 + "/" + (m2 + 1) + "/" + y1;
                Date datt29 = null;
                try {
                    datt29 = format.parse(dat29);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt29 = format.format(datt29);
                if ((datt29.after(b2) && datt29.before(j2)) || dattt29.equals(b1) || dattt29.equals(j1)) {
                    d30.setForeground(Color.MAGENTA);
                }}
                if (!(d31.getText()).equals("")){
                int x31 = Integer.parseInt(d31.getText());
                String dat30 = x31 + "/" + (m2 + 1) + "/" + y1;
                Date datt30 = null;
                try {
                    datt30 = format.parse(dat30);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt30 = format.format(datt30);
                if ((datt30.after(b2) && datt30.before(j2)) || dattt30.equals(b1) || dattt30.equals(j1)) {
                    d31.setForeground(Color.MAGENTA);
                }}
                if (!(d32.getText()).equals("")){
                int x32 = Integer.parseInt(d32.getText());
                String dat31 = x32 + "/" + (m2 + 1) + "/" + y1;
                Date datt31 = null;
                try {
                    datt31 = format.parse(dat31);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt31 = format.format(datt31);
                if ((datt31.after(b2) && datt31.before(j2)) || dattt31.equals(b1) || dattt31.equals(j1)) {
                    d32.setForeground(Color.MAGENTA);
                }}
                if (!(d33.getText()).equals("")){
                int x33 = Integer.parseInt(d33.getText());
                String dat32 = x33 + "/" + (m2 + 1) + "/" + y1;
                Date datt32 = null;
                try {
                    datt32 = format.parse(dat32);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt32 = format.format(datt32);
                if ((datt32.after(b2) && datt32.before(j2)) || dattt32.equals(b1) || dattt32.equals(j1)) {
                    d33.setForeground(Color.MAGENTA);
                }}
                if (!(d34.getText()).equals("")){
                int x34 = Integer.parseInt(d34.getText());
                String dat33 = x34 + "/" + (m2 + 1) + "/" + y1;
                Date datt33 = null;
                try {
                    datt33 = format.parse(dat33);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt33 = format.format(datt33);
                if ((datt33.after(b2) && datt33.before(j2)) || dattt33.equals(b1) || dattt33.equals(j1)) {
                    d34.setForeground(Color.MAGENTA);
                }}
                if (!(d35.getText()).equals("")){
                int x35 = Integer.parseInt(d35.getText());
                String dat34 = x35 + "/" + (m2 + 1) + "/" + y1;
                Date datt34 = null;
                try {
                    datt34 = format.parse(dat34);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt34 = format.format(datt34);
                if ((datt34.after(b2) && datt34.before(j2)) || dattt34.equals(b1) || dattt34.equals(j1)) {
                    d35.setForeground(Color.MAGENTA);
                }}
                if (!(d36.getText()).equals("")){
                int x36 = Integer.parseInt(d36.getText());
                String dat35 = x36 + "/" + (m2 + 1) + "/" + y1;
                Date datt35 = null;
                try {
                    datt35 = format.parse(dat35);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt35 = format.format(datt35);
                if ((datt35.after(b2) && datt35.before(j2)) || dattt35.equals(b1) || dattt35.equals(j1)) {
                    d36.setForeground(Color.MAGENTA);
                }}
                if (!(d37.getText()).equals("")){

                int x37 = Integer.parseInt(d37.getText());
                String dat36 = x37 + "/" + (m2 + 1) + "/" + y1;
                Date datt36 = null;
                try {
                    datt36 = format.parse(dat36);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt36 = format.format(datt36);
                if ((datt36.after(b2) && datt36.before(j2)) || dattt36.equals(b1) || dattt36.equals(j1)) {
                    d37.setForeground(Color.MAGENTA);
                }}
            }
        } catch (Exception error) {

        }
     }//GEN-LAST:event_yearPropertyChange

    private void d36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d36ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d36.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d36ActionPerformed

    private void d37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d37ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int da10 = Integer.parseInt((d37.getText()));
        int m1 = month.getMonth();
        int y1 = year.getYear();
        String date1 = da10 + "/" + (m1 + 1) + "/" + y1;
        boolean err = true;
        Date date2 = null;
        try {
            date2 = format.parse(date1);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        String date3 = format.format(date2);
        tab.setVisible(false);
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e = pz.nextToken();
                String a = pz.nextToken();
                String b = pz.nextToken();
                String c = pz.nextToken();
                String d = pz.nextToken();
                String j = pz.nextToken();
                String f = pz.nextToken();
                String g = pz.nextToken();
                String h = pz.nextToken();
                String k = pz.nextToken();
                String l = pz.nextToken();
                Date b1 = format.parse(b);
                Date j1 = format.parse(j);
                if ((date2.after(b1) && date2.before(j1)) || date3.equals(b) || date3.equals(j)) {
                    tab.setVisible(true);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    model.addColumn("Event");
                    model.addColumn("Location");
                    model.addColumn("Date started");
                    model.addColumn("Time Started");
                    model.addColumn("Date ending");
                    model.addColumn("Time ending");
                    model.addColumn("Duration");
                    model.insertRow(model.getRowCount(), new Object[]{e, a, b, c + ":" + d, j, f + ":" + g, h + " days, " + k + " hours, " + l + " minutes"});
                    err = false;
                }

            }
        } catch (Exception error) {

        }
        if (err == true) {
            model.setRowCount(0);
            tab.setVisible(false);
        }    }//GEN-LAST:event_d37ActionPerformed

    private void monthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthPropertyChange
        d1.setForeground(Color.black);
                d2.setForeground(Color.black);
        d3.setForeground(Color.black);
        d4.setForeground(Color.black);
        d5.setForeground(Color.black);
        d6.setForeground(Color.black);
        d7.setForeground(Color.black);
        d8.setForeground(Color.black);
        d9.setForeground(Color.black);
        d10.setForeground(Color.black);
        d11.setForeground(Color.black);
        d12.setForeground(Color.black);
        d13.setForeground(Color.black);
        d14.setForeground(Color.black);
        d15.setForeground(Color.black);
        d16.setForeground(Color.black);
        d17.setForeground(Color.black);
        d18.setForeground(Color.black);
        d19.setForeground(Color.black);
        d20.setForeground(Color.black);
        d21.setForeground(Color.black);
        d22.setForeground(Color.black);
        d23.setForeground(Color.black);
        d24.setForeground(Color.black);
        d25.setForeground(Color.black);
        d26.setForeground(Color.black);
        d27.setForeground(Color.black);
        d28.setForeground(Color.black);
        d29.setForeground(Color.black);
        d30.setForeground(Color.black);
        d31.setForeground(Color.black);
        d32.setForeground(Color.black);
        d33.setForeground(Color.black);
        d34.setForeground(Color.black);
        d35.setForeground(Color.black);
        d36.setForeground(Color.black);
        d37.setForeground(Color.black);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        invisible.setVisible(false);
        int month1 = month.getMonth();
        int year1 = year.getYear();

        Date m = invisible.getDate();
        String m1 = format.format(m);
        StringTokenizer pz2 = new StringTokenizer(String.valueOf(m1), "/");
        String a10 = pz2.nextToken();
        String b10 = pz2.nextToken();
        String c20 = pz2.nextToken();
        StringTokenizer pz1 = new StringTokenizer(String.valueOf(m), " ");
        String a = pz1.nextToken();
        String b = pz1.nextToken();
        String c = pz1.nextToken();
        int c1 = Integer.parseInt(c);
        String d = pz1.nextToken();
        String e = pz1.nextToken();
        String f = pz1.nextToken();
        int f1 = Integer.parseInt(f);
        String inv = a10 + "/" + (month1 + 1) + "/" + year1;
        Date inv1 = null;
        try {
            inv1 = (Date) format.parse(inv);
        } catch (ParseException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        StringTokenizer pz3 = new StringTokenizer(String.valueOf(inv1), " ");
        String a3 = pz3.nextToken();
        String b3 = pz3.nextToken();
        String c3 = pz3.nextToken();
        int c4 = Integer.parseInt(c3);
        String da = pz3.nextToken();
        String e3 = pz3.nextToken();
        String f3 = pz3.nextToken();
        int f4 = Integer.parseInt(f3);

        d1.setText("");
        d2.setText("");
        d3.setText("");
        d4.setText("");
        d5.setText("");
        d6.setText("");
        d7.setText("");
        d8.setText("");
        d9.setText("");
        d10.setText("");
        d11.setText("");
        d12.setText("");
        d13.setText("");
        d14.setText("");
        d15.setText("");
        d16.setText("");
        d17.setText("");
        d18.setText("");
        d19.setText("");
        d20.setText("");
        d21.setText("");
        d22.setText("");
        d23.setText("");
        d24.setText("");
        d25.setText("");
        d26.setText("");
        d27.setText("");
        d28.setText("");
        d29.setText("");
        d30.setText("");
        d31.setText("");
        d32.setText("");
        d33.setText("");
        d34.setText("");
        d35.setText("");
        d36.setText("");
        d37.setText("");

        while (c4 > 1) {
            c4 = c4 - 1;
            if (a3.equals("Sun")) {
                a3 = "Sat";
            } else if (a3.equals("Sat")) {
                a3 = "Fri";
            } else if (a3.equals("Fri")) {
                a3 = "Thu";
            } else if (a3.equals("Thu")) {
                a3 = "Wed";
            } else if (a3.equals("Wed")) {
                a3 = "Tue";
            } else if (a3.equals("Tue")) {
                a3 = "Mon";
            } else if (a3.equals("Mon")) {
                a3 = "Sun";
            }

        }
        if (a3.equals("Sun")) {
            d1.setVisible(true);
            d2.setVisible(true);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d1.setText("1");
            d2.setText("2");
            d3.setText("3");
            d4.setText("4");
            d5.setText("5");
            d6.setText("6");
            d7.setText("7");
            d8.setText("8");
            d9.setText("9");
            d10.setText("10");
            d11.setText("11");
            d12.setText("12");
            d13.setText("13");
            d14.setText("14");
            d15.setText("15");
            d16.setText("16");
            d17.setText("17");
            d18.setText("18");
            d19.setText("19");
            d20.setText("20");
            d21.setText("21");
            d22.setText("22");
            d23.setText("23");
            d24.setText("24");
            d25.setText("25");
            d26.setText("26");
            d27.setText("27");
            d28.setText("28");
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d29.setText("29");
                d30.setVisible(false);
                d31.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d29.setVisible(false);
                d30.setVisible(false);
                d31.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d29.setVisible(true);
                d29.setText("29");
                d30.setVisible(true);
                d30.setText("30");
                d31.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d29.setVisible(true);
                d29.setText("29");
                d30.setVisible(true);
                d30.setText("30");
                d31.setVisible(true);
                d31.setText("31");

            }
            d32.setVisible(false);
            d33.setVisible(false);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);

        }
        if (a3.equals("Mon")) {
            d1.setVisible(false);
            d2.setVisible(true);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d2.setText("1");
            d3.setText("2");
            d4.setText("3");
            d5.setText("4");
            d6.setText("5");
            d7.setText("6");
            d8.setText("7");
            d9.setText("8");
            d10.setText("9");
            d11.setText("10");
            d12.setText("11");
            d13.setText("12");
            d14.setText("13");
            d15.setText("14");
            d16.setText("15");
            d17.setText("16");
            d18.setText("17");
            d19.setText("18");
            d20.setText("19");
            d21.setText("20");
            d22.setText("21");
            d23.setText("22");
            d24.setText("23");
            d25.setText("24");
            d26.setText("25");
            d27.setText("26");
            d28.setText("27");
            d29.setText("28");
            d32.setVisible(true);
            d33.setVisible(false);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d30.setText("29");
                d31.setVisible(false);
                d32.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d30.setVisible(false);
                d31.setVisible(false);
                d32.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(true);
                d31.setText("30");
                d32.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d30.setVisible(true);
                d30.setText("29");
                d31.setVisible(true);
                d31.setText("30");
                d32.setVisible(true);
                d32.setText("31");

            }

        }
        if (a3.equals("Tue")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(true);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d3.setText("1");
            d4.setText("2");
            d5.setText("3");
            d6.setText("4");
            d7.setText("5");
            d8.setText("6");
            d9.setText("7");
            d10.setText("8");
            d11.setText("9");
            d12.setText("10");
            d13.setText("11");
            d14.setText("12");
            d15.setText("13");
            d16.setText("14");
            d17.setText("15");
            d18.setText("16");
            d19.setText("17");
            d20.setText("18");
            d21.setText("19");
            d22.setText("20");
            d23.setText("21");
            d24.setText("22");
            d25.setText("23");
            d26.setText("24");
            d27.setText("25");
            d28.setText("26");
            d29.setText("27");
            d30.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(false);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d31.setText("29");
                d32.setVisible(false);
                d33.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d31.setVisible(false);
                d32.setVisible(false);
                d33.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(true);
                d32.setText("30");
                d33.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d31.setVisible(true);
                d31.setText("29");
                d32.setVisible(true);
                d32.setText("30");
                d33.setVisible(true);
                d33.setText("31");

            }

        }

        if (a3.equals("Wed")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(true);
            d5.setVisible(true);
            d6.setVisible(true);
            d4.setText("1");
            d5.setText("2");
            d6.setText("3");
            d7.setText("4");
            d8.setText("5");
            d9.setText("6");
            d10.setText("7");
            d11.setText("8");
            d12.setText("9");
            d13.setText("10");
            d14.setText("11");
            d15.setText("12");
            d16.setText("13");
            d17.setText("14");
            d18.setText("15");
            d19.setText("16");
            d20.setText("17");
            d21.setText("18");
            d22.setText("19");
            d23.setText("20");
            d24.setText("21");
            d25.setText("22");
            d26.setText("23");
            d27.setText("24");
            d28.setText("25");
            d29.setText("26");
            d30.setText("27");
            d31.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(false);
            d36.setVisible(false);
            d37.setVisible(false);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d32.setText("29");
                d33.setVisible(false);
                d34.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d32.setVisible(false);
                d33.setVisible(false);
                d34.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(true);
                d33.setText("30");
                d34.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d32.setVisible(true);
                d32.setText("29");
                d33.setVisible(true);
                d33.setText("30");
                d34.setVisible(true);
                d34.setText("31");

            }

        }
        if (a3.equals("Thu")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(true);
            d6.setVisible(true);
            d5.setText("1");
            d6.setText("2");
            d7.setText("3");
            d8.setText("4");
            d9.setText("5");
            d10.setText("6");
            d11.setText("7");
            d12.setText("8");
            d13.setText("9");
            d14.setText("10");
            d15.setText("11");
            d16.setText("12");
            d17.setText("13");
            d18.setText("14");
            d19.setText("15");
            d20.setText("16");
            d21.setText("17");
            d22.setText("18");
            d23.setText("19");
            d24.setText("20");
            d25.setText("21");
            d26.setText("22");
            d27.setText("23");
            d28.setText("24");
            d29.setText("25");
            d30.setText("26");
            d31.setText("27");
            d32.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(true);
            d36.setVisible(false);
            d37.setVisible(false);

            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d33.setText("29");
                d34.setVisible(false);
                d35.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d33.setVisible(false);
                d34.setVisible(false);
                d35.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(true);
                d34.setText("30");
                d35.setVisible(false);
                d36.setVisible(false);
                d37.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d33.setVisible(true);
                d33.setText("29");
                d34.setVisible(true);
                d34.setText("30");
                d35.setVisible(true);
                d35.setText("31");
                d36.setVisible(false);
                d37.setVisible(false);

            }

        }
        if (a3.equals("Fri")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setVisible(true);
            d6.setText("1");
            d7.setText("2");
            d8.setText("3");
            d9.setText("4");
            d10.setText("5");
            d11.setText("6");
            d12.setText("7");
            d13.setText("8");
            d14.setText("9");
            d15.setText("10");
            d16.setText("11");
            d17.setText("12");
            d18.setText("13");
            d19.setText("14");
            d20.setText("15");
            d21.setText("16");
            d22.setText("17");
            d23.setText("18");
            d24.setText("19");
            d25.setText("20");
            d26.setText("21");
            d27.setText("22");
            d28.setText("23");
            d29.setText("24");
            d30.setText("25");
            d31.setText("26");
            d32.setText("27");
            d33.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(true);
            d36.setVisible(true);
            d37.setVisible(false);

            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d34.setText("29");
                d35.setVisible(false);
                d36.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d34.setVisible(false);
                d35.setVisible(false);
                d36.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(true);
                d35.setText("30");
                d36.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d34.setVisible(true);
                d34.setText("29");
                d35.setVisible(true);
                d35.setText("30");
                d36.setVisible(true);
                d36.setText("31");

            }

        }
        if (a3.equals("Sat")) {
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            d4.setVisible(false);
            d5.setVisible(false);
            d6.setVisible(false);
            d7.setText("1");
            d8.setText("2");
            d9.setText("3");
            d10.setText("4");
            d11.setText("5");
            d12.setText("6");
            d13.setText("7");
            d14.setText("8");
            d15.setText("9");
            d16.setText("10");
            d17.setText("11");
            d18.setText("12");
            d19.setText("13");
            d20.setText("14");
            d21.setText("15");
            d22.setText("16");
            d23.setText("17");
            d24.setText("18");
            d25.setText("19");
            d26.setText("20");
            d27.setText("21");
            d28.setText("22");
            d29.setText("23");
            d30.setText("24");
            d31.setText("25");
            d32.setText("26");
            d33.setText("27");
            d34.setText("28");
            d31.setVisible(true);
            d32.setVisible(true);
            d33.setVisible(true);
            d34.setVisible(true);
            d35.setVisible(true);
            d36.setVisible(true);
            d37.setVisible(true);
            if (f4 % 4 == 0 && (b3.equals("Feb"))) {
                d35.setText("29");
                d36.setVisible(false);
                d37.setVisible(false);

            } else if (b3.equals("Feb") && f4 % 4 != 0) {
                d35.setVisible(false);
                d36.setVisible(false);
                d37.setVisible(false);

            }
            if (b3.equals("Apr") || b3.equals("Sep") || b3.equals("Nov") || b3.equals("Jun")) {
                d35.setVisible(true);
                d35.setText("29");
                d36.setVisible(true);
                d36.setText("30");
                d37.setVisible(false);

            } else if (b3.equals("Jan") || b3.equals("Mar") || b3.equals("May") || b3.equals("Jul") || b3.equals("Aug") || b3.equals("Oct") || b3.equals("Dec")) {
                d35.setVisible(true);
                d35.setText("29");
                d36.setVisible(true);
                d36.setText("30");
                d37.setVisible(true);
                d37.setText("31");

            }
        }
        try {
            FileReader stud = new FileReader("Upcoming Events.txt");
            BufferedReader studa = new BufferedReader(stud);
            String no = "";
            while ((no = studa.readLine()) != null) {
                StringTokenizer pz = new StringTokenizer(no, "|");
                String i = pz.nextToken();
                String e1 = pz.nextToken();
                String a1 = pz.nextToken();
                String b1 = pz.nextToken();
                String c2 = pz.nextToken();
                String da10 = pz.nextToken();
                String j1 = pz.nextToken();
                String f2 = pz.nextToken();
                Date b2 = format.parse(b1);
                Date j2 = format.parse(j1);
                int m2 = month.getMonth();
                int y1 = year.getYear();

                if (!(d1.getText()).equals("")) {
                    int x = Integer.parseInt(d1.getText());

                    String dat = x + "/" + (m2 + 1) + "/" + y1;
                    Date datt = null;
                    try {
                        datt = format.parse(dat);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt = format.format(datt);

                    if ((datt.after(b2) && datt.before(j2)) || dattt.equals(b1) || dattt.equals(j1)) {
                        d1.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d2.getText()).equals("")) {

                    int x2 = Integer.parseInt(d2.getText());
                    String dat1 = x2 + "/" + (m2 + 1) + "/" + y1;
                    Date datt1 = null;
                    try {
                        datt1 = format.parse(dat1);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt1 = format.format(datt1);
                    if ((datt1.after(b2) && datt1.before(j2)) || dattt1.equals(b1) || dattt1.equals(j1)) {
                        d2.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d3.getText()).equals("")) {

                    int x3 = Integer.parseInt(d3.getText());
                    String dat2 = x3 + "/" + (m2 + 1) + "/" + y1;
                    Date datt2 = null;
                    try {
                        datt2 = format.parse(dat2);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt2 = format.format(datt2);
                    if ((datt2.after(b2) && datt2.before(j2)) || dattt2.equals(b1) || dattt2.equals(j1)) {
                        d3.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d4.getText()).equals("")) {

                    int x4 = Integer.parseInt(d4.getText());
                    String dat3 = x4 + "/" + (m2 + 1) + "/" + y1;
                    Date datt3 = null;
                    try {
                        datt3 = format.parse(dat3);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt3 = format.format(datt3);
                    if ((datt3.after(b2) && datt3.before(j2)) || dattt3.equals(b1) || dattt3.equals(j1)) {
                        d4.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d5.getText()).equals("")) {

                    int x5 = Integer.parseInt(d5.getText());
                    String dat4 = x5 + "/" + (m2 + 1) + "/" + y1;
                    Date datt4 = null;
                    try {
                        datt4 = format.parse(dat4);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt4 = format.format(datt4);
                    if ((datt4.after(b2) && datt4.before(j2)) || dattt4.equals(b1) || dattt4.equals(j1)) {
                        d5.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d6.getText()).equals("")) {

                    int x6 = Integer.parseInt(d6.getText());
                    String dat5 = x6 + "/" + (m2 + 1) + "/" + y1;
                    Date datt5 = null;
                    try {
                        datt5 = format.parse(dat5);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt5 = format.format(datt5);
                    if ((datt5.after(b2) && datt5.before(j2)) || dattt5.equals(b1) || dattt5.equals(j1)) {
                        d6.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d7.getText()).equals("")) {
                    int x7 = Integer.parseInt(d7.getText());
                    String dat6 = x7 + "/" + (m2 + 1) + "/" + y1;
                    Date datt6 = null;
                    try {
                        datt6 = format.parse(dat6);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt6 = format.format(datt6);
                    if ((datt6.after(b2) && datt6.before(j2)) || dattt6.equals(b1) || dattt6.equals(j1)) {
                        d7.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d8.getText()).equals("")) {
                    int x8 = Integer.parseInt(d8.getText());
                    String dat7 = x8 + "/" + (m2 + 1) + "/" + y1;
                    Date datt7 = null;
                    try {
                        datt7 = format.parse(dat7);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt7 = format.format(datt7);
                    if ((datt7.after(b2) && datt7.before(j2)) || dattt7.equals(b1) || dattt7.equals(j1)) {
                        d8.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d9.getText()).equals("")) {
                    int x9 = Integer.parseInt(d9.getText());
                    String dat8 = x9 + "/" + (m2 + 1) + "/" + y1;
                    Date datt8 = null;
                    try {
                        datt8 = format.parse(dat8);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt8 = format.format(datt8);
                    if ((datt8.after(b2) && datt8.before(j2)) || dattt8.equals(b1) || dattt8.equals(j1)) {
                        d9.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d10.getText()).equals("")) {
                    int x10 = Integer.parseInt(d10.getText());
                    String dat9 = x10 + "/" + (m2 + 1) + "/" + y1;
                    Date datt9 = null;
                    try {
                        datt9 = format.parse(dat9);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt9 = format.format(datt9);
                    if ((datt9.after(b2) && datt9.before(j2)) || dattt9.equals(b1) || dattt9.equals(j1)) {
                        d10.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d11.getText()).equals("")) {
                    int x11 = Integer.parseInt(d11.getText());
                    String dat10 = x11 + "/" + (m2 + 1) + "/" + y1;
                    Date datt10 = null;
                    try {
                        datt10 = format.parse(dat10);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt10 = format.format(datt10);
                    if ((datt10.after(b2) && datt10.before(j2)) || dattt10.equals(b1) || dattt10.equals(j1)) {
                        d11.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d12.getText()).equals("")) {
                    int x12 = Integer.parseInt(d12.getText());
                    String dat11 = x12 + "/" + (m2 + 1) + "/" + y1;
                    Date datt11 = null;
                    try {
                        datt11 = format.parse(dat11);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt11 = format.format(datt11);
                    if ((datt11.after(b2) && datt11.before(j2)) || dattt11.equals(b1) || dattt11.equals(j1)) {
                        d12.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d13.getText()).equals("")) {

                    int x13 = Integer.parseInt(d13.getText());
                    String dat12 = x13 + "/" + (m2 + 1) + "/" + y1;
                    Date datt12 = null;
                    try {
                        datt12 = format.parse(dat12);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt12 = format.format(datt12);
                    if ((datt12.after(b2) && datt12.before(j2)) || dattt12.equals(b1) || dattt12.equals(j1)) {
                        d13.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d14.getText()).equals("")) {

                    int x14 = Integer.parseInt(d14.getText());
                    String dat13 = x14 + "/" + (m2 + 1) + "/" + y1;
                    Date datt13 = null;
                    try {
                        datt13 = format.parse(dat13);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt13 = format.format(datt13);
                    if ((datt13.after(b2) && datt13.before(j2)) || dattt13.equals(b1) || dattt13.equals(j1)) {
                        d14.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d15.getText()).equals("")) {

                    int x15 = Integer.parseInt(d15.getText());
                    String dat14 = x15 + "/" + (m2 + 1) + "/" + y1;
                    Date datt14 = null;
                    try {
                        datt14 = format.parse(dat14);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt14 = format.format(datt14);
                    if ((datt14.after(b2) && datt14.before(j2)) || dattt14.equals(b1) || dattt14.equals(j1)) {
                        d15.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d16.getText()).equals("")) {

                    int x16 = Integer.parseInt(d16.getText());
                    String dat15 = x16 + "/" + (m2 + 1) + "/" + y1;
                    Date datt15 = null;
                    try {
                        datt15 = format.parse(dat15);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt15 = format.format(datt15);
                    if ((datt15.after(b2) && datt15.before(j2)) || dattt15.equals(b1) || dattt15.equals(j1)) {
                        d16.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d17.getText()).equals("")) {

                    int x17 = Integer.parseInt(d17.getText());
                    String dat16 = x17 + "/" + (m2 + 1) + "/" + y1;
                    Date datt16 = null;
                    try {
                        datt16 = format.parse(dat16);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt16 = format.format(datt16);
                    if ((datt16.after(b2) && datt16.before(j2)) || dattt16.equals(b1) || dattt16.equals(j1)) {
                        d17.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d18.getText()).equals("")) {

                    int x18 = Integer.parseInt(d18.getText());
                    String dat17 = x18 + "/" + (m2 + 1) + "/" + y1;
                    Date datt17 = null;
                    try {
                        datt17 = format.parse(dat17);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt17 = format.format(datt17);
                    if ((datt17.after(b2) && datt17.before(j2)) || dattt17.equals(b1) || dattt17.equals(j1)) {
                        d18.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d19.getText()).equals("")) {

                    int x19 = Integer.parseInt(d19.getText());
                    String dat18 = x19 + "/" + (m2 + 1) + "/" + y1;
                    Date datt18 = null;
                    try {
                        datt18 = format.parse(dat18);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt18 = format.format(datt18);
                    if ((datt18.after(b2) && datt18.before(j2)) || dattt18.equals(b1) || dattt18.equals(j1)) {
                        d19.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d20.getText()).equals("")) {

                    int x20 = Integer.parseInt(d20.getText());
                    String dat19 = x20 + "/" + (m2 + 1) + "/" + y1;
                    Date datt19 = null;
                    try {
                        datt19 = format.parse(dat19);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt19 = format.format(datt19);
                    if ((datt19.after(b2) && datt19.before(j2)) || dattt19.equals(b1) || dattt19.equals(j1)) {
                        d20.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d21.getText()).equals("")) {

                    int x21 = Integer.parseInt(d21.getText());
                    String dat20 = x21 + "/" + (m2 + 1) + "/" + y1;
                    Date datt20 = null;
                    try {
                        datt20 = format.parse(dat20);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt20 = format.format(datt20);
                    if ((datt20.after(b2) && datt20.before(j2)) || dattt20.equals(b1) || dattt20.equals(j1)) {
                        d21.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d22.getText()).equals("")) {

                    int x22 = Integer.parseInt(d22.getText());
                    String dat21 = x22 + "/" + (m2 + 1) + "/" + y1;
                    Date datt21 = null;
                    try {
                        datt21 = format.parse(dat21);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt21 = format.format(datt21);
                    if ((datt21.after(b2) && datt21.before(j2)) || dattt21.equals(b1) || dattt21.equals(j1)) {
                        d22.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d23.getText()).equals("")) {

                    int x23 = Integer.parseInt(d23.getText());
                    String dat22 = x23 + "/" + (m2 + 1) + "/" + y1;
                    Date datt22 = null;
                    try {
                        datt22 = format.parse(dat22);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt22 = format.format(datt22);
                    if ((datt22.after(b2) && datt22.before(j2)) || dattt22.equals(b1) || dattt22.equals(j1)) {
                        d23.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d24.getText()).equals("")) {

                    int x24 = Integer.parseInt(d24.getText());
                    String dat23 = x24 + "/" + (m2 + 1) + "/" + y1;
                    Date datt23 = null;
                    try {
                        datt23 = format.parse(dat23);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt23 = format.format(datt23);
                    if ((datt23.after(b2) && datt23.before(j2)) || dattt23.equals(b1) || dattt23.equals(j1)) {
                        d24.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d25.getText()).equals("")) {

                    int x25 = Integer.parseInt(d25.getText());
                    String dat24 = x25 + "/" + (m2 + 1) + "/" + y1;
                    Date datt24 = null;
                    try {
                        datt24 = format.parse(dat24);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt24 = format.format(datt24);
                    if ((datt24.after(b2) && datt24.before(j2)) || dattt24.equals(b1) || dattt24.equals(j1)) {
                        d25.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d26.getText()).equals("")) {

                    int x26 = Integer.parseInt(d26.getText());
                    String dat25 = x26 + "/" + (m2 + 1) + "/" + y1;
                    Date datt25 = null;
                    try {
                        datt25 = format.parse(dat25);
                    } catch (ParseException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dattt25 = format.format(datt25);
                    if ((datt25.after(b2) && datt25.before(j2)) || dattt25.equals(b1) || dattt25.equals(j1)) {
                        d26.setForeground(Color.MAGENTA);
                    }
                }
                if (!(d27.getText()).equals("")){
                int x27 = Integer.parseInt(d27.getText());
                String dat26 = x27 + "/" + (m2 + 1) + "/" + y1;
                Date datt26 = null;
                try {
                    datt26 = format.parse(dat26);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt26 = format.format(datt26);
                if ((datt26.after(b2) && datt26.before(j2)) || dattt26.equals(b1) || dattt26.equals(j1)) {
                    d27.setForeground(Color.MAGENTA);
                }}
                if (!(d28.getText()).equals("")){
                int x28 = Integer.parseInt(d28.getText());
                String dat27 = x28 + "/" + (m2 + 1) + "/" + y1;
                Date datt27 = null;
                try {
                    datt27 = format.parse(dat27);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt27 = format.format(datt27);
                if ((datt27.after(b2) && datt27.before(j2)) || dattt27.equals(b1) || dattt27.equals(j1)) {
                    d28.setForeground(Color.MAGENTA);
                }}
                if (!(d29.getText()).equals("")){
                int x29 = Integer.parseInt(d29.getText());
                String dat28 = x29 + "/" + (m2 + 1) + "/" + y1;
                Date datt28 = null;
                try {
                    datt28 = format.parse(dat28);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt28 = format.format(datt28);
                if ((datt28.after(b2) && datt28.before(j2)) || dattt28.equals(b1) || dattt28.equals(j1)) {
                    d29.setForeground(Color.MAGENTA);
                }}
                if (!(d30.getText()).equals("")){
                int x30 = Integer.parseInt(d30.getText());
                String dat29 = x30 + "/" + (m2 + 1) + "/" + y1;
                Date datt29 = null;
                try {
                    datt29 = format.parse(dat29);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt29 = format.format(datt29);
                if ((datt29.after(b2) && datt29.before(j2)) || dattt29.equals(b1) || dattt29.equals(j1)) {
                    d30.setForeground(Color.MAGENTA);
                }}
                if (!(d31.getText()).equals("")){
                int x31 = Integer.parseInt(d31.getText());
                String dat30 = x31 + "/" + (m2 + 1) + "/" + y1;
                Date datt30 = null;
                try {
                    datt30 = format.parse(dat30);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt30 = format.format(datt30);
                if ((datt30.after(b2) && datt30.before(j2)) || dattt30.equals(b1) || dattt30.equals(j1)) {
                    d31.setForeground(Color.MAGENTA);
                }}
                if (!(d32.getText()).equals("")){
                int x32 = Integer.parseInt(d32.getText());
                String dat31 = x32 + "/" + (m2 + 1) + "/" + y1;
                Date datt31 = null;
                try {
                    datt31 = format.parse(dat31);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt31 = format.format(datt31);
                if ((datt31.after(b2) && datt31.before(j2)) || dattt31.equals(b1) || dattt31.equals(j1)) {
                    d32.setForeground(Color.MAGENTA);
                }}
                if (!(d33.getText()).equals("")){
                int x33 = Integer.parseInt(d33.getText());
                String dat32 = x33 + "/" + (m2 + 1) + "/" + y1;
                Date datt32 = null;
                try {
                    datt32 = format.parse(dat32);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt32 = format.format(datt32);
                if ((datt32.after(b2) && datt32.before(j2)) || dattt32.equals(b1) || dattt32.equals(j1)) {
                    d33.setForeground(Color.MAGENTA);
                }}
                if (!(d34.getText()).equals("")){
                int x34 = Integer.parseInt(d34.getText());
                String dat33 = x34 + "/" + (m2 + 1) + "/" + y1;
                Date datt33 = null;
                try {
                    datt33 = format.parse(dat33);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt33 = format.format(datt33);
                if ((datt33.after(b2) && datt33.before(j2)) || dattt33.equals(b1) || dattt33.equals(j1)) {
                    d34.setForeground(Color.MAGENTA);
                }}
                if (!(d35.getText()).equals("")){
                int x35 = Integer.parseInt(d35.getText());
                String dat34 = x35 + "/" + (m2 + 1) + "/" + y1;
                Date datt34 = null;
                try {
                    datt34 = format.parse(dat34);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt34 = format.format(datt34);
                if ((datt34.after(b2) && datt34.before(j2)) || dattt34.equals(b1) || dattt34.equals(j1)) {
                    d35.setForeground(Color.MAGENTA);
                }}
                if (!(d36.getText()).equals("")){
                int x36 = Integer.parseInt(d36.getText());
                String dat35 = x36 + "/" + (m2 + 1) + "/" + y1;
                Date datt35 = null;
                try {
                    datt35 = format.parse(dat35);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt35 = format.format(datt35);
                if ((datt35.after(b2) && datt35.before(j2)) || dattt35.equals(b1) || dattt35.equals(j1)) {
                    d36.setForeground(Color.MAGENTA);
                }}
                if (!(d37.getText()).equals("")){

                int x37 = Integer.parseInt(d37.getText());
                String dat36 = x37 + "/" + (m2 + 1) + "/" + y1;
                Date datt36 = null;
                try {
                    datt36 = format.parse(dat36);
                } catch (ParseException ex) {
                    Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dattt36 = format.format(datt36);
                if ((datt36.after(b2) && datt36.before(j2)) || dattt36.equals(b1) || dattt36.equals(j1)) {
                    d37.setForeground(Color.MAGENTA);
                }}
            }
        } catch (Exception error) {

        }


    }//GEN-LAST:event_monthPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d1;
    private javax.swing.JButton d10;
    private javax.swing.JButton d11;
    private javax.swing.JButton d12;
    private javax.swing.JButton d13;
    private javax.swing.JButton d14;
    private javax.swing.JButton d15;
    private javax.swing.JButton d16;
    private javax.swing.JButton d17;
    private javax.swing.JButton d18;
    private javax.swing.JButton d19;
    private javax.swing.JButton d2;
    private javax.swing.JButton d20;
    private javax.swing.JButton d21;
    private javax.swing.JButton d22;
    private javax.swing.JButton d23;
    private javax.swing.JButton d24;
    private javax.swing.JButton d25;
    private javax.swing.JButton d26;
    private javax.swing.JButton d27;
    private javax.swing.JButton d28;
    private javax.swing.JButton d29;
    private javax.swing.JButton d3;
    private javax.swing.JButton d30;
    private javax.swing.JButton d31;
    private javax.swing.JButton d32;
    private javax.swing.JButton d33;
    private javax.swing.JButton d34;
    private javax.swing.JButton d35;
    private javax.swing.JButton d36;
    private javax.swing.JButton d37;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton d7;
    private javax.swing.JButton d8;
    private javax.swing.JButton d9;
    private javax.swing.JLabel da1;
    private javax.swing.JLabel da2;
    private javax.swing.JLabel fri;
    private com.toedter.calendar.JCalendar invisible;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser month;
    private javax.swing.JLabel sat;
    private javax.swing.JTable tab;
    private javax.swing.JLabel thu;
    private javax.swing.JLabel tue;
    private javax.swing.JLabel wed;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}
