package maelton.functional_programming_java.common_functional_interfaces.supplier;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceExample {
    public static void main(String[] args) {
        Supplier<String> getLinkedinUrl = () -> "https://www.linkedin.com/in/maelton-lima/";
        System.out.println(getLinkedinUrl.get());
    }
}