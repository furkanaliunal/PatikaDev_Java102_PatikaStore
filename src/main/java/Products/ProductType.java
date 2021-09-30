package Products;

public enum ProductType {
    CellPhone("Cep Telefonu"),
    Notebook("Notebook");

    private final String typeName;
    ProductType(String typeName){
        this.typeName = typeName;
    }
    @Override
    public String toString(){
        return this.typeName;
    }
}
