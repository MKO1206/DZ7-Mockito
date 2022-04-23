package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        Assertions.assertEquals(localizationService.locale(Country.RUSSIA), "Добро пожаловать");
        Assertions.assertEquals(localizationService.locale(Country.USA), "Welcome");
        Assertions.assertEquals(localizationService.locale(Country.BRAZIL), "Welcome");
        Assertions.assertEquals(localizationService.locale(Country.GERMANY), "Welcome");
    }
}