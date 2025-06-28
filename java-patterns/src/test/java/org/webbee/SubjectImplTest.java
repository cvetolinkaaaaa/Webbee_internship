package org.webbee;

import org.junit.jupiter.api.Test;
import org.webbee.observer.ObserverImpl;
import org.webbee.observer.SubjectImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тест для проверки работы паттерна "Наблюдатель".
 */
class SubjectImplTest {

    /**
     * Проверяет, что все подписанные наблюдатели получают уведомления.
     */
    @Test
    void observersReceiveMessages() {
        SubjectImpl subject = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl("Observer1");
        ObserverImpl observer2 = new ObserverImpl("Observer2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.changeState("Hello Observers!");

        assertEquals(1, observer1.getReceivedMessages().size());
        assertEquals("Hello Observers!", observer1.getReceivedMessages().get(0));
        assertEquals(1, observer2.getReceivedMessages().size());
        assertEquals("Hello Observers!", observer2.getReceivedMessages().get(0));
    }

    /**
     * Проверяет, что отписанный наблюдатель не получает новые уведомления.
     */
    @Test
    void detachedObserverDoesNotReceiveMessages() {
        SubjectImpl subject = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl("Observer1");
        ObserverImpl observer2 = new ObserverImpl("Observer2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.changeState("First message");

        subject.detach(observer1);
        subject.changeState("Second message");

        assertEquals(1, observer1.getReceivedMessages().size());
        assertEquals("First message", observer1.getReceivedMessages().get(0));

        assertEquals(2, observer2.getReceivedMessages().size());
        assertEquals("Second message", observer2.getReceivedMessages().get(1));
    }
}
