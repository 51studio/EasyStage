package com.ayocrazy.easystage.bean;

import com.ayocrazy.easystage.uimeta.MetaCheckBox;
import com.ayocrazy.easystage.uimeta.MetaTable;
import com.ayocrazy.easystage.uimeta.MetaText;

import java.io.Serializable;

/**
 * Created by ayo on 2017/1/11.
 */

public class StageBean implements Serializable {
    @MetaText
    private String name, id, root;
    @MetaText
    private int childrenSize;
    @MetaCheckBox
    private boolean debug;
    @MetaTable
    private ViewportBean viewport;
    @MetaTable
    private CameraBean camera;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public int getChildrenSize() {
        return childrenSize;
    }

    public void setChildrenSize(int childrenSize) {
        this.childrenSize = childrenSize;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public ViewportBean getViewport() {
        return viewport;
    }

    public void setViewport(ViewportBean viewport) {
        this.viewport = viewport;
    }

    public CameraBean getCamera() {
        return camera;
    }

    public void setCamera(CameraBean camera) {
        this.camera = camera;
    }
}
