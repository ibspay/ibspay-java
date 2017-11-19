package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public enum TransStatus {
    PENDING,    // 待处理
    PROCESSING, // 处理中
    SUCCESSFUL, // 处理成功
    FAILED;     // 处理失败
}
