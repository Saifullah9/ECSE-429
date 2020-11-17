Feature: Add_a_task_to_a_course_todo_list
    As a student, I add a task to a course to do list, so I can remember it.

#Normal Flow
    Scenario: Successfully add a task to a course todo list
        Given I am a student
        When I add a task to a course todo list
        Then I should successfully add a task to a course todo list

#Alternate Flow
    Scenario:  Add an empty task to a course todo list
        Given I am a student
        When I add an empty task to a course todo list
        Then I should successfully add a task to a course todo list

#Alternate flow
    Scenario: Add a task with a priority to a course todo list
        Given I am a student
        When I add a task to a course todo list
        And that task has a priority associated with it
        Then I should successfully add a task to a course todo list

#Error Flow
    Scenario:  Add a task to a non existing course todo list
        Given I am a student
        When I request to add a task to a non existing course
        Then I should receive an error message about adding a task to a course todo list
