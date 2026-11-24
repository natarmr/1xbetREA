package a;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zaw0 extends BasePendingResult {
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaw0(j9w0 j9w0Var, byte b) {
        super(j9w0Var);
        this.k = b;
        s0x.I(j9w0Var, "GoogleApiClient must not be null");
        s0x.I(q44.f28080a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ m0g0 b(Status status) {
        byte b = this.k;
        return status;
    }

    public final void f(b9v b9vVar) {
        switch (this.k) {
            case 0:
                waw0 waw0Var = (waw0) b9vVar;
                cbw0 cbw0Var = (cbw0) waw0Var.l();
                yaw0 yaw0Var = new yaw0(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = waw0Var.B;
                Parcel parcelC = cbw0Var.C();
                int i = taw0.f33634a;
                parcelC.writeStrongBinder(yaw0Var);
                taw0.c(parcelC, googleSignInOptions);
                cbw0Var.D(parcelC, 102);
                break;
            default:
                waw0 waw0Var2 = (waw0) b9vVar;
                cbw0 cbw0Var2 = (cbw0) waw0Var2.l();
                yaw0 yaw0Var2 = new yaw0(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = waw0Var2.B;
                Parcel parcelC2 = cbw0Var2.C();
                int i2 = taw0.f33634a;
                parcelC2.writeStrongBinder(yaw0Var2);
                taw0.c(parcelC2, googleSignInOptions2);
                cbw0Var2.D(parcelC2, 103);
                break;
        }
    }

    public final void g(Status status) {
        s0x.B("Failed result must not be success", !status.m());
        e(b(status));
    }
}
