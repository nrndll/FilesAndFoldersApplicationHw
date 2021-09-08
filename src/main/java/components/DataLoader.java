package components;

import models.Extension;
import models.File;
import models.Folder;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import repositories.FileRepository;
import repositories.FolderRepository;
import repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        User user1 = new User("Ocean Wisdom");
        userRepository.save(user1);

        User user2 = new User("P Money");
        userRepository.save(user2);

        Folder folder1 = new Folder("Ps", user2);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Bars", user1);
        folderRepository.save(folder2);

        File file1 = new File("Man", Extension.TXT, 32, folder2);
        fileRepository.save(file1);

        File file2 = new File("Skeng", Extension.JAVA, 10, folder2);
        fileRepository.save(file2);
    }
}
