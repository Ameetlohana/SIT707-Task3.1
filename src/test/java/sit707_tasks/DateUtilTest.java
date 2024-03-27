package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s222332999";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Ameet";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		 DateUtil date = new DateUtil(1, 1, 2024);
		    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(1, date.getMonth()); // January
		    Assert.assertEquals(2, date.getDay()); // 2nd day
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth()); // December
	    Assert.assertEquals(31, date.getDay()); // 31st day
		
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("testMaxFebruary28ShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth()); // February
	    Assert.assertEquals(29, date.getDay()); // 29th day (leap year)
	}
	
	@Test
	public void testMaxFebruary28ShouldDecrementToFebruary27() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("testMaxFebruary28ShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth()); // February
	    Assert.assertEquals(27, date.getDay()); // 27th day
	}
	
	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("testMaxMarch31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth()); // April
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	
	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("testMaxMarch31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth()); // March
	    Assert.assertEquals(30, date.getDay()); // 30th day
	}
	
	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("testMaxApril30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth()); // May
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("testMaxApril30ShouldDecrementToApril29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth()); // April
	    Assert.assertEquals(29, date.getDay()); // 29th day
	}
	
	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("testMaxMay31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth()); // June
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("testMaxMay31ShouldDecrementToMay30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth()); // May
	    Assert.assertEquals(30, date.getDay()); // 30th day
	}
	
	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("testMaxJune30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth()); // July
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	
	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("testMaxJune30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth()); // June
	    Assert.assertEquals(29, date.getDay()); // 29th day
	}
	
	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("testMaxJuly31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth()); // August
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("testMaxJuly31ShouldDecrementToJuly30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth()); // July
	    Assert.assertEquals(30, date.getDay()); // 30th day
	}
	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("testMaxAugust31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth()); // September
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("testMaxAugust31ShouldDecrementToAugust30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth()); // August
	    Assert.assertEquals(30, date.getDay()); // 30th day
	}
	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("testMaxSeptember30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth()); // October
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("testMaxSeptember30ShouldDecrementToSeptember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth()); // September
	    Assert.assertEquals(29, date.getDay()); // 29th day
	}
	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("testMaxOctober31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth()); // November
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("testMaxOctober31ShouldDecrementToOctober30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth()); // October
	    Assert.assertEquals(30, date.getDay()); // 30th day
	}
	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("testMaxNovember30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth()); // December
	    Assert.assertEquals(1, date.getDay()); // 1st day
	}
	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("testMaxNovember30ShouldDecrementToNovember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth()); // November
	    Assert.assertEquals(29, date.getDay()); // 29th day
	}
	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1NextYear() {
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("testMaxDecember31ShouldIncrementToJanuary1NextYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth()); // January
	    Assert.assertEquals(1, date.getDay()); // 1st day
	    Assert.assertEquals(2025, date.getYear()); // Next year
	}
	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("testMaxDecember31ShouldDecrementToDecember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth()); // December
	    Assert.assertEquals(30, date.getDay()); // 30th day
	}
}
