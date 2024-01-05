package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    // Shared Fields
    private String name;
    private int storageCapacity;
    private String contents;
    private String discType;
    private int durabilityIndicator;

    // Constructors
    public BaseDisc(String name, int storageCapacity, String contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
        this.durabilityIndicator = 100; // Initialize durability to maximum
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getDurabilityIndicator() {
        return durabilityIndicator;
    }

    public void setDurabilityIndicator(int durabilityIndicator) {
        this.durabilityIndicator = durabilityIndicator;
    }

    // Shared Method
    public void reportInformation() {
        System.out.println("Name: " + name);
        System.out.println("Storage Capacity: " + storageCapacity + " MB");
        System.out.println("Contents: " + contents);
        System.out.println("Disc Type: " + discType);
        System.out.println("Durability Indicator: " + durabilityIndicator);
    }

    // Abstract Method
    abstract void updateDurabilityIndicator(int scratches, int physicalDamage);

    // Implementing methods from the interface
    @Override
    public void spin() {
        // Implement spin functionality
    }

    @Override
    public void storeData(String data) {
        // Implement storing data functionality
    }

    @Override
    public void writeData(String data) {
        // Implement writing data functionality
    }

    @Override
    public String readData() {
        // Implement reading data functionality
        return null;
    }
}