package pkt;
import java.util.*;
import java.io.*;
public class Process {
    public int arrival_time;
    public int priority;
    public int process_time;
    public int id;
    public int baslangic;
    public int suspend_time;
    public String renk;
    //Process Constructor
    public Process(int arrival_time, int priority, int process_time, int id,String renk) {
        this.arrival_time = arrival_time;
        this.priority = priority;
        this.process_time= process_time;
        this.id = id;
        this.baslangic = process_time;
        this.suspend_time = process_time;
        this.renk=renk;
    }
    //process_time donduren fonksiyon
    public int getTime() {
        return process_time;
    }
    //proses calistirma fonksiyonu
    public void run(int saniye) {
        //proses yeni basliyorsa
        if(getTime() == baslangic) {
            System.out.println("\033["+renk + saniye + ".0000 sn proses basladi" + "       (id:" + id + "  oncelik:" + priority + "  kalan sure:" + process_time + "sn)" + "\033[0m");
        }
        else if(getTime() != 0)
        {
            System.out.println("\033["+renk+ saniye + ".0000 sn proses yurutuluyor" + "   (id:" + id + "  oncelik:" + priority + "  kalan sure:" + process_time + "sn)" + "\033[0m");
        }
           
    }
    public void remove(int saniye) //proses bitmisse calisan fonksiyon
    {
        System.out.println("\033["+renk+ saniye + ".0000 sn proses sonlandi" + "      (id:" + id + "  oncelik:" + priority + "  kalan sure:" + process_time + "sn)"+ "\033[0m");
    }

    public void suspend(int saniye,int suspend_id) //proses askiya alma fonksiyonu
    {
        id = suspend_id;
        System.out.println("\033["+renk + saniye + ".0000 sn proses askida" + "        (id:" + id + " oncelik:" + priority + "  kalan sure:" + process_time + "sn)" + "\033[0m");
        suspend_time = saniye;
    }
    public void zaman_asimi(int saniye, int suspend_id) //zaman asimi fonksiyonu
    {
        System.out.println("\033["+renk + saniye + ".0000 sn proses Zaman Asimi" + "    (id:" + id + "  oncelik:" + priority + "  kalan sure:" + process_time + "sn)" + "\033[0m");
    }
}
