package com.notepad.text.test.question;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetTextQuestion implements Question<String> {

    Target target;

    public GetTextQuestion(Target target){
        this.target=target;
    }

    @Override
    public String answeredBy(Actor actor) {
        String texto= actor.asksFor(Text.of(this.target));
        return texto;
    }

    public static GetTextQuestion getText(Target target){
        return Instrumented.instanceOf(GetTextQuestion.class).withProperties(target);
    }
}
