package ch.heigvd.res.chill.domain.tchuensu237;

        import ch.heigvd.res.chill.domain.IProduct;

        import java.math.BigDecimal;

public class Kingbeer implements IProduct {

    public static final String NAME = "King-beer";
    public static final BigDecimal PRICE = new BigDecimal(500);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
