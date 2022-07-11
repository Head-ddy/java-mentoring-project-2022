import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookmarkList {
    // Bookmark를 담는 자료구조형 필요. (Array, ArrayList, ... 등 어떤걸 사용해도 좋음.)
    // File IO에 대한 변수 필요함.

    public BookmarkList() {
        /**
         * data.txt 파일을 읽어서 parsing을 해 bookmark를 만들어 bookmarkList에 넣어준다.
         * 이때 받아오는 양식은, name,url,type,memo 순으로 받아오며,
         * 양 옆 공백문자를 지울 수 있어야 한다.
         */
    }

    public void run() {
        printList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                /**
                 * command:
                 *      /help                               - 명령어의 목록을 보여줌.
                 *      /printall                           - list 목록을 보여줌.
                 *      /print
                 *      /create <name> <url> [type] [memo]  - bookmark를 생성한다. type과 memo는 optional. name은 같을 수 없다.
                 *      /update <name> <key> <value>        - bookmark를 수정한다. ex) /update naver type information : name이 naver인 bookmark에 group를 portal로 바꿔준다.
                 *      /delete <name>                      - bookmark를 삭제한다.
                 *      /sort <key>                         - key를 기준으로 list를 정렬해준다. ex) /sort type: type을 기준으로 정렬.(같을땐 name이 차순위 key)
                 *      /exit
                 */
                String commandLine = br.readLine();
                StringTokenizer st = new StringTokenizer(commandLine);
                String command = st.nextToken();
                if (command.equals("/help")) {
                    System.out.println("* /help - show command list\n" +
                            "* /printall - show bookmark list\n" +
                            "* /print <name> - show bookmark\n" +
                            "* /create <name> <url> -t [type] -m [memo] - create bookmark\n" +
                            "* /update <name> <key> <value> - edit bookmark\n" +
                            "* /delete <name> - delete bookmark\n" +
                            "* /sort <key> - sort bookmark list by key");
                } else if (command.equals("/printall")) {
                    printList();
                } else if (command.equals("/print")) {
                    // 구현 하세요. print 함수 사용.
                } else if (command.equals("/create")) {
                    // 구현 하세요. create 함수 사용.
                } else if (command.equals("/update")) {
                    // 구현 하세요. update 함수 사용.
                } else if (command.equals("/delete")) {
                    // 구현 하세요. delete 함수 사용.
                } else if (command.equals("/sort")) {
                    // 구현 하세요. sort 함수 사용.
                } else if (command.equals("/exit")) {
                    // 구현 하세요. save 함수 사용.
                    return;
                } else {
                    System.out.println("Invalid command. See how to use command, type \"/help\".");
                }
            } catch(IOException e) {
                System.out.println("command problem occurred. exit program.");
                return;
            }
        }
    }


    private void printList() {
        // bookmarkList를 출력해준다. 이때 Bookmark의 print 함수를 사용하도록 한다.
    }

    private void print(String name) {
        // bookmarkList를 출력해준다. 이때 Bookmark의 printDetail함수를 사용하도록 한다.
    }

    private void create(String name, String url) {

    }

    private void create(String name, String url, BookmarkType type) {

    }

    private void create(String name, String url, String memo) {

    }

    private void create(String name, String url, BookmarkType type, String memo) {

    }

    private void update(String name, String key, String value) {

    }

    private void delete(String name) {

    }

    private void sort(String key) {

    }

    private void save() {

    }
}
