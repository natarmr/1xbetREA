package a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class yaw0 extends f9w0 implements IInterface {
    public final /* synthetic */ byte b;
    public final /* synthetic */ zaw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yaw0(zaw0 zaw0Var, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 1);
        this.b = b;
        this.c = zaw0Var;
    }

    @Override // a.f9w0
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        zaw0 zaw0Var = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                taw0.b(parcel);
                e9d0.b();
                return false;
            case 102:
                Status status = (Status) taw0.a(parcel, Status.CREATOR);
                taw0.b(parcel);
                switch (b) {
                    case 0:
                        zaw0Var.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) taw0.a(parcel, Status.CREATOR);
                taw0.b(parcel);
                switch (b) {
                    case 1:
                        zaw0Var.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
