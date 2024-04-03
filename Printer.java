public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        pagesPrinted += pagesPrinted;
        return pagesPrinted;
    }


}
