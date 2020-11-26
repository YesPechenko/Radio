package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetStationOverRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    void shouldIncreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation ();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldReducedCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation ();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoNextStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoPrevStationBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithingRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOutofRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWithingRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.minusVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutofRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}