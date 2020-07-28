
package dijkstra;

import java.util.ArrayList;

public class Vetex {
    Vetex(){}
    Vetex(int label){
        this.label=label;
    }
    
    private int label;
    private Vetex dad=null;
    private ArrayList<Edge> edges;
    private int value=-1;

    public int getLabel() {
        return label;
    }
    public void setLabel(int label) {
        this.label = label;
    }
    public Vetex getDad() {
        return dad;
    }
    public void setDad(Vetex dad) {
        this.dad = dad;
    }
    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        if(this.edges==null)
            this.edges = edges;
    }
    public void setEdges(Edge x) {
        if(this.edges!=null)
            this.edges.add(x);
    }
    
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
}
