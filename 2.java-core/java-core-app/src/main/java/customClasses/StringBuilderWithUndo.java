package customClasses;

public class StringBuilderWithUndo {

    private StringBuilder stringBuilder;
    private  String undoString;

    public StringBuilderWithUndo(){
        stringBuilder = new StringBuilder();
        undoString = ""; //инициализируем как пустую
    }

    public StringBuilderWithUndo append(String string){
        undoString = stringBuilder.toString();
        stringBuilder.append(string);
        return this;
    }

    public StringBuilderWithUndo delete(int start, int end){
        undoString = stringBuilder.toString();
        stringBuilder.delete(start,end);
        return this;
    }

    public StringBuilderWithUndo replace(int start, int end, String string){
        undoString = stringBuilder.toString();
        stringBuilder.replace(start, end, string);
        return this;
    }

    public String undo(){
        String temp = stringBuilder.toString(); //сохраняем на случай повторного использования метода undo
        stringBuilder = new StringBuilder(undoString);
        undoString = temp;
        return stringBuilder.toString();
    }
    public String toString(){
        return stringBuilder.toString();
    }
}
