package coffeetest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/coffeemain",tags={"@Tester"},
glue= {"coffeemain"},plugin = {"pretty","html:src/maven1"},monochrome=true)
public class testrunner {

}

/*export JAVA_HOME=`/usr/libexec/java_home -v 1.8`   - To switch java version in Mac
git init - to use pwd within git repository
git status - to see what are the changes you made
git add .  - to add all modified or any changes to pwd
git commit -m "string value"  - stores all changes in local repository
git remote add origin "URL for clone"  -  adds remote(use this if do not see remote with below command)
git remote -v
git origin push master - to push changes to remote repo

git push -f origin master - force push

java -jar jenkins.war
*/