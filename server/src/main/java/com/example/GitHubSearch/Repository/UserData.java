package com.example.GitHubSearch.Repository;

import org.json.JSONArray;
import org.springframework.stereotype.Repository;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.util.List;
import java.util.ArrayList;

import com.example.GitHubSearch.Model.UserModel;
@Repository
public class UserData {
    private List<UserModel> list;
    public List<UserModel> getAllUsers()
    {
        return list;
    }

    public void getData(String query) throws Exception{
        list = new ArrayList<>();
        String newQuery = query + "%20in:login&per_page=10&page=1";
        String host = "https://api.github.com/search/users?q=" + newQuery;
        HttpResponse <JsonNode> httpResponse = Unirest.get(host)
                .asJson();
        JSONArray myResponse = new JSONArray(httpResponse.getBody().getObject().get("items").toString());
        String login, url, image = "";
        for(int i=0; i<myResponse.length(); i++){
            login = myResponse.getJSONObject(i).getString("login");
            url = myResponse.getJSONObject(i).getString("html_url");
            image = myResponse.getJSONObject(i).getString("avatar_url");
            UserModel newUser = new UserModel(i, login, url, image);
            list.add(newUser);
        }
    }

}
