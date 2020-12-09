package com.jj.threadpool;

/**
 * @author dream
 * @since 2020/12/09 09:47
 */

@FunctionalInterface
public interface ThreadFactory {

    Thread creatThread(Runnable runnable);
}
