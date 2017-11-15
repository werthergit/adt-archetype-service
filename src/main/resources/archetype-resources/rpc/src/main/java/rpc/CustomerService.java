#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rpc;

import ${package}.rpc.protocol.CustomerModel;
import java.util.List;

/**
 * Created by my on 2017/11/13.
 */
public interface CustomerService {

    public CustomerModel getCustomerById(int userId);

    public List<CustomerModel> getCustomerPage(int pageNo, int pageSize);

}
