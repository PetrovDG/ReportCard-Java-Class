package com.sitost.reportcard;

public class ReportCard {

    //The student name (stName) and last name (stLastName) are set as strings.
    private String stName;
    private String stLastName;

    //The students' assessments are according to the six-point system where the minimum score is 2 and the maximum is 6.
    // Student grades are are set as integer variables.

    private int stGeographyGrade;
    private int stMathGrade;
    private int stChemistryGrade;
    private int stPhysicsGrade;
    private int stBiologyGrade;
    private int stHistoryGrade;
    private int stLiteratureGrade;

    //Constructor
    //@param name - Student name
    //@param lastName - Student last name
    //@param geographyGrade - Student Geography grade
    //@param mathGrade - Student Math grade
    //@param chemistryGrade - Student Chemistry grade
    //@param physicsGrade - Student Physics grade
    //@param biologyGrade - Student Biology grade
    //@param historyGrade - Student History grade
    //@param literatureGrade - Student Literature grade

    public ReportCard(String name, String lastName, int geographyGrade, int mathGrade, int chemistryGrade, int physicsGrade,
                      int biologyGrade, int historyGrade, int literatureGrade) {

        //Initializing variables
        stName = name;
        stLastName = lastName;
        stGeographyGrade = geographyGrade;
        stMathGrade = mathGrade;
        stChemistryGrade = chemistryGrade;
        stPhysicsGrade = physicsGrade;
        stBiologyGrade = biologyGrade;
        stHistoryGrade = historyGrade;
        stLiteratureGrade = literatureGrade;
    }

    //Getters
    public String getName() {
        return stName;
    }

    public String getLastName() {
        return stLastName;
    }

    public int getGeographyGrade() {
        return stGeographyGrade;
    }

    public int getMathGrade() {
        return stMathGrade;
    }

    public int getChemistryGrade() {
        return stChemistryGrade;
    }

    public int getPhysicsGrade() {
        return stPhysicsGrade;
    }

    public int getBiologyGrade() {
        return stBiologyGrade;
    }

    public int getHistoryGrade() {
        return stHistoryGrade;
    }

    public int getLiteratureGrade() {
        return stLiteratureGrade;
    }

    //Setters
    public void setStudentName(String name) {
        stName = name;
    }

    public void setStudentLastName(String name) {
        stLastName = name;
    }

    public void setGeographyGrade(int grade) {
        stGeographyGrade = grade;
    }

    public void setMathGrade(int grade) {
        stMathGrade = grade;
    }

    public void setChemistryGrade(int grade) {
        stChemistryGrade = grade;
    }

    public void setPhysicsGrade(int grade) {
        stPhysicsGrade = grade;
    }

    public void setBiologyGrade(int grade) {
        stBiologyGrade = grade;
    }

    public void setHistoryGrade(int grade) {
        stHistoryGrade = grade;
    }

    public void setLiteratureGrade(int grade) {
        stLiteratureGrade = grade;
    }

    // toString() method, which gives a human-readable String representing the data stored in the report card.
    @Override
    public String toString() {
        return "Name: " + stName + " " + stLastName +
                "\nGeography: " + stGeographyGrade +
                "\nMath: " + stMathGrade +
                "\nChemistry: " + stChemistryGrade +
                "\nPhysics: " + stPhysicsGrade +
                "\nBiology: " + stBiologyGrade +
                "\nHistory: " + stHistoryGrade +
                "\nLiterature: " + stLiteratureGrade;
    }
}

