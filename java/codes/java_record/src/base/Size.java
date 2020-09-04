package base;

public enum Size {
    SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);

    private String abbrevation;
    private int index;
    private Size(String abbrevation, int index){
        this.index = index;
        this.abbrevation = abbrevation;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
