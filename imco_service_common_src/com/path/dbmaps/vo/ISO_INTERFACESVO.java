package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;
import java.util.Date;

public class ISO_INTERFACESVO extends BaseVO {
    /**
     * This field corresponds to the database column ISO_INTERFACES.CODE
     */
    private BigDecimal CODE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.COMP_CODE
     */
    private BigDecimal COMP_CODE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.DESCRIPTION
     */
    private String DESCRIPTION;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_800
     */
    private BigDecimal ATM_LOG_800;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_ECHO
     */
    private BigDecimal ATM_LOG_ECHO;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_REC_MSG
     */
    private BigDecimal ATM_LOG_REC_MSG;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_SENT_MSG
     */
    private BigDecimal ATM_LOG_SENT_MSG;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_FILE
     */
    private String ATM_LOG_FILE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_SENT_FILE
     */
    private String ATM_LOG_SENT_FILE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_REC_FILE
     */
    private String ATM_LOG_REC_FILE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_RECONNECT_TIME
     */
    private BigDecimal ATM_RECONNECT_TIME;

    /**
     * This field corresponds to the database column ISO_INTERFACES.MSG_SOURCE
     */
    private BigDecimal MSG_SOURCE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_T_ID
     */
    private BigDecimal ATM_T_ID;

    /**
     * This field corresponds to the database column ISO_INTERFACES.INCLUD_LEN
     */
    private BigDecimal INCLUD_LEN;

    /**
     * This field corresponds to the database column ISO_INTERFACES.LOCK_ACC
     */
    private BigDecimal LOCK_ACC;

    /**
     * This field corresponds to the database column ISO_INTERFACES.BITMAP_TYPE
     */
    private BigDecimal BITMAP_TYPE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.LENGTH_TYPE
     */
    private BigDecimal LENGTH_TYPE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.CURRENT_DATE
     */
    private Date CURRENT_DATE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.TCP_TYPE
     */
    private BigDecimal TCP_TYPE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.AUTO_LOGON
     */
    private BigDecimal AUTO_LOGON;

    /**
     * This field corresponds to the database column ISO_INTERFACES.MSG_LENGTH
     */
    private BigDecimal MSG_LENGTH;

    /**
     * This field corresponds to the database column ISO_INTERFACES.HEADER_LENGTH
     */
    private BigDecimal HEADER_LENGTH;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ISO_PRESENT
     */
    private BigDecimal ISO_PRESENT;

    /**
     * This field corresponds to the database column ISO_INTERFACES.POS_IN_HEADER
     */
    private BigDecimal POS_IN_HEADER;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_SCRIPT_LOG_FILE
     */
    private String ATM_SCRIPT_LOG_FILE;

    /**
     * This field corresponds to the database column ISO_INTERFACES.ATM_LOG_SCRIPT
     */
    private BigDecimal ATM_LOG_SCRIPT;

    /**
     * This field corresponds to the database column ISO_INTERFACES.PCI_COMPLY
     */
    private BigDecimal PCI_COMPLY;

    /**
     * This field corresponds to the database column ISO_INTERFACES.BAL_DOWNLOAD
     */
    private BigDecimal BAL_DOWNLOAD;

