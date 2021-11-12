package com.example.resttodo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoEntity {
    private String id;
    private String userId;
    private String title; // to-do 타이틀 (ex: 코테준비)
    private boolean done; // if true => todo를 완료한 경우에 checked
}
