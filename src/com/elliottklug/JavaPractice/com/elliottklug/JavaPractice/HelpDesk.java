package com.elliottklug.JavaPractice;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

import static com.elliottklug.JavaPractice.Category.*;

public class HelpDesk {

	private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
		@Override
		public int compare(Enquiry o1, Enquiry o2) {
			return o1.getCategory().compareTo(o2.getCategory());
		}
	};
	//private final Queue<Enquiry> enquiries = new ArrayDeque<>();
	private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

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

	public void processAllEnquires() {
		Enquiry enquiry;
		while ((enquiry = enquiries.poll()) != null)
		{
			final String message = "Have you tried turning your " + enquiry.getCategory() + " off and on again?";
			enquiry.getCustomer().reply(message);
		}

	}
}
