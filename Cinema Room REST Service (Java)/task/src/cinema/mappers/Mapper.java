package cinema.mappers;

import cinema.models.PricedSeat;
import cinema.models.Seat;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Seat toSeat(PricedSeat pricedSeat) {
        return new Seat(pricedSeat.row(), pricedSeat.column());
    }
}
