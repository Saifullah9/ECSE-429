Feature: Remove_task_from_a_course_todo_list
    As a student, I remove an unnecessary task from my course to do list, so I can forget about it.

#Normal Flow
    Scenario: Successfully remove a task from a todo list
        Given I am a student
        When I request to remove a task from a todo list
        Then I should remove a task from a course todo list

#Alternate Flow
    Scenario:  Successfully remove a task from a todo list of a course
        Given I am a student
        When I request to remove a course related task from a todo list
        Then I should remove a task from a course todo list

#Error Flow
    Scenario: Remove a task from a non existing todo list
        Given I am a student
        When I request to remove a task from a non existing todo list
        Then I should receive an error message and about removing a task from a course todo list
