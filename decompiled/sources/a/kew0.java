package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class kew0 extends dgw0 {
    public final /* synthetic */ byte n;
    public final mhw0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kew0(EmailAuthCredential emailAuthCredential, String str, byte b) {
        super(2);
        this.n = b;
        switch (b) {
            case 1:
                super(2);
                this.o = new mhw0(emailAuthCredential, null, str);
                break;
            default:
                this.o = new mhw0(emailAuthCredential, null, str);
                break;
        }
    }

    @Override // a.dgw0
    public final String a() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithEmailLinkWithData";
            default:
                return "sendSignInLinkToEmail";
        }
    }

    @Override // a.dgw0
    public final void d(TaskCompletionSource taskCompletionSource, ffw0 ffw0Var) {
        byte b = this.n;
        zlt0 zlt0Var = this.b;
        mhw0 mhw0Var = this.o;
        switch (b) {
            case 0:
                this.g = new trm0(this, taskCompletionSource, (byte) 19);
                ffw0Var.a(mhw0Var, zlt0Var);
                break;
            default:
                this.g = new trm0(this, taskCompletionSource, (byte) 19);
                ffw0Var.a(mhw0Var, zlt0Var);
                break;
        }
    }

    @Override // a.dgw0
    public final void e() {
        switch (this.n) {
            case 0:
                zzad zzadVarT = fck0.t(this.c, this.i);
                if (!((zzad) this.d).b.f45659a.equalsIgnoreCase(zzadVarT.b.f45659a)) {
                    c(new Status(17024, null, null, null));
                } else {
                    this.e.b(this.h, zzadVarT);
                    f(new com.google.firebase.auth.internal.zzx(zzadVarT));
                }
                break;
            default:
                zzad zzadVarT2 = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT2);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT2));
                break;
        }
    }
}
