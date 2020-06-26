class Project {
    private String name;
    private String description;
    private double initialCost;

    Project() {
        this("", "");
    }

    Project(String name) {
        this(name, "");
    }

    Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.initialCost = 100;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return this.initialCost;
    }

    public void setCost(double cost) {
        this.initialCost = cost;
    }

    public String elevatorPitch() {
        String strCost = String.format("%.2f", this.initialCost);
        return this.name +" ($"+ strCost + "): " + this.description;
    }
}