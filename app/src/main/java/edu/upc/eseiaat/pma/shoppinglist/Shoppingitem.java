package edu.upc.eseiaat.pma.shoppinglist;

public class Shoppingitem {

    private String text;
    private boolean checked;

    public Shoppingitem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public Shoppingitem(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toogleChecked() {
        this.checked=!this.checked;
    }
}
