package me.jcala.jchat.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.jcala.jchat.mock.InitData;
import me.jcala.jchat.service.inster.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public String login(String name,String pass) throws JsonProcessingException{
        if (name==null||pass==null){
            return null;

        }

        if ("wood".equals(name ) && "wood".equals(pass)){
           return mapper.writeValueAsString(InitData.woodData);
        }
        if ("fire".equals(name) && "fire".equals(pass)){
            return mapper.writeValueAsString(InitData.fireData);

        }
        if ("gold".equals(name) && "gold".equals(pass)){
            return mapper.writeValueAsString(InitData.goldData);
        }
        return null;
    }
}