package screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import main.OperationIceCream;

public class AudioSettings extends BasicGameState {

  @Override
  public void init(GameContainer container, StateBasedGame game) throws SlickException {
  }

  @Override
  public void render(GameContainer container, StateBasedGame game, Graphics g)
      throws SlickException {
  }

  @Override
  public void update(GameContainer container, StateBasedGame game, int delta)
      throws SlickException {
    
  }

  @Override
  public int getID() {
    return OperationIceCream.AUDIO_SETTINGS;
  }

}
