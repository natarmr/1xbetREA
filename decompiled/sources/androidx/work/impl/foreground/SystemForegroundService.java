package androidx.work.impl.foreground;

import a.cpv0;
import a.lfr;
import a.mlz;
import a.o9o0;
import a.r8x;
import a.std;
import a.wv00;
import a.xgi0;
import a.yw9;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends mlz {
    public static final String e = wv00.h("SystemFgService");
    public boolean b;
    public o9o0 c;
    public NotificationManager d;

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService(RemoteMessageConst.NOTIFICATION);
        o9o0 o9o0Var = new o9o0(getApplicationContext());
        this.c = o9o0Var;
        if (o9o0Var.i != null) {
            wv00.f().d(o9o0.j, "A callback already exists.");
        } else {
            o9o0Var.i = this;
        }
    }

    @Override // a.mlz, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // a.mlz, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        boolean z2 = false;
        String str = e;
        if (z) {
            wv00.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.e();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        o9o0 o9o0Var = this.c;
        o9o0Var.getClass();
        String str2 = o9o0.j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            wv00.f().g(str2, "Started foreground service " + intent);
            o9o0Var.b.a(new lfr(o9o0Var, intent.getStringExtra("KEY_WORKSPEC_ID"), z2, (byte) 16));
            o9o0Var.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            o9o0Var.d(intent);
            return 3;
        }
        byte b = 1;
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            wv00.f().g(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = o9o0Var.i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            wv00.f().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        wv00.f().g(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        cpv0 cpv0Var = o9o0Var.f24889a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        cpv0Var.getClass();
        uuidFromString.getClass();
        std stdVar = cpv0Var.b.f;
        xgi0 xgi0Var = cpv0Var.d.f9946a;
        xgi0Var.getClass();
        r8x.T(stdVar, "CancelWorkById", xgi0Var, new yw9(cpv0Var, uuidFromString, b));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
