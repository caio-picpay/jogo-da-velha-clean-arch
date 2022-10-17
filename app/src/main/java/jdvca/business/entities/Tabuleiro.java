package jdvca.business.entities;

import java.util.Collections;
import java.util.Map;

public class Tabuleiro {
    private final Map<Casa, Sinal> espacos;

    Tabuleiro() {
        /**    A  B  C
         * 1 |  |  |  |
         *   ----------
         * 2 |  |  |  |
         *   ----------
         * 3 |  |  |  |
         */
        espacos = Collections.emptyMap();
    }
}
