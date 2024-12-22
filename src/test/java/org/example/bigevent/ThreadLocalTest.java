//package org.example.bigevent;
//
//import org.junit.jupiter.api.Test;
//
//public class ThreadLocalTest {
//    @Test
//    public void testThreadLocalSetAndGet() {
//        //提供一个ThreadLocal对象
//        ThreadLocal  t1 = new ThreadLocal();
//        //开启两个线程
//        new Thread(()->{
//            t1.set("lxj");
//            System.out.println(t1.get());
//        },"蓝色").start();
//
//        new Thread(()->{
//            t1.set("lxj2");
//            System.out.println(t1.get());
//        },"绿色").start();
//    }
//}
