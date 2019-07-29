package com;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 张世罡
 * @Date： 2019/7/20
 * @Description: com.hkd
 * @version: 1.0
 */
public class testGenreator {
    public static void main(String[] args) throws Exception {
        List<String> warnings= new ArrayList<>();
        DefaultShellCallback shellCallback= new DefaultShellCallback(true);
        File file=new File("src/main/resources/generator.xml");
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(file);
        //逆向工程核心类
        MyBatisGenerator myBatisGenerator= new MyBatisGenerator(config,shellCallback,warnings);
        myBatisGenerator.generate(null);
    }
}
