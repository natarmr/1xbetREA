package a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class e9w0 extends b9v {
    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof daw0 ? (daw0) iInterfaceQueryLocalInterface : new daw0(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 1);
    }

    @Override // a.hz5
    public final Feature[] f() {
        return ro4.j;
    }

    @Override // a.hz5
    public final int i() {
        return 253600000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // a.hz5
    public final boolean o() {
        return true;
    }
}
