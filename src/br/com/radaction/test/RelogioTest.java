package br.com.radaction.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.radaction.Relogio;

public class RelogioTest {

	@Test
	public void testMostraRelogio() {
		Relogio r1 = new Relogio();
		Relogio r2 = new Relogio();
		String hora1 = r1.mostraHora(82800);
		String hora2 = r2.mostraHora(81120);
		assertEquals("23:00:00", hora1);
		assertEquals("22:32:00", hora2);

	}

}
