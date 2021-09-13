//@author juan

public class Course {
    int id;
    int code;
    String name;

    //setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Course() { //default constructor
        this.id = 0;
        this.code = 0;
        this.name = "";
    }
    
    public Course(int id, int code, String name) { //constructor with parameters
        this.id = id;
        this.code = code;
        this.name = name;
    }
    
    public static void main(String[] args) {
        Course c = new Course(1, 229, "Test"); //instantiating the Course class and calling constructor with parameters
        System.out.println(c.getId() + " " + c.getCode() + " " + c.getName()); //printing c's id, code, and name
    }
}