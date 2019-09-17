package com.codeclan.filesandfolders_hw.FilesAndFoldersHw;

import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.File;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.Folder;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository.FileRepository;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository.FolderRepository;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersHwApplicationTests {

	@Autowired
	FileRepository fileRepository;


	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;
	private Folder folder;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave(){
		File file = new File("The Blue File", ".txt", 20, folder);
		fileRepository.save(file);
		Folder folder = new Folder("The Sales Folder");
		folderRepository.save(folder);
	}






}
