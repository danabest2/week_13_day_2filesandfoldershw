package com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository;

import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
