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

public class TestWithRobotiumTP19 extends
		ActivityInstrumentationTestCase2<DiaryCall> {

	Solo soloMonitor;
	Long clock;
	private boolean waitAct;
	private Random rd;
	private String newMsg;

	public TestWithRobotiumTP19() {
		super(DiaryCall.class);
	}

	public void setUp() throws Exception {
		soloMonitor = new Solo(getInstrumentation(), getActivity());
		clock = 0L;
		rd = new Random();
		newMsg = "Início da mensagem--";
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
		soloMonitor.clickOnButton("Enviar Mensagem");
		
		waitAct = soloMonitor.waitForActivity(SendMessage.class, 1000);
		assertTrue(waitAct);
		newMsg += rd.nextInt()+"--Fim da mensagem";
		soloMonitor.enterText(1, newMsg);
		soloMonitor.clickOnButton("Enviar");
		assertTrue(soloMonitor.searchText("Mensagem enviada com sucesso!"));
		
		
	}
	
	@LargeTest
	public void testTree_TC1() {
		// assert DiaryCall with the initial Activity
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		// assert that listContacts is in the view
		ListView listTemp = (ListView) soloMonitor.getView(R.id.listContacts);
		assertEquals(listTemp.getId(), R.id.listContacts);
		assertTrue(listTemp.getCount() != 0);

		soloMonitor.clickOnButton("Create Contact");
		waitAct = soloMonitor.waitForActivity(NewContact.class);// 1000
		assertTrue(waitAct);
		soloMonitor.enterText(0, "DiaryNumbers" + rd.nextInt());
		soloMonitor.enterText(1, "96" + rd.nextInt(10) + rd.nextInt(10) + "24"
				+ rd.nextInt(10) + rd.nextInt(10));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		soloMonitor.clickOnButton("Confirmar");
		waitAct = soloMonitor.waitForActivity(DiaryCall.class);
		assertTrue(waitAct);
		assertTrue(soloMonitor.searchText("Contato cadastrado com sucesso!"));
		
		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Enviar Mensagem");
		waitAct = soloMonitor.waitForActivity(SendMessage.class, 1000);
		assertTrue(waitAct);
		newMsg += rd.nextInt()+"--Fim da mensagem";
		soloMonitor.enterText(1, newMsg);
		soloMonitor.clickOnButton("Enviar");
		assertTrue(soloMonitor.searchText("Mensagem enviada com sucesso!"));
		
		
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
		assertTrue(soloMonitor.searchText("Ligação finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Apagar");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		soloMonitor.clickOnText("SIM");
		assertTrue(soloMonitor.searchText("Contato removido com sucesso!"));
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		
		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Enviar Mensagem");
		waitAct = soloMonitor.waitForActivity(SendMessage.class, 1000);
		assertTrue(waitAct);
		newMsg += rd.nextInt()+"--Fim da mensagem";
		soloMonitor.enterText(1, newMsg);
		soloMonitor.clickOnButton("Enviar");
		assertTrue(soloMonitor.searchText("Mensagem enviada com sucesso!"));
		
		
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
		assertTrue(soloMonitor.searchText("Ligação finalizada"));
		soloMonitor.assertCurrentActivity("Activity wrong", InfoContato.class);
		soloMonitor.clickOnButton("Apagar");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		soloMonitor.clickOnText("SIM");
		assertTrue(soloMonitor.searchText("Contato removido com sucesso!"));
		soloMonitor.assertCurrentActivity("Activity wrong", DiaryCall.class);
		
		// soloMonitor.clickInList(0);
		soloMonitor.clickInList(0);
		clock = System.currentTimeMillis();
		waitAct = soloMonitor.waitForActivity(InfoContato.class, 1000);// 1000
		assertTrue(waitAct);
		waitAct = soloMonitor.waitForActivity(CallReceived.class, 6000);// 1000
		assertTrue(waitAct);
		soloMonitor.clickOnButton("Enviar Mensagem");
		waitAct = soloMonitor.waitForActivity(SendMessage.class, 1000);
		assertTrue(waitAct);
		newMsg += rd.nextInt()+"--Fim da mensagem";
		soloMonitor.enterText(1, newMsg);
		soloMonitor.clickOnButton("Enviar");
		assertTrue(soloMonitor.searchText("Mensagem enviada com sucesso!"));
		
		
	}
	



	public void tearDown() throws Exception {
		soloMonitor.finishOpenedActivities();
	}

}
