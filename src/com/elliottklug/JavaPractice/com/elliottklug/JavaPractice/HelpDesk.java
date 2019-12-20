package com.elliottklug.JavaPractice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static com.elliottklug.JavaPractice.Category.*;

public class HelpDesk {
	private final Queue<Enquiry> enquiries = new ArrayDeque<>();
	
	public void enquire(final Customer customer, final Category category)
	{
		enquiries.offer(new Enquiry(customer, category));
	}

	public void processEnquiry(final Predicate<Enquiry> predicate, final String message)
	{
		final Enquiry enquiry = enquiries.peek();
		if (enquiry != null && predicate.test(enquiry))
		{
			enquiries.remove();
			enquiry.getCustomer().reply(message);
		}
		else
		{
			System.out.println("No work to do, let's have some coffee!");
		}
	}
	
	public void processGeneralEnquiry()
	{
		Predicate<Enquiry> predicate = enq -> enq.getCategory() != PRINTER;
		final String message = "Have you tried turning your device off and on again?";
		processEnquiry(predicate, message);
	}
	
	public void processPrinterEnquiry()
	{
		final Predicate<Enquiry> predicate = enq -> enq.getCategory() == PRINTER;
		final String message = "Is it out of paper?";
		processEnquiry(predicate, message);

	}
}
