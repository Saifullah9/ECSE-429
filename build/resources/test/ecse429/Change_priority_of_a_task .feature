Feature: Change_priority_of_a_task
    As a student,
    I want to adjust the priority of a task,
    to help better manage my time.

    #Normal Flow
    Scenario: Successfully change priority of a task
        Given I am a student
        When I change the priority of a task
        Then I should receive a confirmation message

    #Alternate Flow
    Scenario: Change priority of a task which is associated to a todo list
        Given I am a student
        When I change the priority of a task
        And that task is associated to a todo list
        Then I should receive a confirmation message

    #Error Flow
    Scenario: Change priority of a task to an invalid priority
        Given I am a student
        When I change the priority of a task
        But set it to an invalid priority
        Then I should receive an error message

    #Error Flow
    Scenario: Change the priority of a non-existing task
        Given I am a student
        When I request to change the priority of a task which does not exist
        Then I should receive an error message
