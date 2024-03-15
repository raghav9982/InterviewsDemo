package com.example.Interview;

import com.example.Interview.resource.InterviewResource;
import com.example.Interview.service.InterviewService;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import org.springframework.util.Assert;

@SpringBootTest
class InterviewApplicationTests {

	@Mock
	InterviewResource interviewResource;

	@InjectMocks
	InterviewService interviewService;

	@Test
	void test() {

		Mockito.when(interviewResource.getEmployeeById(10)).thenReturn(null);
		//Assert.notNull(interviewResource.getEmployeeById(10), null);
	}




}
