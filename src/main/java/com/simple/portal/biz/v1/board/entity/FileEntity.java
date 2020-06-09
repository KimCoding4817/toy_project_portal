package com.simple.portal.biz.v1.board.entity;

import com.simple.portal.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double id; // 기본키

    @Column
    private String orgFileName; // 원본 파일 이름

    @Column
    private String fileName; // 파일 이름

    @Column
    private double fileSize; // 파일 사이즈

    @Column
    private String fileExtension; // 파일 확장자

    @NotEmpty
    @NotNull
    @ManyToOne
    BoardEntity boardEntity;

}
