package com.training;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (
monochrome = true,
features = "src/test/resources",
plugin = {"pretty", "html:target/cucumber-html-report"},
//glue = " ",
tags = "@testdiary"
)
public class RunCukesTestNG extends AbstractTestNGCucumberTests {

}

