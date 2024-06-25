package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {

    public static Reservation createReservation(LocalDateTime dateReservation, int nbPlaces, Client client, TypeReservation type) {
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            reservation.setTotal(total * (1 - type.getReductionPourcent() / 100.0));
        } else {
            reservation.setTotal(total);
        }

        return reservation;
    }
}
