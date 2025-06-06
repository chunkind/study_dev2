package b01_thread.step08;

public class ThreadEx15 {
    public static void main(String[] args) {
        RunImplEx15 r = new RunImplEx15();
        Thread th1 = new Thread(r, "*");
        Thread th2 = new Thread(r, "**");
        Thread th3 = new Thread(r, "***");

        th1.start();
        th2.start();
        th3.start();

        //*
        //**
        //***
        
        //*
        //**
        //***
        
        try {
            Thread.sleep(2000);
            th1.suspend(); // 쓰레드 th1를 잠시 중단한다.
            //**
            //***
            
            //**
            //*** 
            Thread.sleep(2000);
            th2.suspend();
            
            //***
            
            //***
            
            //***
            Thread.sleep(3000);
            
            th1.resume();
            //*
            //***
            
            //*
            //***
            
            //*
            //***
            
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            
            //***
            Thread.sleep(2000);
            th3.stop();
            
        } catch (InterruptedException e) { }
    }
}

class RunImplEx15 implements Runnable {
    @Override
    public void run() {
        while(true)
        {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) { }
        }
    }
}