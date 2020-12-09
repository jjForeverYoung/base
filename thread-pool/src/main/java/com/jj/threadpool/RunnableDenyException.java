package com.jj.threadpool;

/**
 * @author dream
 * @since 2020/12/09 09:44
 */
public class RunnableDenyException extends RuntimeException {
    public RunnableDenyException(String msg){
        super(msg);
    }
}
