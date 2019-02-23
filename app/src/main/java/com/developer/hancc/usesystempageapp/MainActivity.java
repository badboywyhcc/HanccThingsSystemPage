package com.developer.hancc.usesystempageapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Hancc";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.changeWiFiBtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onChangeWiFi();
//            }
//        });
    }

    /**
     * 打开系统设置界面
     */
    public void onChangeWiFi() {
        Log.i(TAG,"系统版本:"+android.os.Build.VERSION.SDK_INT);
        if (android.os.Build.VERSION.SDK_INT > 10) {
            // 3.0以上打开设置界面，也可以直接用ACTION_WIRELESS_SETTINGS打开到wifi界面
            startActivity(new Intent(android.provider.Settings.ACTION_SETTINGS));
        } else {
            startActivity(new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS));
        }
    }

    public void actionbusiness(View view){
        int viewid = view.getId();
        Log.i(TAG,"控件的id:"+viewid);

        switch (viewid) {
            // 跳转系统的辅助功能界面
            case R.id.ACTION_ACCESSIBILITY_SETTINGS:
            {
                    Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 显示添加帐户创建一个新的帐户屏幕。【测试跳转到微信登录界面】
            case R.id.ACTION_ADD_ACCOUNT:{
                    Intent intent = new Intent(Settings.ACTION_ADD_ACCOUNT);
                    startActivity(intent);
            }
            break;
            // 飞行模式，无线网和网络设置界面
            case R.id.ACTION_AIRPLANE_MODE_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转 APN设置界面
            case R.id.ACTION_APN_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_APN_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 根据包名跳转到系统自带的应用程序信息界面
            case R.id.ACTION_APPLICATION_DETAILS_SETTINGS:{
                    Uri packageURI = Uri.parse("package:" + "com.tencent.WBlog");
                    Intent intent =  new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS,packageURI);
                    startActivity(intent);
            }
            break;
            // 跳转开发人员选项界面
            case R.id.ACTION_APPLICATION_DEVELOPMENT_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转应用程序列表界面
            case R.id.ACTION_APPLICATION_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_APPLICATION_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转系统的蓝牙设置界面
            case R.id.ACTION_BLUETOOTH_SETTINGS  :{
                    Intent intent =  new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转到移动网络设置界面
            case R.id.ACTION_DATA_ROAMING_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转日期时间设置界面
            case R.id.ACTION_DATE_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_DATE_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转手机状态界面
            case R.id.ACTION_DEVICE_INFO_SETTINGS  :{
                    Intent intent =  new Intent(Settings.ACTION_DEVICE_INFO_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转手机显示界面
            case R.id.ACTION_DISPLAY_SETTINGS  :{
                    Intent intent =  new Intent(Settings.ACTION_DISPLAY_SETTINGS);
                    startActivity(intent);
            }
            break;
            //【API 18及以上 没测试】
            case R.id.ACTION_DREAM_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_DREAM_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转语言和输入设备
            case R.id.ACTION_INPUT_METHOD_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
                    startActivity(intent);
            }
            break;
            //【API 11及以上】  //  跳转 语言选择界面 【多国语言选择】
            case R.id.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转存储设置界面【内部存储】
            case R.id.ACTION_INTERNAL_STORAGE_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转 存储设置 【记忆卡存储】
            case R.id.ACTION_MEMORY_CARD_SETTINGS: {
                Intent intent = new Intent(Settings.ACTION_MEMORY_CARD_SETTINGS);
                startActivity(intent);
            }
            break;
            // 跳转语言选择界面【仅有English 和 中文两种选择】
            case R.id.ACTION_LOCALE_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_LOCALE_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转位置服务界面【管理已安装的应用程序。】
            case R.id.ACTION_LOCATION_SOURCE_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转到 显示设置选择网络运营商。
            case R.id.ACTION_NETWORK_OPERATOR_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 显示NFC共享设置。 【API 14及以上】
            case R.id.ACTION_NFCSHARING_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_NFCSHARING_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 显示NFC设置。这显示了用户界面,允许NFC打开或关闭。  【API 16及以上】
            case R.id.ACTION_NFC_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_NFC_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转到备份和重置界面
            case R.id.ACTION_PRIVACY_SETTINGS :{
                    Intent intent =  new Intent(Settings.ACTION_PRIVACY_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转快速启动设置界面
            case R.id.ACTION_QUICK_LAUNCH_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_QUICK_LAUNCH_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转到 搜索设置界面
            case R.id.ACTION_SEARCH_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_SEARCH_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转到安全设置界面
            case R.id.ACTION_SECURITY_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_SECURITY_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转到设置界面
            case R.id.ACTION_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转到声音设置界面
            case R.id.ACTION_SOUND_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_SOUND_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转账户同步界面
            case R.id.ACTION_SYNC_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_SYNC_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转用户字典界面
            case R.id.ACTION_USER_DICTIONARY_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_USER_DICTIONARY_SETTINGS);
                    startActivity(intent);
            }
            break;
            // 跳转到IP设定界面
            case R.id.ACTION_WIFI_IP_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_WIFI_IP_SETTINGS);
                    startActivity(intent);
            }
            break;
            //  跳转Wifi列表设置
            case R.id.ACTION_WIFI_SETTINGS:{
                    Intent intent =  new Intent(Settings.ACTION_WIFI_SETTINGS );
                    startActivity(intent);
            }
            break;

            default:{

            }break;
        }
    }
}
