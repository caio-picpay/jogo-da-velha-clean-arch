package jdvca.business.usecases;

import jdvca.business.entities.JogoDaVelha;
import jdvca.business.ports.JogoCreatorPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.UUID;

public class IniciarJogoUseCaseTest {


    private final JogoCreatorPort jogoCreatorMock;
    private final IniciarJogoUseCase iniciarJogoUseCase;

    IniciarJogoUseCaseTest(){
        jogoCreatorMock = Mockito.mock(JogoCreatorPort.class);
        iniciarJogoUseCase = new IniciarJogoUseCase(jogoCreatorMock);
    }

    @Test
    void DadoNovoJogoDaVelhaDeveGarantirQueIdEhUmUUIDValido(){
        final JogoDaVelha jogo = iniciarJogoUseCase.run();
        Assertions.assertTrue(isUUID(jogo.getId()));
    }

    private boolean isUUID(final String text){
        try{
            UUID.fromString(text);
            return true;
        }catch (final Exception e){
            return false;
        }
    }
}
