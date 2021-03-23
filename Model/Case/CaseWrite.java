package Model.Case;

public class CaseWrite extends Case{

    private int x;
    private int y;
    private String type;
    private int number;

    public CaseWrite(int x,int y,int number){
        this.x = x;
        this.y = y;
        this.number = number;
        this.type = "Write";
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getNumber(){
        return this.number;
    }

    public String getType(){
        return this.type;
    }

    public void setNumber(int number){
        this.number = number;
    }

}