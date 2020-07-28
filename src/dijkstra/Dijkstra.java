package dijkstra;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
    
    Comparator<Vetex> comparator= new Comparator<Vetex>() {
        @Override
        public int compare(Vetex t, Vetex t1) {
            if(t.getLabel()>t1.getLabel()){
                return 1;
            }else if(t1.getLabel()>t.getLabel()){
                return -1;
            }
            return 0;
        }
    };
    PriorityQueue<Vetex> aa =new PriorityQueue<>(10,comparator);
    void test(){
        /*aa.add(1);
        aa.add(3);
        aa.add(5);
        aa.add(2);
        aa.add(2);
        while(!aa.isEmpty())
            System.out.println(aa.remove());*/
    }
    public void dijkstra(Vetex[] g, int i) {
        for (int j = 0; j < g[i].getEdges().size(); j++) {
            aa.add(g[i].getEdges().get(j).getIn());
        }
        while(!aa.isEmpty())
        System.out.println(aa.remove().getLabel());
    }
}
