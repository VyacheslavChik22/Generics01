public class Example<T> {
    private String str = "";

    public String getStr() {
        return str;
    }

    public void addToString(T t) {
        if (this.str.equals("")) {
            this.str = this.str + t.toString();
        } else {
            this.str = this.str + "\n" + t.toString();

        }
    }
}