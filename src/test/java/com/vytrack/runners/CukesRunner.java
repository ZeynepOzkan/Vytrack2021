package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt",
        "pretty","summary" }, snippets = UNDERSCORE,
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        monochrome = true,
        dryRun = true
       // tags = "@wip"
)

public class CukesRunner {
}
