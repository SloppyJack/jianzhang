package com.example.jianzhang.bo;

import cn.hutool.core.bean.BeanUtil;
import com.example.jianzhang.model.GroupDO;
import com.example.jianzhang.model.PermissionDO;
import lombok.*;

import java.util.List;

/**
 * @author pedro@TaleLin
 * @author Juzi@TaleLin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupPermissionBO {
    private Long id;

    private String name;

    private String info;

    private List<PermissionDO> permissions;

    public GroupPermissionBO(GroupDO group, List<PermissionDO> permissions) {
        BeanUtil.copyProperties(group, this);
        this.permissions = permissions;
    }
}
