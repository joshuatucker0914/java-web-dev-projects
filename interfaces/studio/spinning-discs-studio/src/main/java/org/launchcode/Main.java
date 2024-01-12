package org.launchcode;

public class Main {
    public static void main(String[] args) {
        // Create a CD object
        CD myCd = new CD("AudioCD", 700, "Music Tracks", "CD-R", "Audio Format");

        // Create a DVD object
        DVD myDvd = new DVD("MovieDVD", 4700, "Movie Content", "DVD-R", "Video Format");

        // Run behaviors for CD
        System.out.println("CD Behaviors:");
        myCd.spin();
        myCd.storeData("");
        myCd.writeData("");
        String cdData = myCd.readData();
        System.out.println(cdData);
        myCd.reportInformation();
        myCd.updateDurabilityIndicator(5, 2); // Example values for scratches and physical damage
        System.out.println("Updated Durability Indicator: " + myCd.getDurabilityIndicator());

        System.out.println();

        // Run behaviors for DVD
        System.out.println("DVD Behaviors:");
        myDvd.spin();
        myDvd.storeData("");
        myDvd.writeData("");
        String dvdData = myDvd.readData();
        System.out.println(dvdData);
        myDvd.reportInformation();
        myDvd.updateDurabilityIndicator(3, 1); // Example values for scratches and physical damage
        System.out.println("Updated Durability Indicator: " + myDvd.getDurabilityIndicator());
    }
}