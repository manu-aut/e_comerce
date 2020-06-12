Feature: Add my carriers
  
  As a user ecommerce
  I want to  add a unit

  Scenario Outline: Successful and failed confirmation
    When add a categories <carrier name> to his list <add to list>
    And he should to visualize a confirmation message <confirmation message>
    Then he should display the name of the unit after the search <unit name>

    Examples: 
      | unit name     | add to list       | confirmation message |
      | corona castro | manjarblanco list | Something went wrong |
