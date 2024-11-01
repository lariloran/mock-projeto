package com.example;

public class VolumeUtil {
    private AudioManager audioManager;

    public VolumeUtil(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void maximizeVolume(int max) {
        audioManager.setVolume(max);
    }
}
