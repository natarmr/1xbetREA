package a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.RegisterRequest;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public final class zcx0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44187a;

    public /* synthetic */ zcx0(byte b) {
        this.f44187a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zT = false;
        String strD = null;
        switch (this.f44187a) {
            case 0:
                try {
                    return ErrorCode.a(parcel.readInt());
                } catch (t0o e) {
                    throw new IllegalArgumentException(e);
                }
            case 1:
                int iI0 = b5x.i0(parcel);
                int iW = 0;
                String strD2 = null;
                String strD3 = null;
                String strD4 = null;
                String strD5 = null;
                String strD6 = null;
                String strD7 = null;
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strD2 = b5x.D(parcel, i);
                            break;
                        case 2:
                            strD3 = b5x.D(parcel, i);
                            break;
                        case 3:
                            strD4 = b5x.D(parcel, i);
                            break;
                        case 4:
                            strD5 = b5x.D(parcel, i);
                            break;
                        case 5:
                            strD6 = b5x.D(parcel, i);
                            break;
                        case 6:
                            iW = b5x.W(parcel, i);
                            break;
                        case 7:
                            strD7 = b5x.D(parcel, i);
                            break;
                        default:
                            b5x.b0(parcel, i);
                            break;
                    }
                }
                b5x.H(parcel, iI0);
                return new RegisterRequest(iW, strD2, strD3, strD4, strD5, strD6, strD7);
            default:
                int iI1 = b5x.i0(parcel);
                String strD8 = null;
                while (parcel.dataPosition() < iI1) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        strD = b5x.D(parcel, i2);
                    } else if (c == 2) {
                        strD8 = b5x.D(parcel, i2);
                    } else if (c != 3) {
                        b5x.b0(parcel, i2);
                    } else {
                        zT = b5x.T(parcel, i2);
                    }
                }
                b5x.H(parcel, iI1);
                return new com.google.firebase.auth.internal.zzv(strD, strD8, zT);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f44187a) {
            case 0:
                return new ErrorCode[i];
            case 1:
                return new RegisterRequest[i];
            default:
                return new com.google.firebase.auth.internal.zzv[i];
        }
    }
}
