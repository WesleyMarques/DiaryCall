package com.example.diarycall.test;

import java.util.Random;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;

import com.example.diarycall.R;
import com.example.diarycall.GUI.CallReceived;
import com.example.diarycall.GUI.NewContact;
import com.example.diarycall.GUI.DiaryCall;
import com.example.diarycall.GUI.InfoContato;
import com.example.diarycall.GUI.SendMessage;
import com.robotium.solo.Solo;

public class TestWithRobotiumTP18 extends
		ActivityInstrumentationTestCase2<DiaryCall> {

	Solo soloMonitor;
	Long clock;
	private boolean waitAct;
	private Random rd;
	private String newName;

	public TestWithRobotiumTP18() {
		super(DiaryCall.class);
	}

	public void setUp() throws Exception {
		soloMonitor = new Solo(getInstrumentation(), getActivity());
		clock = 0L;
		rd = new Random();
		newName = "";
	}

	@LargeTest
	public void testTree_TC0() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	
	@LargeTest
	public void testTree_TC1() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC2() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	
	@LargeTest
	public void testTree_TC3() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC4() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC5() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC6() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC7() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC8() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC9() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC10() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}
	@LargeTest
	public void testTree_TC11() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);
		// click in the 0 position listView

		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Atender");
		assertTrue(soloMonitor.searchButton("Desligar", true));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Desligar");
		assertTrue(soloMonitor.searchText("Liga��o finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Editar");
		newName = "NewDiaryNumbers" + rd.nextInt();
		soloMonitor.enterText(0, newName);
		soloMonitor.clickOnButton("Salvar");
		assertTrue(soloMonitor.searchText("Altera��o realizada com sucesso"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		assertTrue(soloMonitor.searchText(newName));
		
	}

	



	public void tearDown() throws Exception {
		soloMonitor.finishOpenedActivities();
	}

}
