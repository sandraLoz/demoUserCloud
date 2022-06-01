package com.opplus.demoUserCloud.mapper;

import org.mapstruct.Mapper;
import com.opplus.demoUserCloud.domain.UserEntity;
import com.opplus.demoUserCloud.dto.UserDto;


@Mapper(componentModel = "spring", uses = {})
public interface UserMapper extends EntityMapper<UserDto, UserEntity>{


}
