package a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class mbw0 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f21525a;

    public mbw0(IBinder iBinder) {
        this.f21525a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21525a;
    }

    public final void b(ypw0 ypw0Var, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(ypw0Var);
            parcelObtain.writeInt(1);
            erw0.a(getServiceRequest, parcelObtain, 0);
            this.f21525a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
