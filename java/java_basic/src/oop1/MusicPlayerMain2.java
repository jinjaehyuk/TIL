package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
               //음악 플레이어 켜기
       on(data);

       volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        showStatus(data);

        off(data);


    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume ++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume --;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        //음악 플레이어 상태
        System.out.println("음악플레이어 상태 확인");
        if(data.isOn){
            System.out.println("On");
        }else{
            System.out.println("Off");
        }
    }


}
