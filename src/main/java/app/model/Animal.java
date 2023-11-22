package app.model;


import org.springframework.stereotype.Component;

@Component("dog")
public abstract class Animal {

    public abstract String toString();

}
