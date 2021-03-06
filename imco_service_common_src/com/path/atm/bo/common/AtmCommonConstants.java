package com.path.atm.bo.common;

import java.math.BigDecimal;

public class AtmCommonConstants
{
	
	// LOV ID
    public static final BigDecimal LOV_TYPE_CONS_COMMON_STATUS = new BigDecimal(949);
    
    // IV CRUD VALUES
    public static final String IV_CRUD_MAINTENANCE = "R";
    public static final String IV_CRUD_APPROVE = "P";
    public static final String IV_CRUD_UPDATE_AFTER_APPROVE = "UP";
    public static final String IV_CRUD_SUSPENDED = "S";
    public static final String IV_CRUD_REACTIVATE = "RA";
    
    // Status
    public static final String STATUS_CREATED = "0_C";
    public static final String STATUS_MODIFIED = "0_M";
    public static final String STATUS_ACTIVE = "A";
    public static final String STATUS_DELETED = "D";
    public static final String STATUS_APPROVED = "P";
    public static final String STATUS_SUSPENDED = "S";
    public static final String STATUS_REACTIVATE = "RA";
    public static final String STATUS_APPROVE_REJECTED = "R";
    public static final String STATUS_UPDATE_AFTER_APPROVE = "UP";
    
    //ISO Field Types
    public static final String ISO_FIELD_TYPE_NUMERIC = "N";
    public static final String ISO_FIELD_TYPE_ALPHA = "V";
    public static final String ISO_FIELD_TYPE_BITMAP = "T";
    public static final String ISO_FIELD_TYPE_BINARY = "B";
    public static final String ISO_FIELD_TYPE_AMOUNT = "A";
    public static final String ISO_FIELD_TYPE_EXP_DATE = "E";
    public static final String ISO_FIELD_TYPE_TIME = "H";
    public static final String ISO_FIELD_TYPE_DATE4 = "M";
    public static final String ISO_FIELD_TYPE_DATE10 = "D";
    
    public static final boolean TRUE_BOOLEAN = true;
    public static final boolean FALSE_BOOLEAN = false;
        
    public static final String DYNAMIC_FILE_MESSAGE = "DYNAMIC_FILE_MESSAGE";
    public static final String DYNAMIC_FILE_TAGS = "DYNAMIC_FILE_TAGS";
    public static final String DYNAMIC_FILE_STRUCTURE = "DYNAMIC_FILE_STRUCTURE";
    public static final String IMCO_DYN_FILE_VALUES_TMP = "IMCO_DYN_FILE_VALUES_TMP";
    
    public static final BigDecimal IMCO_COMMON_STATUS_LOV = new BigDecimal(1478);
    
}
