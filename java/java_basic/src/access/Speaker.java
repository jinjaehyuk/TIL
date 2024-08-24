package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("최대음량입니다.");
        }else{
            volume += 10;
            System.out.println("음량을 10 증가 합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("음량을 10 줄입니다.");
    }

    void showVolume(){
        System.out.println("현재음량 : " + volume);
    }
}

