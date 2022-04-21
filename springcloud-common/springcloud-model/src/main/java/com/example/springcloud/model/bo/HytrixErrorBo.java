package com.example.springcloud.model.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HytrixErrorBo {

    private String serverCode;

    private String method;

    private Object params;

}
