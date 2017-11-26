package rmi.client;

import utils.MeasurePoint;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Weather Client interface
 *
 * @author Ulrich Overdieck s0556056@htw-berlin.de
 * @version 1.0
 */
public interface WeatherClient extends Remote {

    /**
     * Update single measurePoint of weatherClient
     *
     * @param measurePoint with updated temperatures
     * @throws RemoteException as required
     */
    void updateTemperature(MeasurePoint measurePoint) throws RemoteException;
}
