package Day3;

import java.util.*;

class Student {
    private String name;
    private String location;
    private String email;
    private long mobile;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(String name, String location, String email, long mobile) {
        this.name = name;
        this.location = location;
        this.email = email;
        this.mobile = mobile;
    }

    // Getters and Setters
    public String getLocation() {
        return location;
    }
}

