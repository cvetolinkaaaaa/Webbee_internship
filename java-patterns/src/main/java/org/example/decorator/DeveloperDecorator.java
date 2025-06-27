package org.example.decorator;

/**
 * Декоратор для объектов Developer.
 * Хранит ссылку на декорируемого разработчика и делегирует ему выполнение методов.
 * Используется для расширения функционала базового разработчика.
 * @author Evseeva Tsvetolina
 */
public class DeveloperDecorator implements Developer {

    private Developer developer;

    /**
     * Конструктор с параметром.
     * @param developer разработчик, которому делегируются вызовы
     */
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
