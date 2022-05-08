package g12c.cw2;

import java.util.ArrayList;
import java.util.List;

public class Products {

        private String name;
        private ProductType ProductType;
        private double price;
        private int quantity;
        private Storage storage;
        private static final List<Products> products = new ArrayList<>();


        public Products (String name, ProductType ProductType, double price, int quantity) {
            this.name=name;
            this.ProductType=ProductType;
            this.price=price;
            this.quantity=quantity;
            products.add(this);
        }

        public Products (String name, ProductType ProductType, double price, int quantity, Storage storage){
            this.name=name;
            this.ProductType=ProductType;
            this.price=price;
            this.quantity=quantity;
            this.storage=storage;
            products.add(this);
        }


    public String getName() {
            return name;
        }
        public void setName(String name) {
            if(name == null || name.isEmpty()){
                throw new RuntimeException("Nazwa nie może być pusta");
            }
            this.name = name;
        }

        public ProductType getProductType() {
            return ProductType;
        }
        public void setProductType(ProductType ProductType) {
            if(ProductType == null) {
                throw new RuntimeException("Typ produktu nie może być pusty");
            }
            this.ProductType = ProductType;
        }


        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            if(price <= 0){
                throw new RuntimeException("Cena produktu nie może być niższa od zera");
            }
            this.price = price;
        }


        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            if(quantity < 0){
                throw new RuntimeException("Ilość nie może być mniejsza niż 0");
            }
            this.quantity = quantity;
        }


        public Storage getStorage() {
            return storage;
        }
        public void setStorage(Storage storage){
            this.storage = storage;
        }


        public boolean isAvailable(){
            return quantity > 0;
        }


        public void sell() {
            if(this.isAvailable()){
                this.quantity--;
            } else {
                throw new RuntimeException("Produkt nie jest dostępny");
            }
        }

        public void IncreaseQuantity(int counter) {
            this.quantity = getQuantity() + counter;
        }

    public int getDeliveryTime(){
        if(storage == null) {
            return 0;
        }
        return storage.getDeliveryTime();
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", ProductType=" + getProductType() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", storage=" + getStorage() +
                '}';
    }


}




