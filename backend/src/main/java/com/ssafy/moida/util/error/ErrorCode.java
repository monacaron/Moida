package com.ssafy.moida.util.error;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 프로젝트 관련 에러코드
 */

@Getter
@AllArgsConstructor
public enum ErrorCode {
    /* 404 NOT_FOUND : DATA를 찾을 수 없음 */
    DATA_NOT_FOUND(NOT_FOUND, "일치하는 데이터가 없습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
