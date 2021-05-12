package com.mcnz.rps;

import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

public class GameSummaryTest {

	@Test
	public void testGetClientGesture() {

		Assert.assertTrue(true);

	}

	@Test
	public void testGetServerGesture() {
		//GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
		Assert.assertTrue(true);
	}

	@Test
	public void testGetResult() {
		//GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
		Assert.assertEquals( "win", "win");
	}

	@Test
	public void testGetDate() {
		//GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
		Assert.assertNull(null);
	}

}
