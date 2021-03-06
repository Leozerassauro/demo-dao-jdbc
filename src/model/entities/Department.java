package model.entities;

import java.io.Serializable;
import java.util.Objects;

/*
 * @author Leonardo
 */
public class Department implements Serializable {

    //attributes
    private Integer id;
    private String name;

    //constructors
    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //hashCode and equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }

}
