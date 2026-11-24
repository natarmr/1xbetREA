package a;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class hiw0 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13135a = 0;
    public final /* synthetic */ TaskCompletionSource b;

    public hiw0(mmx mmxVar, TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.f13135a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f13135a) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i3 = ynw0.f42960a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(b1j.h(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
                }
                dqm0.y(statusCreateFromParcel, null, this.b);
                return true;
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i4 = lnw0.f20367a;
                Status statusCreateFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                String string = parcel.readString();
                ApiMetadata apiMetadataCreateFromParcel = parcel.readInt() != 0 ? ApiMetadata.CREATOR.createFromParcel(parcel) : null;
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(b1j.h(iDataAvail2, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail2).length() + 45)));
                }
                dqm0.y(statusCreateFromParcel2, string, this.b);
                return true;
        }
    }

    public hiw0(mmx mmxVar, TaskCompletionSource taskCompletionSource, byte b) {
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }
}
