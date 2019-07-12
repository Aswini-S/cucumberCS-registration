package ccmbr.casestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_c2a.04.30\\workspace\\Cucumbercasestudy\\casestudy\\src\\resources\\java\\Reg.feature",
plugin ="html:target/reports")
public class RunnerCS {
}
