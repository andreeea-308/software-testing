package org.example.gettingStarted;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EligibilityServiceTest {

    EligibilityService eligibilityService = new EligibilityService();
    /**
     * Steps to test class EligibilityService:
     * 1. instantiate an object of type EligibilityService
     * 2. see method below and infer what it is supposed to test
     */

    @BeforeEach
    public void willRunBeforeEachTest(){
        System.out.println("Acest mesaj va fi scris inainte de fiecare test:");
    }

    @AfterEach
    public void willRunAfterEachTest(){
        System.out.println("Acest mesaj va fi scris dupa de fiecare test:");
    }

    @BeforeAll
    public static void willRunBeforeAllTest(){
        System.out.println("Acest mesaj va fi scris inainten tuturor testelor:");
    }

    @AfterAll
    public static void willRunAfterAllTest(){
        System.out.println("Acest mesaj va fi scris dupa toate testele:");
    }

    @Test
    public void isEligibleForDiscount_whenClientAgeIsUnder30_thenFalse() {
        /**
         * Let create this test using following structure:
         *
         *  - create a client object that is not eligible for discount
         *  - call method 'isEligibleForDiscount' on class EligibilityService and use client from step above as parameter. save result in a variable
         *  - verify result using static method 'assertFalse' of class Assertions
         */
        Client client = new Client(25, true);
        boolean eligibilityResult = eligibilityService.isEligibleForDiscount(client);
        assertFalse(eligibilityResult);
    }

    @Test
    public void isEligibleForDiscount_whenClientAgeIsOver30_thenTrue() {
        Client client = new Client(35, true);
        boolean eligibilityResult = eligibilityService.isEligibleForDiscount(client);
        assertTrue(eligibilityResult);
    }

    @Test
    public void isEligibleForDiscount_whenClientIsNotLogged_thenThrowException() {
        Client client = new Client(35, false);
        assertThrows(RuntimeException.class, ()  -> eligibilityService.isEligibleForDiscount(client));
    }
    /**
     * Create another 2 tests:
     *  - scenario1: user is eligible
     *  - scenario2: exception is thrown
     */
}