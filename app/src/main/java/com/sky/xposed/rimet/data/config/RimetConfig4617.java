/*
 * Copyright (c) 2019 The sky Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sky.xposed.rimet.data.config;

import com.sky.xposed.rimet.data.M;

/**
 * Created by sky on 2019/1/14.
 */
public class RimetConfig4617 extends RimetConfig {

    @Override
    public void loadConfig() {

        /** Class */
        add(M.classz.class_rimet_LauncherApplication, "com.alibaba.android.rimet.LauncherApplication");
        add(M.classz.class_dingtalkbase_multidexsupport_DDApplication, "com.alibaba.android.dingtalkbase.multidexsupport.DDApplication");
        add(M.classz.class_defpackage_ConversationChangeMaid, "dpw");   // ConversationChangeMaid
        add(M.classz.class_plugin_webwx_ui_ExtDeviceWXLoginUI, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");
        add(M.classz.class_defpackage_ServiceFactory, "jpn");   // ServiceFactory
        add(M.classz.class_android_dingtalk_redpackets_idl_service_RedEnvelopPickIService, "com.alibaba.android.dingtalk.redpackets.idl.service.RedEnvelopPickIService");
        add(M.classz.class_defpackage_RedPacketsRpc, "ces");
        add(M.classz.class_defpackage_RedPacketsRpc_9, "ces$9");
        add(M.classz.class_lightapp_runtime_LightAppRuntimeReverseInterfaceImpl, "com.alibaba.lightapp.runtime.LightAppRuntimeReverseInterfaceImpl");
        add(M.classz.class_android_dingtalk_redpackets_activities_FestivalRedPacketsPickActivity, "com.alibaba.android.dingtalk.redpackets.activities.FestivalRedPacketsPickActivity");
        add(M.classz.class_android_dingtalk_redpackets_activities_PickRedPacketsActivity, "com.alibaba.android.dingtalk.redpackets.activities.PickRedPacketsActivity");
        add(M.classz.class_android_user_settings_activity_NewSettingActivity, "com.alibaba.android.user.settings.activity.NewSettingActivity");

        /** Method */
        add(M.method.method_dingtalkbase_multidexsupport_DDApplication_onCreate, "onCreate");
        add(M.method.method_defpackage_ConversationChangeMaid_onLatestMessageChanged, "onLatestMessageChanged");
        add(M.method.method_wukong_im_conversation_ConversationImpl_latestMessage, "latestMessage");
        add(M.method.method_wukong_im_message_MessageImpl_messageContent, "messageContent");
        add(M.method.method_wukong_im_message_MessageContentImpl_contents, "contents");
        add(M.method.method_defpackage_RedPacketsRpc_newInstance, "a");
        add(M.method.method_defpackage_ServiceFactory_getService, "a");
        add(M.method.method_android_dingtalk_redpackets_idl_service_RedEnvelopPickIService_pickRedEnvelopCluster, "pickRedEnvelopCluster");
        add(M.method.method_lightapp_runtime_LightAppRuntimeReverseInterfaceImpl_initSecurityGuard, "initSecurityGuard");
        add(M.method.method_android_dingtalk_redpackets_activities_FestivalRedPacketsPickActivity_initView, "a");
        add(M.method.method_android_dingtalk_redpackets_activities_PickRedPacketsActivity_initView, "a");
        add(M.method.method_android_user_settings_activity_NewSettingActivity_onCreate, "onCreate");

        /** Field */
        add(M.field.field_wukong_im_message_MessageContentImpl_mType, "mType");
        add(M.field.field_wukong_im_message_MessageContentImpl_CustomMessageContentImpl_mCustomType, "mCustomType");
        add(M.field.field_wukong_im_message_MessageContentImpl_CustomMessageContentImpl_mExtension, "mExtension");

        /** Key */
        add(M.key.key_sid, "sid");
        add(M.key.key_clusterid, "clusterid");

        /** Res */
        add(M.res.res_iv_pick, "iv_pick");
        add(M.res.res_btn_pick, "btn_pick");
        add(M.res.res_setting_msg_notice, "setting_msg_notice");
    }
}
