package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.LogMapper;
import cn.edu.guet.model.Log;
import cn.edu.guet.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImpl implements ILogService {
    @Autowired
    LogMapper logMapper;

    @Override
    public void saveLog(Log log) {

    }
}
