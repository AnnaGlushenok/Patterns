public class ApiManager implements Manager {
    private String data = "I am API";

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
