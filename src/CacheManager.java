public class CacheManager implements Manager {
    private String data = "";

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return new StringBuffer(data).reverse().toString();
    }
}
