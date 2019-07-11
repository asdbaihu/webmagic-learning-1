package us.codecraft.jobhunter.pipeline;

import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.dao.JobInfoDAO;
import us.codecraft.jobhunter.dao.LianJiaDAO;
import us.codecraft.jobhunter.model.LianJiaPriceModel;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/7/11 14:50
 * @Version: jobhunterV1.0
 */
@Component("LianjiaDaoPipeline")
public class LianjiaDaoPipeline implements PageModelPipeline<LianJiaPriceModel> {

    @Resource
    private LianJiaDAO lianJiaDAO;

    @Override
    public void process(LianJiaPriceModel lianJiaPriceModel, Task task) {
        lianJiaDAO.add(lianJiaPriceModel);
    }
}
