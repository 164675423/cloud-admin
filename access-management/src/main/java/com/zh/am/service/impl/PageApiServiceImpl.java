package com.zh.am.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.am.dao.PageApiMapper;
import com.zh.am.domain.entity.PageApi;
import com.zh.am.service.IPageApiService;
import org.springframework.stereotype.Service;

@Service
public class PageApiServiceImpl extends ServiceImpl<PageApiMapper, PageApi> implements IPageApiService {

}
