package Passport;

import ProductList.Product;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<>();

    public void addPassport(Passport passport){
        this.passports.add(passport);
    }

    public Passport findByNumber(int passportNumber){
        for (Passport passport : passports ){
            if (passport.getPassportNumber() == passportNumber){
                return passport;
            }
        }
        return null;
    }
}
