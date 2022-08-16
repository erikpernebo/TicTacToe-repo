public class GridSquare {
    public int state;
    public int pos;

    public GridSquare(int x){
        pos = x;
        state = -1;
    }
    public char drawSpace() {
        if (state == 0) {
     return 'X'; 
    }
    if (state == 1) { 
     return '0';
    } 
    return Integer.toString(pos).charAt(0); 

    }
}
