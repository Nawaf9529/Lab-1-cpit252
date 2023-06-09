package org.example;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",230.23,LocalDate.parse("2012-12-23"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",370,LocalDate.parse("2043-04-03"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",300,LocalDate.parse("2066-06-06"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
