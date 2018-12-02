public class CrackerBarrel{
    private int[][] moveList = { {0,1,3}, {0,2,5}, {1,3,6}, {1,4,8},
    {2,4,7}, {2,5,9}, {3,6,10}, {3,7,12}, {4,7,11}, {4,8,13},
    {5,8,12}, {5,9,14}, {3,4,5}, {6,7,8}, {7,8,9}, {10,11,12},
    {11,12,13}, {12,13,14} };
    private int[] barrel = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* solve */
    public void solve(){
        int[] m;
        for(int i = 0; i < 18; i++){
            m = moveList[i];
            int[] o = { m[2], m[1], m[0] };
            if(canMove(m)){
                move(m);
            }//if
            else if(canMove(o)){
                move(o);
            }//if
        }//for
    }//solve

    /* canMove */
    public boolean canMove(int[] m){
        return (m[0] == 1 && m[1] == 1 && m[2] == 0);
    }//canMove

    /* move */
    public void move(int[] m){
        barrel[m[0]] = 0;
        barrel[m[1]] = 0;
        barrel[m[2]] = 1;
    }//move   

    public int[] getBarrel(){
        return barrel;
    }

    /* main */
    public static void main(String[] args){
        CrackerBarrel c = new CrackerBarrel();
        c.solve();
        int[] b = c.getBarrel();
        for(int i = 0; i < 15; i++){
            System.out.print(b[i] + " ");
        }
    }
}
