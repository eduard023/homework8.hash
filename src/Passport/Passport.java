package Passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int passportNumber;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final LocalDate localDate;

    public Passport(int passportNumber, String surname, String name, String patronymic, LocalDate localDate) {
        this.passportNumber = passportNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.localDate = localDate;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
