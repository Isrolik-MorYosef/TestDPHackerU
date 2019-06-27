
public class Main {

	public static void main(String[] args) {
		
		LogHandler info = new InfoController();
		LogHandler error = new ErrorController();
		LogHandler fatal = new FatalController();

		info.setNext(error);
		error.setNext(fatal);
		fatal.setNext(null);

		info.handle(LogLevels.ERROR);


	}

}
