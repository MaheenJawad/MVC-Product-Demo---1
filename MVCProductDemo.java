public class MVCProductDemo {
    public static void main(String[] args) {
        Product model = retriveProductFromDatabase();

        ProductView view = new ProductView();
        ProductController controller = new ProductController(model, view);
        controller.updateView();

        controller.setProductName("Gummies");
        System.out.println("\nGummies Details after updating: ");
        controller.updateView();
    }
    private static Product retriveProductFromDatabase(){
        Product product = new Product ();
        product.setName("SourPatch Kids");
        product.setId("123476");
        product.setQuantity("50");
        return product;
    }
}
