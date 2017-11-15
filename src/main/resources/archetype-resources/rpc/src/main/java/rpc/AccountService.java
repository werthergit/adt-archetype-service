#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rpc;

import ${package}.domain.AcotAccount;
import ${package}.model.AcotAccountModel;

/**
 * ${symbol_pound} 对外服务RPC
 * Created by forever on 6/12/16.
 */
public interface AccountService {

    AcotAccount get(String id);

    AcotAccount register(AcotAccountModel req);
}
