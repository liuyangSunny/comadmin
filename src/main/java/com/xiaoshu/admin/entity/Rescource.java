package com.xiaoshu.admin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoshu.common.base.DataEntity;

@TableName("sys_rescource")
public class Rescource extends DataEntity<Rescource> {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称
     */
    @TableField("file_name")
    private String fileName;
    /**
     * 来源
     */
    private String source;
    /**
     * 资源网络地址
     */
    @TableField("web_url")
    private String webUrl;
    /**
     * 文件标识
     */
    private String hash;
    /**
     * 文件大小
     */
    @TableField("file_size")
    private String fileSize;
    /**
     * 文件类型
     */
    @TableField("file_type")
    private String fileType;

    @TableField("original_net_url")
    private String originalNetUrl;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getOriginalNetUrl() {
        return originalNetUrl;
    }

    public void setOriginalNetUrl(String originalNetUrl) {
        this.originalNetUrl = originalNetUrl;
    }
}
