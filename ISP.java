
/**
 * Interface for features relevant to a book reader.
 */
public interface BookReader {
    void readBook();
}

/**
 * Interface for features relevant to a media player.
 */
public interface MediaPlayer {
    void playMedia();
}

/**
 * Implements a device that supports both reading and media playback.
 */
public class SmartDevice implements BookReader, MediaPlayer {
    /**
     * Read a book on the device.
     */
    @Override
    public void readBook() {
        System.out.println("Reading book...");
    }

    /**
     * Play media on the device.
     */
    @Override
    public void playMedia() {
        System.out.println("Playing media...");
    }
}
