package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class bpw0 extends y4w0 implements gpw0 {
    public bpw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", (byte) 4);
    }

    @Override // a.gpw0
    public final void u(Bundle bundle) {
        Parcel parcelG = G();
        wmw0.b(parcelG, bundle);
        H(parcelG, 1);
    }
}
