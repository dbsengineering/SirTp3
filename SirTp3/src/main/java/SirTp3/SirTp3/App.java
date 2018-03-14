package SirTp3.SirTp3;

import java.net.UnknownHostException;

import metier.Article;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

import metier.Address;
import metier.Person;

/**
 * Hello world!
 *
 */
public class App {

	/**
	 * 
	 * @param args
	 * @throws UnknownHostException
	 */
	public static void main( String[] args ) throws UnknownHostException{
	    Morphia morphia = new Morphia();    
	    MongoClient mongo = new MongoClient();
	    morphia.map(Person.class).map(Address.class);
	    Datastore ds = morphia.createDatastore(mongo, "test");

		Article article = new Article("Sciances", 4);
	    
	    Person p = new Person();
	    p.setName("Tintin");
	    Address address = new Address();
	    address.setStreet("123 Some street");
	    address.setCity("Some city");
	    address.setPostCode("123 456");
	    address.setCountry("Some country");
	    //set address
	    p.addAddress(address);

	    article.addBuyer(p);
	    // Save the POJO
	    ds.save(p);
	    ds.save(article);
	    for (Person e : ds.find(Person.class))
	         System.err.println(e);

			for (Article e : ds.find(Article.class))
				System.err.println(e);

	}

}
