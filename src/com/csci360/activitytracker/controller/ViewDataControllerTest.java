package com.csci360.activitytracker.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class ViewDataControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		new JFXPanel();
	}

	@After
	public void tearDown() throws Exception {
		Platform.exit();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
