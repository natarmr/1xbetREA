package a;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class fyw0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10380a;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzr b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ oyw0 d;

    public /* synthetic */ fyw0(oyw0 oyw0Var, com.google.android.gms.measurement.internal.zzr zzrVar, Bundle bundle, byte b) {
        this.f10380a = b;
        this.b = zzrVar;
        this.c = bundle;
        this.d = oyw0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        byte b = this.f10380a;
        Bundle bundle = this.c;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.b;
        oyw0 oyw0Var = this.d;
        switch (b) {
            case 0:
                m6x0 m6x0Var = oyw0Var.f26078a;
                m6x0Var.V();
                return m6x0Var.d0(bundle, zzrVar);
            default:
                m6x0 m6x0Var2 = oyw0Var.f26078a;
                m6x0Var2.V();
                return m6x0Var2.d0(bundle, zzrVar);
        }
    }
}
