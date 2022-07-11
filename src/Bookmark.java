public class Bookmark {
    String name;
    String url;
    String group;
    String memo;

    public Bookmark(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Bookmark(String name, String url, String group, String memo) {
        this.name = name;
        this.url = url;
        this.group = group;
        this.memo = memo;
    }
}
