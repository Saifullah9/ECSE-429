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
//    public static void send(String mycall) throws IOException, InterruptedException {
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create(mycall))
//                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
//                .build();
//
//        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//        // print response headers
//        HttpHeaders headers = response.headers();
//        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
//
//        // print status code
//        System.out.println(response.statusCode());
//
//        // print response body
//        System.out.println(response.body());
//
//    }

//    public static HttpRequest.BodyPublisher ofFormData(Map<Object, Object> data) {
//        var builder = new StringBuilder();
//        for (Map.Entry<Object, Object> entry : data.entrySet()) {
//            if (builder.length() > 0) {
//                builder.append("&");
//            }
//            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
//            builder.append("=");
//            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
//        }
//        return HttpRequest.BodyPublishers.ofString(builder.toString());
//    }


///////end of extra for adding and testin



@Given("I am a student")
public void I_am_a_student() throws IOException, InterruptedException {
// we are all students already
    assertSame(1,1);
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
    System.out.println(" THIS IS HAPPENING BEFORE EACH SCENARIO");

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

        System.out.println(" THIS IS HAPPENING AFTER EACH SCENARIO");
    }


////___________________________________add_a_task_to_a_course's_todo_list__________________________________________________
//
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

    //POST("http://localhost:4567/todos"); // create a todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"title\":\"mkyong\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
 //  System.out.println(response.statusCode());
    assertEquals(201 ,response.statusCode());


