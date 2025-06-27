package org.example.decorator;

/**
 * Класс для демонстрации работы паттерна "Декоратор" с разработчиками.
 * Запуск метода {@link #main(String[])} показывает, как различные уровни разработчиков
 * (Junior, Senior, TeamLead) могут быть объединены в одну цепочку с помощью декораторов.
 * @author Evseeva Tsvetolina
 */
public final class Task {

    /**
     * Точка входа в программу.
     * Создает цепочку разработчиков с разными уровнями и демонстрирует выполнение задачи,
     * используя паттерн "Декоратор".
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Developer developer = new TeamLeadDeveloper(new SeniorDeveloper(new JuniorDeveloper()));

        System.out.println(developer.develop());
    }

    private Task() {
    }

}
