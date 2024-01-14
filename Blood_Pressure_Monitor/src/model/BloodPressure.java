package model;

public class BloodPressure {
    private int id;
    private String name;
    private String yob;
    private int systolic;
    private int diastolic;

    public BloodPressure(int id, String name, String yob, int systolic, int diastolic) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }
    
    public void calculate() {
        System.out.println("Blood Pressure Category:");

        if (systolic < 120 && diastolic < 80) {
            System.out.println("1. Normal");
        } else if (systolic >= 120 && systolic <= 129 && diastolic < 80) {
            System.out.println("2. Elevated");
        } else if ((systolic >= 130 && systolic <= 139) || (diastolic >= 80 && diastolic <= 89)) {
            System.out.println("3. Hypertension Stage 1");
        } else if (systolic >= 140 || diastolic >= 90) {
            System.out.println("4. Hypertension Stage 2");
        } else {
            System.out.println("5. Hypertensive crisis (requires medical attention)");
        }
    }
    
    public void display() {
        System.out.println("");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yob);
        System.out.println("Systolic: " + systolic);
        System.out.println("Diastolic: " + diastolic);
        calculate();
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
    }
}
