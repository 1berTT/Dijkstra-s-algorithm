package dijkstra;

import java.util.ArrayList;

public class Graph {
    Graph(){}
    Graph(int g[][]){
        matrix=g;
    }
    Graph(ArrayList<Vetex> g[]){
        list=g;
    }
    Graph(int gM[][],ArrayList<Vetex> gL[]){
        matrix=gM;
        list=gL;
    }
    
    private int matrix[][];
    private ArrayList<Vetex> list[];
    
    
    
    
    
    
    
    public void tranformMatrixToList(){
        
    }
    public void tranformListToMatrix(){
        
    }
    
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public ArrayList<Vetex>[] getList() {
        return list;
    }

    public void setList(ArrayList<Vetex>[] list) {
        this.list = list;
    }
    
}
