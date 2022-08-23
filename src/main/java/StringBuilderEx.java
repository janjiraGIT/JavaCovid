public class StringBuilderEx {
    public void Run() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
