package xyz.aornice.tofq.depostion;


/**
 * Created by drfish on 09/04/2017.
 */
public interface CargoDeposition {

    /**
     * The method will return immediately without guarantee the cargo has been deposited.
     * The deposition success information could get by adding listener to
     * {@link CargoDeposition#addDepositionListener}
     * @param cargo - the {@link ICargo} need to be deposited
     */
    void write(ICargo cargo);

    /**
     * Add {@link DepositionListener} to {@link CargoDeposition}. CargoDeposition will notify
     * the listener when deposition has been done.
     * @param listener - the listener to add
     */
    void addDepositionListener(DepositionListener listener);
}
