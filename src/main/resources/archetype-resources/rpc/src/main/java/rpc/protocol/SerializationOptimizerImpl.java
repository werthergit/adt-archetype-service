#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.rpc.protocol;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import ${package}.domain.AcotAccount;
import ${package}.model.AcotAccountModel;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * This class must be accessible from both the provider and consumer
 *
 * @author lishen
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(AcotAccount.class);
        classes.add(AcotAccountModel.class);
        return classes;
    }
}
