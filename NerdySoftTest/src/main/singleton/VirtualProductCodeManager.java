package main.singleton;

public class VirtualProductCodeManager {
    private static VirtualProductCodeManager codeInstance;
    private String productCode;

    private VirtualProductCodeManager() {
    }

    public static VirtualProductCodeManager getCodeInstance() {
        if (codeInstance == null) {
            codeInstance = new VirtualProductCodeManager();
        }
        return codeInstance;
    }

    public void useCode(String code) {
        productCode = code;
    }

    public boolean isCodeUsed(String code) {
        return code.equals(productCode);
    }
}
