package com.springbatchexample1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
public class Person {

    @Id
    private Integer id;
    private String fname;
    private String lname;
    private String gender;
    private Integer age;

    

    
}
