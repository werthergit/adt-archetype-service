#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapstruct;


import com.adt.framework.common.mydao.map.BasicObjectMapper;
import ${package}.domain.RbCustomer;
import ${package}.rpc.protocol.CustomerModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CustomerMapper extends BasicObjectMapper<RbCustomer, CustomerModel> {


}
