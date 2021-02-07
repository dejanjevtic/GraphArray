
package grapharraylist;
import java.util.ArrayList;
/**
 *
 * @author Dejan
 */

class Graph{
        ArrayList<ArrayList<Integer>> graph;
        int V;
        Graph(int nodes){
            V = nodes;
            graph = new ArrayList<ArrayList<Integer>>();
            for(int i=0; i<V;i++){
                graph.add(new ArrayList<Integer>());
            }
        }
        
        void poveziCvorove(int v, int u){
                graph.get(v).add(u);
                graph.get(u).add(v);
        }

        void stampajGraf(){
            for(int i=0; i<V;i++){
                System.out.print("cvor:" + i);
                for(int x: graph.get(i)) System.out.print("->" +x);
                System.out.println();
            }
        }
}

public class GraphArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph(5);
        g.poveziCvorove(0,1);
        g.poveziCvorove(3,2);
        g.poveziCvorove(2,4);
        g.poveziCvorove(1,4);
        g.poveziCvorove(3,1);
        g.poveziCvorove(2,0);
        g.stampajGraf();
    }
    
}
