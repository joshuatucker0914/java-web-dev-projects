package org.launchcode;

public class DVD extends BaseDisc {
    // DVD-specific fields
    private String videoFormat;

    // Constants
    private final String DVD_FORMAT = "DVD-Video";

    // Constructors
    public DVD(String name, int storageCapacity, String contents, String discType, String videoFormat) {
        super(name, storageCapacity, contents, discType);
        this.videoFormat = videoFormat;
    }

    // DVD-specific methods (if needed)
    // ...

    private String generateSampleVideoData() {
        // Implement logic to generate or retrieve video data dynamically
        return "Generated video data";
    }

    @Override
    void updateDurabilityIndicator(int scratches, int physicalDamage) {
        // Access durabilityIndicator through the getter and setter
        int currentDurability = getDurabilityIndicator();
        // Implement specific logic for updating durability indicator for DVD
        currentDurability -= (scratches + physicalDamage);
        if (currentDurability < 0) {
            currentDurability = 0; // Ensure durability does not go below zero
        }
        setDurabilityIndicator(currentDurability);
    }

    // Implementing methods from the interface
    @Override
    public void spin() {
        // Implement spin functionality specific to DVD
        System.out.println("Spinning DVD at 1000 RPM");
    }

    @Override
    public void storeData(String data) {
        // Implement storing data functionality specific to DVD
        String videoData = generateSampleVideoData();
        super.storeData(videoData);
    }

    @Override
    public void writeData(String data) {
        // Implement writing data functionality specific to DVD
        String storedData = super.readData();
        System.out.println("Writing video data to the DVD using a laser");
    }

    @Override
    public String readData() {
        // Implement reading data functionality specific to DVD
        return "Reading video data from the DVD";
    }

    public void printVideoFormat() {
        System.out.println("Video Format: " + videoFormat);
    }

    // Override reportInformation to include video format
    @Override
    public void reportInformation() {
        super.reportInformation();
        printVideoFormat();
    }

    // Getters and Setters
    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

}

// TODO: Implement your custom interface.

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.