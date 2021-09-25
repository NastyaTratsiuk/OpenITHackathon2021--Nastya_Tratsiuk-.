@smoke
Scenario: choose language.
Given button language: button "Language".
When flight page is open:  button "Language English" .
Then success page is open: choose English.