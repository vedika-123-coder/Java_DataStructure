package Graph;

public class Graph {
    int V;
    int[][] adjMatrix;

    Graph(int vertices){
        this.V=vertices;
        adjMatrix=new int[V][V];
    }
    void addEdges(int u,int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
    }
    void printAdjMatrix(){
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
class DriverCode{
    public static void main(String[] args) {
        Graph G=new Graph(6);
        G.addEdges(0,1);
        G.addEdges(0,4);
        G.addEdges(1,5);
        G.addEdges(5,4);
        G.addEdges(4,3);
        G.addEdges(4,1);
        G.addEdges(1,3);
        G.addEdges(1,2);
        G.addEdges(3,2);
        G.printAdjMatrix();
    }
}
