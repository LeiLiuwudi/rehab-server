package com.zju.gcs.common.result;

import lombok.Data;

/**
 * @author sy
 * @create 2019-10-30-19:32
 */
@Data
public class PageResult<E> {

    private long totalNum;

    private int pageNo;

    private E data;
}
