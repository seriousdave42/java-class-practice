import java.util.ArrayList;;

public class ProjectTest {
    public static void main(String[] args) {
        Project evilProject1 = new Project("Evil Project 1", "Murder all puppies");
        Project evilProject2 = new Project("Evil Project 2", "Murder all kittens");
        Project evilProject3 = new Project("Evil Project 3", "Murder all penguins");
        Project goodProject1 = new Project("Good Project 1", "Grant all puppies immortality");
        Project goodProject2 = new Project("Good Project 2", "Grant all kittens immortality");
        Project goodProject3 = new Project("Good Project 3", "Grant all penguins immortality");
        ArrayList<Project> evilProjects = new ArrayList<Project>();
        ArrayList<Project> goodProjects = new ArrayList<Project>();
        evilProjects.add(evilProject1);
        evilProjects.add(evilProject2);
        evilProjects.add(evilProject3);
        goodProjects.add(goodProject1);
        goodProjects.add(goodProject2);
        goodProjects.add(goodProject3);
        Portfolio evilPortfolio = new Portfolio(evilProjects);
        Portfolio goodPortfolio = new Portfolio(goodProjects);
        goodProject3.setCost(20000);
        evilPortfolio.showPortfolio();
        goodPortfolio.showPortfolio();
    }
}