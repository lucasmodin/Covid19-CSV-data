import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {


    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        return o1.getAldersGruppe().compareTo(o2.getAldersGruppe());
    }
}
