package practicaParcial2.Calls.Farers;

import practicaParcial2.Calls.Call;
import practicaParcial2.Calls.CallType;
import practicaParcial2.Calls.Catalogue;

/**
 * Created by arimi on 09-Nov-16.
 */
public class Farer {
    private Catalogue catalogue;
    private Call call;

    public Farer(Catalogue catalogue, Call call) {
        this.catalogue = catalogue;
        this.call = call;
    }

    public Double Fare(Call call){
        return call.getDuration() * catalogue.getCatalogue().get(call.);
    }
}
