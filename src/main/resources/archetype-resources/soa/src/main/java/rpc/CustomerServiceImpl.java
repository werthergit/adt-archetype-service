#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rpc;

import com.adt.framework.common.mydao.model.PageParams;
import com.adt.framework.common.mydao.model.PageResults;
import ${package}.biz.RbCustomerBizService;
import ${package}.domain.RbCustomer;
import ${package}.mapstruct.CustomerMapper;
import ${package}.rpc.protocol.CustomerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * Created by my on 2017/11/13.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private RbCustomerBizService rbCustomerBizService;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerModel getCustomerById(int userId) {
        RbCustomer rbCustomer =  rbCustomerBizService.get(userId);
        logger.info("开始打印："+rbCustomer.toString());
        return customerMapper.to(rbCustomer);
    }



    @Override
    public List<CustomerModel> getCustomerPage(int pageNo, int pageSize) {
        Example example = new Example(RbCustomer.class);
        PageParams<RbCustomer> pageParams=new PageParams<RbCustomer>();
        pageParams.setPageSize(pageSize);
        pageParams.setPageIndex(pageNo);
        PageResults<RbCustomer> rbCustomerPageResults = null;
        try{
            rbCustomerPageResults =  rbCustomerBizService.queryPageResults(pageParams,example);
        }catch (Exception e){
            rbCustomerPageResults = new PageResults<RbCustomer>();
            e.printStackTrace();
        }
        List<RbCustomer> results = rbCustomerPageResults.getResults();
        return customerMapper.to(results);
    }
}
