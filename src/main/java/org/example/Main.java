package org.example;

import org.example.dto.DestinationDTO;
import org.example.dto.SourceDTO;
import org.example.mapper.MapStructMapper;
import org.mapstruct.factory.Mappers;
import org.modelmapper.ModelMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Main {

    static MapStructMapper mapstructMapper = Mappers.getMapper(MapStructMapper.class);
    static final ModelMapper modelMapper = new ModelMapper();

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 1)
    public static void mapstruct(Blackhole blackhole) {
        var source = createSource();
        var destination = mapstructMapper.convert(source);
        blackhole.consume(destination);
        blackhole.consume(source);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 1)
    public void apacheBeanutils(Blackhole blackhole) throws InvocationTargetException, IllegalAccessException {
        var source = createSource();
        var destination = new DestinationDTO();
        org.apache.commons.beanutils.BeanUtils.copyProperties(destination, source);
        blackhole.consume(destination);
        blackhole.consume(source);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 1)
    public void springBeanutils(Blackhole blackhole) {
        var source = createSource();
        var destination = new DestinationDTO();
        org.springframework.beans.BeanUtils.copyProperties(destination, source);
        blackhole.consume(destination);
        blackhole.consume(source);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 1)
    public void modelMapper(Blackhole blackhole) {
        var source = createSource();
        var destination = new DestinationDTO();
        modelMapper.map(source, destination);
        blackhole.consume(destination);
        blackhole.consume(source);
    }


    public static SourceDTO createSource() {
        SourceDTO result = new SourceDTO();
        result.setId(1);
        result.setCreated(LocalDate.now());
        result.setModified(LocalDateTime.now());
        result.setName("name");
        result.setStatus(BigDecimal.TEN);
        result.setCount(0);
        result.setDiscount(0f);
        return result;
    }
}