package cowin;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.cowin.Center;
import com.main.cowin.CowinPayload;
import com.main.cowin.Session;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class book_appoinment {

	DateTimeFormatter dtf;
	LocalDate currentDate;

	@Test(priority = 1)
	public void check_vacination_same_day() {

		HashMap<String, String> val = new HashMap<String, String>();
		val.put("district_id", "199");
		val.put("date", getcurrent_date());

		Response response = RestAssured.given().params(val).contentType(ContentType.JSON).when()
				.get("https://www.cowin.gov.in/api/v2/appointment/sessions/public/calendarByDistrict/");
		CowinPayload response_setup = response.as(com.main.cowin.CowinPayload.class);

		send_sms();
		
		List<Center> getcenter = response_setup.getCenters();

		if (getcenter.size() > 0) {
			for (int i = 0; i < getcenter.size(); i++) {

				List<Session> getsessions = getcenter.get(i).getSessions();

				if (getcenter.get(i).getFeeType().equals("Free")) {

					if (getsessions.get(0).getAvailableCapacity() > 0 && getsessions.get(0).getMinAgeLimit() == 45) {

						send_sms();
					}

				}

			}
		}

	}

	@Test(priority = 2)
	public void check_vacination_nextday() {

		HashMap<String, String> val = new HashMap<String, String>();
		val.put("district_id", "199");
		val.put("date", getnext_day());

		Response response = RestAssured.given().params(val).contentType(ContentType.JSON).when()
				.get("https://www.cowin.gov.in/api/v2/appointment/sessions/public/calendarByDistrict/");

		CowinPayload response_setup = response.as(com.main.cowin.CowinPayload.class);

		List<Center> getcenter = response_setup.getCenters();

		if (getcenter.size() > 0) {

			for (int i = 0; i < getcenter.size(); i++) {

				List<Session> getsessions = getcenter.get(i).getSessions();

				if (getcenter.get(i).getFeeType().equals("Free")) {

					if (getsessions.get(0).getAvailableCapacity() > 0 && getsessions.get(0).getMinAgeLimit() == 45) {
						send_sms();
					}

				}

			}
		}
	}

	public void send_sms() {

		HashMap<String, String> val = new HashMap<String, String>();
		val.put("authorization", "A4WP1BbvEewXpmoCQ02alYMjxFnf5kD8LTthVgcKS7Uq9IzJu3er8zwMNF0c59dVGtXja2qiPnZpJEBS");
		val.put("route", "q");
		val.put("message",
				"Hello,this%20is%20a%20test%20message%20to%20notify%20vacine%20is%20available%20in%20faridabad.");
		val.put("language", "english");
		val.put("flash", "0");
		val.put("numbers", "9971063417");

		Response response = RestAssured.given().params(val).contentType(ContentType.JSON).when().get("https://www.fast2sms.com/dev/bulkV2");

	}

	public String getcurrent_date() {
		dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		currentDate = LocalDate.now();

		return dtf.format(currentDate);

	}

	public String getnext_day() {

		LocalDate nextDate = currentDate.plusDays(1);

		return dtf.format(nextDate);

	}

}
