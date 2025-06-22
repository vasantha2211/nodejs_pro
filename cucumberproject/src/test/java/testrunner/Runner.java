package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse_ide\\cucumberproject\\Features\\login.feature",
                  glue="stepdefinition",
                  dryRun=false)




public class Runner {

}
