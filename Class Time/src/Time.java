/**
 * La classe rappresenta e gestisce dati di tipo temporale
 */

public class Time{
    /**
     * numero di secondi dell'oggetto Time
     */
    protected int secondi;

    /**
     * numero di minuti dell'oggetto Time
     */
    protected int minuti;
    
    /**
     * numero di ore dell'oggetto Time
     */
    protected int ore;
    
    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * @param secondi numero di secondi dell'oggetto Time
     * @param minuti numero di minuti dell'oggetto Time
     * @param ore numero di ore dell'oggetto Time
     */
    public Time(int secondi, int minuti, int ore) {
        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
    }

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * @param sec secondi da assegnare al nuovo oggetto
     */
    public Time(int sec) {
        if (secondi >= 60) {
            secondi = sec % 60;
            minuti = sec/60;
        }
        if (minuti >= 60) {
            int min = minuti % 60;
            ore = minuti / 60;
            minuti = min;
        }
    }

    /**
     * Vengono addizionati il numero di secondi specificati.
     * @param sec numero di secondi da aggiungere
     *  
     */
    public void addSecondi(int sec) {
        secondi = secondi + sec;
        int sectot = secondi;
        if (secondi > 60) {
            secondi = sectot % 60;
            minuti = minuti + sectot/60;
        }
        if (minuti > 60) {
            int min = minuti % 60;
            ore = minuti / 60;
            minuti = min;
        }
    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     * @return il numero totale dei secondi
     */
    public int convertiSecondi() {
        return (ore * 60 * 60) + (minuti * 60) + secondi;
    }

    /**
     * Restituisce il numero di secondi
     * @return il numero di secondi dell'oggetto Time
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     * Restituisce il numero di minuti
     * @return il numero di minuti dell'oggetto Time
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * Restituisce il numero delle ore
     * @return il numero di ore dell'oggetto Time
     */
    public int getOre() {
        return ore;
    }

    /**
     * @deprecated
     * @param secondi
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    /**
     * @deprecated
     * @param minuti
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */
    @Override
    public String toString() {
        return "Time {ore=" + ore + ", minuti=" + minuti + ", secondi=" + secondi + "}";
    }  
    
}