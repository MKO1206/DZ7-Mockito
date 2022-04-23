package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class GeoServiceImplTest {

    @Test
    void byIpUSA() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        String ip = "96.20.55.34";
        Assertions.assertEquals(Country.USA, geoService.byIp(ip).getCountry());
    }

    @Test
    void byIpRussia() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        String ip = "172.15.46.20";
        Assertions.assertEquals(Country.RUSSIA, geoService.byIp(ip).getCountry());
    }


}