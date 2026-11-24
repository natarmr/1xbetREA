package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class vaw0 extends b9v {
    public final uaw0 B;

    public vaw0(Context context, Looper looper, qgd qgdVar, uaw0 uaw0Var, h9w0 h9w0Var, h9w0 h9w0Var2) {
        super(context, looper, 68, qgdVar, h9w0Var, h9w0Var2);
        uaw0Var = uaw0Var == null ? uaw0.c : uaw0Var;
        fck0 fck0Var = new fck0((byte) 21, false);
        fck0Var.b = Boolean.FALSE;
        uaw0 uaw0Var2 = uaw0.c;
        uaw0Var.getClass();
        fck0Var.b = Boolean.valueOf(uaw0Var.f35353a);
        fck0Var.c = uaw0Var.b;
        fck0Var.c = qaw0.a();
        this.B = new uaw0(fck0Var);
    }

    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof xaw0 ? (xaw0) iInterfaceQueryLocalInterface : new xaw0(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", (byte) 2);
    }

    @Override // a.hz5
    public final Bundle h() {
        uaw0 uaw0Var = this.B;
        uaw0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", uaw0Var.f35353a);
        bundle.putString("log_session_id", uaw0Var.b);
        return bundle;
    }

    @Override // a.hz5
    public final int i() {
        return 12800000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
