package test.adapter;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println(" vlc play >>>>>> " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
