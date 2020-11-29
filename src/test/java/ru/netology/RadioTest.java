package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    void shouldSetStationAndVolumeWithinRange() {
        Radio radio = new Radio(5, 8);
        assertEquals(5, radio.getCurrentRadioStation());
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldSetStationOverRange() {
        radio.setCurrentRadioStation (10);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetStationBelowRange() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    void shouldIncreaseCurrentStation() {
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation ();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldReducedCurrentStation() {
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation ();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoNextStationAfterMax() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoPrevStationBeforeMin() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeOutOfRange() {
        radio.setCurrentVolume(15);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void shouldIncreaseVolumeWithingRange() {
        radio.setCurrentVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOutofRange() {
        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWithingRange() {
        radio.setCurrentVolume(5);
        radio.minusVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutofRange() {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }



}