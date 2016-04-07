package com.quest.webapp.repository;

import com.quest.webapp.entity.Person;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by rodolfoagomes on 06/04/2016.
 */
public interface PersonRepository extends CrudRepository<Person, Long>{

	
}
