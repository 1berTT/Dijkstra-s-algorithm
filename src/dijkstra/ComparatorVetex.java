package dijkstra;

import java.util.Comparator;

public class ComparatorVetex implements Comparator<Vetex>{

    @Override
    public int compare(Vetex t, Vetex t1) {
        if(t.getLabel()>t1.getLabel()){
            return 1;
        }else if(t1.getLabel()>t.getLabel()){
            return -1;
        }
        return 0;    
    }
    
}
