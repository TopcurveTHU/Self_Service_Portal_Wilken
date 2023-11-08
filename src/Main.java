import jakarta.persistence.*;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "Project_V2_JDBC_mysql";
    private static EntityManagerFactory factory;
    public static void main(String[] args) {


        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        // Code für den Zugriff auf die Datenbank

        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}