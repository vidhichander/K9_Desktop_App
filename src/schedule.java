
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vidhi
 */
public class schedule {

    String da1;
    String da2;
    String da3;
    String name;
    String na1; // stName is a class/data member
    String na2;
    String na3;

    public schedule() {
        da1 = null;
        da2 = null;
        da3 = null;
        name = "";
        na1 = "";
        na2 = "";
        na3 = "";

    }

    public schedule(String d1, String d2, String d3, String n1, String s1, String s2, String s3) {
        da1 = d1;
        da2 = d2;
        da3 = d3;
        name = n1;
        na1 = s1;
        na2 = s2;
        na3 = s3;
        //assign the starting values for data members
    }

    public void setDate1(String d1) {
        da1 = d1;
    }

    public void setDate2(String d2) {
        da2 = d2;
    }

    public void setDate3(String d3) {
        da3 = d3; // can also be written as this.Nationality = na;
    }

    public void setName(String n1) {
        name = n1;
    }

    public void setVol1(String s1) {
        na1 = s1;
    }

    public void setVol2(String s2) {
        na2 = s2;
    }

    public void setVol3(String s3) {
        na3 = s3;
    }
    // the four public void methods are called setter methods - each of them sets values for one of the data members

    public String getDate1() {
        return da1;
    }

    public String getDate2() {
        return da2;
    }

    public String getDate3() {
        return da3;
    }

    public String getName() {
        return name;
    }

    public String getVol1() {
        return na1;
    }

    public String getVol2() {
        return na2;
    }

    public String getVol3() {
        return na3;
    }

}
