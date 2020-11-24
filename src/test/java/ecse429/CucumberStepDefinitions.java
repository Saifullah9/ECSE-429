package ecse429;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.Timer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import org.junit.BeforeClass;


public class CucumberStepDefinitions {
    // the  testsss foorr noowwww

//////this is added extra and testing
private static final HttpClient httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .connectTimeout(Duration.ofSeconds(10))
        .build();

@Given("I am a student")
public void I_am_a_student() throws IOException, InterruptedException {
// we are all students already
   // assertSame(true,true);
}

@Before
public void create_priorities() throws IOException, InterruptedException{
   /* refrence
    POST("http://localhost:4567/categories") ;// High
    POST("http://localhost:4567/categories") ;// Medium
    POST("http://localhost:4567/categories") ;//  Low
    */
// creation of categories high medium low
    String json = new StringBuilder()
            .append("{")
            .append("\"title\":\"High\"")   // id is 3
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    String json2 = new StringBuilder()
            .append("{")
            .append("\"title\":\"Medium\"") // id is 4
            .append("}").toString();

    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());


    String json3 = new StringBuilder()
            .append("{")
            .append("\"title\":\"Low\"") // id is 5
            .append("}").toString();

    HttpRequest request3 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json3))
            .uri(URI.create("http://localhost:4567/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
    String json8 = new StringBuilder()
            .append("{")
            .append("\"title\":\"course1\"")   // id is 6
            .append("}").toString();

    HttpRequest request8 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json8))
            .uri(URI.create("http://localhost:4567/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response8 = httpClient.send(request8, HttpResponse.BodyHandlers.ofString());
// ____ Creation for todos__________

    String json4 = new StringBuilder()
            .append("{")
            .append("\"title\":\"todotest1\"") // id is 3
            .append("}").toString();

    HttpRequest request4 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json4))
            .uri(URI.create("http://localhost:4567/todos"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());

    String json5 = new StringBuilder()
            .append("{")
            .append("\"title\":\"todotest2\"") // id is 4
            .append("}").toString();

    HttpRequest request5 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json5))
            .uri(URI.create("http://localhost:4567/todos"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response5 = httpClient.send(request5, HttpResponse.BodyHandlers.ofString());

    // ____ Creation for projects__________

    String json6 = new StringBuilder()
            .append("{")
            .append("\"title\":\"projecttest1\"") // id is 2
            .append("}").toString();

    HttpRequest request6 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json6))
            .uri(URI.create("http://localhost:4567/projects"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response6 = httpClient.send(request6, HttpResponse.BodyHandlers.ofString());

    String json7 = new StringBuilder()
            .append("{")
            .append("\"title\":\"projecttest1\"") // id is 3
            .append("}").toString();

    HttpRequest request7 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json7))
            .uri(URI.create("http://localhost:4567/projects"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response7 = httpClient.send(request7, HttpResponse.BodyHandlers.ofString());


}

@After
public void del_priorities() throws IOException, InterruptedException{

    // todos -> categories
        HttpRequest request = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:4567/todos/3/categories/6"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        HttpRequest request2 = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:4567/todos/3/categories/3"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());


/// todos -> projects
        HttpRequest request3 = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:4567/todos/3/tasksof/2"))    // PUT ID HERE
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());


        // projects -> categories
    HttpRequest request4 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/projects/2/categories/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());

    // projects -> todos

    HttpRequest request5 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/projects/2/tasks/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();


    //categories -> projects
    HttpRequest request6 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/categoriess/3/projects/2"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();
    }

////___________________________________add_a_task_to_a_course's_todo_list__________________________________________________
//
//Treat todos as todo list, project as tasks, categories as priorities and course
@When("I add a task to a course todo list")
public void add_task_to_courses_todo() throws IOException, InterruptedException {

/* refrence
   POST("http://localhost:4567/todos"); // create a todolist
   POST("http://localhost:4567/projects"); // creata task(project)      ADD PARAMTERS IN THE REQUEST NOT LEAVE EMPTY
   POST("http://localhost:4567/categories/");// create a course (category)


   POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
*/
    //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

    //POST("http://localhost:4567/todos/3/categories"); // create a relation between the course(category) and todolist
    String json2 = new StringBuilder()
            .append("{")
            .append("\"id\":\"6\"") // THE ID
            .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response5.statusCode());
