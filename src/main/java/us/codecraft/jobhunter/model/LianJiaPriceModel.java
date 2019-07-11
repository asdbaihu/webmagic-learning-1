package us.codecraft.jobhunter.model;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.ExtractByUrl;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * @Author:dongwn
 * @Description: 链家存储信息实体类
 * @Date: 2019/7/11 14:17
 * @Version: jobhunterV1.0
 */
@TargetUrl("https://bj.lianjia.com/ershoufang/*")
@HelpUrl("https://bj.lianjia.com/ershoufang/pg\\d+")
public class LianJiaPriceModel implements AfterExtractor {

    @ExtractBy("//div[@class='title']/a/text()")
    private String sub_title;

    @ExtractBy("//div[@class='totalPrice']/span/text()")
    private String total_price;

    @ExtractBy("//div[@class='unitPrice']/span/text()")
    private String mi_price;

    @ExtractBy("//div[@class='houseInfo']/a/text()")
    private String address_;

    @ExtractBy("//div[@class='positionInfo']/a/text()")
    private String discription_;


    @ExtractByUrl
    private String url="";



    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getMi_price() {
        return mi_price;
    }

    public void setMi_price(String mi_price) {
        this.mi_price = mi_price;
    }

    public String getAddress_() {
        return address_;
    }

    public void setAddress_(String address_) {
        this.address_ = address_;
    }

    public String getDiscription_() {
        return discription_;
    }

    public void setDiscription_(String discription_) {
        this.discription_ = discription_;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LianJiaPriceModel{" +
                "sub_title='" + sub_title + '\'' +
                ", total_price='" + total_price + '\'' +
                ", mi_price='" + mi_price + '\'' +
                ", address_='" + address_ + '\'' +
                ", discription_='" + discription_ + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public void afterProcess(Page page) {
    }
}
