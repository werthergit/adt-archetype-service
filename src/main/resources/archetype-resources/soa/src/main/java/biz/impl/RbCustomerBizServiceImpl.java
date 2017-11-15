#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.biz.impl;

import com.adt.framework.common.service.impl.BasicServiceImpl;

import ${package}.biz.RbCustomerBizService;
import ${package}.domain.RbCustomer;
import ${package}.model.RbCustomerModel;
import org.springframework.stereotype.Service;

/**
 * DAO
 * Created by my on 2017/7/6.
 */
@Service
public class RbCustomerBizServiceImpl extends BasicServiceImpl<RbCustomer,Integer, RbCustomerModel>
        implements RbCustomerBizService {



}
