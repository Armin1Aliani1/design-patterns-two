package com.designPatterns.structuralPatterns.decorator;

public abstract class BaseDecorator implements IceCream {

    private IceCream iceCream; // wrapee

    public BaseDecorator(IceCream specialIceCream) {
        this.iceCream = specialIceCream;
    }

    /*public int cost(){
        return iceCream.cost();
    }*/

}
