package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		unfunkifiedText=unfunkifiedText.toUpperCase();
		char[] ch=unfunkifiedText.toCharArray();
		for(int i=0; i<unfunkifiedText.length(); i+=2) {
			ch[i]=Character.toLowerCase(ch[i]);
			
		}
		return new String(ch);
	}
	

}
