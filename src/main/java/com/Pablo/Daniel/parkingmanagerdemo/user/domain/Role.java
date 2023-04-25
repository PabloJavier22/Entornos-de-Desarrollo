package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

public enum Role {
  STUDENT("Alumno"),
    PROFESSOR("Profesor"),
    ADMIN("Admin");

    private final String displayName;
    private Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return this.displayName;
    }
}
