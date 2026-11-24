package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class cuw0 extends qqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final muw0 f5006a;
    public final rkt0 b;
    public final icw0 c;
    public final Integer d;

    public cuw0(muw0 muw0Var, rkt0 rkt0Var, icw0 icw0Var, Integer num) {
        this.f5006a = muw0Var;
        this.b = rkt0Var;
        this.c = icw0Var;
        this.d = num;
    }

    public static cuw0 v(fhn fhnVar, rkt0 rkt0Var, Integer num) throws GeneralSecurityException {
        icw0 icw0VarB;
        icw0 icw0Var = (icw0) rkt0Var.b;
        fhn fhnVar2 = fhn.l;
        if (fhnVar != fhnVar2 && num == null) {
            throw new GeneralSecurityException(kng0.l("For given Variant ", String.valueOf(fhnVar), " the value of idRequirement must be non-null"));
        }
        if (fhnVar == fhnVar2 && num != null) {
            hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (icw0Var.f14556a.length != 32) {
            throw new GeneralSecurityException(twn.m(icw0Var.f14556a.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        muw0 muw0Var = new muw0(fhnVar);
        if (fhnVar == fhnVar2) {
            icw0VarB = q6x0.f28222a;
        } else if (fhnVar == fhn.k) {
            icw0VarB = q6x0.a(num.intValue());
        } else {
            if (fhnVar != fhn.j) {
                jf4.n("Unknown Variant: ".concat(String.valueOf(fhnVar)));
                return null;
            }
            icw0VarB = q6x0.b(num.intValue());
        }
        return new cuw0(muw0Var, rkt0Var, icw0VarB, num);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f5006a;
    }

    @Override // a.atm0
    public final Integer t() {
        return this.d;
    }

    @Override // a.qqw0
    public final icw0 u() {
        return this.c;
    }
}
