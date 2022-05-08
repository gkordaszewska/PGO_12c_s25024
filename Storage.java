package g12c.cw2;

    public class Storage {

        private int deliveryTime;

        public Storage(int deliveryTime) {
            this.deliveryTime=deliveryTime;
        }

        public int getDeliveryTime() {
            return deliveryTime;
        }
        public void setDeliveryTime(int deliveryTime) {
            if(deliveryTime <= 0){
                throw new RuntimeException("Czas dostawy nie może być mniejszy lub równy 0 ");
            }
            this.deliveryTime = deliveryTime;
        }


       @Override
        public String toString() {
            return "Storage{" +
                   "deliveryTime=" + getDeliveryTime() +
                    '}';
        }


    }