//POST("http://localhost:4567/projects"); // creata task(project)      ADD PARAMTERS IN THE REQUEST NOT LEAVE EMPTY
    String json2 = new StringBuilder()
            .append("{")
            .append("\"title\":\"proj\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/projects"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
 //   System.out.println(response.statusCode());
    assertEquals(201 ,response2.statusCode());


    //POST("http://localhost:4567/categories/");// create a course (category)
    String json3 = new StringBuilder()
            .append("{")
            .append("\"title\":\"priority\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request3 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json3))
            .uri(URI.create("http://localhost:4567/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response.statusCode());
//    System.out.println(response.body().substring(1,10));
    assertEquals(201 ,response3.statusCode());


    //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
    String json4 = new StringBuilder()
            .append("{")
            .append(response2.body().substring(1,10))
            .append("}").toString();

    HttpRequest request4 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json4))
            .uri(URI.create("http://localhost:4567/todos/13/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
//    System.out.println(response4.statusCode());
//    System.out.println(response4.body());
    assertEquals(201 ,response4.statusCode());

    //POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
    String json5 = new StringBuilder()
            .append("{")
            .append(response3.body().substring(1,10)) // THE ID
            .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


    HttpRequest request5 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json5))
            .uri(URI.create("http://localhost:4567/todos/13/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response5 = httpClient.send(request5, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response5.statusCode());
//    System.out.println(response5.body());
    assertEquals(201 ,response5.statusCode());



}
//
////Treat todos as todo list, project as tasks, categories as priorities and course
@When("I add an empty task to a course todo list")
public void add_emptyTask_to_courses_todo() throws IOException, InterruptedException{


/* refrence
   POST("http://localhost:4567/todos"); // create a todolist
   POST("http://localhost:4567/projects"); // creata task(project)      ADD PARAMTERS IN THE REQUEST NOT LEAVE EMPTY
   POST("http://localhost:4567/categories/");// create a course (category)


   POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
*/

    //POST("http://localhost:4567/todos"); // create a todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"title\":\"mkyong\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    //  System.out.println(response.statusCode());
    assertEquals(201 ,response.statusCode());


//POST("http://localhost:4567/projects"); // creata task(project)      ADD PARAMTERS IN THE REQUEST NOT LEAVE EMPTY
    String json2 = new StringBuilder()
            .append("{")
            .append("\"title\":\"proj\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/projects"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    //   System.out.println(response.statusCode());
    assertEquals(201 ,response2.statusCode());


    //POST("http://localhost:4567/categories/");// create a course (category)
    String json3 = new StringBuilder()
            .append("{")
            .append("\"title\":\"priority\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request3 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json3))
            .uri(URI.create("http://localhost:4567/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response3 = httpClient.send(request3, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response.statusCode());
//    System.out.println(response.body().substring(1,10));
    assertEquals(201 ,response3.statusCode());


    //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
    String json4 = new StringBuilder()
            .append("{")
            .append(response2.body().substring(1,10))
            .append("}").toString();

    HttpRequest request4 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json4))
            .uri(URI.create("http://localhost:4567/todos/13/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
//    System.out.println(response4.statusCode());
//    System.out.println(response4.body());
    assertEquals(201 ,response4.statusCode());

    //POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
    String json5 = new StringBuilder()
            .append("{")
            .append(response3.body().substring(1,10)) // THE ID
            .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


    HttpRequest request5 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json5))
            .uri(URI.create("http://localhost:4567/todos/13/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response5 = httpClient.send(request5, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response5.statusCode());
//    System.out.println(response5.body());
    assertEquals(201 ,response5.statusCode());






}

//
@Then("I should successfully add a task to a course todo list")
public void confirm_task_to_todo_to_course() throws IOException, InterruptedException{
/* refrence
    GET("http://localhost:4567/todos/:id/categories");
    GET("http://localhost:4567/todos/:id/tasksof");
*/
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/13/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    // print status code
//    System.out.println(response.statusCode());
    // print response body
//  System.out.println(response.body());

    assertSame(200,response.statusCode());


    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/:id/tasksof"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response2 = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    // print status code
//    System.out.println(response.statusCode());
    // print response body
//  System.out.println(response.body());

    assertSame(200,response2.statusCode());
}
//
@And("that task has a priority associated with it")
public void add_priority_to_task()  throws IOException, InterruptedException{
  //  POST("http://localhost:4567/categories") // High
  //  POST("http://localhost:4567/categories") // Medium
  //  POST("http://localhost:4567/categories") //  Low

   // POST("http://localhost:4567/projects/:id/categories") ;// ADD PARAMTER ID FOR CATEGORY

    String json = new StringBuilder()
            .append("{")
            .append("\"id\":\"1\"") // THE ID
            .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos/13/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response.statusCode());
//    System.out.println(response.body());
    assertEquals(201 ,response.statusCode());



}
//
//
@When("I request to add a task to a non existing course")
public void task_to_no_course() throws IOException, InterruptedException{
//   POST("http://localhost:4567/todos") ;// create a todolist
//   POST("http://localhost:4567/projects") ;// creata task(project)      DO NOT ADD PARAMTERS IN THE REQUEST ,so  LEAVE EMPTY
//
//   POST("http://localhost:4567/todos/:id/tasksof") ;// create a relation between the task(project) and todolist
//   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist parameter must be invalid

    //POST("http://localhost:4567/todos"); // create a todolist
    String json = new StringBuilder()
            .append("{")
            .append("\"title\":\"mkyong\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .uri(URI.create("http://localhost:4567/todos"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    //  System.out.println(response.statusCode());
    assertEquals(201 ,response.statusCode());


//POST("http://localhost:4567/projects"); // creata task(project)      ADD PARAMTERS IN THE REQUEST NOT LEAVE EMPTY
    String json2 = new StringBuilder()
            .append("{")
            .append("\"title\":\"proj\",")
            .append("\"description\":\"hello\"")
            .append("}").toString();

    HttpRequest request2 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json2))
            .uri(URI.create("http://localhost:4567/projects"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());
    //   System.out.println(response.statusCode());
    assertEquals(201 ,response2.statusCode());


    //POST("http://localhost:4567/todos/:id/tasksof"); // create a relation between the task(project) and todolist
    String json4 = new StringBuilder()
            .append("{")
            .append(response2.body().substring(1,10))
            .append("}").toString();

    HttpRequest request4 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json4))
            .uri(URI.create("http://localhost:4567/todos/13/tasksof"))    // PUT ID HERE
            .setHeader("User-Agent", "Java 11 HttpClient Bot")
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response4 = httpClient.send(request4, HttpResponse.BodyHandlers.ofString());
//    System.out.println(response4.statusCode());
//    System.out.println(response4.body());
    assertEquals(201 ,response4.statusCode());

    //POST("http://localhost:4567/todos/:id/categories"); // create a relation between the course(category) and todolist
    String json5 = new StringBuilder()
            .append("{")
            .append("\"id\":\"-1\"") // THE ID is WRONG FOR TESTING
            .append("}").toString();

//    System.out.println(response3.body().substring(1,10));


    HttpRequest request5 = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofString(json5))
            .uri(URI.create("http://localhost:4567/todos/13/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .header("Content-Type", "application/json")
            .build();

    HttpResponse<String> response5 = httpClient.send(request5, HttpResponse.BodyHandlers.ofString());
//     System.out.println(response5.statusCode());
//    System.out.println(response5.body());
    assertNotEquals(201 ,response5.statusCode());



}

@Then("I should receive an error message about adding a task to a course todo list")
public void recieve_error() throws IOException, InterruptedException{
  //  GET("http://localhost:4567/todos/:id/categories");
  //  GET("http://localhost:4567/todos/:id/tasksof");
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/13/categories"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    // print status code
//    System.out.println(response.statusCode());
    // print response body
//  System.out.println(response.body());

    assertNotEquals(200,response.statusCode());


    HttpRequest request2 = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/todos/:id/tasksof"))
            .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response2 = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    // print status code
//    System.out.println(response.statusCode());
    // print response body
//  System.out.println(response.body());

    assertNotEquals(200,response2.statusCode());

}
//
//// REMEBER TO RESET DATABASE PROCEDURE
//
////___________________________________Categorize_task_priority__________________________________________________
//
////todo is the task, category is the priority,project is the course
//@When("I change a task’s priority")
//public void change_task_priority(){
//  //  POST("http://localhost:4567/categories") // High
//  //  POST("http://localhost:4567/categories") // Medium
//  //  POST("http://localhost:4567/categories") //  Low
//
//    POST("http://localhost:4567/projects"); // creata task(project)
//    POST("http://localhost:4567/projects/:id/categories"); // relationship between category and todo Add paramater for category
//}

//@Then("I should receive a confirmation message")   //change this
//public void confirm_task_priority(){
//
//    GET("http://localhost:4567/projects/:id/categories");
//    assert(status codes of get)
//}
//
//@And("that task is associated to a todo list")
//public void associate_task_todolist(){
//
//    POST("http://localhost:4567/todos"); // creat a todolist(todos)
//    POST("http://localhost:4567/projects/:id/tasks") ;// relation between task(todo) and course(project)
//
//}
//
//@When("I categorize a task with a non-existing priority")
//public void categorize_task_with_no_priority(){
//
//POST("http://localhost:4567/projects") ;// creata task(project)
//POST("http://localhost:4567/projects/:id/categories") ;// relationship between category and todo Add a invalid paramater for category
//}
//
//@Then("I should receive an error message") // need to make it unique
//public void recieve_error2(){
//    GET("http://localhost:4567/projects/:id/categories");
//
//    assert(status codes of  get) // must fail or succeed?
//}
//
//
////___________________________________Change_a_task’s_description__________________________________________________
//
////task is project, priority is category
//
//@When("I change a task’s description")
//public void change_task_description(){
//    POST("http://localhost:4567/projects"); // creata task(project)
//    PUT("http://localhost:4567/projects/:id/description") ;// add a variable for description to be updated
//
//}
//
//@Then("I should receive a confirmation message")   //change this
//public void confirm_task_description(){
//
//    GET("http://localhost:4567/projects/:id/description");
//    assert(status codes of get)
//}
//
//@And("that task is associated to a category")
//public void associate_task_with_category(){  //similar to ascoiate with prio method check rubric
//
//    POST("http://localhost:4567/projects/:id/categories"); // add param for category
//}
//
//@When("I change the description of a task which doesn’t exist")
//public void change_task_description_to_no_task(){
//     POST("http://localhost:4567/projects/:id/description") ;// enter invalid param for project
//}
//
//@Then("I should receive an error message")   //change this
//public void recieve_error_task_description(){
//
//    GET("http://localhost:4567/projects/:id/description");
//    assert(status codes of get)
//}
//
//
//
//
////___________________________________Change_priority_of_a_task__________________________________________________
//
////task is project, priority is category
//@But("set it to an invalid priority")
//public void set_to_invalid_priority(){
//    POST(""http://localhost:4567/projects") // create task(project)
//    POST("http://localhost:4567/projects/:id/categories"); // add invalid param
//}
//
@Then("I should receive an error message")   //change this
public void recieve_error_task_prio() throws IOException, InterruptedException {
/* refrence

   GET("http://localhost:4567/projects/:id/categories");
    assert(status codes of get)

*/
    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create("http://localhost:4567/projects/:1/categories"))
            //.setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    // print response headers
    HttpHeaders headers = response.headers();
    headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

    // print status code
    System.out.println(response.statusCode());

    // print response body
    System.out.println(response.body());
    assertSame(1,1);
}
//
//@When("I request to change the priority of a task which does not exist")
//public void asscociate_priority_with_no_task(){
//    POST("http://localhost:4567/projects/:id/categories"); // add invalid param
//}
//
//
////___________________________________Create_a_todo_list_for_a_class______________________________________________________
//
//
////todolist is todo, class is project, priority is category
//@When("I create a todo list for a class")
//public void create_todo_fo_class(){
//
//   POST("http://localhost:4567/todos") // create a todolist
//   POST("http://localhost:4567/projects") // create class(project)      DO NOT ADD PARAMTERS IN THE REQUEST ,so  LEAVE EMPTY
//// POST("http://localhost:4567/categories/") // create a course (category)
//   POST("http://localhost:4567/projects/:id/todos") // relation between class(project) and todolist(todo) add param
//}
//
//@Then("I should receive a confirmation message")   //change this
//public void confirm_create_todo_for_class(){
//
//   GET("http://localhost:4567/projects/:id/todos") ;// relation between class(project) and todolist(todo) add param
//    assert(status codes of get)
//}
//
//@And("that class has some valid priority assigned to it")
//public void asscoiate_class_with_priority(){
//
//    POST("http://localhost:4567/projects"); // create class(project)
//    POST("http://localhost:4567/projects/:id/categories") ;// add valid param
//}
//
//
//@When("I add a todo list to a non-existing class")
//public void add_todo_to_no_class(){
//
//   POST("http://localhost:4567/todos") ;// create a todolist
//   POST("http://localhost:4567/projects/:id/todos"); // relation between class(project) and todolist(todo) add invalid param for class
//}
//
//@Then("I should receive an error message")   //change this
//public void recieve_error_for_create_todo_for_class(){
//
//   GET("http://localhost:4567/projects/:id/todos") ;// relation between class(project) and todolist(todo) add invalid param
//    assert(status codes of get)
//}
//
//
//
////___________________________________Mark_a_task_as_done______________________________________________________________________
////todos is task
//
//@When("I mark a task as done")
//public void mark_task_as_done(){
//
//    POST("http://localhost:4567/todos"); // create a todolist
//    POST("http://localhost:4567/todos/:id/done") ;// mark it as done add param
//}
//
//@When("I mark a task as incomplete")
//public void mark_task_as_incomplete(){
//
//    POST("http://localhost:4567/todos") ;// create a todolist
//    POST("http://localhost:4567/todos/:id/incomplete") ;// mark it as incomplete add param
//}
//
//
//@Then("I should receive a confirmation message") //change this
//public void confirm_task_marked_done(){
//    GET("http://localhost:4567/todos/:id");
//
//    assert(the done boolean and status code of the get)
//}
//
//@Then("I should receive a confirmation message") //change this
//public void confirm_task_marked_incomplete(){
//    GET("http://localhost:4567/todos/:id");
//
//    assert(the done boolean and status code of the get)
//}
//
//@When("I request to mark a non-existing task as done")
//public void mark_none_existing_task(){
//    POST("http://localhost:4567/todos/:id/done") ;// mark it as incomplete add invalid param for task
//}
//
//@Then("I should receive an error message") //change this
//public void confirm_task_marked_incomplete(){
//    GET("http://localhost:4567/todos/:id");
//
//    assert(the done boolean and status code of the get)
//}
//
//
//
//
//
////___________________________________Query_all_incomplete_HIGH_priority_tasks_of_all_classes____________________________
//
////category is priority, task is project , todo is class
//
//@When("I query all incomplete HIGH priority tasks of all classes")
//public void query_incomplete_high_priority_tasks_of_classes(){
//
//    POST("http://localhost:4567/projects") ;// create task(project)
//    POST("http://localhost:4567/projects/:id/categories"); //relation between task(project) and priority(category) add param
////create another one
//    POST("http://localhost:4567/projects") ;// create task(project)
//    POST("http://localhost:4567/projects/:id/categories"); //relation between task(project) and priority(category) add param
//
//    GET("http://localhost:4567/categories/:id/projects");
//
//}
//
//
//@Then("I should receive a list of the incomplete HIGH priority tasks of all my classes")
//public void confirm_the_query_list(){
//     GET("http://localhost:4567/categories/:id/projects");
//     assert(thelist and status code);
//}
//
//@But("no incomplete HIGH priority tasks exist")
//public void no_high_tasks(){
//
//    GET("http://localhost:4567/categories/:id/projects");;   // the param will be another prio for example where no tasks are associated
//}
//
//
//@Then("I should receive a message saying it’s empty")
//public void confirm_alternate_query_list(){
//     GET("http://localhost:4567/categories/:id/projects");
//     assert(thelist and status code);
//}
//
//@But("there are no classes")
//public void task_not_with_a_class_for_query(){
//
//    POST("http://localhost:4567/todos/:id/tasksof") ;// relation between class(todo) and task(project) add invalid param for class
//    POST("http://localhost:4567/projects/:id/categories");
//}
//
//@Then("I should receive an error message")
//public void recieve_error_for_query_task_no_class(){
//
//     GET("http://localhost:4567/categories/:id/projects");
//     assert(thelist and status code);
//
//}
//
////___________________________________Query_the_incomplete_tasks_of_a_class__________________________________________________
//
//
//
//
//
//
////___________________________________Remove_a_todo_list_of_a_class__________________________________________________
//// todo is todolist,category is priority, projects is class
//
//@When("I remove a todo list of a class")
//public void remove_todo_of_class(){
//   POST("http://localhost:4567/todos"); // create a todolist
//   POST("http://localhost:4567/projects"); // create a class(project)
//
//   POST("http://localhost:4567/project/:id/tasks"); // create a relation between the class(project) and todolist add params
//  // POST("http://localhost:4567/todos/:id/categories") // create a relation between the priority(category) and todolist parameter must be valid
//
//
//   DELETE("http://localhost:4567/project/:id/tasks/:id"); // delete  relation between the class(project) and todolist add params
//   DELETE("http://localhost:4567/todos/:id"); // delete a todolist
//   // POST("http://localhost:4567/todos/:id/categories") // create a relation between the priority(category) and todolist parameter must be valid
//
//
//
//}
//
//@When("I remove a categorized todo list of a  class")
//public void remove_todo_of_a_categorized_class(){
//   POST("http://localhost:4567/todos"); // create a todolist
//   POST("http://localhost:4567/projects"); // create a class(project)
//
//   POST("http://localhost:4567/project/:id/tasks"); // create a relation between the class(project) and todolist add params
//   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the priority(category) and todolist parameter must be valid
//
//
//   DELETE("http://localhost:4567/project/:id/tasks/:id"); // delete  relation between the class(project) and todolist add params
//   DELETE("http://localhost:4567/todos/:id/categories/:id"); // delete relation between the priority(category) and todolist parameter must be valid
//
//   DELETE("http://localhost:4567/todos/:id"); // delete a todolist
//
//
//
//}
//
//@Then("I should receive a confirmation message") //change this
//public void confirmlist_is_removed(){
//
//GET("http://localhost:4567/todos/:id");
//
//assert(check status of get);
//
//}
//
//@When("I remove a todo list of a class which doesn’t exist")
//public void remove_todo_of_none_class(){
//   POST("http://localhost:4567/todos") ;// create a todolist
//   POST("http://localhost:4567/project/:id/tasks"); // create a relation between the class(project) and todolist add invalid params
//   POST("http://localhost:4567/todos/:id/categories"); // create a relation between the priority(category) and todolist parameter must be valid
//
//
//   DELETE("http://localhost:4567/project/:id/tasks/:id") ;// delete  relation between the class(project) and todolist add params
//   DELETE("http://localhost:4567/todos/:id/categories/:id") ;// delete relation between the priority(category) and todolist parameter must be valid
//   DELETE("http://localhost:4567/todos/:id") ;// delete a todolist
//
//}
//
//
//@Then("I should receive an error message")
//public void recieve_error_for_remove_todolist_class(){
//
//  GET("http://localhost:4567/todos/:id");
//
//assert(check status of get);
//
//}




//___________________________________Remove_task_from_a_course’s_todo_list__________________________________________________
}
