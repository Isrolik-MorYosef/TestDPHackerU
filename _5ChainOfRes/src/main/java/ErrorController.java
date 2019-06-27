
public class ErrorController extends LogHandler {

	@Override
	public void handle(LogLevels levels) {
		if (levels.getValue() >= 2)
		{
			System.out.println("print The log to file ");
		}
		if (levels.getValue() > 2)
		{
			if (next != null)
			{
				next.handle(levels);
			}
		}
	}

}