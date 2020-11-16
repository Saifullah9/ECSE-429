Feature: Change_a_task’s_description
    As a student,
    I want to change a task description,
    to better represent the work to do.

    #Normal Flow
    Scenario: Successfully change a task’s description
        Given I am student
        When I change a task’s description
        Then I should receive a confirmation message

    #Alternate Flow
    Scenario: Successfully change a categorized task’s description
        Given I am a student
        When I change a task’s description
        And that task is associated to a category
        Then I should receive a confirmation message

    #Error Flow
    Scenario: Change the description of a task which doesn’t exist
        Given I am student
        When I change the description of a task which doesn’t exist
        Then I should receive a error message
