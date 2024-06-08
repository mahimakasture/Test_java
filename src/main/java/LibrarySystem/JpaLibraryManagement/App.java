package LibrarySystem.JpaLibraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		int flag = 1;

		while (flag != 0) {
			System.out.println("1.Insert Data in table");
			System.out.println("2.Update Data in table");
			System.out.println("3.Delete Data in table");
			System.out.println("4.Show Table...");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        switch (choice) {
        case 1:{
        	Student st=new Student(101,"Mahima","Solapur","WIT");
            Student st1=new Student(102,"Nikhil","Sangli","DY Patil");
            Student st2=new Student(103,"Shruti","Pune","IMS");
    		em.persist(st);
    		em.persist(st1);
    		em.persist(st2);

    		List<Student> list=new ArrayList<>();
    		list.add(st);
    		list.add(st1);
    		list.add(st2);
    		
    		Library lb=new Library(201, "Walchand", "IT", list);
    		em.persist(lb);
    		em.getTransaction().commit();
			break;
        }
        case 2:{
        	Student obj5=em.find(Student.class,103);
        	obj5.setSname("Vimal");
			em.persist(obj5);
			em.getTransaction().commit();
			break;
        }
        case 3:{
        	Student obj1=em.find(Student.class,103);
        	em.remove(obj1);
        	em.getTransaction().commit();
        	break;
        	
        }
        case 4: {
        	Student obj2=em.find(Student.class,102);
        	System.out.println(obj2);
        	break;
        	
        }
		case 5:
			flag = 0;
			continue;

		default:
			System.out.println("Invalid input");
		}
		System.out.println("Do you want to continue...yes or no");
		String str = sc.next();

		if (str.equals("yes")) {

		} else {
			flag = 0;
		}
	}

	
	System.out.println("Application closed...");
        	
        }
    }
