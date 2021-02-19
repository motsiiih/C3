package it.unicam.Team151.C3.repositories;

import it.unicam.Team151.C3.prenotazione.Armadietto;
import it.unicam.Team151.C3.prenotazione.PuntoConsegna;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArmadiettoRepository extends CrudRepository<Armadietto, Long> {

    List<Armadietto> findAllByPuntoConsegna(PuntoConsegna puntoConsegna);

    Optional<Armadietto> findByCodice(int codice);

}