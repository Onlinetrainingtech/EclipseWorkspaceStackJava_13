
public class ProductDAOImpl implements ProductDAO
{

	public void addProduct() {
		
		System.out.println("This is addProduct Modules");
		
	}

	public void viewProduct(ProductModel p) {
		
		System.out.println("This is view Product::"+p.getPid()+""+p.getPname());
		
	}

}
