package org.example.gettingStarted;

public class EligibilityService {

    private static final int MINIMUM_AGE_FOR_DISCOUNT = 30;

    public boolean isEligibleForDiscount(Client client) {
        if (!client.isLogged())
            throw new RuntimeException("Client is not logged!");
        return client.getAge() > MINIMUM_AGE_FOR_DISCOUNT;
    }
}
