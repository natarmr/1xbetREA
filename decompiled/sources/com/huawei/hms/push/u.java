package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public class u {
    private static final String[] c = {RemoteMessageConst.Notification.URL, Payload.TYPE_APP, "cosa", "rp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45950a;
    private o b;

    public u(Context context, o oVar) {
        this.f45950a = context;
        this.b = oVar;
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.c());
            if (e.c(this.f45950a, this.b.c())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }

    private void b() {
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.b.c() + ",and msg.intentUri is " + this.b.m());
            Intent intentB = e.b(this.f45950a, this.b.c());
            String strM = this.b.m();
            o oVar = this.b;
            boolean zBooleanValue = false;
            if (strM != null) {
                try {
                    Intent uri = Intent.parseUri(oVar.m(), 0);
                    uri.setSelector(null);
                    if (uri.getClipData() == null) {
                        uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = e.a(this.f45950a, this.b.c(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentB = uri;
                    }
                } catch (Exception e) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (oVar.a() != null) {
                Intent intent = new Intent(this.b.a());
                if (e.a(this.f45950a, this.b.c(), intent).booleanValue()) {
                    intentB = intent;
                }
            }
            if (intentB == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentB.setPackage(this.b.c());
            if (zBooleanValue) {
                intentB.addFlags(268435456);
            } else {
                intentB.setFlags(805437440);
            }
            this.f45950a.startActivity(intentB);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public void c() {
        o oVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f45950a == null || (oVar = this.b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if (Payload.TYPE_APP.equals(oVar.h())) {
            a();
            return;
        }
        if ("cosa".equals(this.b.h())) {
            b();
            return;
        }
        boolean zEquals = "rp".equals(this.b.h());
        o oVar2 = this.b;
        if (zEquals) {
            HMSLog.w("PushSelfShowLog", oVar2.h() + " not support rich message.");
            return;
        }
        boolean zEquals2 = RemoteMessageConst.Notification.URL.equals(oVar2.h());
        o oVar3 = this.b;
        if (zEquals2) {
            HMSLog.w("PushSelfShowLog", oVar3.h() + " not support URL.");
            return;
        }
        HMSLog.d("PushSelfShowLog", oVar3.h() + " is not exist in hShowType");
    }

    public static boolean a(String str) {
        for (String str2 : c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
