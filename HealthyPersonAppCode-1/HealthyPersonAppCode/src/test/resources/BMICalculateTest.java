import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.healthypersonapp.BMICalculator;
import com.healthypersonapp.Person;

public class BMICalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void  should_ReturnTrue_When_DietRecommended() {
		assertEquals(BMICalculator.isDietRecommended(120.0, 2.1),true);
		//Diet is recommended because BMI>threshold value.
	}
	@Test
	public void  should_ReturnFalse_When_DietNotRecommended() {
	assertEquals(BMICalculator.isDietRecommended(28.0, 2.0),false);
	}
	@Test(expected=ArithmeticException.class)
	public void should_ThrowArithmeticException_When_HeightZero() {
		BMICalculator.isDietRecommended(120.0, 0.0);
	}
	@Test
	public void  should_ReturnPersonWithWorstBMI_When_PersonListNotEmpty() {
		List<Person> persons=Arrays.asList(new Person(70.0,0.0),new Person(75.0,2.2),
				new Person(80.0,2.3),new Person(85.0,2.4));
		BMICalculator.findPersonWithWorstBMI(persons);
	}

}
