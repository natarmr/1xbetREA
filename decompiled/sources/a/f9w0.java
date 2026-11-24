package a;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f9w0 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9176a;

    public f9w0(String str, byte b) {
        this.f9176a = b;
        switch (b) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public static void C(Parcel parcel) {
        int i = onw0.f25568a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(b1j.h(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }

    public boolean D(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                o9w0.b(parcel);
                break;
            case 4:
                o9w0.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                o9w0.b(parcel);
                break;
            case 7:
                o9w0.b(parcel);
                break;
            case 8:
                com.google.android.gms.signin.internal.zak zakVar = (com.google.android.gms.signin.internal.zak) o9w0.a(parcel, com.google.android.gms.signin.internal.zak.CREATOR);
                o9w0.b(parcel);
                r9w0 r9w0Var = (r9w0) this;
                r9w0Var.c.post(new lfr(r9w0Var, zakVar, z, (byte) 22));
                break;
            case 9:
                o9w0.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract boolean E(int i, Parcel parcel, Parcel parcel2);

    public boolean F(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.f9176a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        switch (this.f9176a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return D(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return E(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return F(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                lmx lmxVar = (lmx) this;
                switch (i) {
                    case 1:
                        Status status = (Status) onw0.a(parcel, Status.CREATOR);
                        PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) onw0.a(parcel, PendingGetCredentialHandle.CREATOR);
                        C(parcel);
                        status.getClass();
                        dqm0.y(status, pendingGetCredentialHandle, lmxVar.b);
                        return true;
                    case 2:
                        Status status2 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status2.getClass();
                        e9d0.b();
                        break;
                    case 3:
                        Status status3 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status3.getClass();
                        e9d0.b();
                        break;
                    case 4:
                        Status status4 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status4.getClass();
                        e9d0.b();
                        break;
                    case 5:
                        Status status5 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status5.getClass();
                        e9d0.b();
                        break;
                    case 6:
                        Status status6 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status6.getClass();
                        e9d0.b();
                        break;
                    case 7:
                        Status status7 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status7.getClass();
                        throw new UnsupportedOperationException();
                    case 8:
                        Status status8 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status8.getClass();
                        e9d0.b();
                        break;
                    case 9:
                        Status status9 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status status10 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status11.getClass();
                        e9d0.b();
                        break;
                    case 12:
                        Status status12 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status12.getClass();
                        e9d0.b();
                        break;
                    case 13:
                        Status status13 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status13.getClass();
                        e9d0.b();
                        break;
                    case 14:
                        Status status14 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status14.getClass();
                        e9d0.b();
                        break;
                    case 15:
                        Status status15 = (Status) onw0.a(parcel, Status.CREATOR);
                        C(parcel);
                        status15.getClass();
                        e9d0.b();
                        break;
                }
                return false;
        }
    }
}
