package com.ssafy.moida.repository;

import com.ssafy.moida.model.Project;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 프로젝트 레포지토리
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // 프로젝트 전체 조회
    List<Project> findAll();

    // 프로젝트 상세 조회
    Project findById(long id);
}
