package com.lzlg.student.web.conforller;

import com.lzlg.student.ben.Classstudent;
import com.lzlg.student.util.Message;
import com.lzlg.student.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class studentconforller {
    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add(Classstudent classstudent){
        Message<String> message=new Message<>();
        Date date=new Date();
       message.setTime(date.getTime());
       message.setStatus(200);
       message.setMessage("success");
       message.setData("添加学生成功");
     return message;
    }
    @PostMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParams({
     @ApiImplicitParam(name="studentid",value = "学号",paramType = "query",dataType = "int",required = true),
     @ApiImplicitParam(name = "studentname",value = "姓名",paramType = "query",dataType = "string")
    })
    public Message delete(int studentid,String studentname){

        return MessageUtil.success("删除学生成功");
    }
}
