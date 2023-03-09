package test;

import java.util.List;

import dao.ProduiDaoImpl;
import metier.entities.Produit;

public class TestDao {
	public static void main(String[] args) {
		ProduiDaoImpl pdao=new ProduiDaoImpl();
		Produit prod=pdao.save(new Produit("Iphone 8 plus",2800));
		System.out.println(prod);
		List<Produit> prods=pdao.produitsParMC("HP");
		for(Produit p:prods)
			System.out.println(p.toString());
		
	}
}
