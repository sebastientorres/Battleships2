package com.st;

import java.util.Random;

/**
 * Created by st on 20/09/14.
 */
public class Ship {

    int shipLength;
    int shipHeadCoords;
    boolean shipOrientationVertical;
    boolean hasShipBeenHit;
    boolean isShipSunk;


    public boolean setShipOrientation(){

        Random rand = new Random();
        int value = rand.nextInt(2) +1;

        if (value == 1 ){
            shipOrientationVertical = true;
        } else {
            shipOrientationVertical = false;
        }

        return shipOrientationVertical;
    }

    public boolean checkShipHit(String shipHeadCoords, int shipLength){


        return hasShipBeenHit;
    }

    public int setShipLength(){

        Random rand = new Random();
        int shipLength = rand.nextInt(5) +1;

        return shipLength;
    }

    public String setShipHeadCoords(){

        return shipHeadCoords;
    }

    public boolean hasShipBeenSunk(){


        return isShipSunk;
    }

    public String shipSetPosition(){


        return shipHeadCoords;
    }

}
