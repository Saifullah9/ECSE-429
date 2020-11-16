Feature: Query_all_incomplete_HIGH_priority_tasks_of_all_classes
    As a student, I query all incomplete HIGH priority tasks from all my classes, to identify my short-term goals.

#Normal Flow
    Scenario: Successfully query all incomplete HIGH priority tasks of all classes
        Given I am a student
        When I query all incomplete HIGH priority tasks of all classes
        Then I should receive a list of the incomplete HIGH priority tasks of all my classes

#Alternate Flow
    Scenario: Query all incomplete HIGH priority tasks but there are none
        Given I am a student
        When I query all incomplete HIGH priority tasks of all classes
        But no incomplete HIGH priority tasks exist
        Then I should receive a list of the incomplete HIGH priority tasks of all my classes

#Error Flow
    Scenario: Query all incomplete HIGH priority tasks of a non-existing class
        Given I am a student
        When I query all incomplete HIGH priority tasks of all classes
        But there are no classes
        Then I should receive an error message about query of high priority tasks
