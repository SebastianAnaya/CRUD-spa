package com.sebas.CRUDspa.service;

import com.sebas.CRUDspa.model.tipo_documento;
import com.sebas.CRUDspa.repository.TDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TDService implements TDRepository{

    @Autowired
    private static TDRepository tdRepository;

    @Override
    public  List<tipo_documento> findAll() {
        return tdRepository.findAll();
    }

    @Override
    public List<tipo_documento> findAll(Sort sort) {
        return tdRepository.findAll(sort);
    }

    @Override
    public Page<tipo_documento> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<tipo_documento> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(tipo_documento entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends tipo_documento> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends tipo_documento> S save(S entity) {
        return null;
    }

    @Override
    public <S extends tipo_documento> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<tipo_documento> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends tipo_documento> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends tipo_documento> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<tipo_documento> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public tipo_documento getOne(Long aLong) {
        return null;
    }

    @Override
    public tipo_documento getById(Long aLong) {
        return null;
    }

    @Override
    public tipo_documento getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends tipo_documento> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends tipo_documento> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends tipo_documento> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends tipo_documento> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends tipo_documento> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends tipo_documento> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends tipo_documento, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
