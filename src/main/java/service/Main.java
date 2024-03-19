package service;
import model.Person;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {
//    public static void main(String[] args) {
//        Configuration conf = new Configuration().configure ("hibernate.cfg.xml");
//        conf.addAnnotatedClass ( Person.class );
//        SessionFactory configuration = conf.buildSessionFactory ();
//    }


    public static void main(String[] args) {
        StandardServiceRegistry build = new StandardServiceRegistryBuilder ().configure ().build ();
        new MetadataSources ( build).addAnnotatedClass ( Person.class ).buildMetadata ().buildSessionFactory ();

    }
}
