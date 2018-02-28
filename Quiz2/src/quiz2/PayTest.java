package quiz2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PayTest {

	@Test
	void test() {
		 Pay myCar = new Pay(35000, 10, 60, 0);

		  System.out.println(myCar.MonthPay());
		  System.out.println(myCar.TotalPay());
		  

	}

}
