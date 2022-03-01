import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.java.smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        //Arrange
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de María es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void si_hay_menos_de_2_jugadores(){
        //Arrange
        Game sut = new Game();
        sut.agregar("Juan");

        boolean expected = false;

        //Act
        boolean actual = sut.esJugable();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void si_hay_6_jugadores(){
        //Arrange
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");
        sut.agregar("Pepe");
        sut.agregar("Hector");
        sut.agregar("Iñigo");
        sut.agregar("Miguel");

        boolean expected = true;

        //Act
        boolean actual = sut.esJugable();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void sacar_numero_impar_y_salir_de_la_cárcel(){
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);
        sut.respuestaIncorrecta();
        sut.tirarDado(1);
        sut.fueRespuestaCorrecta();
        sut.tirarDado(1);

        String expected = "La nueva posición de María es 2";

        String actual = sut.nuevaPosicionJugador();

        Assertions.assertEquals(expected,actual);

    }
}