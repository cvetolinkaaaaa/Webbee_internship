package org.example;

public class DeveloperDecorator implements Developer {

    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String develop() {
        return developer.develop();
    }

}
