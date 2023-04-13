package cinema.models;

import lombok.Data;

@Data
public class SoldTicket {
    final String token;
    final PricedSeat ticket;
}
