package com.in28minutes.microservices.currencyexchangeservice.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources", plugin = { "pretty" })
public class RunCucumberIntegrationTestCase {
}