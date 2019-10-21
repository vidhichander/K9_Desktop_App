
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rajul
 */
public class Adopt {

    String id;
    String name;
    String dob;
    String ed;
    String gen;
    String breed;
    String col;
    String siz;
    String ken;
    String pers;
    String his;
    String pic;

    public Adopt() {
        id = "";
        name = "";
        dob = null;
        ed = null;
        gen = "";
        breed = "";
        col = "";
        siz = "";
        ken = "";
        pers = "";
        his = "";
        pic = "";
        
    }
    public Adopt(String id1, String name1, String dob1, String ed1, String gen1, String breed1, String col1, String siz1, String ken1, String pers1, String his1, String pic1) {
        id = id1;
        name = name1;
        dob = dob1;
        ed = ed1;
        gen = gen1;
        breed = breed1;
        col = col1;
        siz = siz1;
        ken = ken1;
        pers = pers1;
        his = his1;
        pic = pic1;
        //assign the starting values for data members
    }
    public void setID(String id1) {
        id = id1;
    }
    public void setName(String name1) {
        name = name1;
    }
public void setDOB(String dob1) {
        dob = dob1;
    }
public void setED(String ed1) {
        ed = ed1;
    }

public void setGen(String gen1) {
        gen = gen1;
    }
public void setBreed(String breed1) {
        breed = breed1;
    }
public void setColor(String col1) {
        col = col1;
    }
public void setSize(String siz1) {
        siz = siz1;
    }
public void setKennel(String ken1) {
        ken = ken1;
    }

public void setPers(String pers1) {
        pers = pers1;
    }

public void setHist(String his1) {
        his = his1;
    }
public void setPic(String pic1) {
        pic = pic1;
    }

 public String getID() {
     return id;
    }
    public String getName() {
        return name;
    }
public String getDOB() {
        return dob;
    }
public String getED() {
        return ed ;
    }

public String getGen() {
        return gen ;
    }
public String getBreed() {
        return breed;
    }
public String getColor() {
        return col ;
    }
public String getSize() {
        return siz;
    }
public String getKennel() {
        return ken;
    }

public String getPers() {
        return pers;
    }

public String getHist() {
        return his;
    }
public String getPic() {
        return pic;
    }





    

 
                       
    }

