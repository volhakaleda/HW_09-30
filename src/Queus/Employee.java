package Queus;

import java.util.Date;

public class Employee {

    private String name;
    private Date startDate;

    public Employee (String name) {
        this.name = name;
        this.startDate = new Date(); //why?

    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
return startDate;
    }
}
