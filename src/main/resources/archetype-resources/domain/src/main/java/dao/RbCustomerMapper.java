#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;
import ${package}.domain.RbCustomer;

import com.adt.framework.common.mydao.dao.mybatis.BasicMapper;

public interface RbCustomerMapper extends BasicMapper<RbCustomer, Integer> {
}