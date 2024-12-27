package mundo;

import DAO.ContinenteDAO;
import java.util.ArrayList;
import models.Continente;

public class Mundo {

    public static void main(String[] args) {
        ContinenteDAO contDao = new ContinenteDAO();
        ArrayList<Continente> listaContinentes = new ArrayList<>();
       listaContinentes = contDao.listar();
       
        for (Continente cont : listaContinentes) {
            System.out.println("Id: " + cont.getId()+ " Nome: " + cont.getNome());
        }
    }
}
