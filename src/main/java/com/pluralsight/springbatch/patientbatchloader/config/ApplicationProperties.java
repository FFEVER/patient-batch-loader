package com.pluralsight.springbatch.patientbatchloader.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Patient Batch Loader.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private final Batch batch = new Batch();

    public Batch getBatch() {
        return this.batch;
    }

    public static class Batch {

        // Automatically linked to the application.batch.inputPath via @ConfigurationProperties
        private String inputPath = "C:/Batch Study/patient-batch-loader/data";

        public String getInputPath() {
            return this.inputPath;
        }

        public void setInputPath(String inputPath) {
            this.inputPath = inputPath;
        }
    }

}
