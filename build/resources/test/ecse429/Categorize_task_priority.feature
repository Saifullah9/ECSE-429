Feature: Categorize_task_priority
    As a student, I categorize tasks as HIGH, MEDIUM or LOW priority, so I can better manage my time.


#Normal Flow
    Scenario:  Successfully categorize a task
        Given I am a student
        When I change a task priority
        Then I should successfully categorize a task

#Alternate Flow
    Scenario: Successfully categorize a task associated to a todo list
        Given I am a student
        When I change a task priority
        And that task is associated to a todo list
        Then I should successfully categorize a task

#Error Flow
    Scenario:  Categorize a task to a non existing priority
        Given I am a student
        When I categorize a task with a non existing priority
        Then I should receive an error message about categorizing a task
