/*
 *
 *  *****************************************************************************
 *  * Copyright ( c ) 2016 Heren Tianjin Inc. All Rights Reserved.
 *  *
 *  * This software is the confidential and proprietary information of Heren Tianjin Inc
 *  * ("Confidential Information").  You shall not disclose such Confidential Information
 *  *  and shall use it only in accordance with the terms of the license agreement
 *  *  you entered into with Heren Tianjin or a Heren Tianjin authorized
 *  *  reseller (the "License Agreement").
 *  ****************************************************************************
 *
 */

package com.heren.turtle.server.dao.hisDao;

import com.heren.turtle.server.dao.BaseDao;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * com.heren.turtle.server.dao
 *
 * @author zhiwei
 * @create 2016-11-03 11:11.
 */
@Component("hisOrderDao")
public interface HisOrderDao extends BaseDao {

    List<Map<String, Object>> queryOrders(Map<String, Object> params);

}
