package model;

public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String program;
    private String year;

    public Student(int id, String name, String email, String phone, String program, String year) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.program = program;
        this.year = year;
    }

    public int getid() {
        return id;
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
}

