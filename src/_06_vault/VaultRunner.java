package _06_vault;

public class VaultRunner {
	public static void main(String[]args) {
		Vault vault = new Vault();
		SecretAgent bond = new SecretAgent();
		int code = bond.findCode(vault);
		System.out.println(code);
	}
	
	
	
}
