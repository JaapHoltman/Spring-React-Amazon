package com.jaapholtman.awsimageupload.bucket;

public enum BucketName {
//als ik deze enum gebruik PROFILE_IMAGE gebruik hij nu automatisch de s3 bucket die ik op aws heb aan gemaakt
    PROFILE_IMAGE("jaapholtman-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
