package Model.Case;

public class CaseBlock extends Case{

    private int x;
    private int y;
    private String type;

    public CaseBlock(int x, int y){
        this.x = x;
        this.y = y;
        this.type = "Block";
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String getType(){
        return this.type;
    }
    
}
