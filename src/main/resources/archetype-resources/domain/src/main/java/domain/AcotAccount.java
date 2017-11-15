#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import com.adt.framework.domain.IntegerDomain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "acot_account")
public class AcotAccount extends IntegerDomain {
    /**
     * 账号业务主键
     */
    private String bid;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 账号名称
     */
    @Column(name = "accout_name")
    private String accoutName;

    /**
     * 账号类型:
     */
    @Column(name = "accout_type")
    private Byte accoutType;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 注册、认证、绑定
     */
    @Column(name = "accout_status")
    private Byte accoutStatus;

    /**
     * 注册渠道
     */
    @Column(name = "register_channle")
    private Integer registerChannle;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 认证时间
     */
    @Column(name = "authenticate_datetime")
    private Date authenticateDatetime;

    /**
     * 是否禁用
     */
    @Column(name = "is_disable")
    private Boolean isDisable;

    /**
     * 是否注销
     */
    @Column(name = "is_unregister")
    private Boolean isUnregister;

    /**
     * 更新时间
     */
    @Column(name = "update_datetime")
    private Date updateDatetime;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 获取账号业务主键
     *
     * @return bid - 账号业务主键
     */
    public String getBid() {
        return bid;
    }

    /**
     * 设置账号业务主键
     *
     * @param bid 账号业务主键
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取账号名称
     *
     * @return accout_name - 账号名称
     */
    public String getAccoutName() {
        return accoutName;
    }

    /**
     * 设置账号名称
     *
     * @param accoutName 账号名称
     */
    public void setAccoutName(String accoutName) {
        this.accoutName = accoutName;
    }

    /**
     * 获取账号类型:
     *
     * @return accout_type - 账号类型:
     */
    public Byte getAccoutType() {
        return accoutType;
    }

    /**
     * 设置账号类型:
     *
     * @param accoutType 账号类型:
     */
    public void setAccoutType(Byte accoutType) {
        this.accoutType = accoutType;
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取注册、认证、绑定
     *
     * @return accout_status - 注册、认证、绑定
     */
    public Byte getAccoutStatus() {
        return accoutStatus;
    }

    /**
     * 设置注册、认证、绑定
     *
     * @param accoutStatus 注册、认证、绑定
     */
    public void setAccoutStatus(Byte accoutStatus) {
        this.accoutStatus = accoutStatus;
    }

    /**
     * 获取注册渠道
     *
     * @return register_channle - 注册渠道
     */
    public Integer getRegisterChannle() {
        return registerChannle;
    }

    /**
     * 设置注册渠道
     *
     * @param registerChannle 注册渠道
     */
    public void setRegisterChannle(Integer registerChannle) {
        this.registerChannle = registerChannle;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取认证时间
     *
     * @return authenticate_datetime - 认证时间
     */
    public Date getAuthenticateDatetime() {
        return authenticateDatetime;
    }

    /**
     * 设置认证时间
     *
     * @param authenticateDatetime 认证时间
     */
    public void setAuthenticateDatetime(Date authenticateDatetime) {
        this.authenticateDatetime = authenticateDatetime;
    }

    /**
     * 获取是否禁用
     *
     * @return is_disable - 是否禁用
     */
    public Boolean getIsDisable() {
        return isDisable;
    }

    /**
     * 设置是否禁用
     *
     * @param isDisable 是否禁用
     */
    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
    }

    /**
     * 获取是否注销
     *
     * @return is_unregister - 是否注销
     */
    public Boolean getIsUnregister() {
        return isUnregister;
    }

    /**
     * 设置是否注销
     *
     * @param isUnregister 是否注销
     */
    public void setIsUnregister(Boolean isUnregister) {
        this.isUnregister = isUnregister;
    }

    /**
     * 获取更新时间
     *
     * @return update_datetime - 更新时间
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updateDatetime 更新时间
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * 获取电子邮件
     *
     * @return email - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }
}