package com.notepad.text.test.stepdefinitions;

import com.notepad.text.test.question.GetTextQuestion;
import com.notepad.text.test.task.NavigateTask;
import com.notepad.text.test.task.WriteTextTask;
import com.notepad.text.test.userinterfaces.NotepadPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TextStepDefinitions {

    @Managed
    WebDriver driver;

    Actor lucas = Actor.named("Lucas");

    @Before
    public void setupActor() {
        lucas.can(BrowseTheWeb.with(driver));
    }

    @Given("The user is in the page of text")
    public void theUserIsInThePageOfText() {
       lucas.attemptsTo(
               NavigateTask.navigate()
       );
    }
    @When("the user write the enriched text {string}")
    public void theUserWriteTheEnrichedText(String texto) {
      lucas.attemptsTo(
              WriteTextTask.writeText(texto)
      );
    }
    @Then("the user should see the text")
    public void theUserShouldSeeTheText() {
        lucas.should(
                seeThat("Comparacion de textos", GetTextQuestion.getText(NotepadPage.editor), Matchers.is("Hola como estas"))
        );
    }

}
