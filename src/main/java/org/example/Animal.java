package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog){
        setName(name);
        setDog(isDog);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getDog() {
        return isDog;
    }

    public void setDog(boolean dog) {
        isDog = dog;
    }

    @Override
    public String toString(){
        return getName() + " is a dog: " + getDog() + "\n";
    }
}
