package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.iotask2.IOtask2BlockContext;

public class Instructions {

	public static String Get(int index) {
		String i="";
		 
		switch(index) {
		case 0:
			i="Thank you for taking part in this experiment. <br>"                        
					  + "Please close any programs that could cause distraction (e.g. email clients) and " 
					  + "maximise the size of this window.<br><br> "
					  + "This experiment will take approximately 30 minutes. Please only continue when you think "
					  + "you will be free from distractions for the next 30 minutes.<br><br> "
					  + "You may withdraw at any time without penalty, simply by closing your browser window. "
					  + "If you are having difficulty running the experiment we recommend that you try "
					  + "using Google Chrome. Unfortunately the experiment may not be compatible with all " 
					  + "systems and we apologise if you are not able to take part.<br><br> " 
					  + "Click below to continue.";
			break;
		case 1:
			i="In this experiment you will have a simple task to do.<br><br>"
                  + "You will see several yellow circles inside a box. "
                  + "Inside each circle will be a number. <br><br>"
                  + "Using your mouse, you can click on these circles to "
                  + "move them around. Your task is to drag them to the bottom "
                  + "of the box in sequence. "
                  + "Please start by dragging 1 all the way to the bottom. "
                  + "This will make it disappear. Then drag 2 to the bottom, then 3, "
                  + "and so on.<br><br>"
                  + "Click below to practise the task.";
			break;
		case 2:
			i="Now you will continue the same task, but sometimes there will be something else to "
					+ "do.<br><br>As well as dragging each circle in turn to the "
					+ "bottom of the screen, you will be instructed to drag one or more "
					+ "of the circles to another part of the box. For "
					+ "instance, you might be told that you should drag number 5 "
					+ "to the left of the box instead of "
					+ "the bottom.<br><br>You will still be able to drag any "
					+ "circle to the bottom of the box, but you should try to "
					+ "remember to drag these special circles to the instructed "
					+ "location. ";
			break;
		case 3:
			i="Now you will do the task again, but this time there will be three special "
                  + "circles to remember.";
			break;
		case 31:
			i="From now on, you will occasionally be asked to answer arithmetic questions while you do the task.<br><br>"
			      + "If you see a question in a pop-up box, please type in the answer, click OK, then continue with the task.";
			break;
		case 4:
			i="Click below to practice the task one more time before starting the actual experiment.";
			break;
		case 5:
			i="In the next part of the experiment we would like you to practise a strategy that can "
					+ "help you to remember the special circles. You can drag the special circles near to the "
					+ "instructed edge of the box to help you remember.<br><br> " 
					+ "For example, if you had to remember to drag 5 to the left of the box, "
					+ "you could drag it near to there at the beginning, before you drag the 1. " 
					+ "Then when you eventually got to 5, its location would remind you "
					+ "what to do. Please, click below to continue and use this strategy in the task. ";
			break;
		case 6:
			i="In the next part of the experiment we would like you to practise a strategy that can "
					+ "help you to remember the special circles. You can double-click on any of the "
					+ "circles which will make them turn blue. So if you double-click on the special circles "
					+ "at the beginning, this will help you remember which ones they are. This will make it easier "
					+ "to remember which ones to drag to the left, top, or right, instead of the bottom of the box.<br><br> " 
					+ "Please, click below to continue and use this strategy in the task. ";
			break;
		case 7:
			i="In the next part of the experiment we would like you to practise a strategy that can "
					+ "help you to remember the special circles. There will be a button above "
					+ "the box saying 'Reminders'. You can click this button to open a window "
					+ "where you can type in any text to help you remember the special circles. "
					+ "So you can click this button at the beginning and type in any reminders that "
					+ "might help you later on. You can see these reminders any time by clicking the button "
					+ "again.<br><br> " 
					+ "Please, click below to continue and use this strategy in the task. ";
			break;
		case 8:
			i="In the next part of the experiment we would like you to practise doing the task without "
					+ "setting reminders, so you have to remember the special circles yourself.";
			break;
		case 81:
        	i="Now that you have had some practice, we would like you to tell us "
                    + "how <b>confident</b> you are that you can accurately perform the task "
                    + "<b>when you do it exactly as you practised just now</b>.<br><br>"
                    + "Please use the scale below to indicate what percentage of "
                    + "the special circles you can correctly drag to the instructed side of the square, on average. 100% "
                    + "would mean that you always get every single one correct. 0% would mean that you can never "
                    + "get any of them correct.";
            break;
		case 9:
			i="Now you will do the task for real. Please continue doing the task as you did "
					+ "in the practice trial just now.";
			break;
		case 91:
			i="Now the experiment will start for real.<br><br>"
					+ "From this point onwards, you will be able to choose which strategy to use. It is completely up to you,"
					+ " just chose whichever one you think is best.<br><br>Click below to continue.";
			break;
		case 10:
			i = "You have now completed this part of the experiment.<br><br>"
					+ "<b><a href=\"https://research.sc/participant/login/dynamic/4A829951-3246-446A-89E5-FD17232E6F51?external_id="
					+ SessionInfo.participantID + "&external_session_id=" + SessionInfo.sessionKey + "\">"
					+ "CLICK HERE</a></b> to continue.";
		}

		return(i);	
	}
	
