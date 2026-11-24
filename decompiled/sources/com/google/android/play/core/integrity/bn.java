package com.google.android.play.core.integrity;

import a.bcm0;
import a.c9w0;
import a.h5w0;
import a.h8w0;
import a.k6w0;
import a.q6w0;
import a.s6w0;
import a.w6w0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h5w0 f45620a;
    private final h8w0 b;
    private final String c;
    private final TaskCompletionSource d;
    private final at e;
    private final k f;

    public bn(Context context, h8w0 h8w0Var, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = h8w0Var;
        this.e = atVar;
        this.f = kVar;
        h5w0 h5w0Var = new h5w0(context, h8w0Var, "ExpressIntegrityService", bo.f45621a, new c9w0() { // from class: com.google.android.play.core.integrity.bd
            @Override // a.c9w0
            public final Object a(IBinder iBinder) {
                int i = s6w0.l;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof w6w0 ? (w6w0) iInterfaceQueryLocalInterface : new q6w0(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", (byte) 0);
            }
        });
        this.f45620a = h5w0Var;
        h5w0Var.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k6w0(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(bcm0.g(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k6w0(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(bcm0.g(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f45620a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j, long j2, int i) {
        this.b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f45620a.c(new bg(this, taskCompletionSource, 0, str, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i) {
        this.b.b("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f45620a.c(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
