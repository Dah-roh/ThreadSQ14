package org.example;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class ScheduledTaskExample extends TimerTask {
    @Override
    public void run() {
        System.out.println("Every second the time is...."+ LocalDateTime.now());
    }
}
