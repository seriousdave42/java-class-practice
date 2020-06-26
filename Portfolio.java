import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    Portfolio(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public double getPortfolioCost() {
        double totalCost = 0;
        for (Project project : this.projects) {
            totalCost += project.getCost();
        }
        return totalCost;
    }

    public void showPortfolio() {
        for (Project project : this.projects) {
            System.out.println(project.elevatorPitch());
        }
        String strTotalCost = String.format("%.2f", this.getPortfolioCost());
        System.out.println("Total portfolio cost: $" + strTotalCost);
    }
}