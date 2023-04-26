package com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain;

public enum Status {
    STARTED("Started"),
    ENDED("Ended"),
    CANCELED("Canceled");

    private final String displayStatus;

    private Status(String displayStatus) {
              this.displayStatus = displayStatus;
          }

    public String getDisplayStatus() {
        return this.displayStatus;
    }
}
