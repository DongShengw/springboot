package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author anonymous
 * @since 2022-06-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Grouping implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "grouping_id", type = IdType.AUTO)
    private Integer groupingId;

    private String groupingName;

    private String groupingMechanism;

    private int groupingDevicecount;

    private String groupingDescribe;


}
