package a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class f7x0 implements azw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpw0 f9080a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public f7x0(AppMeasurementDynamiteService appMeasurementDynamiteService, rpw0 rpw0Var) {
        this.b = appMeasurementDynamiteService;
        this.f9080a = rpw0Var;
    }

    @Override // a.azw0
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f9080a.d(str, str2, bundle, j);
        } catch (RemoteException e) {
            kxw0 kxw0Var = this.b.f45539a;
            if (kxw0Var != null) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.b(e, "Event listener threw exception");
            }
        }
    }
}
