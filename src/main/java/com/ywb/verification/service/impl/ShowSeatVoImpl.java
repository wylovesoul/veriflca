package com.ywb.verification.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ywb.verification.mapper.ShowSeatVoMapper;
import com.ywb.verification.mapper.adminMapper;
import com.ywb.verification.pojo.Movie;
import com.ywb.verification.service.ShowSeatVoService;
import com.ywb.verification.service.adminService;
import com.ywb.verification.vo.ShowSeatVo;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatVoImpl extends ServiceImpl<ShowSeatVoMapper, ShowSeatVo> implements ShowSeatVoService {
}
