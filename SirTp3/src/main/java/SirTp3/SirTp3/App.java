package SirTp3.SirTp3;

import java.net.UnknownHostException;

import metier.Article;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

import metier.Address;
import metier.Person;
import redis.clients.jedis.Jedis;

/**
 * Hello world!
 */
public class App {


  // --- Morphia ---

  /**
   *
   * @param args
   * @throws UnknownHostException
   */
	/*public static void main( String[] args ) throws UnknownHostException{
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
	}*/


  // --- Redis ---

  //Lancer redis-server.exe

  /**
   * Exemple 1
   *
   * @param args
   */
  /*public static void main(String[] args) {
    Jedis jedis = new Jedis("localhost");
    jedis.set("foo", "bar");
    String value = jedis.get("foo");
    System.err.println(value);
  }*/


  /**
   * Exemple 2.
   * @param args
   */
  /*public static void main(String[] args) {
    Jedis jedis = new Jedis("localhost");
    System.out.println(jedis.get("counter"));
    jedis.incr("counter");
    System.out.println(jedis.get("counter"));
  }*/

  /**
   * Exemple 3.
   * @param args
   * @throws InterruptedException
   */
  /*public static void main(String[] args) throws InterruptedException {
    String cacheKey = "cachekey";
    Jedis jedis = new Jedis("localhost");
    // adding a new key
    jedis.set(cacheKey, "cached value");
    // setting the TTL in seconds
    jedis.expire(cacheKey, 15);
    // Getting the remaining ttl
    System.out.println("TTL:" + jedis.ttl(cacheKey));
    Thread.sleep(1000);
    System.out.println("TTL:" + jedis.ttl(cacheKey));
    // Getting the cache value
    System.out.println("Cached Value:" + jedis.get(cacheKey));
    // Wait for the TTL finishs
    Thread.sleep(15000);
    // trying to get the expired key
    System.out.println("Expired Key:" + jedis.get(cacheKey));
  }*/

  /**
   * Exemple 4.
   *
   * @param args
   */
  public static void main(String[] args) {
    String cacheKey = "languages";
    Jedis jedis = new Jedis("localhost");
    // Adding a set as value
    jedis.sadd(cacheKey, "Java");
    jedis.sadd(cacheKey, "C#");
    jedis.sadd(cacheKey, "Python"); // SADD
    // Getting all values in the set: SMEMBERS
    System.out.println("Languages: " + jedis.smembers(cacheKey));
    // Adding new values
    jedis.sadd(cacheKey, "Java");
    jedis.sadd(cacheKey, "Ruby");
    // Getting the values... it doesn't allow duplicates
    System.out.println("Languages: " + jedis.smembers(cacheKey));
  }

}
