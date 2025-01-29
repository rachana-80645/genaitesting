Feature: Testing Legal Co-pilot applications. 

  @LegalCopilot
  Scenario: Legal Copilot
    Given open Url and click SSO button
    When log in with username and password sign in to the application   
    And sign in to the application 
    And confirm the Stay signed in  
    Then click on the Automate Contract Review button upload the file and wait for the contract review process to complete
    Then download the Red-lined Document
    Then click on the Try Another button
    Then logout of Legal copilot  
    #Then click on the Try Another button
    
   @CarlyleLegal
   Scenario: CarlyleLegal
   