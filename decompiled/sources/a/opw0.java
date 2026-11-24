package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class opw0 extends y4w0 implements rpw0 {
    public opw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", (byte) 4);
    }

    @Override // a.rpw0
    public final void d(String str, String str2, Bundle bundle, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        wmw0.b(parcelG, bundle);
        parcelG.writeLong(j);
        H(parcelG, 1);
    }

    @Override // a.rpw0
    public final int zzf() {
        Parcel parcelF = F(G(), 2);
        int i = parcelF.readInt();
        parcelF.recycle();
        return i;
    }
}
