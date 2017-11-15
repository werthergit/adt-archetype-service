#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.biz;

import com.adt.framework.common.service.BasicService;
import ${package}.domain.RbCustomer;
import ${package}.model.RbCustomerModel;

/**
 *  dao
 *
 * <p></p>
 * Created by my on 2017/7/6.
 */
public interface RbCustomerBizService extends BasicService<RbCustomer,Integer, RbCustomerModel> {


}
