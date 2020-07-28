package dijkstra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        Scanner scan=null;
        try {
            scan = new Scanner(new File("/home/jardel/NetBeansProjects/Dijkstra/src/dijkstra/grafo.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println("deu merda isso aí");
        }
        Vetex g[]=new Vetex[scan.nextInt()];
        for (int i = 0; i < g.length; i++) {
            g[i]=new Vetex(i);
        }
        while(scan.hasNext()){
            int in,out,weight;
            out=scan.nextInt();
            in=scan.nextInt();
            weight=scan.nextInt();
            //System.out.println(out+"---"+weight+"--->"+in);
            if(g[out].getEdges()==null){
                ArrayList<Edge> es= new ArrayList<>();
                Edge e= new Edge();
                e.setIn(g[in]);
                e.setWeigth(weight);
                es.add(e);
                g[out].setEdges(es);
            }else{
                ArrayList<Edge> es= g[out].getEdges();
                Edge e= new Edge();
                e.setIn(g[in]);
                e.setWeigth(weight);
                es.add(e);
                g[out].setEdges(es);
            }
        }
        Dijkstra d= new Dijkstra();
        d.dijkstra(g,0);
        d.test();
    }
}
/*Comparator<Integer> comparator;
        comparator = (Integer t, Integer t1) -> {
            if(t>t1){
                return 1;
            }else if(t1>1){
                return -1;
            }
            return 0;
        };*/
/*
        ArrayList<ArrayList<Vetex>> list = new ArrayList<ArrayList<Vetex>>();
        ArrayList<Vetex> listV= new ArrayList<>();
        int size=scan.nextInt();
        for (int i=0;i<size;i++) {
            list.add(new ArrayList<Vetex>());
            list.get(i).add(new Vetex(i));
            
        }
        
        while(scan.hasNext()){
            int in,out,weight;
            out=scan.nextInt();
            in=scan.nextInt();
            weight=scan.nextInt();
            System.out.println(out+"---"+weight+"--->"+in);
            list.get(out).add(list.get(in).get(0));
        }
        
        
        
        list[0].add(list[1].get(0));
        list[0].add(list[2].get(0));
        list[0].add(list[5].get(0));
        list[1].add(list[2].get(0));
        list[1].add(list[3].get(0));
        list[2].add(list[3].get(0));
        list[2].add(list[5].get(0));
        list[3].add(list[4].get(0));
        list[5].add(list[4].get(0));
        */