//    System.out.println(response5.body());
    assertEquals(201 ,response2.statusCode());



}

@When("I add an empty task to a course todo list")
public void add_emptyTask_to_courses_todo() throws IOException, InterruptedException{


/* refrence
   POST("http://localhost:4567/todos"); // create a todolist
   POST("http://localhost:4567/projects"); // creata task(project)      ADD PARAMTERS IN THE REQUEST NOT LEAVE EMPTY
   POST("http://localhost:4567/categories/");// create a course (category)


   POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
*/


    //POST("http://localhost:4567/todos/3/categories"); // create a relation between the course(category) and todolist
    String json2 = new StringBuilder()
            .append("{")
            .append("\"id\":\"6\"") // THE ID
            .append("}").toString();



    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response2.statusCode());





}

@Then("I should successfully add a task to a course todo list")
public void confirm_task_to_todo_to_course() throws IOException, InterruptedException{
/* refrence
    GET("http://localhost:4567/todos/:id/categories");
    GET("http://localhost:4567/todos/:id/tasksof");
*/
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200,response.statusCode());


    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/3/tasksof"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();
    HttpResponse<String> response2 = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200,response2.statusCode());
}

@And("that task has a priority associated with it")
public void add_priority_to_task()  throws IOException, InterruptedException{
  //  POST("http://localhost:4567/categories") // High
  //  POST("http://localhost:4567/categories") // Medium
  //  POST("http://localhost:4567/categories") //  Low

    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"") // THE ID
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());


}

@When("I request to add a task to a non existing course")
public void task_to_no_course() throws IOException, InterruptedException{
//   POST("http://localhost:4567/todos") ;// create a todolist
//   POST("http://localhost:4567/projects") ;// creata task(project)      DO NOT ADD PARAMTERS IN THE REQUEST ,so  LEAVE EMPTY
//
//   POST("http://localhost:4567/todos/:id/tasksof") ;// create a relation between the task(project) and todolist
//   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist parameter must be invalid


    //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());


    //POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
    String json2 = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"") // THE ID is WRONG FOR TESTING
            .append("}").toString();


    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response2.statusCode());



}

@Then("I should receive an error message about adding a task to a course todo list")
public void recieve_error() throws IOException, InterruptedException{
  //  GET("http://localhost:4567/todos/:id/categories");
  //  GET("http://localhost:4567/todos/:id/tasksof");
    //POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"") // THE ID is WRONG FOR TESTING
            .append("}").toString();


    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/:id/tasksof"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response2 = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200,response2.statusCode());

}

////___________________________________Categorize_task_priority__________________________________________________
//
////todo is the task, category is the priority,project is the course
@When("I change a task priority")
public void change_task_priority() throws IOException, InterruptedException{
  //  POST("http://localhost:4567/categories") // High
  //  POST("http://localhost:4567/categories") // Medium
  //  POST("http://localhost:4567/categories") //  Low

    //POST("http://localhost:4567/projects/:id/categories"); // relationship between category and todo Add paramater for category
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

}

@Then("I should successfully categorize a task")   //change this
public void confirm_task_priority() throws IOException, InterruptedException{

    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());
}

@And("that task is associated to a todo list")
public void associate_task_todolist() throws IOException, InterruptedException{

//    POST("http://localhost:4567/projects/:id/tasks") ;// relation between task(todo) and course(project)

    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());


}

@When("I categorize a task with a non existing priority")
public void categorize_task_with_no_priority() throws IOException, InterruptedException{

//POST("http://localhost:4567/projects/:id/categories")relationship between category and todo Add a invalid paramater for category
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

}

@Then("I should receive an error message about categorizing a task") // need to make it unique
public void recieve_error2() throws IOException, InterruptedException{
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());
}

////___________________________________Change_a_task’s_description__________________________________________________

//task is project, priority is category

@When("I change a task description")
public void change_task_description() throws IOException, InterruptedException{

   // PUT("http://localhost:4567/projects/:id/description") ;// add a variable for description to be updated
    String json = new StringBuilder()
            .append("{")
            .append("\"description\":\"updated\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());

}

@Then("I should successfully change a task description")   //change this
public void confirm_task_description() throws IOException, InterruptedException{

   // GET("http://localhost:4567/projects/:id/description");
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/2"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());
}

@And("that task is associated to a category")
public void associate_task_with_category() throws IOException, InterruptedException{  //similar to ascoiate with prio method check rubric

   // POST("http://localhost:4567/projects/:id/categories"); // add param for category
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());
}

