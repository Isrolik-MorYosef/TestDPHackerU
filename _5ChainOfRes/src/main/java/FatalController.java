public class FatalController extends LogHandler {

	@Override
	public void handle(LogLevels levels) {
		if (levels.getValue() >= 3)
		{
			System.out.println("print The log to Array and to SMS ");
		}
		if (levels.getValue() > 3)
		{
			if (next != null)
			{
				next.handle(levels);
			}
		}
	}

}
