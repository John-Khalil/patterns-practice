package singleton;

public class DatabaseConnection {
  private static DatabaseConnection instance;

  private DatabaseConnection(){
    System.out.println("Singleton initialized");
  }

  public static DatabaseConnection getInstance(){
    if (instance == null){
      instance=new DatabaseConnection();
    }
    return instance;
  }

  public void connect(){
    System.out.println("Connected");
  }
}