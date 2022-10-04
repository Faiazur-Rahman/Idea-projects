package org.example.myappliation.services;

import com.google.gson.Gson;
import com.squareup.okhttp.*;
import org.example.myappliation.entity.UserAccountInfo;
import org.example.myappliation.pojo.Pojo;
import org.example.myappliation.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaidService {
    private String clientId="632ffe80e6fbd200135c8daa";
    private String secret = "e462675935f1b8e032840707ea2182";
    private OkHttpClient client = new OkHttpClient();
    private MediaType mediaType = MediaType.parse("application/json");
    private String institution_id = "ins_3";
    @Autowired
    private AccountRepository accountRepository;
    public Pojo getAllAccounts(){
        String publicKey = getPublicKey();
        String access_token = getAccessToken(publicKey);
        String allAccountsJsonString = getAllAccountsJsonString(access_token);
        System.out.println(allAccountsJsonString);
        Gson gson = new Gson();
        Pojo pojo = gson.fromJson(allAccountsJsonString, Pojo.class);
        for (UserAccountInfo account: pojo.getAllAccounts()){
            accountRepository.save(account);
        }
        return pojo;
    }

    private String getAllAccountsJsonString(String access_token) {
        String url = "https://sandbox.plaid.com/accounts/balance/get";
        String content = "{\n  \"" +
                "client_id\": \""+clientId+"\"," +
                "\n  \"secret\": \""+secret+"\"," +
                "\n  \"access_token\": \"access-sandbox-b93a8c2e-82ed-4e1f-b692-3751cb8dbd0b\"\n}";
        System.out.println(content);
        RequestBody body = RequestBody.create(mediaType, content);
        Request request = getRequest(url, body);
        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (Exception e){
            return "Not found";
        }
    }

    private String getPublicKey(){
        String url = "https://sandbox.plaid.com/sandbox/public_token/create";
        String content = "{\n  \"client_id\":" +
                " \""+clientId+"\"," +
                "\n  \"secret\": \""+secret+"\"," +
                "\n  \"institution_id\": \""+institution_id+"\",\n  \"" +
                "initial_products\":" +
                " [\"auth\"],\n  \"options\": {\n    \"webhook\":" +
                " \"https://www.genericwebhookurl.com/webhook\"\n  }\n}";

        RequestBody body = RequestBody.create(mediaType, content);
        Request request = getRequest(url, body);
        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (Exception e){
            return "Not found";
        }
    }

    private String getAccessToken(String publicKey) {
        String url = "https://sandbox.plaid.com/item/public_token/exchange";
        String content = "{\n  \"client_id\": \""+clientId+"\",\n" +
                "  \"secret\": \""+secret+"\",\n  \"" +
                "public_token\": \"public-sandbox-eda6cbb6-7c01-47ff-850e-2dd538769033\"\n}";
        RequestBody body = RequestBody.create(mediaType, content);
        Request request = getRequest(url, body);
        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (Exception e){
            return "Not found";
        }
    }

    private Request getRequest(String url, RequestBody body) {
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        return request;
    }
}
