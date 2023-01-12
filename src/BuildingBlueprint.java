//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class BuildingBlueprint {

    //declare variables
    private int intStories;
    private int intApart;
    private float fltOcc;
    private boolean boolFull;

    //constructors
    public  BuildingBlueprint() {
        intStories = 10;
        intApart = 20;
        fltOcc = 1;
        boolFull = true;
    }
    public BuildingBlueprint(int a, int b, float c) {
        intStories = a;
        intApart = b;
        fltOcc = c;
        if (fltOcc < 1) {
            boolFull = false;
        }
        else {
            boolFull = true;
        }

    }

    //setter and getters
    public void setFltOcc(float a) {
        if (a >= 0 && a <= 1) {
            fltOcc = a;
        }
        if (fltOcc < 1) {
            boolFull = false;
        }
        else {
            boolFull = true;
        }
    }

    public float getFltOcc() {
        return fltOcc;
    }

    public int getIntStories() {
        return intStories;
    }

    public int getIntApart() {
        return intApart;
    }

    public boolean getBoolFull() {
        return boolFull;
    }
}