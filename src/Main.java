import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            // List and write file in a folder
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Which directory do you wanna search?");
            String folderToSearch = bufferedReader.readLine();
            System.out.println("Ok, let's search the folder: " + folderToSearch);

            Search search = new Search(folderToSearch);
            search.startSearch();

            // Check if file exists in certain directory
            System.out.println("What folder do you wanna search?");
            String folderToSearch2 = bufferedReader.readLine();
            System.out.println("What file do you want to check if exists in this folder?");
            String fileToSearch = bufferedReader.readLine();
            System.out.println("Ok, let's see if " + fileToSearch + " exists in " + folderToSearch);
            System.out.println(search.fileExists(fileToSearch, folderToSearch2));

            System.out.println("What file do you want to create?");
            String fileToCreate = bufferedReader.readLine();
            System.out.println("In which directory?");
            String directoryToCreateFileIn = bufferedReader.readLine();

            search.createFileInDirectory(fileToCreate, directoryToCreateFileIn);
            System.out.println("File " + fileToCreate + " has been created in " + directoryToCreateFileIn + " GOOD JOB CACETEIROS");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
