package com.sofkau.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/vueloNormal.feature"},
        glue = {"com.sofkau.stepdefinition"},
        publish = true
)

public class VueloSinDisponibilidadTest {
}
