package CGV;

import java.util.List;

public class Movie {
    private String name;
    private int age_limit;
    private String where;

    public Movie(String name, int age_limit, String where) {
        this.name = name;
        this.age_limit = age_limit;
        this.where = where;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge_limit(int age_limit) {
        this.age_limit = age_limit;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getName() {
        return name;
    }

    public int getAge_limit() {
        return age_limit;
    }

    public String getWhere() {
        return where;
    }
}
