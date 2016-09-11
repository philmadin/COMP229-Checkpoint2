package onscreen;

import java.awt.Graphics;

public class SheepCarrying extends CharacterDecorator{
	
	public SheepCarrying(Character c) {
		super(c);
	}

    public void draw(Graphics g){
    	character.draw(g);
		g.setColor(new java.awt.Color(255,255,255));
    	g.fillRect(character.location.getTopLeft().x+5, character.location.getTopLeft().y+5, 25, 25);
    }

}
