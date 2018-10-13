package classRoomSessions;

//import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflect {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c1 = Class.forName("db.C2");
		 Method[] declaredMethods = c1.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		 /*Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
			for (Constructor method : declaredConstructors) {
				System.out.println(method.getName());
			}*/
	}

}
