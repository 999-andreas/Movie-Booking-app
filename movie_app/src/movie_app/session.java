/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_app;

/**
 *
 * @author andre
 */
public class session {
    private String time;
    private int nb_place;
    private double price;

    public session(String time, int nb_place, double price) {
        this.time = time;
        this.nb_place = nb_place;
        this.price = price;
    }

    @Override
    public String toString() {
        return "session{" + "time=" + time + ", nb_place=" + nb_place + ", price=" + price + '}';
    }
    
    public String getTime() {
        return time;
    }

    public int getNb_place() {
        return nb_place;
    }

    public double getPrice() {
        return price;
    }

    public void setTime(String times) {
        this.time = times;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
