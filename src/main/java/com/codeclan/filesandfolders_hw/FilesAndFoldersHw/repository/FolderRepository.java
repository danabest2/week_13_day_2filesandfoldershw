package com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository;

import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
