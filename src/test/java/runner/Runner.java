package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/Runner",
       "rerun:target/Rerun_Failed/Runner.txt"}
        ,glue = {"steps"}

        ,features = {"src/main/resources/features/login.feature"}

        ,tags = "@Positive1"





)


public class Runner {
}
