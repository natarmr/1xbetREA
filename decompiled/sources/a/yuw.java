package a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class yuw implements avw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f43289a;

    @Override // a.avw
    public final void a(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(avw.h);
            parcelObtain.writeStringArray(strArr);
            this.f43289a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f43289a;
    }
}
