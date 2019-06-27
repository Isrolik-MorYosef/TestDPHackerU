
public class InfoController extends LogHandler {

	@Override
	public void handle(LogLevels levels) {
		if (levels.getValue() >= 1)
		{
			System.out.println("print The log to Screen");
		}
		if (levels.getValue() > 1)
		{
			if (next != null)
			{
				next.handle(levels);
			}
		}
	}
}
