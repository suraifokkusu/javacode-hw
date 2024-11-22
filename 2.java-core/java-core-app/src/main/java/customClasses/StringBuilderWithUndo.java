package customClasses;

import java.util.Arrays;
import java.util.Stack;

public class StringBuilderWithUndo {

    private char[] array;
    private int len;
    private Stack<char[]> stack;


    public StringBuilderWithUndo() {
        array = new char[10];
        len = 0;
        stack = new Stack<>();
    }

    private void ensureCapacity(int minimumCapacity) { //увеличение вместимости когда нужно
        if (minimumCapacity - array.length > 0) {
            int newCapacity = array.length * 2 + 2; //небольшой фиксированный прирост
            if (newCapacity - minimumCapacity < 0) {
                newCapacity = minimumCapacity; //минимально необходимая емкость
            }
            char[] newValue = new char[newCapacity];
            System.arraycopy(array, 0, newValue, 0, len);
            array = newValue;
        }
    }

    private void saveString() {
        char[] snapshot = new char[len];
        System.arraycopy(array, 0, snapshot, 0, len);
        stack.push(snapshot); //сохраняем снимок в стэк
    }

    public StringBuilderWithUndo append(String s) {
        saveString();
        ensureCapacity(len + s.length());
        s.getChars(0, s.length(), array, len); //копируем строку в массив
        len += s.length();
        return this;
    }

    public StringBuilderWithUndo delete(int start, int end) {
        if (start < 0 || end > len || start > end) {
            throw new StringIndexOutOfBoundsException();
        }
        saveString();
        System.arraycopy(array, end, array, start, len - end); //сдвигаем массив
        len -= (end - start);
        return this;
    }

    public void undo() {
        if (!stack.empty()) {
            char[] snapshot = stack.pop();
//            if (array.length!=0){}
                this.len = snapshot.length;
                this.array = snapshot;

        }
    }

    @Override
    public String toString() {
        return new String(array, 0, len);
    }
}