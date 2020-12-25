package th.ac.utcc.cpe.data_structures.sample;

/**
 * แก้ไขให้เป็นชื่อและอีเมล์ของตัวเอง
 * @author Peerapong Tippanun <1910711102018@live4.utcc.ac.th>
 */
public class MyWord {
    String word;
    String translation;
    
    public MyWord(String w, String t) {
        word = w;
        translation = t;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
        
}
