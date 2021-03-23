package Model.Grille;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Model.Case.*;


public class Grille{

    private int largeur;
    private int longueur;
    private ArrayList<Case> grille;
    private String fileName;

    public Grille(int largeur, int longueur, String fileName){
        this.largeur = largeur;
        this.longueur = longueur;
        this.fileName = fileName;
        this.grille = new ArrayList<>();
    }

    public void setLargeur(int L){
      this.largeur = L;
    }

    public void setLongeur(int L){
      this.longueur = L;
    }

    public void gridMaker(){
        try {
            File myObj = new File(this.fileName);
            Scanner myReader = new Scanner(myObj);
            int L = 0;
            while (myReader.hasNextLine()) {
              L += 1;
              String ligne = myReader.nextLine();
              String[] cases = ligne.split("-");
              setLargeur(cases.length);
              for(String caseTmp : cases){
                  if (!caseTmp.contains("/")) {
                    int tmp = Integer.parseInt(caseTmp);
                    if(tmp == -1){
                      this.grille.add(new CaseBlock(0,0));
                    }
                    else{
                      this.grille.add(new CaseWrite(0, 0, tmp));
                    }
                  }
                  else{
                    String[] tmpN = caseTmp.split("/");
                    int obj1 = Integer.parseInt(tmpN[0]);
                    int obj2 = Integer.parseInt(tmpN[1]);
                    this.grille.add(new CaseObj(0, 0, obj1, obj2));
                  }
                  
              }
            }
            setLongeur(L);
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    

}