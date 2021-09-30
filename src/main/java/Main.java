public class Main {
    public static void main(String[] args) {
        Shop patikaStore = new Shop("PatikaStore");
        new initalizeDemo(patikaStore);
        new ManagementPanel(patikaStore);
    }
}
