package com.example.chgk.job;

import com.example.chgk.model.dto.request.QuestionInfoRequest;
import com.example.chgk.model.enums.QuestionStatus;
import com.example.chgk.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JobService {

    private final QuestionService questionService;

    @Scheduled(cron = "0 0 0 * * *")
    public void rejectOldQuestions() {
        questionService.getQuestionsToDelete()
                .stream()
                .forEach(question ->
                        questionService.approveQuestion(question.getId(), new QuestionInfoRequest(), QuestionStatus.REJECTED));
    }
}
