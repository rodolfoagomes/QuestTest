package com.quest.webapp.service;

import com.quest.webapp.entity.Person;

import java.util.Collection;


/**
 * Created by rodolfoagomes on 06/04/2016.
 */
public interface PersonServiceInterf {

	public Person save(Person emp);
	public Boolean exists(Long empId);
	public Collection<Person> getAll();
}