    /**
     * This field corresponds to the database column ISO_INTERFACES.SKIP_BITMAP
     */
    private BigDecimal SKIP_BITMAP;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.CODE
     *
     * @return the value of ISO_INTERFACES.CODE
     */
    public BigDecimal getCODE() {
        return CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.CODE
     *
     * @param CODE the value for ISO_INTERFACES.CODE
     */
    public void setCODE(BigDecimal CODE) {
        this.CODE = CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.COMP_CODE
     *
     * @return the value of ISO_INTERFACES.COMP_CODE
     */
    public BigDecimal getCOMP_CODE() {
        return COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.COMP_CODE
     *
     * @param COMP_CODE the value for ISO_INTERFACES.COMP_CODE
     */
    public void setCOMP_CODE(BigDecimal COMP_CODE) {
        this.COMP_CODE = COMP_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.DESCRIPTION
     *
     * @return the value of ISO_INTERFACES.DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.DESCRIPTION
     *
     * @param DESCRIPTION the value for ISO_INTERFACES.DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_800
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_800
     */
    public BigDecimal getATM_LOG_800() {
        return ATM_LOG_800;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_800
     *
     * @param ATM_LOG_800 the value for ISO_INTERFACES.ATM_LOG_800
     */
    public void setATM_LOG_800(BigDecimal ATM_LOG_800) {
        this.ATM_LOG_800 = ATM_LOG_800;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_ECHO
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_ECHO
     */
    public BigDecimal getATM_LOG_ECHO() {
        return ATM_LOG_ECHO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_ECHO
     *
     * @param ATM_LOG_ECHO the value for ISO_INTERFACES.ATM_LOG_ECHO
     */
    public void setATM_LOG_ECHO(BigDecimal ATM_LOG_ECHO) {
        this.ATM_LOG_ECHO = ATM_LOG_ECHO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_REC_MSG
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_REC_MSG
     */
    public BigDecimal getATM_LOG_REC_MSG() {
        return ATM_LOG_REC_MSG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_REC_MSG
     *
     * @param ATM_LOG_REC_MSG the value for ISO_INTERFACES.ATM_LOG_REC_MSG
     */
    public void setATM_LOG_REC_MSG(BigDecimal ATM_LOG_REC_MSG) {
        this.ATM_LOG_REC_MSG = ATM_LOG_REC_MSG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_SENT_MSG
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_SENT_MSG
     */
    public BigDecimal getATM_LOG_SENT_MSG() {
        return ATM_LOG_SENT_MSG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_SENT_MSG
     *
     * @param ATM_LOG_SENT_MSG the value for ISO_INTERFACES.ATM_LOG_SENT_MSG
     */
    public void setATM_LOG_SENT_MSG(BigDecimal ATM_LOG_SENT_MSG) {
        this.ATM_LOG_SENT_MSG = ATM_LOG_SENT_MSG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_FILE
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_FILE
     */
    public String getATM_LOG_FILE() {
        return ATM_LOG_FILE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_FILE
     *
     * @param ATM_LOG_FILE the value for ISO_INTERFACES.ATM_LOG_FILE
     */
    public void setATM_LOG_FILE(String ATM_LOG_FILE) {
        this.ATM_LOG_FILE = ATM_LOG_FILE == null ? null : ATM_LOG_FILE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_SENT_FILE
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_SENT_FILE
     */
    public String getATM_LOG_SENT_FILE() {
        return ATM_LOG_SENT_FILE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_SENT_FILE
     *
     * @param ATM_LOG_SENT_FILE the value for ISO_INTERFACES.ATM_LOG_SENT_FILE
     */
    public void setATM_LOG_SENT_FILE(String ATM_LOG_SENT_FILE) {
        this.ATM_LOG_SENT_FILE = ATM_LOG_SENT_FILE == null ? null : ATM_LOG_SENT_FILE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_REC_FILE
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_REC_FILE
     */
    public String getATM_LOG_REC_FILE() {
        return ATM_LOG_REC_FILE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_REC_FILE
     *
     * @param ATM_LOG_REC_FILE the value for ISO_INTERFACES.ATM_LOG_REC_FILE
     */
    public void setATM_LOG_REC_FILE(String ATM_LOG_REC_FILE) {
        this.ATM_LOG_REC_FILE = ATM_LOG_REC_FILE == null ? null : ATM_LOG_REC_FILE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_RECONNECT_TIME
     *
     * @return the value of ISO_INTERFACES.ATM_RECONNECT_TIME
     */
    public BigDecimal getATM_RECONNECT_TIME() {
        return ATM_RECONNECT_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_RECONNECT_TIME
     *
     * @param ATM_RECONNECT_TIME the value for ISO_INTERFACES.ATM_RECONNECT_TIME
     */
    public void setATM_RECONNECT_TIME(BigDecimal ATM_RECONNECT_TIME) {
        this.ATM_RECONNECT_TIME = ATM_RECONNECT_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.MSG_SOURCE
     *
     * @return the value of ISO_INTERFACES.MSG_SOURCE
     */
    public BigDecimal getMSG_SOURCE() {
        return MSG_SOURCE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.MSG_SOURCE
     *
     * @param MSG_SOURCE the value for ISO_INTERFACES.MSG_SOURCE
     */
    public void setMSG_SOURCE(BigDecimal MSG_SOURCE) {
        this.MSG_SOURCE = MSG_SOURCE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_T_ID
     *
     * @return the value of ISO_INTERFACES.ATM_T_ID
     */
    public BigDecimal getATM_T_ID() {
        return ATM_T_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_T_ID
     *
     * @param ATM_T_ID the value for ISO_INTERFACES.ATM_T_ID
     */
    public void setATM_T_ID(BigDecimal ATM_T_ID) {
        this.ATM_T_ID = ATM_T_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.INCLUD_LEN
     *
     * @return the value of ISO_INTERFACES.INCLUD_LEN
     */
    public BigDecimal getINCLUD_LEN() {
        return INCLUD_LEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.INCLUD_LEN
     *
     * @param INCLUD_LEN the value for ISO_INTERFACES.INCLUD_LEN
     */
    public void setINCLUD_LEN(BigDecimal INCLUD_LEN) {
        this.INCLUD_LEN = INCLUD_LEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.LOCK_ACC
     *
     * @return the value of ISO_INTERFACES.LOCK_ACC
     */
    public BigDecimal getLOCK_ACC() {
        return LOCK_ACC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.LOCK_ACC
     *
     * @param LOCK_ACC the value for ISO_INTERFACES.LOCK_ACC
     */
    public void setLOCK_ACC(BigDecimal LOCK_ACC) {
        this.LOCK_ACC = LOCK_ACC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.BITMAP_TYPE
     *
     * @return the value of ISO_INTERFACES.BITMAP_TYPE
     */
    public BigDecimal getBITMAP_TYPE() {
        return BITMAP_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.BITMAP_TYPE
     *
     * @param BITMAP_TYPE the value for ISO_INTERFACES.BITMAP_TYPE
     */
    public void setBITMAP_TYPE(BigDecimal BITMAP_TYPE) {
        this.BITMAP_TYPE = BITMAP_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.LENGTH_TYPE
     *
     * @return the value of ISO_INTERFACES.LENGTH_TYPE
     */
    public BigDecimal getLENGTH_TYPE() {
        return LENGTH_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.LENGTH_TYPE
     *
     * @param LENGTH_TYPE the value for ISO_INTERFACES.LENGTH_TYPE
     */
    public void setLENGTH_TYPE(BigDecimal LENGTH_TYPE) {
        this.LENGTH_TYPE = LENGTH_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.CURRENT_DATE
     *
     * @return the value of ISO_INTERFACES.CURRENT_DATE
     */
    public Date getCURRENT_DATE() {
        return CURRENT_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.CURRENT_DATE
     *
     * @param CURRENT_DATE the value for ISO_INTERFACES.CURRENT_DATE
     */
    public void setCURRENT_DATE(Date CURRENT_DATE) {
        this.CURRENT_DATE = CURRENT_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.TCP_TYPE
     *
     * @return the value of ISO_INTERFACES.TCP_TYPE
     */
    public BigDecimal getTCP_TYPE() {
        return TCP_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.TCP_TYPE
     *
     * @param TCP_TYPE the value for ISO_INTERFACES.TCP_TYPE
     */
    public void setTCP_TYPE(BigDecimal TCP_TYPE) {
        this.TCP_TYPE = TCP_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.AUTO_LOGON
     *
     * @return the value of ISO_INTERFACES.AUTO_LOGON
     */
    public BigDecimal getAUTO_LOGON() {
        return AUTO_LOGON;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.AUTO_LOGON
     *
     * @param AUTO_LOGON the value for ISO_INTERFACES.AUTO_LOGON
     */
    public void setAUTO_LOGON(BigDecimal AUTO_LOGON) {
        this.AUTO_LOGON = AUTO_LOGON;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.MSG_LENGTH
     *
     * @return the value of ISO_INTERFACES.MSG_LENGTH
     */
    public BigDecimal getMSG_LENGTH() {
        return MSG_LENGTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.MSG_LENGTH
     *
     * @param MSG_LENGTH the value for ISO_INTERFACES.MSG_LENGTH
     */
    public void setMSG_LENGTH(BigDecimal MSG_LENGTH) {
        this.MSG_LENGTH = MSG_LENGTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.HEADER_LENGTH
     *
     * @return the value of ISO_INTERFACES.HEADER_LENGTH
     */
    public BigDecimal getHEADER_LENGTH() {
        return HEADER_LENGTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.HEADER_LENGTH
     *
     * @param HEADER_LENGTH the value for ISO_INTERFACES.HEADER_LENGTH
     */
    public void setHEADER_LENGTH(BigDecimal HEADER_LENGTH) {
        this.HEADER_LENGTH = HEADER_LENGTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ISO_PRESENT
     *
     * @return the value of ISO_INTERFACES.ISO_PRESENT
     */
    public BigDecimal getISO_PRESENT() {
        return ISO_PRESENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ISO_PRESENT
     *
     * @param ISO_PRESENT the value for ISO_INTERFACES.ISO_PRESENT
     */
    public void setISO_PRESENT(BigDecimal ISO_PRESENT) {
        this.ISO_PRESENT = ISO_PRESENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.POS_IN_HEADER
     *
     * @return the value of ISO_INTERFACES.POS_IN_HEADER
     */
    public BigDecimal getPOS_IN_HEADER() {
        return POS_IN_HEADER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.POS_IN_HEADER
     *
     * @param POS_IN_HEADER the value for ISO_INTERFACES.POS_IN_HEADER
     */
    public void setPOS_IN_HEADER(BigDecimal POS_IN_HEADER) {
        this.POS_IN_HEADER = POS_IN_HEADER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_SCRIPT_LOG_FILE
     *
     * @return the value of ISO_INTERFACES.ATM_SCRIPT_LOG_FILE
     */
    public String getATM_SCRIPT_LOG_FILE() {
        return ATM_SCRIPT_LOG_FILE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_SCRIPT_LOG_FILE
     *
     * @param ATM_SCRIPT_LOG_FILE the value for ISO_INTERFACES.ATM_SCRIPT_LOG_FILE
     */
    public void setATM_SCRIPT_LOG_FILE(String ATM_SCRIPT_LOG_FILE) {
        this.ATM_SCRIPT_LOG_FILE = ATM_SCRIPT_LOG_FILE == null ? null : ATM_SCRIPT_LOG_FILE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.ATM_LOG_SCRIPT
     *
     * @return the value of ISO_INTERFACES.ATM_LOG_SCRIPT
     */
    public BigDecimal getATM_LOG_SCRIPT() {
        return ATM_LOG_SCRIPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.ATM_LOG_SCRIPT
     *
     * @param ATM_LOG_SCRIPT the value for ISO_INTERFACES.ATM_LOG_SCRIPT
     */
    public void setATM_LOG_SCRIPT(BigDecimal ATM_LOG_SCRIPT) {
        this.ATM_LOG_SCRIPT = ATM_LOG_SCRIPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.PCI_COMPLY
     *
     * @return the value of ISO_INTERFACES.PCI_COMPLY
     */
    public BigDecimal getPCI_COMPLY() {
        return PCI_COMPLY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.PCI_COMPLY
     *
     * @param PCI_COMPLY the value for ISO_INTERFACES.PCI_COMPLY
     */
    public void setPCI_COMPLY(BigDecimal PCI_COMPLY) {
        this.PCI_COMPLY = PCI_COMPLY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.BAL_DOWNLOAD
     *
     * @return the value of ISO_INTERFACES.BAL_DOWNLOAD
     */
    public BigDecimal getBAL_DOWNLOAD() {
        return BAL_DOWNLOAD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.BAL_DOWNLOAD
     *
     * @param BAL_DOWNLOAD the value for ISO_INTERFACES.BAL_DOWNLOAD
     */
    public void setBAL_DOWNLOAD(BigDecimal BAL_DOWNLOAD) {
        this.BAL_DOWNLOAD = BAL_DOWNLOAD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ISO_INTERFACES.SKIP_BITMAP
     *
     * @return the value of ISO_INTERFACES.SKIP_BITMAP
     */
    public BigDecimal getSKIP_BITMAP() {
        return SKIP_BITMAP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ISO_INTERFACES.SKIP_BITMAP
     *
     * @param SKIP_BITMAP the value for ISO_INTERFACES.SKIP_BITMAP
     */
    public void setSKIP_BITMAP(BigDecimal SKIP_BITMAP) {
        this.SKIP_BITMAP = SKIP_BITMAP;
    }
}