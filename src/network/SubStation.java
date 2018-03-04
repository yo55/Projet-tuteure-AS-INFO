package network;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jimenez
 */
public class SubStation extends Node{
    private int powerIn, powerOut;
    private ArrayList<Group> groups;
    private ArrayList<Line> lines;
    
    private SubStation(){
       super();
       groups = new ArrayList<>();
       lines = new ArrayList<>();
    }
    
    SubStation(String n){
        super(n);
        groups = new ArrayList<>();
        lines = new ArrayList<>();
    }
    
    SubStation(String n, PowerPlant[] plants, Group[] gr){
        super(n);
        groups = new ArrayList<>();
        lines = new ArrayList<>();
        for (PowerPlant p : plants){
            lines.add(new Line(p,this));
        }
        groups.addAll(Arrays.asList(gr));
        updatePowers();
    }
    
    @Override
    public boolean isConnected(){
        return true;
    }
    
    void updateInput(){
        powerIn = 0;
        lines.forEach(lien -> powerIn += lien.getPower());
    }
    void updateOutput(){
        powerOut = 0;
        groups.forEach(g -> powerOut += g.getConsumption());
    }
    
    void updatePowers(){
        updateInput();
        updateOutput();
    }
    /** méthodes acessibles **/
    void addGroups(Group... gr){
        groups.addAll(Arrays.asList(gr));
    }
    void addLines(Line... li){
        lines.addAll(Arrays.asList(li));
    }
    
    /** getters/setters **/
    public int getPowerIn() {
        return powerIn;
    }

    public int getPowerOut() {
        return powerOut;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }
}