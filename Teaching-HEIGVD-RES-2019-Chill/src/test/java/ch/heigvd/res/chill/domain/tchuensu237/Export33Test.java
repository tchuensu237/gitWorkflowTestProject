package ch.heigvd.res.chill.domain.tchuensu237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Export33Test {

    @Test
    void aBartenderShouldAcceptAnOrderforExport33() {
        Export33 beer = new Export33();
        assertEquals(beer.getName(), Export33.NAME);
        assertEquals(beer.getPrice(), Export33.PRICE);
    }

    @Test
    void thePriceAndNumberOfOrderedKingShouldBeCorrect() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.tchuensu237.Export33";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Export33.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
