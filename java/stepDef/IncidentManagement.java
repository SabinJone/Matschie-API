package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IncidentManagement extends Parent {
	

	@When("Create change request with {string}")
	public void create_change_request_with(String body) {
       request = RestAssured.given().contentType("application/json").when().body(body);
       response = request.post("/change_request");
	}

	@Then("Validate the response as {int}")
	public void validate_the_response_as(Integer readsc) {
	 response.then().assertThat().statusCode(readsc);
	}

	@When("get the request which we created with query parameters with sys_param_field  {string} and {string}")
	public void get_the_request_which_we_created_with_query_parameters_with_sys_param_field_and(String field, String value) {
		 request = RestAssured.given().queryParam(field,value);
		response = RestAssured.get("/change_request");
	}

	@Then("Validate the response for read {int}")
	public void validate_the_response_for_read(Integer creats) {
	   response.then().assertThat().statusCode(creats);
	}
}
