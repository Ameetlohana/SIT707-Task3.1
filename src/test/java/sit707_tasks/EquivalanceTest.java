package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class EquivalanceTest {
	@Test
    public void testD1WithinRange() {
        // Test a day within the range 1 to 28
        DateUtil date = new DateUtil(15, 4, 2024); // 15th April 2024
        Assert.assertEquals(15, date.getDay());
    }

    @Test
    public void testD2Day29() {
        // Test day 29
        DateUtil date = new DateUtil(29, 2, 2024); // 29th February 2024 (leap year)
        Assert.assertEquals(29, date.getDay());
    }

    @Test
    public void testD3Day30() {
        // Test day 30
        DateUtil date = new DateUtil(30, 6, 2024); // 30th June 2024
        Assert.assertEquals(30, date.getDay());
    }

    @Test
    public void testD4Day31() {
        // Test day 31
        DateUtil date = new DateUtil(31, 12, 2024); // 31st December 2024
        Assert.assertEquals(31, date.getDay());
    }

    // Month Equivalence Classes
    @Test
    public void testM1Months30Days() {
        // Test months with 30 days
        DateUtil date = new DateUtil(15, 4, 2024); // 15th April 2024
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testM2Months31Days() {
        // Test months with 31 days
        DateUtil date = new DateUtil(15, 1, 2024); // 15th January 2024
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testM3FebruaryLeapYear() {
        // Test February in a leap year
        DateUtil date = new DateUtil(29, 2, 2024); // 29th February 2024 (leap year)
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testM3FebruaryNonLeapYear() {
        // Test February in a non-leap year
        DateUtil date = new DateUtil(28, 2, 2023); // 28th February 2023 (non-leap year)
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    // Year Equivalence Classes
    @Test
    public void testY1NonLeapYear() {
        // Test a year without a leap year
        DateUtil date = new DateUtil(15, 4, 2023); // 15th April 2023
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testY2LeapYear() {
        // Test a leap year
        DateUtil date = new DateUtil(15, 4, 2024); // 15th April 2024 (leap year)
        Assert.assertEquals(2024, date.getYear());
    }
}

