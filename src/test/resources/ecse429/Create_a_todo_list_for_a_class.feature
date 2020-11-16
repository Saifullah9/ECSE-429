Feature: Create_a_todo_list_for_a_class
    As a student, I create a to do list for a new class I am taking, so I can manage course work.

#Normal Flow
    Scenario: Successfully create a todo list for a class
        Given I am a student
        When I create a todo list for a class
        Then I should create a todo list for a class

#Alternate Flow
    Scenario: Successfully create a todo list for a class with a priority assigned
        Given I am a student
        When I create a todo list for a class
        And that class has some valid priority assigned to it
        Then I should create a todo list for a class

#Error Flow
    Scenario: Create a todo list for a non existing class
        Given I am a student
        When I add a todo list to a non existing class
        Then I should receive an error message and about creating a todo list for a class
