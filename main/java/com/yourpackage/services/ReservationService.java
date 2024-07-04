package com.yourpackage.services;

import com.yourpackage.dao.ReservationDAO;
import com.yourpackage.entities.Reservation;
import java.util.List;

public class ReservationService {
    private ReservationDAO reservationDAO = new ReservationDAO();

    public void addReservation(Reservation reservation) {
        reservationDAO.addReservation(reservation);
    }

    public void updateReservation(Reservation reservation) {
        reservationDAO.updateReservation(reservation);
    }

    public void deleteReservation(int id) {
        reservationDAO.deleteReservation(id);
    }

    public List<Reservation> getAllReservations() {
        return reservationDAO.getAllReservations();
    }
}
