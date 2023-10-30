package tn.esprit.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer.services.IChambreService;

@RestController
@AllArgsConstructor
@RequestMapping("Chambres")
public class ChambreController {
    IChambreService chambreService;
}
