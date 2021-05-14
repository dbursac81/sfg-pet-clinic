package guru.springframework.models;

import guru.springframework.interfaces.Animal;

public class BasicAnimal implements Animal {
    private String name;

    public BasicAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {

    }
}
