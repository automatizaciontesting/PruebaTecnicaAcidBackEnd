package com.automationacid.co.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features="src/test/resources/features/Api.feature",
        glue = "com.automationacid.co.stepsdefinition",
        snippets = CAMELCASE,
        tags = ""
)
public class ApiRunner {
}
