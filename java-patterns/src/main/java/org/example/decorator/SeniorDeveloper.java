package org.example.decorator;

/**
 * Декоратор, добавляющий поведение старшего разработчика.
 * Расширяет функционал базового разработчика дополнительными обязанностями,
 * например, ревью кода.
 * @author Evseeva Tsvetolina
 */
public class SeniorDeveloper extends DeveloperDecorator {

    /**
     * Конструктор с параметром.
     * @param developer декорируемый разработчик
     */
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String develop() {
        return super.develop() + reviewCode();
    }

    public String reviewCode() {
        return "Reviewing code...";
    }

}
