public class ReferenceExample {
    public static void main(String[] args) {
        StringBuilder originalReference = new StringBuilder("Hello");
        System.out.println("Before: " + originalReference);
        modifyReference(originalReference);
        System.out.println("After: " + originalReference);
    }

    private static void modifyReference(StringBuilder reference) {
        reference.append(" World");
        System.out.println("Inside method: " + reference);
    }
}
