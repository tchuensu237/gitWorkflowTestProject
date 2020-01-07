package ch.heigvd.res.chill.domain.tchuensu237;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Export33 implements IProduct {

    public static final String NAME = "33-Export";
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
