package roomescape.service;

import java.util.List;

import org.springframework.stereotype.Service;

import roomescape.dao.ReservationDao;
import roomescape.domain.Reservation;

@Service
public class ReservationService {
    private final ReservationDao reservationDao;

    public ReservationService(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    public List<Reservation> getAllReservations() {
        List<Reservation> reservationList = reservationDao.listAllReservations();
        return reservationList;
    }

    public Long addReservation(Reservation reservation) {
        Long generatedId = reservationDao.createReservation(reservation);
        return generatedId;
    }

    public int removeReservation(Long id) {
        int deleteCount = reservationDao.deleteReservation(id);

        return deleteCount;
    }
}