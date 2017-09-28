package com.hadihariri.demos.kotlin.clean;

class JavaNulls {
    public void validateCustomer(CustomerJava customer) throws SecurityException {

        if (customer != null) {
            if (customer.getName() != null) {
                if (customer.getName().startsWith("A")) {
                    throw new SecurityException("Names are not allowed to begin with A");
                }
            }
            if (customer.getEmail() != null) {
                if (!customer.getEmail().contains("@gmail.com")) {
                    throw new SecurityException("Only GMail emails are allowed");
                }
            }
        }

    }

    public CustomerJava getCustomerById(int id) {

        if (id > 0) {
            return new CustomerJava(1, "", null);
        } else {
            return null;
        }
    }
}