package com.arjun.cafe.restImpl;

import com.arjun.cafe.POJO.User;
import com.arjun.cafe.constents.CafeConstant;
import com.arjun.cafe.rest.UserRest;
import com.arjun.cafe.service.UserService;
import com.arjun.cafe.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {



        try {
          return userService.signUp(requestMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
       return CafeUtils.getResponseEntity(CafeConstant.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
