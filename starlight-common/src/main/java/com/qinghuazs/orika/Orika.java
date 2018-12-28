package com.qinghuazs.orika;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Orika {

    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private static final MapperFacade mapperFacade = mapperFactory.getMapperFacade();

    public static <S, D> D map(S sourceObject, Class<D> destinationClass) {
        return mapperFacade.map(sourceObject, destinationClass);
    }

}
