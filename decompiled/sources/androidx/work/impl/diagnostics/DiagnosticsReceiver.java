package androidx.work.impl.diagnostics;

import a.cpv0;
import a.wv00;
import a.xl60;
import a.yl60;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45419a = wv00.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        wv00 wv00VarF = wv00.f();
        String str = f45419a;
        wv00VarF.a(str, "Requesting diagnostics");
        try {
            context.getClass();
            cpv0 cpv0VarD = cpv0.d(context);
            cpv0VarD.getClass();
            cpv0VarD.a((yl60) new xl60(DiagnosticsWorker.class).k());
        } catch (IllegalStateException e) {
            wv00.f().e(str, "WorkManager is not initialized", e);
        }
    }
}
