package com.jj.threadpool;

/**
 * @author dream
 * @since 2020/12/09 09:43
 */
public interface RunnableQueue {
    // 新进程进来时提交到缓存队列
    void offer(Runnable runnable);

    /**
     * 取出线程
     */
    Runnable take();

    /**
     * 获取队列中线程的数量
     */
    int size();

}
