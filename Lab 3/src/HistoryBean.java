import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class HistoryBean {

    private EntityManager em = DataBase.em;

    public List<Result> getResults() {
        DataBase.em.getTransaction().begin();
        List<Result> list = DataBase.em.createQuery("SELECT c FROM Result c", Result.class).getResultList();
        DataBase.em.getTransaction().commit();
        return list;
    }

    private List<Result> results;

    public HistoryBean() {
        results = new ArrayList<Result>();
    }

}
