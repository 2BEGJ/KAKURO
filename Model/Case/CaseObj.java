package Model.Case;

public class CaseObj extends Case {
    
    private int x;
    private int y;
    private String type;
    private int obj1;
    private int obj2;


    public CaseObj(int x, int y, int obj1, int obj2){
        this.x = x;
        this.y = y;
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.type = "Objectif";
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

    public int getObj1(){
        return this.obj1;
    }

    public int getObj2(){
        return this.obj2;
    }

    

}
