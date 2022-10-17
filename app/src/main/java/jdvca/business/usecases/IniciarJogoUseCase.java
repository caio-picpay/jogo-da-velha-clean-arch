package jdvca.business.usecases;

import jdvca.business.entities.JogoDaVelha;
import jdvca.business.ports.JogoCreatorPort;

public class IniciarJogoUseCase {

    private final JogoCreatorPort jogoCreator;

    public IniciarJogoUseCase(final JogoCreatorPort jogoCreator) {
        this.jogoCreator = jogoCreator;
    }

    public JogoDaVelha run() {
        final JogoDaVelha jogo = new JogoDaVelha();
        jogoCreator.create(jogo);
        return jogo;
    }
}
