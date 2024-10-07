package com.example.chgk.service;

import com.example.chgk.model.db.entity.Question;
import com.example.chgk.model.dto.request.QuestionInfoRequest;
import com.example.chgk.model.dto.request.QuestionPackRequest;
import com.example.chgk.model.dto.response.QuestionInfoResponse;
import com.example.chgk.model.enums.QuestionStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import java.util.List;

public interface QuestionService {
    Page<QuestionInfoResponse> getAllQuestions(Integer page, Integer perPage, String sort, Sort.Direction order);
    QuestionInfoResponse getQuestion(Long id);
    List<QuestionInfoResponse> getQuestionPack(QuestionPackRequest request);
    QuestionInfoResponse getAnswer(Long id);
    QuestionInfoResponse createQuestion(QuestionInfoRequest request);
    QuestionInfoResponse updateQuestion(Long id, QuestionInfoRequest request);
    QuestionInfoResponse approveQuestion(Long id, QuestionInfoRequest request, QuestionStatus status);
    void deleteQuestion(Long id);
    Page<QuestionInfoResponse> getQuestionsToApprove(Integer page, Integer perPage, String sort, Sort.Direction order);
    Question getQuestionDb(Long id);
    List<Question> getQuestionsToDelete();
}
