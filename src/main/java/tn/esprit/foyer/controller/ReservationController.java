package tn.esprit.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer.services.IReservationService;

@RestController
@AllArgsConstructor
@RequestMapping("Reservation")
public class ReservationController {
    IReservationService reservationService;
}
