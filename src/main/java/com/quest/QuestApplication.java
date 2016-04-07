package com.quest;

import com.quest.webapp.service.PersonServiceInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.quest.webapp")
public class QuestApplication {

	@Autowired
    PersonServiceInterf personServiceInterf;
	
    public static void main(String[] args) {
        SpringApplication.run(QuestApplication.class, args);
    }
   
   
}

