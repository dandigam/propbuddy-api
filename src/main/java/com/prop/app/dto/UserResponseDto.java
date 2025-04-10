package com.prop.app.dto;

import com.prop.app.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String aboutYourSelf;

    private List<RoleDto> roles;

    private byte[] profilePhoto;

    private Integer districtId;

    private Integer isEnabled;

    private String userName;


}
