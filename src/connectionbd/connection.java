    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionbd;

import entite.questionnaire;
import service.questionnaireService;
/**
 *
 * @author uid1212
 */
public class connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        questionnaire qst=new questionnaire(6);
        questionnaireService serv = new questionnaireService();
        serv.insert(qst);
        serv.readAll().forEach(System.out::println);
        
    }

    
    
}
