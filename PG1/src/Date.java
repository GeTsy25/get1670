public class Date {
    private int year; //attribute
    private int month;
    private int day; 
    //private int year, month, day; // Can be written in one line
    //constructor (method that same name of class)
    public Date(int year, int month, int day) { 
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //setter and getter
    //setter sets the value of the attribute
    //getter returns the attribute in the object
    public int getYear() {
        return this.year;   
    }
    public int getMonth() {
        return this.month;   
    }
    public int getDay() {
        return this.day;
    }
    //setters ไว้กำหนดค่าให้กับ attribute
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day; //this ไว้บอก attribute ของ class แต่ถ้า day เฉยๆเป็นพารามิเตอร์(ตัวแปร)
    }
    //toString method เรียกใช้ได้เลยผ่าน object
    public String toString() {
        return String.format("%02d%02d%4d",month,day,year);
}
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
