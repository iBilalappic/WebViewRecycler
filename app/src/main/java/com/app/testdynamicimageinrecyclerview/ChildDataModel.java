package com.app.testdynamicimageinrecyclerview;

public class ChildDataModel {
    private String htmlContent;
    private CanvasData canvasData =null;

    public ChildDataModel() {
    }

    public ChildDataModel(String htmlContent, CanvasData canvasData) {
        this.htmlContent = htmlContent;
        this.canvasData = canvasData;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public CanvasData getCanvasData() {
        return canvasData;
    }

    public void setCanvasData(CanvasData canvasData) {
        this.canvasData = canvasData;
    }

    // Constructor, getters, setters
}