@When("I change the description of a task which doesnt exist")
public void change_task_description_to_no_task() throws IOException, InterruptedException{
     //PUT("http://localhost:4567/projects/:id/description") ;// enter invalid param for project
    String json = new StringBuilder()
            .append("{")
            .append("\"description\":\"updated\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

}

@Then("I should receive a error message task description")   //change this
public void recieve_error_task_description() throws IOException, InterruptedException{

   // GET("http://localhost:4567/projects/:id/description");
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());
}

////___________________________________Change_priority_of_a_task__________________________________________________
//
////task is project, priority is category
@But("set it to an invalid priority")
public void set_to_invalid_priority() throws IOException, InterruptedException{
   // POST("http://localhost:4567/projects/:id/categories"); // add invalid param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

}

@Then("I should receive an error message about task priority")   //change this
public void recieve_error_task_prio() throws IOException, InterruptedException {
/* refrence

   GET("http://localhost:4567/projects/:id/categories");
    assert(status codes of get)

*/
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());
}

@When("I request to change the priority of a task which does not exist")
public void asscociate_priority_with_no_task() throws IOException, InterruptedException {
   // POST("http://localhost:4567/projects/:id/categories"); // add invalid param for task id
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/-1/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

}

@When("I change the priority of a task")
public void change_prio_of_a_task() throws IOException, InterruptedException{
    // POST("http://localhost:4567/projects/:id/categories"); // add valid param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

}

@Then("I should successfully change priority of a task")
public void confirm_prio_has_been_changed() throws IOException, InterruptedException{
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());
}


////___________________________________Create_a_todo_list_for_a_class______________________________________________________
//
//
//todolist is todo, class is project, priority is category
@When("I create a todo list for a class")
public void create_todo_for_class() throws IOException, InterruptedException {

   //POST("http://localhost:4567/projects/:id/tasks") // relation between class(project) and todolist(todo) add param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

}

@Then("I should create a todo list for a class")   //change this
public void confirm_create_todo_for_class() throws IOException, InterruptedException {

   //GET("http://localhost:4567/projects/:id/todos") ;// relation between class(project) and todolist(todo) add param
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/2/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());

}

@And("that class has some valid priority assigned to it")
public void asscoiate_class_with_priority() throws IOException, InterruptedException {

    //POST("http://localhost:4567/projects/:id/categories") ;// add valid param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

}

@When("I add a todo list to a non existing class")
public void add_todo_to_no_class() throws IOException, InterruptedException {

  // POST("http://localhost:4567/projects/:id/todos"); // relation between class(project) and todolist(todo) add invalid param for class
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/-1/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

}

@Then("I should receive an error message and about creating a todo list for a class")   //change this
public void recieve_error_for_create_todo_for_class() throws IOException, InterruptedException {

   //GET("http://localhost:4567/projects/:id/tasks") ;// relation between class(project) and todolist(todo) add invalid param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/-1/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());

}

////___________________________________Mark_a_task_as_done______________________________________________________________________
//todos is task

@When("I mark a task as done")
public void mark_task_as_done() throws IOException, InterruptedException {
   // PUT("http://localhost:4567/todos/:id") ;// mark it as done add param
    String json = new StringBuilder()
            .append("{")
            .append("\"title\":\"same\",")
            .append("\"doneStatus\":true")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .PUT(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    assertEquals(200 ,response.statusCode());
}

@When("I mark a task as incomplete")
public void mark_task_as_incomplete() throws IOException, InterruptedException {
    // PUT("http://localhost:4567/todos/:id") ;// mark it as done add param
    String json = new StringBuilder()
            .append("{")
            .append("\"title\":\"same\",")
            .append("\"doneStatus\":false")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .PUT(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    assertEquals(200 ,response.statusCode());

}

@Then("I should mark a task as done") //change this
public void confirm_task_marked_done() throws IOException, InterruptedException {
    // GET("http://localhost:4567/todos/:id") ;// mark it as done add param
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());
}

@Then("I should mark a task as incomplete") //change this
public void confirm_task_marked_incomplete() throws IOException, InterruptedException {
// GET("http://localhost:4567/todos/:id") ;// mark it as done add param
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response.statusCode());
}

