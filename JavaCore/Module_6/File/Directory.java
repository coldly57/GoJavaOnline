package module6.task1file;

import java.util.ArrayList;

public class Directory {

    private ArrayList<File> filesList = new ArrayList<>();

    public Directory(File... files){

        for (int i = 0; i < files.length + 1; i++) {
            try {
                this.filesList.add(files[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index '" + i + "' doesn't exist in array 'files'!");
            }
        }
    }

    public ArrayList<File> getFilesList() {
        return this.filesList;
    }

    public void setFilesInDir(File... files){
        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public static void main(String[] args) {

        Directory directory = new Directory(new TextFile(), new AudioFile(), new ImageFile());

        directory.setFilesInDir(new AudioFile(), new AudioFile(), new TextFile());

        for (File f : directory.getFilesList()){
            System.out.println(f.getCurrentString());
        }
    }

}
