package cinema.repositories;

import cinema.models.PricedSeat;
import cinema.models.SoldTicket;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Repository
public class SoldTicketRepository {
    Map<String, PricedSeat> data = new HashMap<>();

    public SoldTicket save(PricedSeat ticket) {
        String token = UUID.randomUUID().toString();
        SoldTicket res = new SoldTicket(
                token, ticket
        );
        data.put(token, ticket);
        return res;
    }

    public Optional<PricedSeat> remove(String tokenDTO) {

        return Optional.ofNullable(data.remove(tokenDTO));
    }

    public int totalIncome() {
        return data.values().stream()
                .mapToInt(PricedSeat::price)
                .sum();
    }

    public int count() {
        return data.size();
    }
}
