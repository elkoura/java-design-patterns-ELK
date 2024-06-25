package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

public class ReservationService {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private ClientDao clientDao = new ClientDao();
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    public Reservation creerReservation(Params params) {
        // Récupération des informations de Params
        String identifiantClient = params.getIdentifiantClient();
        LocalDateTime dateReservation = toDate(params.getDateReservation());
        String typeReservation = params.getTypeReservation();
        int nbPlaces = params.getNbPlaces();

        // Recherche du client
        Client client = clientDao.extraireClient(identifiantClient);

        // Recherche du type de réservation
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        // Création de la réservation
        Reservation reservation = ReservationFactory.createReservation(dateReservation, nbPlaces, client, type);

        // Ajout de la réservation au client
        client.getReservations().add(reservation);

        return reservation;
    }

    private LocalDateTime toDate(String dateStr) {
        return LocalDateTime.parse(dateStr, formatter);
    }
}
