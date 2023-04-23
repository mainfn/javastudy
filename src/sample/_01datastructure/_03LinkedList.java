package sample._01datastructure;


public class _03LinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.print();
        linkedList.remove(2);
        linkedList.print();
    }

    static class LinkedList {
        Node head;
        int size;

        void add(int value) {

            // Node가 1개 추가될 것이므로 size를 1 증가시킨다.
            ++this.size;

            // 인자로 받은 value를 통해 새로운 Node를 만든다.
            Node newNode = new Node(value);

            // 만약 head가 null이라면(빈 LinkedList라면)
            // head에 새로운 Node를 넣어준 뒤, 종료한다.
            // head.next == null일 것이다.
            // Node가 1개 밖에 없기 때문.
            if (head == null) {
                head = newNode;
                return;
            }

            // 만약 head가 null이 아니라면(LinkedList에 Node가 1개 이상이라면)
            Node cursor = head;
            // head를 참조하는 변수인 cursor를 만들어준다.
            // 그리고 cursor.next가 null이 아닐 때까지 cursor를 다음 Node로 업데이트한다.

            // 이 반복문은 cursor.next가 null일 때 멈추게 된다.
            // cursor.next가 null이라는 것은, cursor가 마지막 Node라는 것이다.
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            // 그 마지막 Node의 다음 번 Node로 새로운 Node를 등록한다.
            cursor.next = newNode;
        }

        void remove(int index) {
            // size가 index보다 작으면 삭제가 불가능하다.
            //
            // 예를 들어, size가 0이고 index도 0이라면 아무런 작업을 하지 않는다.
            // 0 <= 0은 true이기 때문.
            //
            // 그러나 size가 1이고 index가 0이라면
            // 1 <= 0은 false이기 때문에 if 문이 실행되지 않는다.
            // 즉, 아래 코드들이 실행될 것이다.
            if (size <= index) {
                throw new IndexOutOfBoundsException("index: " + index + "가 범위를 벗어났습니다. 최대 index = " + (size - 1));
            }

            // 아래 로직이 실행되면 Node 삭제가 무조건 일어나므로
            // 미리 size를 감소시킨다.
            --size;

            // 삭제할 index가 0이라면 이동이 필요 없고 head가 null이 될 것이다.
            if (index == 0) {
                head = head.next;
                return;
            }

            // 삭제할 index에 위치한 Node로 cursor를 이동시킨다.
            // 예를 들어 삭제할 index가 1이라면 반복문이 1회 실행되고,
            // cursor도 1번 이동할 것이다.
            Node cursor = head;
            Node prev = cursor;
            Node next;
            for (int i = 0; i < index; i++) {
                prev = cursor;
                cursor = cursor.next;
            }
            next = cursor.next;

            // 삭제할 대상은 바로 cursor다.
            // 그럼 prev의 next를 next로 변경하면 된다.
            // 그러면 cursor를 가리키는 Node는 더 이상 아무도 없게 된다.
            // GC에 의해 제거될 것이다.

            prev.next = next;

        }

        void print() {
            Node cursor = head;
            while (cursor != null) {
                System.out.print(cursor.value + " ");
                cursor = cursor.next;
            }
            System.out.println();
        }


    }

    static class Node {
        int value;
        Node next;

        Node() {

        }

        Node(int value) {
            this.value = value;
        }
    }
}
