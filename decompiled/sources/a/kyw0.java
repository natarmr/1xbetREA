package a;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kyw0 extends f9w0 implements mex0 {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public kyw0(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 2);
        s0x.C(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    @Override // a.f9w0
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            gvw gvwVarZzd = zzd();
            parcel2.writeNoException();
            mnw0.b(parcel2, gvwVarZzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public abstract byte[] G();

    public final boolean equals(Object obj) {
        gvw gvwVarZzd;
        if (obj instanceof mex0) {
            try {
                mex0 mex0Var = (mex0) obj;
                if (mex0Var.zze() == this.b && (gvwVarZzd = mex0Var.zzd()) != null) {
                    return Arrays.equals(G(), (byte[]) aa60.H(gvwVarZzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // a.mex0
    public final gvw zzd() {
        return new aa60(G());
    }

    @Override // a.mex0
    public final int zze() {
        return this.b;
    }
}
