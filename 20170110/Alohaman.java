public class Aloha3{
	public static void main(String[] args) {
		Alohaman am = new Alohaman();
		am.sayAloha(76);
	}
}


class Alohaman{
	private String msg1;
	private String msg2;

	public Alohaman(){
		this.msg1 = "Aloha";
		this.msg2 = "アロハ";
	}

	public void sayAloha(int n){
		for (int i=0;i<n;i++) {
		System.out.println(i+":"+this.msg1);
		}
	}
}

