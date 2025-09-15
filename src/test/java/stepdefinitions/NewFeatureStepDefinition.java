package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class NewFeatureStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I scroll and click Form Auth link1 in the internet$")			
            public void whenIScrollClickFormAuthLink1InTheInternet()
            {
                workFlow.scrollAndClick(0, "New Feature", "New Feature.FormAuthlink1LinkXPATH", "XPATH");
                
            }
            @When("^I entered Username_T in form authentication as '(.*)'$")			
            public void whenIEnteredUsernametInFormAuthenticationAstomsmith(String  vartomsmith)
            {
                workFlow.enterText(vartomsmith, 0, "New Feature", "New Feature.Username_TTextBoxXPATH", "XPATH");
                
            }
            @When("^I clear text Username_T in form authentication$")			
            public void whenIClearTextUsernametInFormAuthentication()
            {
                workFlow.clearText(0, "New Feature", "New Feature.Username_TTextBoxXPATH", "XPATH");
                
            }
            @When("^I enter copied text Username_T in form authentication$")			
            public void whenIEnterCopiedTextUsernametInFormAuthentication()
            {
                workFlow.enterCopiedText(0, "New Feature", "New Feature.Username_TTextBoxXPATH", "XPATH");
                
            }
            @When("^I clear and enter text Username_T in form authentication as '(.*)'$")			
            public void whenIClearEnterTextUsernametInFormAuthenticationAsusernamet1(String  varusernamet1)
            {
                workFlow.clearAndEnterText(varusernamet1, 0, "New Feature", "New Feature.Username_TTextBoxXPATH", "XPATH");
                
            }
    }