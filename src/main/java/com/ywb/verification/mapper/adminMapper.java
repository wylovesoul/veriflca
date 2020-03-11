package com.ywb.verification.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ywb.verification.pojo.Movie;
import com.ywb.verification.pojo.Seat;
import com.ywb.verification.pojo.Show;
import com.ywb.verification.pojo.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface adminMapper extends BaseMapper<Movie> {
   Boolean deleteById(String id);

    List<Movie> selectMovie();

    List<Tag> getOneTagSelect();

    Boolean inserttagmovie(@Param("tagId")String tagId,@Param("movieId") String movieId);

    Boolean insertshow(Show show);
    Boolean editshow(Show show);
    Boolean insertseat(Seat Seat);
}
