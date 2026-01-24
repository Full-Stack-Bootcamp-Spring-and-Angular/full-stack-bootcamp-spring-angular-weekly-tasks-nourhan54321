import com.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();
        Session session= sessionFactory.getCurrentSession();

        //identify student
        Student student1=new Student(1,"Nourhan","nour@gmail.com");
        /// /add
//        session.beginTransaction();
//        session.save(student1);
//        session.getTransaction().commit();


        /// select by id;
//        session.beginTransaction();
//        Student student=session.get(Student.class,1);
//
//        System.out.println(student.toString());
//        session.getTransaction().commit();

        /// ////////delete
//        session.beginTransaction();
//        Student student = session.get(Student.class,1);
//        session.delete(student);
//        session.getTransaction().commit();


        /// //////update
        session.beginTransaction();
        Student student= session.get(Student.class,1);
        student.setEmail("noour@gmail.com");
        session.save(student);
        session.getTransaction().commit();


        }
    }


    ///////////steps to be followed in delete or update
/////////////must first fetch data then delete or update
///////for update or  save use save
