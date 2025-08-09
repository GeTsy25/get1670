import java.util.ArrayList;


public class StudentList {
    private String name;
    private String address;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    /* 
    constructor for the student class.
    validation of input data 
    */
    public StudentList(String name, String address){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank.");
        }
        if (address == null || name.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank.");
        }
        this.name = name;
        this.address = address;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();

    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
    return String.format("%s(%s)", name,address);
    }
    public void addCourseGrade(String course, int grade){
        if(course == null || course.isBlank()){
            System.out.println("Error.Course name can't be blank.");
            return;
        }
        if(grade<0 || grade > 100){
            System.out.println("Error.grade must be between 0-100.");
            return;
        }
        if(courses.size() >=30){
        System.out.println("cant add more than 30 course.");  
        }
        this.courses.add(course);
        this.grades.add(grade);
    }
    public void printGrades(){
        System.out.print(this.name +"");
        for(int i=0;i<courses.size();i++){
        System.out.print(courses.get(i) + ":" + grades.get(i));
            if(i < courses.size() -1)
            System.out.print(",");

        }
        System.out.println();
    }
    public double getAverageGrade(){
        if(courses.isEmpty())
        return 0.0;
        int sum=0;
        for(int _grade:grades){
            sum += _grade;
        }
        //return avg
        return (double)sum/courses.size();
    }
}
