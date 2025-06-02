public class Product {

    private String ProductName;
    private String ProductId;
    private String ProductQuantity;

    public String getId() {
        return ProductId;
    }
    public void setId(String id) {
        this.ProductId = id;
    }
    public String getName() {
        return ProductName;
    }
    public void setName(String name) {
        this.ProductName = name;
    }
    public String getQuantity() {
        return ProductQuantity;
    }
    public void setQuantity(String Quantity) {
        this.ProductQuantity = Quantity;
    }
}