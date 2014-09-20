package com.st;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by st on 20/09/14.
 */
public class GameTurn {

    List<String> coordsFiredAt = new ArrayList<String>();

    int shipXCoords;

    public int readInXCoords(){


        return shipXCoords;
    }

    int shipYCoords;

    public int readInYCoords(){


        return shipYCoords;
    }

    boolean coordsAreValid;

    public boolean validateCoordinates(int shipXCoords, int shipYCoords){

        if(checkHaveCoordsBeenUsed(shipXCoords, shipYCoords)){
            coordsAreValid = false;
        }

        return coordsAreValid;
    }


    boolean haveCoordsBeenUsed;
    boolean checkHaveCoordsBeenUsed(int shipXCoords, int shipYCoords){


        return haveCoordsBeenUsed;
    }

    public void fireAtShip(int shipXCoords, int shipYCoords, List<String> coordsFiredAt){


    }

}
