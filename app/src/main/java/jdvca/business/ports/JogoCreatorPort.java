package jdvca.business.ports;

import jdvca.business.entities.JogoDaVelha;

public interface JogoCreatorPort {
    void create(final JogoDaVelha jogo);
}
