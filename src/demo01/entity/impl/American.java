package demo01.entity.impl;

import demo01.entity.Axe;
import demo01.entity.Person;

/**
 * ¹¹Ôì×¢Èë
 * @author Administrator
 *
 */
public class American implements Person {

	private Axe axe;
	
	public American(Axe axe){
		this.axe=axe;
	};
	
	@Override
	public void useAxe() {
		System.out.println(axe.chop());
	}

}
