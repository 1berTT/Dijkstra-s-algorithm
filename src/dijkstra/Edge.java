/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

public class Edge {
    Edge(){}
    Edge(Vetex in,int w){
        this.in=in;
        this.weigth=weigth;
    }
    
    private Vetex in;
    private int weigth;

    public Vetex getIn() {
        return in;
    }
    public void setIn(Vetex in) {
        this.in = in;
    }
    public int getWeigth() {
        return weigth;
    }
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}
