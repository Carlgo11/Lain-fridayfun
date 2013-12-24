package com.carlgo11.lain_plugin.fridayfun.player;

import java.util.Calendar;
import java.util.Random;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.kitteh.tag.PlayerReceiveNameTagEvent;

public class PlayerReveiveNameTagEvent implements Listener {

    public int mojangday = 5;
    public int carlgoday = 0; //currently not enabled

    @EventHandler
    public void onPlayerLoadNametagEvent(PlayerReceiveNameTagEvent e)
    {
        int currday = this.checkdate();
        if (currday == mojangday) {
            int b = random(10);
            if (b == 1) {
                e.setTag("Notch");
            } else if (b == 2) {
                e.setTag("jeb_");
            } else if (b == 3) {
                e.setTag("Dinnerbone");
            } else if (b == 4) {
                e.setTag("MinecraftChick");
            } else if (b == 5) {
                e.setTag("Grumm");
            } else if (b == 6) {
                e.setTag("C418");
            } else if (b == 7) {
                e.setTag("Ticlin45");
            } else if (b == 8) {
                e.setTag("EvilSeph");
            } else if (b == 9) {
                e.setTag("md_5");
            } else if (b == 10) {
                e.setTag("carlgo11");
            }
        } else if (currday == carlgoday) {
            e.setTag("carlgo11");
        }
    }

    public int checkdate()
    {
        int weekDay = 0;

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        if (Calendar.MONDAY == dayOfWeek) {
            weekDay = 1;
        } else if (Calendar.TUESDAY == dayOfWeek) {
            weekDay = 2;
        } else if (Calendar.WEDNESDAY == dayOfWeek) {
            weekDay = 3;
        } else if (Calendar.THURSDAY == dayOfWeek) {
            weekDay = 4;
        } else if (Calendar.FRIDAY == dayOfWeek) {
            weekDay = 5;
        } else if (Calendar.SATURDAY == dayOfWeek) {
            weekDay = 6;
        } else if (Calendar.SUNDAY == dayOfWeek) {
            weekDay = 7;
        }

        return weekDay;
    }

    public int random(int h)
    {
        int a = 0;
        Random n = new Random();
        int num;
        for (int count = 1; count <= 2; count++) {
            num = 1 + n.nextInt(h);
            a = num;
        }
        return a;
    }

}
