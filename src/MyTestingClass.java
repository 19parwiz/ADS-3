public class MyTestingClass {
    private int value;

    public MyTestingClass(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        // Custom hash code method
        return Integer.hashCode(value * 31);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass that = (MyTestingClass) obj;
        return value == that.value;
    }
}
