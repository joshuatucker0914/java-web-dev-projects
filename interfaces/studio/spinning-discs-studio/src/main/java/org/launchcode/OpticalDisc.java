package org.launchcode;

public interface OpticalDisc {
    // Constant Fields
    String COMMON_FORMAT = "ISO";

    // Shared Fields
    String name = null;
    int storageCapacity = 0; // in megabytes
    String contents = null;
    String discType = null;

    // Method Signatures
    void spin();
    void storeData(String data);
    void writeData(String data);
    String readData();
    void reportInformation();
}
