/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;
import java.sql.Statement;
import entite.questionnaire;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author uid1212
 */
public class questionnaireService implements Service <questionnaire>{

    
    private Connection connexion;
    private int idqst;
    private ResultSet rs;
private Statement ste;

    public questionnaireService() {
         connexion = DataSource.getInstance().getCnx();
    }
    
    
    @Override
    public void insert(questionnaire t) {
        String requete = "insert into  questionnaire (id_coach ) values('" + t.getId_coach() + "')";

        try {
            ste = connexion.createStatement();
            ste.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(questionnaireService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<questionnaire> readAll() {
        String requete="select * from questionnaire";
        List<questionnaire> list=new ArrayList<>();
        try {
            ste=connexion.createStatement();
            rs=ste.executeQuery(requete);
            while(rs.next()){
                idqst= rs.getInt(1);
                questionnaire p=new questionnaire(idqst,rs.getInt(2) );
                
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(questionnaireService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public questionnaire readById(int id) {
        String requete="select * from questionnaire where  id_questionnaire =" + id ;
        questionnaire qst =new questionnaire ();
        try {
            ste=connexion.createStatement();
            rs=ste.executeQuery(requete);
            
                qst =new questionnaire(rs.getInt("id_coach") );
                
            
        } catch (SQLException ex) {
            Logger.getLogger(questionnaireService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qst;
    }

    @Override
    public void delete(int id) {
        String requete="delete from questionnaire where id_questionnaire = " + id;
        
        try {
            ste = connexion.createStatement();
            ste.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(questionnaireService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(questionnaire t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
