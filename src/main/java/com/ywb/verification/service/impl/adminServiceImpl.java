package com.ywb.verification.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywb.verification.mapper.adminMapper;
import com.ywb.verification.pojo.Movie;
import com.ywb.verification.pojo.Tag;
import com.ywb.verification.service.adminService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class adminServiceImpl extends ServiceImpl<adminMapper, Movie> implements adminService {
    private  final adminMapper adminMapper;
    @Override
    public Boolean deleteById(String id) {

        return   adminMapper.deleteById(id);
    }

    @Override
    public List<Movie> selectMovie() {
        List<Movie> movies = adminMapper.selectMovie();
        return movies;
    }

    @Override
    public List<Tag> getOneTagSelect() {
        return adminMapper.getOneTagSelect();
    }

     @Override
    public boolean inserttagmovie(String tagId,String movieId) {
        return adminMapper.inserttagmovie(tagId,movieId);
    }
}
