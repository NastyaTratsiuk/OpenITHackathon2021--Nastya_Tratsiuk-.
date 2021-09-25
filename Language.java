package enums;

public enum Language {

    English ( "Global (EN)");


    private final String language;


    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
