package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class paw0 extends b9v {
    public final Bundle B;

    public paw0(Context context, Looper looper, qgd qgdVar, h9w0 h9w0Var, h9w0 h9w0Var2) {
        super(context, looper, 212, qgdVar, h9w0Var, h9w0Var2);
        this.B = new Bundle();
    }

    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ebw0 ? (ebw0) iInterfaceQueryLocalInterface : new ebw0(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override // a.hz5
    public final Feature[] f() {
        return x4d0.r;
    }

    @Override // a.hz5
    public final Bundle h() {
        return this.B;
    }

    @Override // a.hz5
    public final int i() {
        return 17895000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // a.hz5
    public final boolean o() {
        return true;
    }

    @Override // a.hz5
    public final boolean s() {
        return true;
    }
}
