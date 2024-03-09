
package practicagraficas;

import java.util.Random;

public class Process {
    private int process_id;
    private int time;
    private int time_arrival;
    private int completion_time;
    private int return_time;
    private int response_time;
    private boolean band_response;
    private int wait_time;
    //Getters and Setters
    public int getProcessId() {
        return process_id;
    }

    public void setProcessId(int process_id) {
        this.process_id = process_id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTimeArrival() {
        return time_arrival;
    }

    public void setTimeArrival(int time_arrival) {
        this.time_arrival = time_arrival;
    }

    public int getCompletionTime() {
        return completion_time;
    }

    public void setCompletionTime(int completion_time) {
        this.completion_time = completion_time;
    }

    public int getReturnTime() {
        return return_time;
    }

    public void setReturnTime(int return_time) {
        this.return_time = return_time;
    }

    public int getResponseTime() {
        return response_time;
    }

    public void setResponseTime(int response_time) {
        this.response_time = response_time;
    }

    public int getWaitTime() {
        return wait_time;
    }

    public void setWaitTime(int wait_time) {
        this.wait_time = wait_time;
    }

    public int getTimeRun() {
        return time_run;
    }

    public void setTimeRun(int time_run) {
        this.time_run = time_run;
    }
     public void AddTimeRun() {
        this.time_run = time_run+1;
    }
    private int time_run;

    public Process(int id) {
        this.process_id = id;
        this.time = generateRandomTime(6, 12);
        this.time_arrival = 0;
        this.completion_time = 0;
        this.return_time = 0;
        this.response_time = 0;
        this.band_response = false;
        this.wait_time = 0;
        this.time_run = 0;
    }
    private int generateRandomTime(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    public String print() {
        return String.format("ID: %d Time: %d TT: %d TL: %d TF: %d TR: %d TRES: %d TW: %d BAND: %s",
                process_id, time, time_run, time_arrival, completion_time, return_time,
                response_time, wait_time, band_response);
    }
    
}

