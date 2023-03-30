package com.notepad.text.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotepadPage {

    public static Target btnTextoEnriquecido=
            Target.the("texto enriquecido").located(By.id("richtextnote-tab"));

    public static Target btnBold=
            Target.the("boton negrita").locatedBy("//*[@id=\"richtextnote\"]/main/div/div/div[1]/div/div[1]/button[1]");

    public static  Target editor=
            Target.the("Editor").located(By.id("editor"));


}
