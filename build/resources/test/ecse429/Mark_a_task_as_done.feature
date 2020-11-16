Feature: Mark_a_task_as_done

    As a student,
    I mark a task as done on my course to do list,
    so I can track my accomplishments.

    #Normal Flow
    Scenario:  Successfully mark a task as done
        Given I am a student
        When I mark a task as done
        Then I should receive a confirmation message

    #Alternate Flow
    Scenario: Mark a task as incomplete
        Given I am a student
        When I mark a task as incomplete
        Then I should receive a confirmation message

    #Error Flow
    Scenario: Mark a non-existing task as done
        Given I am a student
        When I request to mark a non-existing task as done
        Then I should receive an error message
