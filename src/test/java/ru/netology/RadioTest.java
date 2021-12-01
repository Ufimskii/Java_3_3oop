package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

// Тесты на количество станций
    @Test
    public void shouldNumberOfStation() {
        Radio radio = new Radio(10);
        radio.setNumberOfStations(8);
        assertEquals(8, radio.getNumberOfStations());

    }
    @Test
    public void shouldNumberOfStationDefault() {
        Radio radio = new Radio();
        assertEquals(10, radio.getNumberOfStations());

    }

    //Тесты установки станции
    @Test
    public void shouldUpCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        assertEquals(8, radio.upStation());

    }

    @Test
    public void shouldDownCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        assertEquals(6, radio.downStation());

    }

    @Test
    public void shouldUpMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        assertEquals(0, radio.upStation());

    }

    @Test
    public void shouldDownMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        assertEquals(9, radio.downStation());

    }

    //Тесты смены громкости
    @Test
    public void shouldUpCurrentValume() {
        Radio radio = new Radio();
        radio.setMaxValume(100);
        radio.setMinValume(0);
        radio.setCurrentValume(5);
        assertEquals(6, radio.upVolume());

    }

    @Test
    public void shouldDownCurrentValume() {
        Radio radio = new Radio();
        radio.setMaxValume(100);
        radio.setMinValume(0);
        radio.setCurrentValume(5);
        assertEquals(4, radio.downVolume());

    }

    @Test
    public void shouldUpMaxValume() {
        Radio radio = new Radio();
        radio.setMaxValume(100);
        radio.setMinValume(0);
        radio.setCurrentValume(100);
        assertEquals(100, radio.upVolume());

    }

    @Test
    public void shouldDownMinValume() {
        Radio radio = new Radio();
        radio.setMaxValume(100);
        radio.setMinValume(0);
        radio.setCurrentValume(0);
        assertEquals(0, radio.downVolume());

    }

}