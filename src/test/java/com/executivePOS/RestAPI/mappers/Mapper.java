package com.executivePOS.RestAPI.mappers;

import com.executivePOS.RestAPI.domains.entities.UserEntity;

public interface Mapper<A,B> {
    B mapTo(A a);

    A mapFrom(B b);
}
