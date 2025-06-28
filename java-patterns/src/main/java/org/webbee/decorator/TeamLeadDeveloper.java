package org.webbee.decorator;

/**
 * Декоратор, добавляющий поведение тимлида.
 * Расширяет функционал разработчика, добавляя задачу по проведению созвонов.
 * @author Evseeva Tsvetolina
 */
public class TeamLeadDeveloper extends DeveloperDecorator {

    /**
     * Конструктор с параметром.
     * @param developer декорируемый разработчик
     */
    public TeamLeadDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String develop() {
        return super.develop() + makingCalls();
    }

    public String makingCalls() {
        return "Im on call(";
    }

}
