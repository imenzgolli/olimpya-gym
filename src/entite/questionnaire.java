/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;




/**
 *
 * @author uid1212
 */
public class questionnaire {
    private int id_questionnaire  ;
    private int id_coach ;

    public questionnaire() {
    }
public questionnaire(int id_coach) {
    this.id_coach = id_coach;
    }
    public questionnaire( int id_questionnaire,int id_coach) {
        this.id_questionnaire=id_questionnaire;
        this.id_coach = id_coach;
    }

    public void setId_coach(int id_coach) {
        this.id_coach = id_coach;
    }

   

    public int getId_coach() {
        return id_coach;
    }



    @Override
    public String toString() {
        
        return " " + this.id_questionnaire + " "+this.id_coach ;
    }
    
}
