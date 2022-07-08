package com.designPatterns.creationalPatterns.builder;

public class TipiHouseBuilder implements HouseBuilder {

    private House house;

    public TipiHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("XXX");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("YYY");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("ZZZ");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("AAA");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
