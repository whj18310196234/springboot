package com.example.springbootbuild.cn.com.junit;

import org.junit.Test;
import org.python.util.PythonInterpreter;

import java.io.File;

public class TestUnit {

    @Test
    public void executePython(){
        String py = "print('hello python')";
        PythonInterpreter p = new PythonInterpreter();
        p.exec(py);

    }


    @Test
    public void executeJavaCallPython(){
        String path = "D:\\pythonProject\\20211108-pythonProject\\utiltest\\hello.py";
        PythonInterpreter p = new PythonInterpreter();
        p.execfile(path);

    }


    @Test
    public void mkdirExists(){
//        File mkdir = new File("/export/Data/download");
        File mkdir = new File("D:\\ext.wanghongjun1\\Desktop\\12q1212a\\dd");
        if(!mkdir.exists()) mkdir.mkdirs();
    }

}
