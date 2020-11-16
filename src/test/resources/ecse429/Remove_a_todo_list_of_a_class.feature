Feature: Remove_a_todo_list_of_a_class
    As a student, I remove a to do list for a class which I am no longer taking, to declutter my schedule.

#Normal Flow
    Scenario: Successfully remove a todo list of a class
        Given I am a student
        When I remove a todo list of a class
        Then I should remove a todo list of a class

#Alternate Flow
    Scenario: Successfully remove a todo list of a class with a priority assigned
        Given I am a student
        When I remove a categorized todo list of a class
        Then I should remove a todo list of a class

#Error Flow
    Scenario: Attempt to remove a todo list of a non-existing class
        Given I am a student
        When I remove a todo list of a class which doesnt exist
        Then I should receive an error message and about removing a todo list of a class
