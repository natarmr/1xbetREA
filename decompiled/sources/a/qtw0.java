package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class qtw0 extends qqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtw0 f29320a;
    public final rkt0 b;
    public final icw0 c;
    public final Integer d;

    public qtw0(xtw0 xtw0Var, rkt0 rkt0Var, icw0 icw0Var, Integer num) {
        this.f29320a = xtw0Var;
        this.b = rkt0Var;
        this.c = icw0Var;
        this.d = num;
    }

    public static qtw0 v(xtw0 xtw0Var, rkt0 rkt0Var, Integer num) throws GeneralSecurityException {
        icw0 icw0VarB;
        icw0 icw0Var = (icw0) rkt0Var.b;
        arw0 arw0Var = xtw0Var.f41484a;
        arw0 arw0Var2 = arw0.g;
        if (arw0Var != arw0Var2 && num == null) {
            throw new GeneralSecurityException(kng0.l("For given Variant ", String.valueOf(arw0Var), " the value of idRequirement must be non-null"));
        }
        if (arw0Var == arw0Var2 && num != null) {
            hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (icw0Var.f14556a.length != 32) {
            throw new GeneralSecurityException(twn.m(icw0Var.f14556a.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (arw0Var == arw0Var2) {
            icw0VarB = q6x0.f28222a;
        } else {
            if (arw0Var != arw0.f) {
                jf4.n("Unknown Variant: ".concat(String.valueOf(arw0Var)));
                return null;
            }
            icw0VarB = q6x0.b(num.intValue());
        }
        return new qtw0(xtw0Var, rkt0Var, icw0VarB, num);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f29320a;
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
