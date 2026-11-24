package a;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class kuw0 extends hz5 {
    @Override // a.hz5
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof gtw0 ? (gtw0) iInterfaceQueryLocalInterface : new ctw0(iBinder);
    }

    @Override // a.hz5
    public final int i() {
        return 12451000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.measurement.START";
    }
}
