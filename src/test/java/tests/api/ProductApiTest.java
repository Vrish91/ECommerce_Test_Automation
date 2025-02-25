package tests.api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ProductApiTest extends BaseApiTest {

	@Test
	public void testGetProductById() {
		test.info("Fetching product by ID");

		int productId = 1;

		Response response = given()
				.pathParam("id", productId)
				.when()
				.get("/products/{id}");

		logResponse(response); // Logs API response in Extent Reports

		int statusCode = response.getStatusCode();
		int returnedId = response.jsonPath().getInt("id");

		if (statusCode == 200 && returnedId == productId) {
			test.pass("Successfully fetched product details.");
		} else {
			test.fail("Failed to fetch product details. Status Code: " + statusCode);
		}

		Assert.assertEquals(statusCode, 200, "Status code mismatch");
		Assert.assertEquals(returnedId, productId, "Product ID mismatch");
	}
}
