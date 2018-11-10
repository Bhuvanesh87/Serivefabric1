package com.iteritory.ignite.FirstIgnite;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
 

public class Ignite1 
{

	public static void main(String[] args) 
	{
		Ignition.setClientMode(true);
		 
		// Here, we provide the cache configuration file
		Ignite obj1 = Ignition.start("E:\\Bizruntime\\softwares\\apache-ignite-fabric-2.6.0-bin\\config\\itc-poc-config.xml");
 
		// create cache if not already existing
		IgniteCache<Integer, String> objCache1 = obj1.getOrCreateCache("myFirstIgniteCache");
 
		// Populating the cache with few values
		objCache1.put(1, "Bhuvanesh");
		objCache1.put(2, "Balaji");
		objCache1.put(3, "Chandhu");
		objCache1.put(4, "Sridhar");
		objCache1.put(5, "Ankit patel");
		objCache1.put(6, "Balakrishna");
 
		// Get these items from cache
		System.out.println(objCache1.get(1));
		System.out.println(objCache1.get(2));
		System.out.println(objCache1.get(3));
		System.out.println(objCache1.get(4));
		System.out.println(objCache1.get(5));
		System.out.println(objCache1.get(6));
		
		
		
	}

}
