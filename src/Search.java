import java.io.*;

public class Search {

    File[] listOfFiles;
    String folderToSearch;
    File folder;

    public Search(String folderToSearch) {
        this.folder = new File(folderToSearch);
        this.folderToSearch = folderToSearch;
        this.listOfFiles = folder.listFiles();
    }

    public void startSearch() {

        BufferedWriter bufferedWriter = null;

        try {

            bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));

            for (int i = 0; i < listOfFiles.length; i++) {
                System.out.println("LIST OF FILES: " + listOfFiles[i]);
                bufferedWriter.write(listOfFiles[i] + "\n");
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("That folder does not exist");
            System.exit(1);
        }
    }

    public boolean fileExists(String fileToSearch, String directory) {

        File file = new File(directory);

        if (file.isDirectory()) {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].getName().equals(fileToSearch)) {
                    System.out.println("File " + fileToSearch + " exists in " + directory);
                    return true;
                } else {
                    System.out.println("File " + fileToSearch + " does not exist in " + directory);
                    return false;
                }
            }
        }
        return false;
    }

    public void createFileInDirectory(String fileToCreate, String directory) {

        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(directory + "/" + fileToCreate));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
