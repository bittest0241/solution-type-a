package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if(function.equals("앱")) {
			System.out.println(runApp());
			return;
		}else if(function.equals("음악")) {
			System.out.println("스트리밍");
			return;
		}
		
		super.execute(function);
	}
	
	
	public String runApp() {
		
		return "앱실행";
	}
}