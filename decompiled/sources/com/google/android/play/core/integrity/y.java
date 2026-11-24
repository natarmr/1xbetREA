package com.google.android.play.core.integrity;

import a.h8w0;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8w0 f45639a = new h8w0("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j) {
        this.b = str;
        this.c = j;
    }

    public final Task a(Activity activity, int i) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                h8w0 h8w0Var = this.f45639a;
                Object[] objArr = {Integer.valueOf(i)};
                h8w0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", h8w0.c(h8w0Var.f12650a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i);
                bundle.putString("package.name", this.b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
