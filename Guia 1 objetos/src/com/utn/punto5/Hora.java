package com.utn.punto5;

public class Hora {
    private int hour;
    private int minute;
    private int second;

    public Hora(){

    }

    public Hora(int hour, int minute, int second){
        this.hour= (0<hour && hour<24) ? hour:0;
        this.minute= (0<minute && minute<60) ? minute:0;;
        this.second= (0<second && second<60) ? second:0;;
    }

    public void setHour(int hour) {
            this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void backHour(){
        if(this.hour==0){
            this.hour= 23;
        }else{
            this.hour--;
        }
    }

    public void backMinute(){
        if(this.minute==0){
            this.minute= 59;
        }else{
            this.minute--;
        }
    }

    public void backSecond(){
        if(this.second==0){
            this.second= 59;
        }else {
            this.second--;
        }
    }

    public void forwardHour(){
        if(this.hour==23){
            this.hour= 0;
        }else{
            this.hour++;
        }
    }

    public void forwardMinute(){
        if (this.minute==59){
            this.minute= 0;
        }else{
            this.minute++;
        }
    }

    public void forwardSecond(){
        if (this.minute==59){
            this.minute= 0;
        }else{
            this.minute++;
        }
    }

    @Override
    public String toString() {
        String hh = String.format("%02d", hour);
        String mm = String.format("%02d", minute);
        String ss = String.format("%02d", second);

        return hh + ":" + mm + ":" + ss;
    }

}
