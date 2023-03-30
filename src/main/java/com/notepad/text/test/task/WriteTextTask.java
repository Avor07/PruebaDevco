package com.notepad.text.test.task;

import com.notepad.text.test.userinterfaces.NotepadPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class WriteTextTask implements Task {

    String texto;

    public WriteTextTask(String texto){
        this.texto=texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NotepadPage.btnTextoEnriquecido),
                Wait.until(
                        WebElementQuestion.the(NotepadPage.btnBold) ,
                        WebElementStateMatchers.isEnabled()).forNoMoreThan(50).seconds(),
                Click.on(NotepadPage.btnBold),
                Click.on(NotepadPage.editor),
                Clear.field(NotepadPage.editor),
                Enter.theValue(Keys.ENTER).into(NotepadPage.editor),
                Enter.theValue(texto).into(NotepadPage.editor)
        );
    }

    public static WriteTextTask writeText(String texto){
        return Instrumented.instanceOf(WriteTextTask.class).withProperties(texto);
    }
}