@When("I request to mark a non existing task as done")
public void mark_none_existing_task() throws IOException, InterruptedException {
   // POST("http://localhost:4567/todos/:id/done") ;// mark it as incomplete add invalid param for task
    String json = new StringBuilder()
            .append("{")
            .append("\"doneStatus\":true")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .PUT(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());

}

@Then("I should receive an error message about marking a task as done") //change this
public void recieve_error_marked_complete() throws IOException, InterruptedException {
   // GET("http://localhost:4567/todos/:id");
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());


}

////___________________________________Query_all_incomplete_HIGH_priority_tasks_of_all_classes____________________________
//
////category is priority, project is task , todo is class
//
@When("I query all incomplete HIGH priority tasks of all classes")
public void query_incomplete_high_priority_tasks_of_classes() throws IOException, InterruptedException {

//    POST("http://localhost:4567/categories/:id/projects"); //relation between task(project) and priority(category) add param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/categories/3/projects"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    assertEquals(201 ,response.statusCode());


//    GET("http://localhost:4567/categories/:id/projects");
    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/categories/3/projects"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response2.statusCode());


}

@Then("I should receive a list of the incomplete HIGH priority tasks of all my classes")
public void confirm_the_query_list() throws IOException, InterruptedException {

    //    GET("http://localhost:4567/categories/:id/projects");
    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/categories/3/projects"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response2.statusCode());
}

@But("no incomplete HIGH priority tasks exist")
public void no_high_tasks() throws IOException, InterruptedException{

    //    GET("http://localhost:4567/categories/:id/projects");
    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/categories/4/projects"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response2.statusCode());
}

@But("there are no classes")
public void task_not_with_a_class_for_query() throws IOException, InterruptedException {

   // POST("http://localhost:4567/todos/:id/tasksof") ;// relation between class(todo) and task(project) add invalid param for class
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/-1/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(201 ,response.statusCode());
}

@Then("I should receive an error message about query of high priority tasks")
public void recieve_error_for_query_task_no_class() throws IOException, InterruptedException {
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/-1/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());
}

////___________________________________Query_the_incomplete_tasks_of_a_class__________________________________________________
////category is priority, task is project , todo is class
//
@When("I query the incomplete tasks of a class")
public void query_incomplete_tasks_of_classes() throws IOException, InterruptedException {

//    POST("http://localhost:4567/categories/:id/projects"); //relation between task(project) and priority(category) add param
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/categories/3/projects"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    assertEquals(201 ,response.statusCode());


//    GET("http://localhost:4567/categories/:id/projects");
    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/categories/3/projects"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response2.statusCode());


}

@Then("I should receive a list of incomplete tasks")
public void confirm_the_query_list_of_incomplete_tasks() throws IOException, InterruptedException {
        HttpRequest request2 = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:4567/todos/3/tasksof"))    // PUT ID HERE
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
        assertEquals(200 ,response2.statusCode());
    }

@Then ("I should receive a message saying no incomplete tasks left")
public void confirm_the_query_empty_list_of_incomplete_tasks() throws IOException, InterruptedException {
        HttpRequest request2 = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:4567/todos/3/tasksof"))    // PUT ID HERE
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
        assertEquals(200 ,response2.statusCode());
    }

@And("there are no incomplete tasks left")
public void no_incomplete_left_for_query() throws IOException, InterruptedException {

        // POST("http://localhost:4567/todos/:id/tasksof") ;// relation between class(todo) and task(project) add invalid param for class
    HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:4567/todos/4/tasksof"))    // PUT ID HERE
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(200 ,response.statusCode());
    }

@But("the tasks do not exist")
public void task_none_for_query() throws IOException, InterruptedException {

    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());
}

@Then("I should receive an error message about querying all incomplete tasks of a class")
public void recieve_error_for_query_no_tasks() throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());
}


////___________________________________Remove_a_todo_list_of_a_class__________________________________________________
//// todo is todolist,category is priority, projects is class
//
@When("I remove a todo list of a class")
public void remove_todo_of_class() throws IOException, InterruptedException {
   // POST("http://localhost:4567/project/:id/tasks"); // create a relation between the class(project) and todolist add params
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

    // POST("http://localhost:4567/todos/:id/categories") // create a relation between the priority(category) and todolist parameter must be valid
    String json2 = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response2.statusCode());

  // DELETE("http://localhost:4567/project/:id/tasks/:id"); // delete  relation between the class(project) and todolist add params
    HttpRequest request3 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/projects/2/tasks/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response3.statusCode());

    // DELETE("http://localhost:4567/todos/:id/categories/:id"); // delete  relation between the class(project) and todolist add params
    HttpRequest request4 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/todos/3/categories/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response4.statusCode());

}

