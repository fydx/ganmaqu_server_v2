package com.sssta.ganmaqu.Controller;

import com.sssta.ganmaqu.Util.HibernateUtil;
import com.sssta.ganmaqu.model.City;
import com.sssta.ganmaqu.response.AvaliableCitiesResponse;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by libin on 15/2/26.
 */
@Controller
@RequestMapping("/avaliableCities")
public class AvaliableCitiesController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    AvaliableCitiesResponse printCities()
    {
        AvaliableCitiesResponse avaliableCitiesResponse = new AvaliableCitiesResponse();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List cities = session.createQuery("from City").list() ;
        session.close();
        avaliableCitiesResponse.setStatus(0);
        avaliableCitiesResponse.setMsg("success");
        avaliableCitiesResponse.setCities(cities);

        return avaliableCitiesResponse;
    }
}
