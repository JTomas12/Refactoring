package pt.up.fe.ldts.example3;

public class FixedDiscount extends Discount {
    private final int discount;

    public FixedDiscount(int discount) {
        this.discount = discount;
    }
    public double applyDiscount(double price) {
        return discount > price ? 0 : price-discount;
    }
}

