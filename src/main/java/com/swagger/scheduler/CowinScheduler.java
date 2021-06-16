package com.swagger.scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.swagger.client.Cowin;
import com.swagger.model.Center;
import com.swagger.model.Session;

@Component
public class CowinScheduler {

	
	@Autowired
	private Cowin cowin;;
	
	@Autowired
    private JavaMailSender javaMailSender;
    
    void sendEmail(String centermsg) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("mhtshrm@gmail.com");

        msg.setSubject("Cowin update");
        msg.setText(centermsg);

        javaMailSender.send(msg);

    }
	
	@Scheduled(fixedDelay = 10000)
	public void run() {
		//
		 Map<String, List<Center>> centers= cowin.getCenters("355", "31-05-2021");
			
		 List<Center> centers1 = centers.get("centers").stream().collect(Collectors.toList());
		 List<Center> center18Plus = new ArrayList<>();
		 for (Center center : centers1) {
			for (Session session : center.getSessions()) {
				if(String.valueOf(session.getMinAgeLimit()).equals("18") & session.getAvailableCapacityDose1()>0) {
					center18Plus.add(center);
					String msg = center.getBlockName() + " : " + center.getDistrictName() + ":" + center.getPincode();
					sendEmail(msg);
				}
			} 
		}
		System.out.println("Scheduler running");
	
	}
}
