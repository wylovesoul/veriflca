package com.ywb.verification.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ywb.verification.mapper.adminMapper;
import com.ywb.verification.pojo.*;
import com.ywb.verification.service.adminService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/adminController")
@Slf4j
@CrossOrigin
@AllArgsConstructor
public class indexController   {
    private final adminService adminService;
    private  final adminMapper adminMapper;
    @GetMapping("/page")
    public List<Movie> page(Page page, Movie movie){
        QueryWrapper<Movie> queryWrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(movie.getName())) {
            queryWrapper.like("name", movie.getName());
        }
        List<Movie> list = adminService.list(queryWrapper);
        for (Movie list1:list
             ) {
            System.out.println(list1);
        }
        return list;
    }

    @DeleteMapping("/deleteById")
    public Boolean deleteById(String id){

        boolean b = adminService.removeById(id);
        return b;
    }

    @PostMapping("/insertMovie")
    @Transactional
    public Boolean insertMovie(Movie movie,String tagId){
        System.out.println("111111111111"+movie.toString());
        boolean save = adminService.save(movie);
//        Map<String,Object> map =new HashMap<>();

        adminMapper.inserttagmovie(tagId,String.valueOf(movie.getId()));
        return save;
    }

    @PutMapping("/insertMovie")
    public Boolean updateMovie(Movie movie){
        boolean update = adminService.updateById(movie);
        return update;
    }


    @GetMapping("/findByIdMovie")
    public Movie findByIdMovie(String id){
        return adminService.getById(id);
    }

    @GetMapping("/selectMovie")
    public List<Movie> selectMovie(){
        return adminService.selectMovie();
    }

    @PostMapping("/insert")
    public Boolean insertShow(Show Show,String tagname){
        Show.setSeatMap("aaaaaaaa|aaaaaaaa|aaaaaaaa|aaaaaaaa|aaaaaaaa|aaaaaaaa|aaaaaaaa|aaaaaaaa|");
        Show.setTheaterName("1");
        Boolean insertshow = adminMapper.insertshow(Show);
        long id = Show.getId();
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                Seat seat=new Seat();
                seat.setShowId(id);
                seat.setRow(i);
                seat.setCol(j);
                seat.setIsBooked(0);
                adminMapper.insertseat(seat);
            }
        }
        return null;
    }

    @PutMapping("/insert")
    public Boolean editShow(Show Show,String tagname){

        Boolean insertshow = adminMapper.editshow(Show);

        return null;
    }

}
