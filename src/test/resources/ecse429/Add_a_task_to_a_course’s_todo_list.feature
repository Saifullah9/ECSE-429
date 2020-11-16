Feature: Add_a_task_to_a_course’s_todo_list
    As a student,
    I add a task to a course to do list,
    so I can remember it.

    #Normal Flow
    Scenario: Successfully add a task to a course’s todo list
        Given I am a student
        When I add a task to a course todo list
        And I enter all the required fields with valid input
        Then I should receive a confirmation message

    #Alternate Flow
    Scenario:  Add an empty task to a course’s todo list
        Given I am a student
        When I add an empty task to a course’s todo list
        Then a task with the default settings should be created
        And I should receive a confirmation message

    #Alternate flow
    Scenario: Add a task with a priority to a course’s todo list
        Given I am a student
        When I add a task to a course’s todo list
        And that task has a priority associated with it
        Then I should receive a confirmation message

    #Error Flow
    Scenario:  Add a task to a non-existing course’s todo list
        Given I am a student
        When I request to add a task to a non-existing course
        Then I should receive an error message
