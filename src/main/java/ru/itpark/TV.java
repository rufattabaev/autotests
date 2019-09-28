package ru.itpark;

public class TV {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0){
            return;
        }
        if (currentChannel > 100){
            return;
        }
            this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <0){
            return;
        }
        if (currentVolume > 100){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentCannel(){
        if (currentChannel ==100){
            currentChannel = 0;
            return;
        }
        currentChannel++;
    }
    public void decreaseCurrentCannel(){
        if (currentChannel ==0){
            currentChannel = 100;
            return;
        }
        currentChannel--;
    }
    public void increaseCurrentVolume(){
        if (currentVolume == 100){
            return;
        }
        currentVolume++;
    }
    public void decreaseCurrentVolume(){
        if (currentVolume ==0){
            return;
        }
        currentVolume--;

    }
}
