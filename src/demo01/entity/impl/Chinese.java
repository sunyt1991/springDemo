package demo01.entity.impl;

import demo01.entity.Axe;
import demo01.entity.Person;

/**
 * …Ë÷µ◊¢»Î
 * @author Administrator
 *
 */
public class Chinese implements Person {

	private Axe axe;
	
	private String name;
	
	public Chinese(){}
	
	public Chinese(String name){
		this.name="my name is "+name;
	}
	
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
