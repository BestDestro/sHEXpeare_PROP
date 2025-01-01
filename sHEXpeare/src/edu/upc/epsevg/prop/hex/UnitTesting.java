/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.epsevg.prop.hex;


/**
 *
 * @author bernat
 */
public class UnitTesting {

    
    public static void main(String[] args) {
    
        
byte[][] board = {
    { 0,  0,  0,  0,  0,  0,  0,  0,  0, 0, 0},
      { 0,  0, 0,  0,  0,   0,   0,  0,  0, 0, 0},
        { 0, 0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
          { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
            { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
              { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
                { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
                 { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
                    { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
                      { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0},
                        { 0,  0,  0,   0,   0,   0,  0,  0,  0, 0, 0}
};

        HexGameStatus gs = new HexGameStatus(board, PlayerType.PLAYER1); 
      //  heuristicaDijkstra(gs);
 
    }
    
     // public static int heuristicaDijkstra(HexGameStatus gameState) {
     //     PlayerType currentPlayer = gameState.getCurrentPlayer();
     //      PlayerType opponent = PlayerType.opposite(currentPlayer); 
     //   int miDistancia = sHEXpeare.calcularDistanciaDijkstra(gameState, currentPlayer);
    //    int suDistancia = sHEXpeare.calcularDistanciaDijkstra(gameState, opponent);
    //    System.out.println("Distancia para " + currentPlayer + ": " + miDistancia);
    //    System.out.println("Distancia para " + opponent + ": " + suDistancia);
  //      return 2 * suDistancia - miDistancia;  
        // Maximiza la diferencia a tu favor
 //   }
    
}
