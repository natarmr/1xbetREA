package com.huawei.hms.push;

import a.kng0;
import a.ua80;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.threads.AsyncExec;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HmsMessageService extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Messenger f45924a = new Messenger(new f(new b(this, null)));

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45925a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f45925a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = HmsMessageService.this.getApplicationContext();
            if (this.b.equals(BaseUtils.getLocalToken(applicationContext, this.f45925a))) {
                return;
            }
            HMSLog.i("HmsMessageService", "receive a new token, refresh the local token");
            BaseUtils.saveToken(applicationContext, this.f45925a, this.b);
        }
    }

    private synchronized void a(Intent intent, Bundle bundle, String str) {
        try {
            String stringExtra = intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN);
            a(stringExtra, str);
            Context applicationContext = getApplicationContext();
            boolean zIsEmpty = TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !zIsEmpty) {
                HMSLog.i("HmsMessageService", "onNewToken to host app.");
                onNewToken(stringExtra);
                BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
                if (subjectIds != null && subjectIds.length != 0) {
                    for (int i = 0; i < subjectIds.length; i++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, subjectIds[i]);
                        HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + subjectIds[i]);
                        onNewToken(stringExtra, bundle2);
                        a(stringExtra, subjectIds[i]);
                    }
                    BaseUtils.clearSubjectIds(applicationContext);
                }
                HMSLog.i("HmsMessageService", "onNewToken to host app with bundle.");
                bundle.putString("belongId", intent.getStringExtra("belongId"));
                onNewToken(stringExtra, bundle);
                return;
            }
            HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + str);
            onNewToken(stringExtra, bundle);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Intent intent) {
        HMSLog.i("HmsMessageService", "parse batch response.");
        String stringExtra = intent.getStringExtra("batchMsgbody");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("transactionId");
                String strOptString2 = jSONObject.optString(RemoteMessageConst.MSGID);
                int iOptInt = jSONObject.optInt("ret", ErrorEnum.ERROR_UNKNOWN.getInternalCode());
                if (ErrorEnum.SUCCESS.getInternalCode() == iOptInt) {
                    b(strOptString, strOptString2);
                } else {
                    b(strOptString, strOptString2, iOptInt);
                }
            }
        } catch (JSONException unused) {
            HMSLog.w("HmsMessageService", "parse batch response failed.");
        }
    }

    public void doMsgReceived(Intent intent) {
        onMessageReceived(new RemoteMessage(a(intent)));
    }

    public void handleIntentMessage(Intent intent) {
        if (intent == null) {
            HMSLog.e("HmsMessageService", "receive message is null");
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("message_id");
            String stringExtra2 = intent.getStringExtra(RemoteMessageConst.MSGTYPE);
            String stringExtra3 = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
            if ("new_token".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "onNewToken");
                a(intent, stringExtra3);
                return;
            }
            if ("received_message".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "onMessageReceived, message id:" + stringExtra);
                a(PushNaming.RECEIVE_MSG_RSP, stringExtra, ErrorEnum.SUCCESS.getInternalCode());
                doMsgReceived(intent);
                return;
            }
            if ("sent_message".equals(stringExtra2)) {
                b(stringExtra3, stringExtra);
                return;
            }
            if ("send_error".equals(stringExtra2)) {
                b(stringExtra3, stringExtra, intent.getIntExtra("error", ErrorEnum.ERROR_UNKNOWN.getInternalCode()));
                return;
            }
            if ("delivery".equals(stringExtra2)) {
                int intExtra = intent.getIntExtra("error", ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode());
                HMSLog.i("HmsMessageService", "onMessageDelivery, message id:" + stringExtra + ", status:" + intExtra + ", transactionId: " + stringExtra3);
                a(PushNaming.UPSEND_RECEIPT, stringExtra3, intExtra);
                onMessageDelivered(stringExtra, new SendException(intExtra));
                return;
            }
            if ("server_deleted_message".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "delete message, message id:" + stringExtra);
                onDeletedMessages();
                return;
            }
            if ("batchSent".equals(stringExtra2)) {
                b(intent);
                return;
            }
            HMSLog.e("HmsMessageService", "Receive unknown message: " + stringExtra2);
        } catch (RuntimeException e) {
            HMSLog.e("HmsMessageService", "handle intent RuntimeException: " + e.getMessage());
        } catch (Exception e2) {
            ua80.s(e2, new StringBuilder("handle intent exception: "), "HmsMessageService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.i("HmsMessageService", "start to bind");
        return this.f45924a.getBinder();
    }

    public void onDeletedMessages() {
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMSLog.i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HMSLog.i("HmsMessageService", "start to command , startId = " + i2);
        handleIntentMessage(intent);
        return 2;
    }

    public void onTokenError(Exception exc) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }

    public class b implements f.a {
        private b() {
        }

        @Override // com.huawei.hms.push.f.a
        public void a(Message message) {
            if (message == null) {
                HMSLog.e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.i("HmsMessageService", "handle message start...");
            Bundle data = Message.obtain(message).getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                intent.putExtra(RemoteMessageConst.INPUT_TYPE, data.getInt(RemoteMessageConst.INPUT_TYPE, -1));
                HmsMessageService.this.handleIntentMessage(intent);
            }
        }

        public /* synthetic */ b(HmsMessageService hmsMessageService, a aVar) {
            this();
        }
    }

    private void b(String str, String str2) {
        HMSLog.i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, ErrorEnum.SUCCESS.getInternalCode());
        onMessageSent(str2);
    }

    private void b(String str, String str2, int i) {
        StringBuilder sbP = kng0.p(i, "onSendError, message id:", str2, " error:", ", transactionId: ");
        sbP.append(str);
        HMSLog.i("HmsMessageService", sbP.toString());
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i);
        onSendError(str2, new SendException(i));
    }

    private Bundle a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("message_id", intent.getStringExtra("message_id"));
        bundle.putByteArray(RemoteMessageConst.MSGBODY, intent.getByteArrayExtra(RemoteMessageConst.MSGBODY));
        bundle.putString(RemoteMessageConst.DEVICE_TOKEN, intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN));
        if (intent.getIntExtra(RemoteMessageConst.INPUT_TYPE, -1) == 1) {
            bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
        }
        return bundle;
    }

    private void a(Intent intent, String str) {
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        int intExtra = intent.getIntExtra("error", errorEnum.getInternalCode());
        a(PushNaming.GETTOKEN_ASYNC_RSP, str, intExtra);
        String stringExtra = intent.getStringExtra("subjectId");
        String stringExtra2 = intent.getStringExtra("message_proxy_type");
        StringBuilder sbP = kng0.p(intExtra, "doOnNewToken:transactionId = ", str, " , internalCode = ", ",subjectId:");
        sbP.append(stringExtra);
        sbP.append(",proxyType:");
        sbP.append(stringExtra2);
        HMSLog.i("HmsMessageService", sbP.toString());
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString(SUBJECT_ID, stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString(PROXY_TYPE, stringExtra2);
        }
        if (intExtra == errorEnum.getInternalCode()) {
            HMSLog.i("HmsMessageService", "Apply token OnNewToken, subId: " + stringExtra);
            a(intent, bundle, stringExtra);
            return;
        }
        HMSLog.i("HmsMessageService", "Apply token failed, subId: " + stringExtra);
        a(intent, bundle, stringExtra, intExtra);
    }

    private synchronized void a(Intent intent, Bundle bundle, String str, int i) {
        try {
            Context applicationContext = getApplicationContext();
            boolean zIsEmpty = TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !zIsEmpty) {
                HMSLog.i("HmsMessageService", "onTokenError to host app.");
                onTokenError(new BaseException(i));
                BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
                if (subjectIds != null && subjectIds.length != 0) {
                    for (int i2 = 0; i2 < subjectIds.length; i2++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, subjectIds[i2]);
                        HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + subjectIds[i2]);
                        onTokenError(new BaseException(i), bundle2);
                    }
                    BaseUtils.clearSubjectIds(applicationContext);
                }
                HMSLog.i("HmsMessageService", "onTokenError to host app with bundle.");
                onTokenError(new BaseException(i), bundle);
                return;
            }
            HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + str);
            onTokenError(new BaseException(i), bundle);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AsyncExec.submitSeqIO(new a(str2, str));
    }

    private void a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        PushBiUtil.reportExit(getApplicationContext(), str, str2, i);
    }
}
