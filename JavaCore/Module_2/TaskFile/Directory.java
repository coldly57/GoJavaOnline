public class Directory{
    private TextFile textFile;
    private AudioFile audioFile;
    private ImageFile imageFile;
    
    public Directory(TextFile textFile, AudioFile audioFile, ImageFile imageFile){
        this.textFile = textFile;
        this.audioFile = audioFile;
        this.imageFile = imageFile;
    }
}
