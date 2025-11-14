package com.perez.compras_ventas.common.dto;

import jakarta.annotation.Resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileDownloadResponse {

    private Resource resource;
    private String contentType;
    private String fileName;
}
