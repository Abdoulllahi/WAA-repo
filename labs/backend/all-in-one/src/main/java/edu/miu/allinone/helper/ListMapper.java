package edu.miu.allinone.helper;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class ListMapper <T, E>{

    ModelMapper modelMapper;

    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public List<?> mapList(List<T> list, E convertTo) {

        return list
                .stream()
                .map(element -> modelMapper.map(element, convertTo.getClass()))
                .toList();
    }
}
