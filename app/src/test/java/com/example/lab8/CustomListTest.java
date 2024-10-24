package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.getCount(), listSize + 1);
    }


    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        City city2 = new City("Vancouver", "BC");
        assertEquals(list.countCities(), 0);
        list.addCity(city);
        assertEquals(list.countCities(), 1);
        list.addCity(city2);
        assertEquals(list.countCities(), 2);
    }

}
