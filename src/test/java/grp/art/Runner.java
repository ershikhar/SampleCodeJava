package grp.art;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
//@RunWith(Cucumber.class) 
//@CucumberOptions(
//  features = "//art//src//test//java//grp//art//query.feature",
//  glue = "//art//src//test//java//grp//art//stepdef.java"
//)
//public class Runner{}


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/cucumber.json"},
		features = {"src//test//java//grp//art"}
		)
public class Runner {

}