	public static String InfoText() {
		return ("We would like to invite you to participate in this research project. "
                + "You should only participate if you want to; choosing not to take part "
                + "will not disadvantage you in any way. Before you decide whether you "
                + "want to take part, please read the following information carefully and "
                + "discuss it with others if you wish. Ask us if there is anything that "
                + "is not clear or you would like more information.<br><br>"
                + "We are recruiting volunteers from the Amazon Mechanical Turk website to "
                + "take part in an experiment aiming to improve our understanding of human "
                + "attention and memory. You will see various objects on the screen like coloured, numbered circles, "
                + "and you will be asked to move them with your computer mouse. Sometimes you will be asked to remember "
                + "particular numbers and move the corresponding circle in a particular direction. You will be asked how "
                + "confident you are in your ability to solve the task. "
                + "The experiment "
                + "will last approximately 45 minutes and you will receive a payment of $2 plus an additional bonus via the "
                + "Amazon Mechanical Turk payment system. There are no anticipated risks or "
                + "benefits associated with participation in this study.<br><br>"
                + "It is up to you to decide whether or not to take part. If you choose "
                + "not to participate, you won't incur any penalties or lose any "
                + "benefits to which you might have been entitled. However, if you do "
                + "decide to take part, you can print out this information sheet and "
                + "you will be asked to fill out a consent form on the next page. "
                + "Even after agreeing to take "
                + "part, you can still withdraw at any time and without giving a reason. If you withdraw before the "
                + "end of the experiment, we will not retain your data and it will not be analysed."
                + "<br><br>All data will be collected and stored in accordance with the General Data Protection "
                + "Regulations 2018. Personal information is stored separately from test results, and researchers "
                + "on this project have no access to this data. Your personal information such as name and email "
                + "address is held by Amazon Mechanical Turk but the researchers on this project have no acccess "
                + "to this. Data from this experiment may be made available to the research community, for example by "
                + "posting them on websites such as the Open Science Framework (<a href=\"http://osf.io\">http://osf.io</a>). "
                + "It will not be possible to identify you from these data.<br><br>"
                + "We aim to publish the results of this project in scientific journals and book chapters. Copies of the "
                + "results can either be obtained directly from the scientific journals' websites or from us.<br><br>"
                + "Should you wish to raise a complaint, please contact the Principal Investigator of this project, "
                + "Professor Sam Gilbert (<a href=\"mailto:sam.gilbert@ucl.ac.uk\">sam.gilbert@ucl.ac.uk</a>). However, "
                + "if you feel your complaint has not been handled to your satisfaction, please be aware that you can "
                + "also contact the Chair of the UCL Research Ethics Committee (<a href=\"mailto:ethics@ucl.ac.uk\">ethics@ucl.ac.uk</a>).");
    }

}
