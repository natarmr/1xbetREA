package com.google.android.play.core.integrity;

import a.bcm0;
import a.c9w0;
import a.e7w0;
import a.h5w0;
import a.h7w0;
import a.h8w0;
import a.j5w0;
import a.k6w0;
import a.k7w0;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h5w0 f45597a;
    private final h8w0 b;
    private final String c;
    private final at d;
    private final k e;

    public aj(Context context, h8w0 h8w0Var, at atVar, k kVar) {
        this.c = context.getPackageName();
        this.b = h8w0Var;
        this.d = atVar;
        this.e = kVar;
        h8w0 h8w0Var2 = j5w0.f15954a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && j5w0.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                this.f45597a = new h5w0(context, h8w0Var, "IntegrityService", ak.f45598a, new c9w0() { // from class: com.google.android.play.core.integrity.ae
                    @Override // a.c9w0
                    public final Object a(IBinder iBinder) {
                        int i = h7w0.l;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                        return iInterfaceQueryLocalInterface instanceof k7w0 ? (k7w0) iInterfaceQueryLocalInterface : new e7w0(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", (byte) 0);
                    }
                });
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        h8w0Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h8w0.c(h8w0Var.f12650a, "Phonesky is not installed.", objArr));
        }
        this.f45597a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k6w0(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(bcm0.g(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f45597a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f45597a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f45597a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f45597a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
