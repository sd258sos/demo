package com.example.jsondemo.mode;
import lombok.Data;
import java.util.List;

/**
 * @author : jack lu
 * @date : 2019/12/12
 */
@Data
public class BoxStatus {
    public String id;
    public String name;
    public String mac;
    public String ip;
    public long timestamp;
    public Status status;
    public List<Service> service;
    public Configuration configuration;

}
