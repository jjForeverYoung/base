package com.jj.threadpool;

/**
 * @author dream
 * @since 2020/12/09 09:32
 */
public interface ThreadPool {

    void execute(Runnable runnable);

    void shutDown();

    int getInitSize();

    int getMaxSize();

    int getCoreSize();

    int getActiveCount();

    int getQueueSize();

    boolean isShutdown();
}
