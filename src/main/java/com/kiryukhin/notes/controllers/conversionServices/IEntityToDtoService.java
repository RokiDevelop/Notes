package com.kiryukhin.notes.controllers.conversionServices;

import java.util.List;

public interface IEntityToDtoService<T,V> {
    T convert(V v);
    List<T> convertAll(List<V> v);
}
