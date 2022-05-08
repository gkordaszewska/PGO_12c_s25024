package g12c.cw2;


import java.util.ArrayList;


    public class ShoppingCart {
        private final ArrayList<Products> products = new ArrayList<>();
        private static int id_counter = 0;
        private int  id = id_counter++;



        public double getTotalPrice(){
            double totalPrice = 0;
            if(products.size() > 0) {
                for (Products products : products) {
                    totalPrice += products.getPrice();
                }
            }
            return totalPrice;
        }


        public int getTotalDeliveryTime(){
            int totalDeliveryTime = 0;
            if(products.size() > 0) {
                for (Products products : products) {
                    if(products.getDeliveryTime() > totalDeliveryTime){
                        totalDeliveryTime = products.getDeliveryTime();
                    }
                }
            }
            return totalDeliveryTime;
        }


        public ArrayList<Products> getProducts() {
            return products;
        }

        public ShoppingCart() {
            setId();
        }

        public int getId() {
            return id;
        }
        public void setId() {
            this.id = id_counter++;
        }


        public void Sell(){
            if(products.size() == 0){
                throw new RuntimeException("Koszyk nie zawiera produktów");
            }
            for(Products products : products){
                products.sell();
            }
        }

        @Override
        public String toString() {
            return "ShoppingCart{" +
                    "id=" + getId() +
                    ", products=" + products +
                    ", totalPrice=" + getTotalPrice() +
                    ", totalDeliveryTime=" + getTotalDeliveryTime() +
                    '}';
        }




    }
