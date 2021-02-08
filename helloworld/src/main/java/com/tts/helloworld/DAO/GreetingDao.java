package com.tts.helloworld.DAO;

import com.tts.helloworld.model.Greeting;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GreetingDao implements Dao<Greeting>{

    // this list is the closest thing we have in our app that could be considered a database
    private List<Greeting> greetings = new ArrayList<>();

    public GreetingDao() {
        greetings.add(new Greeting(1, "Hello"));
        greetings.add(new Greeting(2, "Hola"));
    }
    @Override
    public List<Greeting> getAll() {
        return greetings;
    }

    @Override
    public Optional<Greeting> get(long id) {
        return Optional.ofNullable(greetings.get((int) id));
    }
}
