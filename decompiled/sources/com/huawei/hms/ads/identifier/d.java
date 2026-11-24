package com.huawei.hms.ads.identifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile d f45735a;

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.opendevice.open.action.REAL_OAID_RESET");
        if (f45735a == null) {
            f45735a = new d();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(f45735a, intentFilter, "com.huawei.permission.app.DOWNLOAD", null, 2);
        } else {
            context.registerReceiver(f45735a, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
        }
    }

    public static void b(Context context) {
        try {
            if (f45735a != null) {
                Log.i("OaidChangedReceiver", "unregister receiver");
                context.unregisterReceiver(f45735a);
                f45735a = null;
            }
        } catch (Throwable unused) {
            Log.w("OaidChangedReceiver", "unregisterReceiver exception");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || !"com.huawei.opendevice.open.action.REAL_OAID_RESET".equals(intent.getAction())) {
            return;
        }
        j.f45741a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.d.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("OaidChangedReceiver", "receive oaid reset broadcast");
                final Context context2 = AdsIdentifierSdk.getContext();
                if (context2 == null) {
                    Log.w("OaidChangedReceiver", "context is null");
                } else {
                    c.a(context2, new e() { // from class: com.huawei.hms.ads.identifier.d.1.1
                        @Override // com.huawei.hms.ads.identifier.e
                        public void a() {
                            try {
                                Intent intent2 = new Intent("com.huawei.opendevice.open.action.OAID_RESET");
                                intent2.setPackage(f.a(context2));
                                context2.sendBroadcast(intent2, "com.huawei.hms.permission.signatureOrSystem");
                            } catch (Throwable unused) {
                                Log.w("OaidChangedReceiver", "send broCast fail");
                            }
                        }
                    });
                }
            }
        });
    }
}
