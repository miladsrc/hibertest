package model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private Integer id;

    private String name;

    private String email;

}
