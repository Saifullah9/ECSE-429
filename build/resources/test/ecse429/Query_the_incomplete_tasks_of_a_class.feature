Feature: Query_the_incomplete_tasks_of_a_class
    As a student, I query the incomplete tasks for a class I am taking, to help manage my time.

#Normal Flow
    Scenario: Successfully query the incomplete tasks of a class
        Given I am a student
        When I query the incomplete tasks of a class
        Then I should receive a list of incomplete tasks

#Alternate Flow
    Scenario: Query incomplete tasks but none left
        Given I am a student
        When I query the incomplete tasks of a class
        And there are no incomplete tasks left
        Then I should receive a message saying no incomplete tasks left

#Error Flow
    Scenario: Query the incomplete tasks of a class which does not exist
        Given I am a student
        When I query the incomplete tasks of a class
        But the tasks do not exist
        Then I should receive an error message about querying all incomplete tasks of a class
