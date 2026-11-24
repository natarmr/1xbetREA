package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class buj0 extends b9v {
    public final boolean B;
    public final qgd C;
    public final Bundle D;
    public final Integer E;

    public buj0(Context context, Looper looper, qgd qgdVar, Bundle bundle, qav qavVar, rav ravVar) {
        super(context, looper, 44, qgdVar, qavVar, ravVar);
        this.B = true;
        this.C = qgdVar;
        this.D = bundle;
        this.E = (Integer) qgdVar.h;
    }

    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof x9w0 ? (x9w0) iInterfaceQueryLocalInterface : new x9w0(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 1);
    }

    @Override // a.hz5
    public final Bundle h() {
        qgd qgdVar = this.C;
        boolean zEquals = this.c.getPackageName().equals((String) qgdVar.e);
        Bundle bundle = this.D;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) qgdVar.e);
        }
        return bundle;
    }

    @Override // a.hz5
    public final int i() {
        return 12451000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // a.hz5
    public final boolean r() {
        return this.B;
    }
}
