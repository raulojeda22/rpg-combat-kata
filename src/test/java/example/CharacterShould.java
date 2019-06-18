package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterShould {

	@Test
	public void start_character() {

		Character player1 = new Melee("Guillermo");
		

		assertEquals(player1.getHealth(), 1000f,0f);
		assertEquals(player1.getLevel(), 1);
		assertEquals(player1.isAlive(), true);
		assertEquals(player1.getName(), "Guillermo");


	}

	@Test
	public void deal_damage_to_player() {

		Character player2 = new Melee("Guillermo");
				
		player2.setDamage(10);

		assertEquals(player2.getHealth(), 990,0.000f);
		
	}
	
	@Test
	public void heal_player() {

		Character player2 = new Melee("Guillermo");
		player2.setDamage(10);		
		player2.setHeal(5);

		assertEquals(player2.getHealth(), 995,0.000f);
		

	}
	
	@Test
	public void player_dies() {

		Character player2 = new Melee("Guillermo");
		
		player2.setDamage(1000);		
		
		assertEquals(player2.isAlive(), false);
		

	}
	
	@Test
	public void player_heal_to_die() {

		Character player2 = new Melee("Guillermo");
		
		player2.setHeal(-1000);		

		assertEquals(player2.isAlive(), false);
		

	}
	
	@Test
	public void heal_a_dead_body() {

		Character player2 = new Melee("Guillermo");
		
		player2.setDamage(10000);		
		
		
		double healthBeforeHeal=player2.getHealth();
		
		player2.setHeal(100);
		
		
		assertEquals(healthBeforeHeal, player2.getHealth(),0.000f);
		

	}
	
	@Test
	public void overheal() {

		Character player2 = new Melee();	
		
		
		player2.setHeal(100);
		
		
		assertEquals(player2.getHealth(),1000,0.000f);
		

	}
	
	@Test
	public void player_attack_himself(){

		Character player2 = new Melee();	
		Character player1 = new Melee();	

		Attack sword = new Attack(player1,player2);
		
		assertEquals(sword.isAttackPossible(), false);
		
	}
	@Test
	public void player_heal_a_enemy(){

		Character player2 = new Melee("Raül");	
		Character player1 = new Melee("Güillermo");
		player2.setFaction(2);
		
		Heal cura= new Heal(player1,player2);
				
		assertEquals(cura.isHealPossible(), false);
		
	}
	@Test
	public void player_damage_to_enemy(){

		Character player2 = new Melee("Raül");	
		Character player1 = new Melee("Güillermo");
		player2.setFaction(2);
				
		Attack sword = new Attack(player1,player2);
		
		sword.attack(10);
		
		assertEquals(player2.getHealth(), 990,0.000f);
		
	}
	@Test
	public void player_damage_himself(){

		
		Character player1 = new Melee("Güillermo");
				
		Attack sword = new Attack(player1,player1);
		sword.attack(10);
		
		assertEquals(player1.getHealth(), 1000,0.000f);
		
	}
	@Test
	public void player_heal_to_enemy(){

		Character player2 = new Melee("Raül");	
		Character player1 = new Melee("Güillermo");
		player2.setHealth(900);
		player2.setFaction(2);
		
				
		Heal cura= new Heal(player1,player2);
		cura.heal(10);
		
		assertEquals(900,player2.getHealth(),0.000f);
		
	}
	@Test
	public void player_heal_himself(){

		Character player2 = new Melee("Raül");	
		
		player2.setHealth(900);
				
		Heal cura= new Heal(player2,player2);
		cura.heal(10);
		
		assertEquals(910,player2.getHealth(),0.000f);
		
	}
	@Test
	public void player_attack_with_5_level_more(){

		
		Character player2 = new Melee("Raül");	
		Character player1 = new Melee("Güillermo");
		player1.setLevel(6);
		player2.setFaction(2);
				
		Attack sword = new Attack(player1,player2);
		
		sword.attack(100);
		
		
		assertEquals( 850,player2.getHealth(),0.000f);
		
	}
	@Test
	public void player_attack_range() {

		
		Melee player2 = new Melee("Raül");	
		Ranged player1 = new Ranged("Güillermo");
		player2.setFaction(2);

		
		
		assertEquals( 20,player1.getAttackRange(),0.000f);
		assertEquals( 2,player2.getAttackRange(),0.000f);
		
	}
	@Test
	public void player_attack_with_5_level_less(){

		
		Melee player2 = new Melee("Raül");	
		Melee player1 = new Melee("Güillermo");
		player2.setLevel(6);
		player2.setFaction(2);
				
		Attack sword = new Attack(player1,player2);
		
		sword.attack(100);
		
		
		assertEquals( 950,player2.getHealth(),0.000f);
		
	}

	
	@Test
	public void player_attack_not_in_range(){

		
		Character player1 = new Melee("Güillermo");
		Character player2 = new Melee("Raül");
		player1.setPosition(1);
		player2.setFaction(2);
		
		Attack sword = new Attack(player1,player2);		
		sword.attack(100);
		
		assertEquals(1000, player2.getHealth(),0f);
	
		
	}
	@Test
	public void player_attack_allied(){

		
		Character player1 = new Melee("Güillermo");
		Character player2 = new Melee("Raül");
		
		
		Attack sword = new Attack(player1,player2);		
		sword.attack(100);
		
		assertEquals(1000, player2.getHealth(),0f);
	
		
	}
	@Test
	public void player_heal_allied(){

		
		Character player1 = new Melee("Güillermo");
		Character player2 = new Melee("Raül");
		player2.setHealth(900);
		
		Heal cura = new Heal(player1,player2);		
		cura.heal(100);
		
		assertEquals(1000, player2.getHealth(),0f);
	
		
	}
	@Test
	public void player_heal_a_thing(){

		
		Character player1 = new Melee("Güillermo");
		Thing arbol = new Thing();
		player1.setFaction(0);
		
		Heal cura = new Heal(player1,arbol);		
		cura.heal(100);
		
		assertEquals(2000, arbol.getHealth(),0f);
	
		
	}
	@Test
	public void player_attack_a_thing(){

		
		Character player1 = new Melee("Güillermo");
		Thing arbol = new Thing();
				
		Attack sword = new Attack(player1,arbol);		
		sword.attack(100);
		
		assertEquals(1900, arbol.getHealth(),0f);
	
		
	}
}
