//This code will display some text on the screen, with a button underneath.
//When the user clicks the button, the screen is cleared and we go back to the 
//SequenceHandler.
//
//Usage: ClickPage.Run(String textToDisplay, String textOnButton)
//e.g.:
//ClickPage.Run("Hello", "Click here to continue")
//
//The text to display can include HTML code e.g. <b> for bold


package com.sam.webtasks.basictools;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sam.webtasks.client.SequenceHandler;
import com.sam.webtasks.iotask1.IOtask1Block;
import com.sam.webtasks.iotask1.IOtask1BlockContext;

public class ClickPage {
	public static void Run(String htmlText, String buttonText) {
		final HTML displayText = new HTML(htmlText);
	    final Button continueButton = new Button(buttonText);
	    
		final HorizontalPanel horizontalPanel = new HorizontalPanel();
	    final VerticalPanel verticalPanel = new VerticalPanel();

	    //set up vertical panel
	    verticalPanel.setWidth("75%");
	    verticalPanel.setHeight("75%");

	    verticalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
	    verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

	    //add elements to panel
	    displayText.setStyleName("instructionText");
	    verticalPanel.add(displayText);
	    
	    if (!buttonText.contentEquals("nobutton")) {
	    	verticalPanel.add(continueButton);
	    }

	    //place vertical panel inside horizontal panel, so it can be centred
	    horizontalPanel.setWidth(Window.getClientWidth() + "px");
	    horizontalPanel.setHeight(Window.getClientHeight() + "px");

	    horizontalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	    horizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

	    horizontalPanel.add(verticalPanel);

	    //add panel to root
	    RootPanel.get().add(horizontalPanel);

	    //set up clickhandler  
	    continueButton.addClickHandler(new ClickHandler() {
	        public void onClick(ClickEvent event) {
	            RootPanel.get().remove(horizontalPanel);

	            new Timer() {
	                public void run() {
	                	SequenceHandler.Next();
	                }
	            }.schedule(500);
	        }
	    });
	}

	public static void Run_ChooseOffload(String htmlText) {
		final IOtask1Block block = IOtask1BlockContext.getContext();
		
		final HTML displayText = new HTML(htmlText);
	    
		final HorizontalPanel horizontalPanel = new HorizontalPanel();
	    final VerticalPanel verticalPanel = new VerticalPanel();

	    //set up vertical panel
	    verticalPanel.setWidth("75%");
	    verticalPanel.setHeight("75%");

	    verticalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
	    verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

	    //add elements to panel
	    displayText.setStyleName("instructionText");
	    verticalPanel.add(displayText);

	    //place vertical panel inside horizontal panel, so it can be centred
	    horizontalPanel.setWidth(Window.getClientWidth() + "px");
	    horizontalPanel.setHeight(Window.getClientHeight() + "px");

	    horizontalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	    horizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

	    horizontalPanel.add(verticalPanel);

	    //now add the buttons

	    String noReminder = "I will just<br>remember by myself";
		String prospective = "Double-click the<br>circles to turn them blue";
		String retrospective = "Use the reminder button<br>at the top to type in text";
		String both = "Drag the circles next to<br>where they are supposed to go";
		
		final Button noReminder_button = new Button(noReminder);
		final Button prospective_button = new Button(prospective);
		final Button retrospective_button = new Button(retrospective);
		final Button both_button = new Button(both);
		
		final HorizontalPanel hPanel1 = new HorizontalPanel();
		final HorizontalPanel hPanel2 = new HorizontalPanel();
		final VerticalPanel vPanel = new VerticalPanel();
		
		final VerticalPanel frame = new VerticalPanel();
		
		
		vPanel.setHeight("100px");
		hPanel1.setWidth("525px");
		hPanel2.setWidth("525px");
		noReminder_button.setWidth("250px");
		prospective_button.setWidth("250px");
		retrospective_button.setWidth("250px");
		both_button.setWidth("250px");
		
		hPanel1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		
		if(Counterbalance.getFactorLevel("buttonOrder1") == 1) {
			hPanel1.add(noReminder_button);
		} else {
			hPanel1.add(prospective_button);
		}
		
		hPanel1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		
		if(Counterbalance.getFactorLevel("buttonOrder1") == 0) {
			hPanel1.add(noReminder_button);
		} else {
			hPanel1.add(prospective_button);
		}
		
		hPanel2.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		
		if(Counterbalance.getFactorLevel("buttonOrder2") == 1) {
			hPanel2.add(retrospective_button);
		} else {
			hPanel2.add(both_button);
		}
		
		hPanel2.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		if(Counterbalance.getFactorLevel("buttonOrder2") == 0) {
			hPanel2.add(retrospective_button);
		} else {
			hPanel2.add(both_button);
		}
		
		vPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_TOP);
		
		if(Counterbalance.getFactorLevel("buttonOrder3") == 1) {
			vPanel.add(hPanel1);
		} else {
			vPanel.add(hPanel2);
		}

		vPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_BOTTOM);
		
		if(Counterbalance.getFactorLevel("buttonOrder3") == 0) {
			vPanel.add(hPanel1);
		} else {
			vPanel.add(hPanel2);
		}
		
		noReminder_button.addClickHandler(new ClickHandler() {
	        public void onClick(ClickEvent event) {
	        	IOtask1BlockContext.setOffloadCondition(Names.REMINDERS_NOTALLOWED);
	        	
	        	RootPanel.get().remove(horizontalPanel);
	        	
	        	String data = block.blockNum + "," + block.currentTrial + ",1";
	    		PHP.logData("strategyChoice", data, true);
	        }
		});
		
		prospective_button.addClickHandler(new ClickHandler() {
	        public void onClick(ClickEvent event) {
	        	IOtask1BlockContext.setOffloadCondition(Names.REMINDERS_PROSPECTIVE_MANDATORY);
	        	
	        	RootPanel.get().remove(horizontalPanel);
	        	
	        	String data = block.blockNum + "," + block.currentTrial + ",2";
	    		PHP.logData("strategyChoice", data, true);
	    		
	        	SequenceHandler.Next();
	        }
		});
		
		retrospective_button.addClickHandler(new ClickHandler() {
	        public void onClick(ClickEvent event) {
	        	IOtask1BlockContext.setOffloadCondition(Names.REMINDERS_RETROSPECTIVE_MANDATORY);
	        	
	        	RootPanel.get().remove(horizontalPanel);
	        	
	        	String data = block.blockNum + "," + block.currentTrial + ",3";
	    		PHP.logData("strategyChoice", data, true);
	        	
	        	SequenceHandler.Next();
	        }
		});
		
		both_button.addClickHandler(new ClickHandler() {
	        public void onClick(ClickEvent event) {
	        	IOtask1BlockContext.setOffloadCondition(Names.REMINDERS_MANDATORY_ANYCIRCLE);
	        	
	        	RootPanel.get().remove(horizontalPanel);
	        	
	        	String data = block.blockNum + "," + block.currentTrial + ",4";
	    		PHP.logData("strategyChoice", data, true);
	        	
	        	SequenceHandler.Next();
	        }
		});
	     
		
		verticalPanel.add(vPanel);	
		horizontalPanel.add(verticalPanel);
		
		//add panel to root
	    RootPanel.get().add(horizontalPanel);
	}
}

