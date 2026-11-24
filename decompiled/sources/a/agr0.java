package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class agr0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bgr0 f839a;
    public final /* synthetic */ bgr0 b;

    public agr0(bgr0 bgr0Var, bgr0 bgr0Var2) {
        this.b = bgr0Var;
        this.f839a = bgr0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.b.c).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            bgr0 bgr0Var = this.f839a;
            if (bgr0Var == null) {
                return;
            }
            if (bgr0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                bgr0 bgr0Var2 = this.f839a;
                ((zfr0) bgr0Var2.f).e.schedule(bgr0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f839a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
