package com.walterlife.javacore;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class ProducerConsumerSolution {
    public static void main( String[] args ) {
        Vector<Integer> sharedProduct = new Vector<Integer>();
        int size = 4;

        Thread producer = new Thread(new Producer(sharedProduct, size), "producer");
        Thread consumer = new Thread(new Consumer(sharedProduct, size), "consumer");

        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {

    private final  Vector<Integer> sharedProduct;
    private final  int    SIZE;
    private static int PRODUCTOR_NUM = 7;

    public Producer(Vector sharedProduct, int size) {
        this.sharedProduct = sharedProduct;
        this.SIZE = size;
    } 

    public void run() {
        try {
            for(int productor = 0; productor < PRODUCTOR_NUM; productor++) {
                producer(productor);
            } 
        } catch(InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);            
        }
    } 

    private void producer(int productor) throws InterruptedException {
        // productor too much, wait
        while(sharedProduct.size() == SIZE) {
            synchronized (sharedProduct) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedProduct.size());
                sharedProduct.wait();
            } 
        } 

        // producer productor
        synchronized (sharedProduct) {
            sharedProduct.add(productor);
            sharedProduct.notifyAll();
        } 
    } 
} 

class Consumer implements Runnable {
    private final Vector<Integer> sharedProduct;
    private final int SIZE;

    public Consumer(Vector sharedProduct, int size) {
        this.sharedProduct = sharedProduct;
        this.SIZE = size;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private Integer consume() throws InterruptedException {
        // wait if queue is empty
        while (sharedProduct.isEmpty()) {
            synchronized (sharedProduct) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedProduct.size());

                sharedProduct.wait();
            }
        }

        // Otherwise consume element and notify waiting producer
        synchronized (sharedProduct) {
            sharedProduct.notifyAll();
            return (Integer) sharedProduct.remove(0);
        }
    }
} 
