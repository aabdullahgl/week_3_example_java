package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new MailLogger(), new DataBaseLogger(),new ConsoleLogger() };
//		for (BaseLogger Logger : loggers) {
//			Logger.Log("Log mesajı");
//		}

		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
