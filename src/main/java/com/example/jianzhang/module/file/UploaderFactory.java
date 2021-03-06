package com.example.jianzhang.module.file;

import com.example.jianzhang.extension.file.LocalUploader;
import com.example.jianzhang.extension.file.QiniuUploader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author pedro@TaleLin
 */
@Component
public class UploaderFactory {

    @Value("${lin.cms.file.uploader:local}")
    private String uploader;

    @Bean
    public Uploader createUploader() {
        switch (uploader) {
            case "local":
                return new LocalUploader();
            case "qiniuyun":
                return new QiniuUploader();
            default:
                break;
        }
        return null;
    }
}
