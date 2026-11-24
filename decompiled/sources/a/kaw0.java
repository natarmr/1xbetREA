package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class kaw0 extends b9v {
    public final mwp0 B;

    public kaw0(Context context, Looper looper, qgd qgdVar, mwp0 mwp0Var, h9w0 h9w0Var, h9w0 h9w0Var2) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, qgdVar, h9w0Var, h9w0Var2);
        this.B = mwp0Var;
    }

    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof faw0 ? (faw0) iInterfaceQueryLocalInterface : new faw0(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override // a.hz5
    public final Feature[] f() {
        return ro4.j;
    }

    @Override // a.hz5
    public final Bundle h() {
        mwp0 mwp0Var = this.B;
        mwp0Var.getClass();
        Bundle bundle = new Bundle();
        String str = mwp0Var.f22517a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // a.hz5
    public final int i() {
        return 203400000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // a.hz5
    public final boolean o() {
        return true;
    }
}
