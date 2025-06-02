public class ProductController {
    private Product model;
    private ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }
    public void setProductName(String name){
        model.setName(name);
    }
    public String getProductName(){
        return model.getName();
    }
    public void setProductId(String id){
        model.setId(id);
    }
    public String getProductId(){
        return model.getId();
    }
    public void setProductQuantity(String Quantity){
        model.setQuantity(Quantity);
    }
    public String getProductQuantity(){
        return model.getQuantity();
    }
    public void updateView() {
        view.printProductDetails(model.getName(), model.getId(), model.getQuantity());
    }
}
