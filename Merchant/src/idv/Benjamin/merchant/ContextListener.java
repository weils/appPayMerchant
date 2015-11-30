package idv.Benjamin.merchant;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ContextListener implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		Constants.loadUp();
		
	}

}
	