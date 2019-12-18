package com.example.jsondemo.message;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.example.jsondemo.mode.BoxStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author : jack lu
 * @date : 2019/12/18
 */
@Component
public class DeviceStatusReceiver {

    @RabbitListener(queues = "face.detected")
    public void receiveEventReport(byte[] bytes) {
        if (bytes!=null){
            BoxStatus eventReportJson= JSON.parseObject(new String(bytes), BoxStatus.class);
            System.out.println("收到一条消息"+ DateUtil.now());

        }
    }
}
