package com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository;

import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
