public class Covid19Data {

    private String region;
    private String aldersGruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;


    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfældeIAlt,
                       int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato) {

            this.region = region;
            this.aldersGruppe = aldersGruppe;
            this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
            this.døde = døde;
            this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
            this.indlagte = indlagte;
            this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    @Override
    public String toString() {
        return "Covid19 data:" +
                " Region: " + region +
                " Aldersgruppe: " + aldersGruppe +
                " Bekræftede tilfælde i alt: " + bekræftedeTilfældeIAlt +
                " Døde: " + døde +
                " Indlagte: " + indlagte +
                " Indlagte på intensiv afdeling: " + indlagtePåIntensivAfdeling +
                " Dato: " + dato;


    }

}
