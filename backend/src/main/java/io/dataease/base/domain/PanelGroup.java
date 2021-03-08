package io.dataease.base.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class PanelGroup implements Serializable {
    private String id;

    private String name;

    private String pid;

    private Integer level;

    private String nodeType;

    private String createBy;

    private Long createTime;

    private String panelType;

    private static final long serialVersionUID = 1L;
}