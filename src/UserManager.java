public class UserManager {
    private ApiManager api;
    private CacheManager cache;

    public UserManager() {
        this.api = new ApiManager();
        this.cache = new CacheManager();
    }

    public String getData() {
        String data = this.cache.getData();
        if (data.isEmpty()) {
            data = this.api.getData();
            this.cache.setData(data);
        }
        return data;
    }
}
