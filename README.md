# Trivial

## Problema 0

Extraemos el código duplicado a un único método "nuevaPsicionJugador",
al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_1_voy_a_casilla_1"

## Problema 1

Utilizamos el método esJugable para que el juego se ejecute.
Si no se ejecuta, saldrá un mensaje que te informe de que no se puede

Creamos el test unitario "si_hay_menos_de_2_jugadores"

## Problema 2

Creamos el test "si_hay_6_jugadores" y aparece un error InputOutOfBounds porque se empieza a guardar todo 
en la posición 1 del array, en vez de en la cero, arreglamos esa parte.
El método agregar se modifica para que dependa del método esJugable.

Creamos el test unitario "si_hay_6_jugadores"

## Problema 3

Añado la instrucción de salir de la cárcel en el método tirarDado (cuando se saca un número impar).

Creo el test unitario "sacar_numero_impar_y_salir_de_la_cárcel"

## Problema 4

Cambiamos el nombre del método a JugadorNoHaGanado y cambiamos el nombre de la variable noGanador a Ganador.

## Problema 5

Se refactoriza el cambiar de jugador en el método pasarTurno y lo reemplazamos.

## Problema 6

Extraemos del método fueRespuestaCorrecta la parte donde se acierta la pregunta y llamamos
al nuevo método respuestaAcertada reutilizándolo en la segunda parte del método fueRespuestaCorrecta.