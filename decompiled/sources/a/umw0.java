package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class umw0 extends Binder implements IInterface {
    public umw0(String str) {
        attachInterface(this, str);
    }

    public abstract boolean b(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return b(i, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
