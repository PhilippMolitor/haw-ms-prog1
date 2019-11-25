package io.philslab.prog1.vorlesung_09.Pokemon;

public class Glumanda extends Pokemon 
{	
	public Glumanda()
	{
		super("Glumanda", pokemonType.FIRE, 10);
		addAttack(new Attack("Glut", 3));
	}
}
