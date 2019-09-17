package com.codeclan.filesandfolders_hw.FilesAndFoldersHw.components;

import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.File;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.Folder;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.models.User;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository.FileRepository;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository.FolderRepository;
import com.codeclan.filesandfolders_hw.FilesAndFoldersHw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;
    private Folder folder;
    private File file;
    private Folder folder_id;

    public void run(ApplicationArguments args) {

        File green = new File("The Green File", ".txt", 15, folder_id);
        fileRepository.save(green);

        File yellow = new File("The Yellow File", ".ppt", 20, folder_id);
        fileRepository.save(yellow);


        Folder hr = new Folder("The HR File");
        folderRepository.save(hr);


        Folder marketing = new Folder("The Marketing File");
        folderRepository.save(marketing);


        User john = new User("John");
        userRepository.save(john);
    }
}
