package com.dstudio.model;

import lombok.Data;
import tgtools.util.GUID;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author wd824
 */
@Data
public class BaseModel extends MiniRowEntity {

    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "REV_")
    private String rev;


    public static void init(BaseModel model) {
        model.setId(GUID.newGUID());
        model.setRev(System.currentTimeMillis() + "");
    }
}