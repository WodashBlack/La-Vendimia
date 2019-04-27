/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static tictactoe.Tictactoe.*;

/**
 *
 * @author WodashBlack
 */
public class main {
    public static void main (String [] args) throws IOException {
       char jugadorActual = 'X';
       boolean terminar = false;
        inicializarTablero();
        do{
            registrarJugada(jugadorActual);
            imprimirGato();
            if ( hayGanador(jugadorActual)){
                System.out.println("Felicidades jugador " + jugadorActual);
                System.out.println("Has ganado el juego");
                terminar = true;
            } 
            else {
                if (!hayEspacio()){
                    // Ya no hay casillas disponibles, el juego se empató
                    System.out.println("El juego termina en empate");
                    terminar = true;
                }else
                    if (jugadorActual == 'X')
                        jugadorActual = 'O';
                    else
                        jugadorActual = 'X';
                    }
                } while ( !terminar);
            }
        }
