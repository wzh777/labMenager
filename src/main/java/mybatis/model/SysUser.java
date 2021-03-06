package mybatis.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class SysUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_account
     *
     * @mbggenerated
     */
    private String userAccount;

    /**
     * Database Column Remarks:
     *   用户密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_password
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * Database Column Remarks:
     *   用户姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   用户性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_sex
     *
     * @mbggenerated
     */
    private String userSex;

    /**
     * Database Column Remarks:
     *   用户积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_score
     *
     * @mbggenerated
     */
    private Integer userScore;

    /**
     * Database Column Remarks:
     *   用户电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_phone
     *
     * @mbggenerated
     */
    private String userPhone;

    /**
     * Database Column Remarks:
     *   用户座位 -1表示目前没有座位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_seat
     *
     * @mbggenerated
     */
    private Integer userSeat;

    /**
     * Database Column Remarks:
     *   用户所在组
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_group
     *
     * @mbggenerated
     */
    private String userGroup;

    /**
     * Database Column Remarks:
     *   用户在组里的身份 1组长/0组员以及其他身份,研究生等
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_identify
     *
     * @mbggenerated
     */
    private Integer userIdentify;

    /**
     * Database Column Remarks:
     *   用户身份是否有效 1有效/0无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_status
     *
     * @mbggenerated
     */
    private Integer userStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_account
     *
     * @return the value of sys_user.user_account
     *
     * @mbggenerated
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_account
     *
     * @param userAccount the value for sys_user.user_account
     *
     * @mbggenerated
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_password
     *
     * @return the value of sys_user.user_password
     *
     * @mbggenerated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_password
     *
     * @param userPassword the value for sys_user.user_password
     *
     * @mbggenerated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_sex
     *
     * @return the value of sys_user.user_sex
     *
     * @mbggenerated
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_sex
     *
     * @param userSex the value for sys_user.user_sex
     *
     * @mbggenerated
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_score
     *
     * @return the value of sys_user.user_score
     *
     * @mbggenerated
     */
    public Integer getUserScore() {
        return userScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_score
     *
     * @param userScore the value for sys_user.user_score
     *
     * @mbggenerated
     */
    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_phone
     *
     * @return the value of sys_user.user_phone
     *
     * @mbggenerated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_phone
     *
     * @param userPhone the value for sys_user.user_phone
     *
     * @mbggenerated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_seat
     *
     * @return the value of sys_user.user_seat
     *
     * @mbggenerated
     */
    public Integer getUserSeat() {
        return userSeat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_seat
     *
     * @param userSeat the value for sys_user.user_seat
     *
     * @mbggenerated
     */
    public void setUserSeat(Integer userSeat) {
        this.userSeat = userSeat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_group
     *
     * @return the value of sys_user.user_group
     *
     * @mbggenerated
     */
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_group
     *
     * @param userGroup the value for sys_user.user_group
     *
     * @mbggenerated
     */
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup == null ? null : userGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_identify
     *
     * @return the value of sys_user.user_identify
     *
     * @mbggenerated
     */
    public Integer getUserIdentify() {
        return userIdentify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_identify
     *
     * @param userIdentify the value for sys_user.user_identify
     *
     * @mbggenerated
     */
    public void setUserIdentify(Integer userIdentify) {
        this.userIdentify = userIdentify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_status
     *
     * @return the value of sys_user.user_status
     *
     * @mbggenerated
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_status
     *
     * @param userStatus the value for sys_user.user_status
     *
     * @mbggenerated
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}