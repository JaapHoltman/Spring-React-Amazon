package com.jaapholtman.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.apigateway.model.EndpointConfiguration;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
//deze class gebruikt nu mijn speciefieke key die ik op aws heb aangemaakt en verbind met aws
    //niet vergeten te verwijderen!! net door amazon gebeld!
    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "empty",
                "empty"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("https://s3.eu-central-1.amazonaws.com", "eu-central-1"))
                .build();
    }
}
