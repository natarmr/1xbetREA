package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class few0 extends dgw0 {
    public final /* synthetic */ byte n;
    public final zzajg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public few0(AuthCredential authCredential, String str, byte b) {
        super(2);
        this.n = b;
        switch (b) {
            case 2:
                super(2);
                s0x.I(authCredential, "credential cannot be null");
                this.o = s7n0.D(authCredential, str);
                break;
            default:
                s0x.I(authCredential, "credential cannot be null");
                zzajg zzajgVarD = s7n0.D(authCredential, str);
                zzajgVarD.j = false;
                this.o = zzajgVarD;
                break;
        }
    }

    @Override // a.dgw0
    public final String a() {
        switch (this.n) {
            case 0:
                return "linkFederatedCredential";
            case 1:
                return "reauthenticateWithCredentialWithData";
            default:
                return "signInWithCredential";
        }
    }

    @Override // a.dgw0
    public final void d(TaskCompletionSource taskCompletionSource, ffw0 ffw0Var) {
        byte b = this.n;
        zlt0 zlt0Var = this.b;
        zzajg zzajgVar = this.o;
        byte b2 = 19;
        switch (b) {
            case 0:
                this.g = new trm0(this, taskCompletionSource, b2);
                String strO = ((zzad) this.d).f45652a.o();
                ffw0Var.getClass();
                s0x.E(strO);
                s0x.H(zzajgVar);
                s0x.H(zlt0Var);
                nmt0 nmt0Var = ffw0Var.f9464a;
                hcp0 hcp0Var = new hcp0(zlt0Var, ffw0.b);
                s0x.E(strO);
                cmt0 cmt0Var = new cmt0();
                cmt0Var.f4625a = zzajgVar;
                cmt0Var.b = hcp0Var;
                cmt0Var.c = nmt0Var;
                nmt0Var.h(strO, cmt0Var);
                break;
            case 1:
                this.g = new trm0(this, taskCompletionSource, b2);
                ffw0Var.b(zzajgVar, zlt0Var);
                break;
            default:
                this.g = new trm0(this, taskCompletionSource, b2);
                ffw0Var.b(zzajgVar, zlt0Var);
                break;
        }
    }

    @Override // a.dgw0
    public final void e() {
        switch (this.n) {
            case 0:
                zzad zzadVarT = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT));
                break;
            case 1:
                zzad zzadVarT2 = fck0.t(this.c, this.i);
                if (!((zzad) this.d).b.f45659a.equalsIgnoreCase(zzadVarT2.b.f45659a)) {
                    c(new Status(17024, null, null, null));
                } else {
                    this.e.b(this.h, zzadVarT2);
                    f(new com.google.firebase.auth.internal.zzx(zzadVarT2));
                }
                break;
            default:
                zzad zzadVarT3 = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT3);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public few0(AuthCredential authCredential) {
        super(2);
        this.n = (byte) 0;
        s0x.I(authCredential, "credential cannot be null");
        this.o = s7n0.D(authCredential, null);
    }
}
