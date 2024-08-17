package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        //켜기
        mp.on();
        //볼륨증가
        mp.volumeUp();
        //볼륨증가
        mp.volumeUp();
        //볼륨감소
        mp.volumeDown();
        //상태
        mp.showStatus();
        //끄기
        mp.off();


    }
}
