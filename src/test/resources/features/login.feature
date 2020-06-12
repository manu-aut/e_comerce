Feature: test estres por interfaz

  @TestLogin @cucumber @completing
  Scenario Outline: validate different error messages
    When enters the credentials
      | user   | password   |
      | <user> | <password> |
    Then the message could be validated  <errorMessage>

    Examples: 
      | user                    | password       | errorMessage                                    |
      | edwin@edgelogistics.com | password825441 | You have entered an incorrect email or password |
