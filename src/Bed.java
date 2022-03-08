public class Bed {

    private String style;
    private int height;
    private int quilt;
    private int pillows;
    private int sheets;

    public Bed(String style, int height, int quilt, int pillows, int sheets) {
        System.out.println("hello world");
        this.style = style;
        this.height = height;
        this.quilt = quilt;
        this.pillows = pillows;
        this.sheets = sheets;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getQuilt() {
        return quilt;
    }



    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public void make(){
        System.out.println("bed class -> bed make is called");
    }
}
