package alinkedlist;

public class Student {
    private int id;
    private String name;
    private String email;
    private double GPA;

    public Student(){

    }
    public Student(int input_id, String input_name, String input_email, double input_GPA){
        this.id = input_id;
        this.name = input_name;
        this.email = input_email;
        this.GPA = input_GPA;
    }
    @Override
    public String toString(){
        return "Student [id =" + id + " ,name" + name + ", email" + email + ", GPA = " + GPA +"]";
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
