package com.springbatchexample1.batch;

import com.springbatchexample1.model.Person;
import com.springbatchexample1.repository.PersonRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Person> {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void write(List<? extends Person> persons) throws Exception {

        System.out.println("Data Saved for Persons: " + persons);
        personRepository.saveAll(persons);
    }
}
