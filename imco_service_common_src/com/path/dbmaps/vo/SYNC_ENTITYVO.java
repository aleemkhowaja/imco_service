package com.path.dbmaps.vo;

import java.math.BigDecimal;

public class SYNC_ENTITYVO extends SYNC_ENTITYVOKey {
    /**
     * This field corresponds to the database column SYNC_ENTITY.ENTITY_NAME
     */
    private String ENTITY_NAME;

    /**
     * This field corresponds to the database column SYNC_ENTITY.DESCRIPTION
     */
    private String DESCRIPTION;

    /**
     * This field corresponds to the database column SYNC_ENTITY.BR_FIELD_NAME
     */
    private String BR_FIELD_NAME;

    /**
     * This field corresponds to the database column SYNC_ENTITY.REQUEST_API_CODE
     */
    private BigDecimal REQUEST_API_CODE;

    /**
     * This field corresponds to the database column SYNC_ENTITY.RESPONSE_API_CODE
     */
    private BigDecimal RESPONSE_API_CODE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_ENTITY.ENTITY_NAME
     *
     * @return the value of SYNC_ENTITY.ENTITY_NAME
     */
    public String getENTITY_NAME() {
        return ENTITY_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_ENTITY.ENTITY_NAME
     *
     * @param ENTITY_NAME the value for SYNC_ENTITY.ENTITY_NAME
     */
    public void setENTITY_NAME(String ENTITY_NAME) {
        this.ENTITY_NAME = ENTITY_NAME == null ? null : ENTITY_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_ENTITY.DESCRIPTION
     *
     * @return the value of SYNC_ENTITY.DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_ENTITY.DESCRIPTION
     *
     * @param DESCRIPTION the value for SYNC_ENTITY.DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_ENTITY.BR_FIELD_NAME
     *
     * @return the value of SYNC_ENTITY.BR_FIELD_NAME
     */
    public String getBR_FIELD_NAME() {
        return BR_FIELD_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_ENTITY.BR_FIELD_NAME
     *
     * @param BR_FIELD_NAME the value for SYNC_ENTITY.BR_FIELD_NAME
     */
    public void setBR_FIELD_NAME(String BR_FIELD_NAME) {
        this.BR_FIELD_NAME = BR_FIELD_NAME == null ? null : BR_FIELD_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_ENTITY.REQUEST_API_CODE
     *
     * @return the value of SYNC_ENTITY.REQUEST_API_CODE
     */
    public BigDecimal getREQUEST_API_CODE() {
        return REQUEST_API_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_ENTITY.REQUEST_API_CODE
     *
     * @param REQUEST_API_CODE the value for SYNC_ENTITY.REQUEST_API_CODE
     */
    public void setREQUEST_API_CODE(BigDecimal REQUEST_API_CODE) {
        this.REQUEST_API_CODE = REQUEST_API_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYNC_ENTITY.RESPONSE_API_CODE
     *
     * @return the value of SYNC_ENTITY.RESPONSE_API_CODE
     */
    public BigDecimal getRESPONSE_API_CODE() {
        return RESPONSE_API_CODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYNC_ENTITY.RESPONSE_API_CODE
     *
     * @param RESPONSE_API_CODE the value for SYNC_ENTITY.RESPONSE_API_CODE
     */
    public void setRESPONSE_API_CODE(BigDecimal RESPONSE_API_CODE) {
        this.RESPONSE_API_CODE = RESPONSE_API_CODE;
    }
}