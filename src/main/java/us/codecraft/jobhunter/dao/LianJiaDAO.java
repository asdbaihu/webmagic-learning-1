package us.codecraft.jobhunter.dao;

import org.apache.ibatis.annotations.Insert;
import us.codecraft.jobhunter.model.LianJiaPriceModel;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/7/11 14:52
 * @Version: jobhunterV1.0
 */
public interface LianJiaDAO {

    @Insert("insert into lianjia_house_info (`sub_title`,`total_price`,`mi_price`,`address_`,`discription_`,`url`) values (#{sub_title},#{total_price},#{mi_price},#{address_},#{discription_},#{url})")
    public int add(LianJiaPriceModel lianJiaPriceModel);
}
