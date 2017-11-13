package io.ride.web.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IDEA
 * User: ride
 * Date: 17-11-4
 * Time: 下午8:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-mybatis.xml")
public class TemperDaoTest {

    @Autowired
    private TemperHumidDao temperDao;

    @Test
    public void listTest() throws Exception {
        System.out.println(temperDao.list());
    }

    @Test
    public void findByIdTest() {
        System.out.println(temperDao.findById(15));
    }

    @Test
    public void finByIdWithNodeInfoTest() {
        System.out.println(temperDao.findByIdWithNodeInfo(15));
    }

    @Test
    public void listByNodeIdTest() {
        System.out.println(temperDao.listByNodeId(1));
    }


    @Test
    public void listByNodeIdAndTimeSlotTest() {
        System.out.println(temperDao.listByNodeIdAndTimeSlot(1, "2017-10-31 12:00:00", "2017-10-31 12:30:00"));
    }
}