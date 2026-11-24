package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class lew0 extends dgw0 {
    public final /* synthetic */ byte n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lew0(String str, String str2, String str3, String str4, byte b) {
        super(2);
        this.n = b;
        switch (b) {
            case 1:
                super(2);
                s0x.F(str, "email cannot be null or empty");
                s0x.F(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                break;
            default:
                s0x.F(str, "email cannot be null or empty");
                s0x.F(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                break;
        }
    }

    @Override // a.dgw0
    public final String a() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithEmailPasswordWithData";
            default:
                return "signInWithEmailAndPassword";
        }
    }

    @Override // a.dgw0
    public final void d(TaskCompletionSource taskCompletionSource, ffw0 ffw0Var) {
        switch (this.n) {
            case 0:
                this.g = new trm0(this, taskCompletionSource, (byte) 19);
                ffw0Var.d(this.o, this.p, this.q, this.r, this.b);
                break;
            default:
                this.g = new trm0(this, taskCompletionSource, (byte) 19);
                ffw0Var.d(this.o, this.p, this.q, this.r, this.b);
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
