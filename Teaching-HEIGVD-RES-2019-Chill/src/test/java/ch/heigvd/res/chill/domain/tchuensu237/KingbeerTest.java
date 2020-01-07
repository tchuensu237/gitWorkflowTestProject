package ch.heigvd.res.chill.domain.tchuensu237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KingbeerTest {

    @Test
    void aBartenderShouldAcceptAnOrderforKingbeer() {
        Kingbeer beer = new Kingbeer();
        assertEquals(beer.getName(), Kingbeer.NAME);
        assertEquals(beer.getPrice(), Kingbeer.PRICE);
    }

    @Test
    void thePriceAndNumberOfOrderedKingShouldBeCorrect() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.tchuensu237.Kingbeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Kingbeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
