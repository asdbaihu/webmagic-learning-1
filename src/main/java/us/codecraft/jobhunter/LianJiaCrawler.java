package us.codecraft.jobhunter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.model.LianJiaPriceModel;
import us.codecraft.jobhunter.model.LieTouJobInfo;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午4:19
 */
@Component
public class LianJiaCrawler {

    @Qualifier("LianjiaDaoPipeline")
    @Autowired
    private PageModelPipeline jobInfoDaoPipeline;

    public void crawl() {
        OOSpider.create(Site.me()
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36"),jobInfoDaoPipeline, LianJiaPriceModel.class)
                .addUrl("https://bj.lianjia.com/ershoufang/pg1")
                .thread(5)
                .run();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext*.xml");
        final LianJiaCrawler jobCrawler = applicationContext.getBean(LianJiaCrawler.class);
        jobCrawler.crawl();
    }
}
