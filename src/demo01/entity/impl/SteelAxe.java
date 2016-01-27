package demo01.entity.impl;

import demo01.entity.Axe;

public class SteelAxe implements Axe {

	@Override
	public String chop() {
		return "steel axe,so fast!";
	}

}
