package a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class xuw implements zuw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f41531a;

    @Override // a.zuw
    public final void a(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(zuw.g);
            parcelObtain.writeStringArray(strArr);
            if (!this.f41531a.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method onInvalidation is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41531a;
    }
}
