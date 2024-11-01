package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {

    @Mock
    private AudioManager audioManager;

    @InjectMocks
    private VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
        int maxVolume = 100;
        volumeUtil.maximizeVolume(maxVolume);

        verify(audioManager, times(1)).setVolume(maxVolume);
    }
}
