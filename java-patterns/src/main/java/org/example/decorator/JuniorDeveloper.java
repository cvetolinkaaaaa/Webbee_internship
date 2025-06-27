package org.example.decorator;

/**
 * Класс, представляющий младшего разработчика.
 * Реализует основной функционал выполнения задачи.
 * @author Evseeva Tsvetolina
 */
public class JuniorDeveloper implements Developer {

    @Override
    public String develop() {
        return "Developing program...";
    }

}
