package com.ywb.verification.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ywb.verification.pojo.Tag;
import com.ywb.verification.service.ShowSeatVoService;
import com.ywb.verification.service.adminService;
import com.ywb.verification.vo.ShowSeatVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ShowController")
@Slf4j
@CrossOrigin
@AllArgsConstructor
public class ShowController {
    private final ShowSeatVoService ShowSeatVoService;
    private final adminService adminService;
    @GetMapping("/getShow")
    public List<ShowSeatVo> getShow(Page page, ShowSeatVo ShowSeatVo){
        QueryWrapper<ShowSeatVo> QueryWrapper=new QueryWrapper();
        if (!StringUtils.isEmpty(ShowSeatVo.getTheaterName())) {
            QueryWrapper.like("theater_name", ShowSeatVo.getTheaterName());
        }

        return ShowSeatVoService.list(QueryWrapper);
    }

    @DeleteMapping("/deleteById")
    public Boolean deleteById(String id){
        boolean b = ShowSeatVoService.removeById(id);
        return b;
    }

    @GetMapping("/getOneTagSelect")
    public List<Tag>  getOneTagSelect(){
        return adminService.getOneTagSelect();
    }
}
