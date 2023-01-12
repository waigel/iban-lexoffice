package com.waigel.backend.iban;

import com.waigel.backend.exceptions.CountryCodeInvalidException;
import com.waigel.backend.exceptions.Message;
import com.waigel.backend.utils.LatinEncoding;

import java.util.Arrays;
import java.util.Locale;

public record Country(String countryCode, Locale locale) {
    public Country {
        final String[] availableCountryCodes = Locale.getISOCountries();
        if (!Arrays.asList(availableCountryCodes).contains(countryCode))
            throw new CountryCodeInvalidException(Message.COUNTRY_CODE_INVALID);

        if (locale == null)
            locale = Locale.ENGLISH;
    }

    public String getCountryName() {
        return new Locale("", this.countryCode).getDisplayCountry(locale);
    }


    public Integer getAsAlpha2() {
        return Integer.parseInt(LatinEncoding.replace(countryCode));
    }
}
