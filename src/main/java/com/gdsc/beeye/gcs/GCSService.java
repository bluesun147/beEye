/*
package com.gdsc.beeye.gcs;

import com.google.cloud.storage.Acl;
import com.google.cloud.storage.BlobInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;

@Service
@RequiredArgsConstructor
public class GCSService {

    private final Storage storage;


    public Blob downloadFileFromGCS(DownloadReqDto downloadReqDto) {
        Blob blob = storage.get(downloadReqDto.getBucketName(), downloadReqDto.getDownloadFileName());
        blob.downloadTo(Paths.get(downloadReqDto.getLocalFileLocation()));
        return blob;
    }
}*/
