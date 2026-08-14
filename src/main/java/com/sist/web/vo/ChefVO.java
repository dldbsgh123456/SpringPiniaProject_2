package com.sist.web.vo;

import lombok.Data;


@Data
// 테이블명이랑 클래스명이 같아서 table 어노테이션 안 씀
public class ChefVO {

    private String chef;
    private String poster;
    private String mem_cont1,mem_cont3,mem_cont2,mem_cont7;
}
