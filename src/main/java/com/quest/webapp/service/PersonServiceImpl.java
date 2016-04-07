package com.quest.webapp.service;

import java.util.Collection;

import javax.transaction.Transactional;

import com.quest.webapp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.webapp.repository.PersonRepository;


/**
 * Created by rodolfoagomes on 06/04/2016.
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonServiceInterf {

	@Autowired
	protected PersonRepository personRepository;

	@Override
	public Person save(Person emp) {
		if(!exists(emp.getPpsNumber()))
			return personRepository.save(emp);
		return null;
	}

	@Override
	public Collection<Person> getAll() {
		Iterable<Person> itr = personRepository.findAll();
		return (Collection<Person>)itr;
	}

	@Override
	public Boolean exists(Long empId) {
		return personRepository.exists(empId);
	}
	

}
