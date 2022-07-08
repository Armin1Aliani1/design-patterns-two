package com.designPatterns.creationalPatterns.builder;

public class ApplicationBuild {
    public static void main(String[] args) {

        HouseBuilder iglooBuilder = new IglooHouseBuilder();

        HouseBuilder tipiBuilder = new TipiHouseBuilder();

        CivilEngineer engineerOne = new CivilEngineer(iglooBuilder);

        CivilEngineer engineerTwo = new CivilEngineer(tipiBuilder);

        engineerOne.constructHouse();

        engineerTwo.constructHouse();

        House houseOne = engineerOne.getHouse();

        House houseTwo = engineerTwo.getHouse();

        System.out.println("Builder constructed one : " + houseOne);

        System.out.println("Builder constructed two : " + houseTwo);

        StringBuilder builder = new StringBuilder("Hello");
        String product = builder.append(1)
                .append(true)
                .append("Armin")
                .toString();

        System.out.println(product);
    }
}
