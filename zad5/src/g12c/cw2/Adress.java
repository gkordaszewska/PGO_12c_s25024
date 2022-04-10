package g12c.cw2;

public class Adress {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Adress(String country, String city, String street, int house, int flat) {
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse(house);
        setFlat(flat);

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new RuntimeException("wartość country nie może być pusta");
        } else {
            this.country = country;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new RuntimeException("wartość city nie może być pusta");
        } else {
            this.city = city;
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            throw new RuntimeException("wartość street nie może być pusta");
        } else {
            this.street = street;
        }
    }

    public String getHouse() {
        return country;
    }

    public void setHouse(int house) {
        if (house <= 0) {
            throw new RuntimeException("wartość house nie może być mniejsza niż 1");
        } else {
            this.house = house;
        }
    }

    public void setFlat(int flat) {
        if (flat <= 0) {
            throw new RuntimeException("wartość flat nie może być mniejsza niż 1");
        } else {
            this.flat = flat;

        }
    }


}


