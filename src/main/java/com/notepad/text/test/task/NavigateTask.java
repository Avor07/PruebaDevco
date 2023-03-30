package com.notepad.text.test.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.online-notepad.net/es/bloc-de-notas-online")
        );
    }
    public static NavigateTask navigate(){
        return Instrumented.instanceOf(NavigateTask.class).withProperties();
    }
}
