package br.edu.ifsp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.edu.ifsp.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Guilherme");
		person.setLastName("Costa");
		person.setAddress("Rua do Limoeiro, 1234 - Bairro do Limoeiro");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 10; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Nome: " + i);
		person.setLastName("Sobrenome: " + i);
		person.setLastName("Endereço: " + i);
		person.setGender("Male");
		return person;
	}

}
