package model;

public class Student {
    private int Id;
    private String name;
    private String email;
    private String phone;
    private String program;
    private String year;

    public Student(int Id, String name, String email, String phone, String program, String year) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.program = program;
        this.year = year;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }   

   public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getProgram() {
        return program;
    }

    public String getYear() {
        return year;
    }

    //Setter for changing students phone number
    public void setPhone(String phone) {
        this.phone = phone;
    }
}

