package viewpackage;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class App extends StateBasedGame {
  public static final String GAME_NAME = "Operation Ice Cream";
  public static final int MENU_STATE = 0;
  public static final int WINDOW_SIZE_X = 1600;
  public static final int WINDOW_SIZE_Y = 900;
  
  public App(String name) {
    super(name);
    this.addState(new Menu());
  }

  public static void main(String[] args) {
    AppGameContainer appGameContainer;
    try {
      appGameContainer = new AppGameContainer(new App(GAME_NAME));
      appGameContainer.setDisplayMode(WINDOW_SIZE_X, WINDOW_SIZE_Y, false);
      appGameContainer.setTargetFrameRate(60);
      appGameContainer.setShowFPS(false);
      appGameContainer.start();
    } catch (SlickException e) {
      e.getStackTrace();
    }
  }

  @Override
  public void initStatesList(GameContainer container) throws SlickException {
    // TODO Auto-generated method stub
    this.enterState(MENU_STATE);
  }
}
