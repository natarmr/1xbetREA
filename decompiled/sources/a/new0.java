package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;

/* JADX INFO: loaded from: classes2.dex */
public final class new0 extends dgw0 {
    public final /* synthetic */ byte n;
    public final AuthCredential o;
    public final String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public new0(PhoneAuthCredential phoneAuthCredential, String str, byte b) {
        super(2);
        this.n = b;
        switch (b) {
            case 1:
                super(2);
                this.o = phoneAuthCredential;
                this.p = str;
                break;
            default:
                phoneAuthCredential.d = false;
                this.o = phoneAuthCredential;
                this.p = str;
                break;
        }
    }

    @Override // a.dgw0
    public final String a() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithPhoneCredentialWithData";
            case 1:
                return "signInWithPhoneNumber";
            default:
                return "linkEmailAuthCredential";
        }
    }

    @Override // a.dgw0
    public final void d(TaskCompletionSource taskCompletionSource, ffw0 ffw0Var) {
        byte b = this.n;
        zlt0 zlt0Var = this.b;
        String str = this.p;
        AuthCredential authCredential = this.o;
        byte b2 = 19;
        switch (b) {
            case 0:
                this.g = new trm0(this, taskCompletionSource, b2);
                ffw0Var.c((PhoneAuthCredential) authCredential, str, zlt0Var);
                break;
            case 1:
                this.g = new trm0(this, taskCompletionSource, b2);
                ffw0Var.c((PhoneAuthCredential) authCredential, str, zlt0Var);
                break;
            default:
                this.g = new trm0(this, taskCompletionSource, b2);
                EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
                String str2 = emailAuthCredential.f45642a;
                String str3 = emailAuthCredential.b;
                s0x.E(str3);
                String strO = ((zzad) this.d).f45652a.o();
                String strM = this.d.m();
                ffw0Var.getClass();
                s0x.E(str2);
                s0x.E(str3);
                s0x.E(strO);
                s0x.H(zlt0Var);
                nmt0 nmt0Var = ffw0Var.f9464a;
                hcp0 hcp0Var = new hcp0(zlt0Var, ffw0.b);
                s0x.E(str2);
                s0x.E(str3);
                s0x.E(strO);
                zcw0 zcw0Var = new zcw0();
                zcw0Var.f44186a = str2;
                zcw0Var.b = str3;
                zcw0Var.c = strM;
                zcw0Var.d = str;
                zcw0Var.e = hcp0Var;
                zcw0Var.f = nmt0Var;
                nmt0Var.h(strO, zcw0Var);
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
            case 1:
                zzad zzadVarT2 = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT2);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT2));
                break;
            default:
                zzad zzadVarT3 = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT3);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public new0(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        this.n = (byte) 2;
        this.o = emailAuthCredential;
        s0x.F(emailAuthCredential.f45642a, "email cannot be null");
        s0x.F(emailAuthCredential.b, "password cannot be null");
        this.p = str;
    }
}
