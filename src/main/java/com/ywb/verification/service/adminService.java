package com.ywb.verification.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ywb.verification.pojo.Movie;
import com.ywb.verification.pojo.Tag;

import java.util.List;

public interface adminService extends IService<Movie> {

    Boolean deleteById(String id);

    List<Movie> selectMovie();

    List<Tag> getOneTagSelect();


  boolean inserttagmovie(String tagId,String movieId);
}
