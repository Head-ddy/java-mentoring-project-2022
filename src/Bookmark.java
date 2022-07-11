/**
 * Bookmark의 종류는 BookmarkType Enum을 참고할 것.
 * 각 BookmarkType마다 class를 만들어서 Bookmark를 상속할 것.
 * 각 Bookmark에서는 optional한 값을 가지는데, 이 값들은 다음과 같다.
 *     - Information: 메인페이지 뉴스 제공 여부(boolean)
 *     - Advertise: 사업분야(String)
 *     - Entertain: 요금(int)
 *     - Education: 종류(Enum - 초등학교, 중학교, 고등학교, 대학교, 학원, 기타)
 *     - Commerce: 커머스 타입(Enum - 소셜커머스, 오픈마켓)
 *     - Community: 커뮤니티 주제(문자열)
 */
public abstract class Bookmark {
    String name;
    String url;
    BookmarkType type;
    String memo;

    public Bookmark(String name, String url) {
        this.name = name;
        this.url = url;
        this.type = BookmarkType.Others;
    }

    public Bookmark(String name, String url, String memo) {
        this.name = name;
        this.url = url;
        this.type = BookmarkType.Others;
        this.memo = memo;
    }

    public void print() {
        /**
         * 기본적인 사항(name, url)만 출력하는 함수
         */
    }

    public abstract void printDetail(); // Optional 데이터까지 출력해주는 함수.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BookmarkType getType() {
        return type;
    }

    public void setType(BookmarkType type) {
        this.type = type;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public abstract void getOptional();

    public abstract void setOptional(); // Optional 데이터를 수정하는경우 사용하는 함수.
}