@When("I remove a categorized todo list of a class")
public void remove_todo_of_a_categorized_class() throws IOException, InterruptedException {
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/projects/2/tasks"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

    // POST("http://localhost:4567/todos/:id/categories") // create a relation between the priority(category) and todolist parameter must be valid
    String json2 = new StringBuilder()
            .append("{")
            .append("\"id\":\"3\"")
            .append("}").toString();

    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response2.statusCode());

    // DELETE("http://localhost:4567/project/:id/tasks/:id"); // delete  relation between the class(project) and todolist add params
    HttpRequest request3 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/projects/2/tasks/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response3.statusCode());

    // DELETE("http://localhost:4567/todos/:id/categories/:id"); // delete  relation between the class(project) and todolist add params
    HttpRequest request4 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/todos/3/categories/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response4.statusCode());
}

@Then("I should remove a todo list of a class") //change this
public void confirmlist_is_removed() throws IOException, InterruptedException {

 HttpRequest request4 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/3"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response4.statusCode());

}

@When("I remove a todo list of a class which doesnt exist")
public void remove_todo_of_none_class() throws IOException, InterruptedException {
 // DELETE("http://localhost:4567/todos/:id/projects/:id"); // delete  relation between the class(project) and todolist add params
    HttpRequest request = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/todos/3/projects/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());

}

@Then("I should receive an error message and about removing a todo list of a class")
public void recieve_error_for_remove_todolist_class() throws IOException, InterruptedException {

    HttpRequest request = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/todos/3/projects/-1"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());
}


//___________________________________Remove_task_from_a_course’s_todo_list__________________________________________________
//Treat todos as todo list, project as tasks, categories as priorities and course

@When("I request to remove a task from a todo list")
public void remove_task_from_todo() throws IOException, InterruptedException{
    //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"2\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/3/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response.statusCode());

    //POST("http://localhost:4567/todos/3/categories"); // create a relation between the course(category) and todolist
    String json2 = new StringBuilder()
            .append("{")
            .append("\"id\":\"6\"") // THE ID
            .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/todos/3/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response2.statusCode());

    HttpRequest request3 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/todos/3/tasksof/2"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
    assertEquals(200 ,response3.statusCode());


    HttpRequest request4 = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/todos/3/categories/6"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
    assertEquals(201 ,response2.statusCode());



}

@When("I request to remove a course related task from a todo list")
public void remove_course_task_from_todo() throws IOException, InterruptedException{
        //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
        String json = new StringBuilder()
                .append("{")
                .append("\"id\":\"2\"")
                .append("}").toString();

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create("http://localhost:4567/todos/3/tasksof"))    // PUT ID HERE
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(201 ,response.statusCode());

        //POST("http://localhost:4567/todos/3/categories"); // create a relation between the course(category) and todolist
        String json2 = new StringBuilder()
                .append("{")
                .append("\"id\":\"6\"") // THE ID
                .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


        HttpRequest request2 = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json2))
                .uri(URI.create("http://localhost:4567/todos/3/categories"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
        assertEquals(201 ,response2.statusCode());

        HttpRequest request3 = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:4567/todos/3/tasksof/2"))    // PUT ID HERE
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
        assertEquals(200 ,response3.statusCode());


        HttpRequest request4 = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:4567/todos/3/categories/6"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
        assertEquals(201 ,response2.statusCode());



    }

@Then("I should remove a task from a course todo list")
public void confirm_remove_course_task_from_todo() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:4567/categories/6"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(200 ,response.statusCode());
    }

@When("I request to remove a task from a non existing todo list")
public void remove_course_task_from_none_todo() throws IOException, InterruptedException{
    HttpRequest request = HttpRequest.newBuilder()
            .DELETE()
            .uri(URI.create("http://localhost:4567/projects/2/tasks/-1"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    assertNotEquals(200 ,response.statusCode());
}

@Then("I should receive an error message and about removing a task from a course todo list")
public void recieve_error_for_remove_course_task_from_none_todo() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:4567/projects/2/tasks/-1"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        assertNotEquals(200 ,response.statusCode());
    }



}
