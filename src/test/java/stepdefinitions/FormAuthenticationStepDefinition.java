package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class FormAuthenticationStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I copied text Login page_TB in form authentication$")			
            public void whenICopiedTextLoginPagetbInFormAuthentication()
            {
                workFlow.copiedtext(0, "Form Authentication", "Form Authentication.Loginpage_TBTextBoxXPATH", "XPATH");
                
            }
            @When("^I selected Login_button in form authentication$")			
            public void whenISelectedLoginbuttonInFormAuthentication()
            {
                workFlow.clickedElement(0, "Form Authentication", "Form Authentication.Login_buttonButtonXPATH", "XPATH");
                
            }
            @When("^I copied text password head_label in form authentication$")			
            public void whenICopiedTextPasswordHeadlabelInFormAuthentication()
            {
                workFlow.copiedtext(0, "Form Authentication", "Form Authentication.passwordhead_labelLabelXPATH", "XPATH");
                
            }
            @When("^I entered Password_TA in form authentication as '(.*)'$")			
            public void whenIEnteredPasswordtaInFormAuthenticationAsnewUser(String  varnewUser)
            {
                workFlow.enterText(varnewUser, 0, "Form Authentication", "Form Authentication.Password_TATextAreaXPATH", "XPATH");
                
            }
            @When("^I clear text Password_TA in form authentication$")			
            public void whenIClearTextPasswordtaInFormAuthentication()
            {
                workFlow.clearText(0, "Form Authentication", "Form Authentication.Password_TATextAreaXPATH", "XPATH");
                
            }
            @When("^I clear and enter text Password_TA in form authentication as '(.*)'$")			
            public void whenIClearEnterTextPasswordtaInFormAuthenticationAspasswordta3(String  varpasswordta3)
            {
                workFlow.clearAndEnterText(varpasswordta3, 0, "Form Authentication", "Form Authentication.Password_TATextAreaXPATH", "XPATH");
                
            }
            @When("^I copied text usename head_link in form authentication$")			
            public void whenICopiedTextUsenameHeadlinkInFormAuthentication()
            {
                workFlow.copiedtext(0, "Form Authentication", "Form Authentication.usenamehead_linkLinkXPATH", "XPATH");
                
            }
    }