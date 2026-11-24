package a;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class qrw0 extends umw0 implements rpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azw0 f29230a;

    public qrw0(azw0 azw0Var) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f29230a = azw0Var;
    }

    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f29230a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        wmw0.d(parcel);
        d(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }

    @Override // a.rpw0
    public final void d(String str, String str2, Bundle bundle, long j) {
        this.f29230a.a(str, str2, bundle, j);
    }

    @Override // a.rpw0
    public final int zzf() {
        return System.identityHashCode(this.f29230a);
    }
}
