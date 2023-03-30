package com.notepad.text.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\texto.feature",
        glue = "com.notepad.text.test.stepdefinitions",snippets = CucumberOptions.SnippetType.CAMELCASE )
public class TextRunner {
}
