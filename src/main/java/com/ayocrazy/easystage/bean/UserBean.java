package com.ayocrazy.easystage.bean;

import java.io.Serializable;

/**
 * Created by ayo on 2017/1/12.
 */

public class UserBean implements Serializable {
    private String[] fieldNames;
    private String[] methodNames;
    private String[] metas;
    private Object[] values;

    public String[] getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(String[] fieldNames) {
        this.fieldNames = fieldNames;
    }

    public String[] getMetas() {
        return metas;
    }

    public void setMetas(String[] metas) {
        this.metas = metas;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public String[] getMethodNames() {
        return methodNames;
    }

    public void setMethodNames(String[] methodNames) {
        this.methodNames = methodNames;
    }
}
