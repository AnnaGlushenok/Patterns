package Colors;

public enum Colors {
    RED("\u001B[31m"),
    BLACK("\u001B[30m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),
    RESET("\u001B[0m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    YELLOW("\u001B[33m"),
    WHITE("\u001B[37m");

    private String code;

    Colors(String code) {
        this.code = code;
    }

    public String getColor() {
        return code;
    }
}
