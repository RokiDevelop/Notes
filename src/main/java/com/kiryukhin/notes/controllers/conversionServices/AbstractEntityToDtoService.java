package com.kiryukhin.notes.controllers.conversionServices;

import java.util.List;

public abstract class AbstractEntityToDtoService<T, V> implements IEntityToDtoService<T, V>{
    @Override
    public List<T> convertAll(List<V> v){
        return v.stream().map(this::convert).toList();
    }
}
