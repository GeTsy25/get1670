import java.util.ArrayList;

public class StudentList {
    private String name;
    private String address;
    private ArrayList<String> courses; // วิชา
    private ArrayList<Integer> grades; // คะแนน
    
    /*
     * Constructor for the Student Class
     * Validate of input Data ตรวจสอบข้อมูล Input
     */

     public StudentList(String name, String address){
        //validatino of input name
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must not be null or blank");
        }

        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Address must not be null or blank");
        }

        this.name = name;
        this.address = address;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();

        
    }
    public String getName() {
        return name;
        }

        public String getAddress() {
            return address;
        }
        
        public void setAddress(String address) {
                    //validatino of input name
            if(name == null || name.isBlank()){
                throw new IllegalArgumentException("Name must not be null or blank");
            }

            if(name == null || name.isBlank()){
                throw new IllegalArgumentException("Address must not be null or blank");
            }
            this.address = address;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return String.format("%s,(%s)", name,address);
        }


        /*
         * Adds a new course and grade
         * @param coure The course name
         * @param grade The grade (0-100)
         */

        public void addCourseGrade(String course, int grade){
            //Add validatino for the courses and grade
            if(name == null || name.isBlank()){
                System.out.print("Error:Course name cannot be blank");
                return;
            }

            if(grade < 0 || grade > 100){
                System.out.print("Error:Grade must be between 0 and 100");
                return;
            }
            //Check if the course limit is reached
            if(courses.size() >= 30){
                System.out.print("Cannot add more than 30 courses");
            }

            this.courses.add(course);
            this.grades.add(grade);

        }

        //Print all the courses and grades in a formatted string
        public void printGrades(){
            System.out.print(this.name+" ");
            for(int i = 0 ;  i < courses.size() ; i++){
                System.out.print(courses.get(i) + ":" + grades.get(i));
                if(i < courses.size() - 1) System.out.print(", ");
            }
            System.out.println();
        }

        /*
         * Calculates the average grade for all courses
         * @return The average grdae, or 0.0 if no courses are added
         */

        public double getAverageGrade(){
            if(courses.isEmpty()) return 0.0;
            int sum =  0;
            //using foreach
            for(int _grade:grades){
                sum += _grade;
            }
            return (double)sum/courses.size();
        
        }
}