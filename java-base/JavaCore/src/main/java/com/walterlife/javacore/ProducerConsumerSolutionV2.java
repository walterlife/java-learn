package com.walterlife.javacore;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Hello world!
 *
 */
public class ProducerConsumerSolutionV2 {
    public static void main( String[] args ) {
        BlockingQueue<Integer> sharedProduct = new LinkedBlockingQueue<Integer>();

        Thread producer = new Thread(new ProducerV2(sharedProduct), "producer");
        Thread consumer = new Thread(new ConsumerV2(sharedProduct), "consumer");

        producer.start();
        consumer.start();
    }
}

class ProducerV2 implements Runnable {

    private final  BlockingQueue<Integer> sharedProduct;
    private static int PRODUCTOR_NUM = 7;

    public ProducerV2(BlockingQueue<Integer> sharedProduct) {
        this.sharedProduct = sharedProduct;
    } 

    public void run() {
        try {
            for(int productor = 0; productor < PRODUCTOR_NUM; productor++) {
                System.out.println("Produced: " + productor);   
                sharedProduct.put(productor);
            } 
        } catch(InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);            
        }
    } 
} 

class ConsumerV2 implements Runnable {
    private final BlockingQueue<Integer> sharedProduct;

    public ConsumerV2(BlockingQueue<Integer> sharedProduct) {
        this.sharedProduct = sharedProduct;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + sharedProduct.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
} 
