//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

class Lab13A {
    public static void main(String[] args){

        //create buildings
        BuildingBlueprint building1 = new BuildingBlueprint();
        BuildingBlueprint building2 = new BuildingBlueprint(30, 30, (float)0.75);

        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + building1.getIntStories() + " floors, " + building1.getIntApart() + " apartments, and is " + (int) (building1.getFltOcc() * 100) + "% occupied. Full? " + building1.getBoolFull());
        System.out.println("Building 2 has " + building2.getIntStories() + " floors, " + building2.getIntApart() + " apartments, and is " + (int) (building2.getFltOcc() * 100) + "% occupied. Full? " + building2.getBoolFull());
        System.out.println("Many years pass.");

        //set new occupation and final output
        building1.setFltOcc(0);
        building2.setFltOcc(1);

        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + building1.getIntStories() + " floors, " + building1.getIntApart() + " apartments, and is " + (int) (building1.getFltOcc() * 100) + "% occupied. Full? " + building1.getBoolFull());
        System.out.println("Building 2 has " + building2.getIntStories() + " floors, " + building2.getIntApart() + " apartments, and is " + (int) (building2.getFltOcc() * 100) + "% occupied. Full? " + building2.getBoolFull());
        System.out.println("Looks like people prefer taller buildings.");

    }
}