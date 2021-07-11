package com.v.im.mapper;

import com.v.im.entity.ImGroup;
import com.v.im.entity.ImUserFriend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2018-12-31
 */
public interface ImUserFriendMapper extends BaseMapper<ImUserFriend> {

    /**
     * 根据用户的ID 获取 用户好友(双向用户关系)
     * @param userId 用户ID
     * @return 好友分组的列表
     */
    List<ImGroup> getUserFriends(String userId);

}
