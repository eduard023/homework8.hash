package ProductList;

import java.util.Objects;


public class Product {
    private final String name;
    private final int price;
    private final double necessary;
    private boolean checked;

    public Product(String name, int price, double necessary) {
        if (name == null || name.isBlank() || price < 0 || necessary < 0){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.necessary = necessary;
        this.checked = false;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getNecessary() {
        return necessary;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return this.name + " цена - " + this.price +
                ". Колличество " + this.necessary +
                ". Куплен: "+
                checkedString;
    }

}
