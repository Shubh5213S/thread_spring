package commandPattern;

public class TVOnCommand implements Command{
	private TV tv;
	
	public TVOnCommand(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}
	
}
