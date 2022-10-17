package jdvca.business.entities;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class JogoDaVelha {
    private final Map<Casa, Sinal> tabuleiro;
    private final String id;

    public JogoDaVelha() {
        /**    A  B  C
         * 1 |  |  |  |
         *   ----------
         * 2 |  |  |  |
         *   ----------
         * 3 |  |  |  |
         */
        id = UUID.randomUUID().toString();
        tabuleiro = Collections.emptyMap();
    }

    public String getId() {
        return id;
    }

    public Map<Casa, Sinal> getTabuleiro() {
        return tabuleiro;
    }
}
