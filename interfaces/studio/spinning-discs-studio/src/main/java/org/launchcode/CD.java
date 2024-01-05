package org.launchcode;

public class CD extends BaseDisc {
    // CD-specific fields
    private String audioFormat;

    // Constants
    private final String CD_FORMAT = "Red Book";

    // Constructors
    public CD(String name, int storageCapacity, String contents, String discType, String audioFormat) {
        super(name, storageCapacity, contents, discType);
        this.audioFormat = audioFormat;
    }

    private String generateSampleAudioData() {
        // Implement logic to generate or retrieve audio data dynamically
        return "Generated audio data";
    }

    @Override
    void updateDurabilityIndicator(int scratches, int physicalDamage) {
        // Access durabilityIndicator through the getter and setter
        int currentDurability = getDurabilityIndicator();
        // Implement specific logic for updating durability indicator for CD
        currentDurability -= (scratches * 2 + physicalDamage * 3);
        if (currentDurability < 0) {
            currentDurability = 0; // Ensure durability does not go below zero
        }
        setDurabilityIndicator(currentDurability);
    }

    // Implementing methods from the interface
    @Override
    public void spin() {
        // Implement spin functionality specific to CD
        System.out.println("Spinning CD at 500 RPM");
    }

    @Override
    public void storeData(String data) {
        // Implement storing data functionality specific to CD
        String audioData = generateSampleAudioData();
        super.storeData(audioData);
    }

    @Override
    public void writeData(String data) {
        // Implement writing data functionality specific to CD
        String storedData = super.readData();
        System.out.println("Writing audio data to the CD using a laser");
    }

    @Override
    public String readData() {
        // Implement reading data functionality specific to CD
        return "Reading audio data from the CD";
    }

    // CD-specific method to print audio format
    public void printAudioFormat() {
        System.out.println("Audio Format: " + audioFormat);
    }

    // Override reportInformation to include audio format
    @Override
    public void reportInformation() {
        super.reportInformation();
        printAudioFormat();
    }

    // Getters and Setters
    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }
}
