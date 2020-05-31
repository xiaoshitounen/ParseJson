package swu.xl.parsejson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //testJSONParse();

        //testJSONParseByGSON();
    }

    /**
     * 原生：解析JSON数据
     */
    private void testJSONParse(){
        //获取json字符串
        InputStream is = getResources().openRawResource(R.raw.json);
        String jsonString = getStringByInputStream(is);

        try {
            //获取json对象
            JSONObject jsonObject = new JSONObject(jsonString);

            //解析json对象
            User user = new User();
            JsonModel jsonModel = new JsonModel();
            {
                //获取其中的json对象
                JSONObject user_json = jsonObject.getJSONObject("user");
                user.id = user_json.getLong("id");
                user.name = user_json.getString("name");
                user.avatar = user_json.getString("avatar");
                jsonModel.user = user;

                //获取其中的字符串
                jsonModel.title = jsonObject.getString("title");
                jsonModel.content = jsonObject.getString("content");

                //获取其中的数组
                JSONArray images = jsonObject.getJSONArray("images");
                for (int i = 0; i < images.length(); i++) {
                    jsonModel.images.add((String) images.get(i));
                }

                //获取其中的字符串
                jsonModel.block = jsonObject.getString("block");
                jsonModel.discussNumber = jsonObject.getString("discussNumber");
                jsonModel.datetime = jsonObject.getString("datetime");
            }

            //测试
            System.out.println(jsonModel);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 第三方GSON库：解析JSON数据
     */
    private void testJSONParseByGSON(){
        //获取json字符串
        InputStream is = getResources().openRawResource(R.raw.json);
        String jsonString = getStringByInputStream(is);

        //使用第三方库解析
        Gson gson = new Gson();
        Bean bean = gson.fromJson(jsonString, Bean.class);

        //测试
        System.out.println(bean);
    }

    /**
     * 将输入流->JSON字符串
     * @param is
     * @return
     */
    private String getStringByInputStream(InputStream is) {
        String result;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] data = new byte[1024];
        int len = 0;

        try {
            //一直读取
            while ((len = is.read(data)) != -1){
                bos.write(data,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        result = new String(bos.toByteArray());

        return result;
    }
}