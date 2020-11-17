Feature: Change_a_task’s_description
    As a student, I want to change a task description, to better represent the work to do.

#Normal Flow
    Scenario: Successfully change a task’s description
        Given I am a student
        When I change a task description
        Then I should successfully change a task description


#Alternate Flow
    Scenario: Successfully change a categorized task’s description
        Given I am a student
        When I change a task description
        And that task is associated to a category
        Then I should successfully change a task description


#Error Flow
    Scenario: Change the description of a task which doesn’t exist
        Given I am a student
        When I change the description of a task which doesnt exist
        Then I should receive a error message task description

