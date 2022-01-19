public class Test {
    public static void main(String[] args) {
        UserAdministrator userAdministrator = new UserAdministrator("Айдар");
        SupplierReader supplierReader = new SupplierReader("Анель");
        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Айна");

        userAdministrator.overdueNotification(supplierReader);
        supplierReader.takeBook(userAdministrator);
        supplierReader.returnBook(userAdministrator);
        librarianAdministrator.orderBook(supplierReader);
    }
}