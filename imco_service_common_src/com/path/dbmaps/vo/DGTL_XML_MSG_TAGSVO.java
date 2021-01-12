package com.path.dbmaps.vo;

import com.path.lib.vo.BaseVO;
import java.math.BigDecimal;

public class DGTL_XML_MSG_TAGSVO extends BaseVO {
    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.DGTL_XML_MSG_TAGS_ID
     */
    private BigDecimal DGTL_XML_MSG_TAGS_ID;

    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.DGTL_MSG_DEF_ID
     */
    private BigDecimal DGTL_MSG_DEF_ID;

    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.PARENT_TAG_NAME
     */
    private String PARENT_TAG_NAME;

    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.COMPLEX_TYPE
     */
    private String COMPLEX_TYPE;

    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.TAG_NAME
     */
    private String TAG_NAME;

    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.TAG_TYPE
     */
    private String TAG_TYPE;

    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.DESCRIPTION
     */
    private String DESCRIPTION;
    
    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.IS_LEAF_YN
     */
    private String IS_LEAF_YN;
    
    
    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.IS_MANDATORY_YN
     */
    private String IS_MANDATORY_YN;
    
    /**
     * This field corresponds to the database column DGTL_XML_MSG_TAGS.HIERARCHY
     */
    private String HIERARCHY;    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.DGTL_XML_MSG_TAGS_ID
     *
     * @return the value of DGTL_XML_MSG_TAGS.DGTL_XML_MSG_TAGS_ID
     */
    public BigDecimal getDGTL_XML_MSG_TAGS_ID() {
        return DGTL_XML_MSG_TAGS_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.DGTL_XML_MSG_TAGS_ID
     *
     * @param DGTL_XML_MSG_TAGS_ID the value for DGTL_XML_MSG_TAGS.DGTL_XML_MSG_TAGS_ID
     */
    public void setDGTL_XML_MSG_TAGS_ID(BigDecimal DGTL_XML_MSG_TAGS_ID) {
        this.DGTL_XML_MSG_TAGS_ID = DGTL_XML_MSG_TAGS_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.DGTL_MSG_DEF_ID
     *
     * @return the value of DGTL_XML_MSG_TAGS.DGTL_MSG_DEF_ID
     */
    public BigDecimal getDGTL_MSG_DEF_ID() {
        return DGTL_MSG_DEF_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.DGTL_MSG_DEF_ID
     *
     * @param DGTL_MSG_DEF_ID the value for DGTL_XML_MSG_TAGS.DGTL_MSG_DEF_ID
     */
    public void setDGTL_MSG_DEF_ID(BigDecimal DGTL_MSG_DEF_ID) {
        this.DGTL_MSG_DEF_ID = DGTL_MSG_DEF_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.PARENT_TAG_NAME
     *
     * @return the value of DGTL_XML_MSG_TAGS.PARENT_TAG_NAME
     */
    public String getPARENT_TAG_NAME() {
        return PARENT_TAG_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.PARENT_TAG_NAME
     *
     * @param PARENT_TAG_NAME the value for DGTL_XML_MSG_TAGS.PARENT_TAG_NAME
     */
    public void setPARENT_TAG_NAME(String PARENT_TAG_NAME) {
        this.PARENT_TAG_NAME = PARENT_TAG_NAME == null ? null : PARENT_TAG_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.COMPLEX_TYPE
     *
     * @return the value of DGTL_XML_MSG_TAGS.COMPLEX_TYPE
     */
    public String getCOMPLEX_TYPE() {
        return COMPLEX_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.COMPLEX_TYPE
     *
     * @param COMPLEX_TYPE the value for DGTL_XML_MSG_TAGS.COMPLEX_TYPE
     */
    public void setCOMPLEX_TYPE(String COMPLEX_TYPE) {
        this.COMPLEX_TYPE = COMPLEX_TYPE == null ? null : COMPLEX_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.TAG_NAME
     *
     * @return the value of DGTL_XML_MSG_TAGS.TAG_NAME
     */
    public String getTAG_NAME() {
        return TAG_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.TAG_NAME
     *
     * @param TAG_NAME the value for DGTL_XML_MSG_TAGS.TAG_NAME
     */
    public void setTAG_NAME(String TAG_NAME) {
        this.TAG_NAME = TAG_NAME == null ? null : TAG_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.TAG_TYPE
     *
     * @return the value of DGTL_XML_MSG_TAGS.TAG_TYPE
     */
    public String getTAG_TYPE() {
        return TAG_TYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.TAG_TYPE
     *
     * @param TAG_TYPE the value for DGTL_XML_MSG_TAGS.TAG_TYPE
     */
    public void setTAG_TYPE(String TAG_TYPE) {
        this.TAG_TYPE = TAG_TYPE == null ? null : TAG_TYPE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.DESCRIPTION
     *
     * @return the value of DGTL_XML_MSG_TAGS.DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.DESCRIPTION
     *
     * @param DESCRIPTION the value for DGTL_XML_MSG_TAGS.DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.IS_LEAF_YN
     *
     * @return the value of DGTL_XML_MSG_TAGS.IS_LEAF_YN
     */
    public String getIS_LEAF_YN() {
        return IS_LEAF_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.IS_MANDATORY_YN
     *
     * @param DESCRIPTION the value for DGTL_XML_MSG_TAGS.IS_MANDATORY_YN
     */
    public void setIS_MANDATORY_YN(String IS_MANDATORY_YN) {
        this.IS_MANDATORY_YN = IS_MANDATORY_YN == null ? null : IS_MANDATORY_YN.trim();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.IS_MANDATORY_YN
     *
     * @return the value of DGTL_XML_MSG_TAGS.IS_MANDATORY_YN
     */
    public String getIS_MANDATORY_YN() {
        return IS_MANDATORY_YN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.IS_LEAF_YN
     *
     * @param DESCRIPTION the value for DGTL_XML_MSG_TAGS.IS_LEAF_YN
     */
    public void setIS_LEAF_YN(String IS_LEAF_YN) {
        this.IS_LEAF_YN = IS_LEAF_YN == null ? null : IS_LEAF_YN.trim();
    }
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DGTL_XML_MSG_TAGS.HIERARCHY
     *
     * @return the value of DGTL_XML_MSG_TAGS.HIERARCHY
     */
    public String getHIERARCHY() {
        return HIERARCHY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DGTL_XML_MSG_TAGS.HIERARCHY
     *
     * @param DESCRIPTION the value for DGTL_XML_MSG_TAGS.HIERARCHY
     */
    public void setHIERARCHY(String HIERARCHY) {
        this.HIERARCHY = HIERARCHY == null ? null : HIERARCHY.trim();
    }
}