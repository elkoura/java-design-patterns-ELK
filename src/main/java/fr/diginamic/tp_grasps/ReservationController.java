package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Reservation;

public class ReservationController {
    
    private ReservationService reservationService = new ReservationService();

    public Reservation creerReservation(Params params) {
        return reservationService.creerReservation(params);
    }
}
