package org.example.decorator;

public final class Task {

    public static void main(String[] args) {
        Developer developer = new TeamLeadDeveloper(new SeniorDeveloper(new JuniorDeveloper()));

        System.out.println(developer.develop());
    }

    private Task() {
    }

}
