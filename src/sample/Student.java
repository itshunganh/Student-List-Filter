package sample;

import java.util.UUID;

public class Student {
    public UUID stuID;
    public String stuName;
    public int stuAge;
    public String stuMajor;
    public double stuGPA;
    @Override
    public String toString(){
        return (this.stuID + " - " + this.stuName + " - " + this.stuAge + " - " + this.stuMajor + " - " + this.stuGPA);
    }
}
