package jsp;

import java.util.Date;

public class Person {
    private String name;
    private String sex;
    private String date;

    public Person(String name, String sex, String date) {
        this.sex = sex;
        this.name = name;
        this.date = date;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

}

