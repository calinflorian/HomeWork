public enum Season {
    Vara("Anotimpul este vara.", "Lunile de vara sunt : iunie, iulie si august."),
    Toamna("Anotimpul este toamna.", "Lunile de toamna sunt : septembrie, octombrie si noiembrie."),
    Iarna("Anotimpul este iarna.", "Lunile de iarna sunt : decembrie, ianuarie si februarie."),
    Primavara("Anotimpul este primavara.", "Lunile de primavara sunt : martie, aprilie si mai.");

    String descriere, perioada;

    Season(String descriere, String perioada) {
        this.descriere = descriere;
        this.perioada = perioada;
    }

}
