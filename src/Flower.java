import java.util.*;

public class Flower {

    ArrayList<Flower> bouquet;

    public Flower getFlower() {
        return this;
    }

    private String name;
    private String flowerColor = "белый";
    private String country = "Россия";
    private double cost = 1;
    int lifeSpan = 3;

    public Flower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }
    }

    public static void viewBouquet(ArrayList<Flower> bouquet) {
        double sumBouquet = 0;
        int lifeSpanBouquet = 3;
        String resultInfo = "";
        System.out.println("Состав букета:");

        Map<String, Integer> namesAndAmount = new HashMap<>();
        Set<String> uniqNames = new HashSet<>();

        List<String> names = new ArrayList<>();

        for (int i = 0; i < bouquet.size(); i++) {
            //информация о стоимости букета
            sumBouquet += bouquet.get(i).getCost();
            //информация о стоянии букета
            if (bouquet.get(i).getLifeSpan() < lifeSpanBouquet) {
                lifeSpanBouquet = bouquet.get(i).getLifeSpan();
            }
        }
        //узнаем уникальные названия цветов в букете
        for (int i = 0; i < bouquet.size(); i++) {
            uniqNames.add(bouquet.get(i).getName());
        }
        //подсчитаем виды цветов в букете
        names.addAll(uniqNames);
        int flowerCounter = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < bouquet.size(); j++) {
                if (names.get(i).equals(bouquet.get(j).getName())) {
                    flowerCounter++;
                }
            }
            namesAndAmount.put(names.get(i), flowerCounter);
            flowerCounter = 0;
        }
        for (Map.Entry <String, Integer> entry: namesAndAmount.entrySet()) {
            resultInfo += entry.getKey() + " - " + entry.getValue() + ", ";
        }
        double totalSumBouquet = sumBouquet + sumBouquet * 0.1;
        resultInfo += "будет стоить " + totalSumBouquet + " рублей";
        resultInfo += " и будет стоять " + lifeSpanBouquet + " дня(-ей).";
        System.out.println(resultInfo);
    }

    @Override
    public String toString() {
        return name
                + ", страна происхождения — " + country
                + ", стоимость штуки — " + cost
                + " рублей, срок стояния — " + lifeSpan + " дней.";
    }
}
