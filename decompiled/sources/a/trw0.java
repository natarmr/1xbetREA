package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class trw0 extends qqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrw0 f34437a;
    public final rkt0 b;
    public final icw0 c;
    public final Integer d;

    public trw0(vrw0 vrw0Var, rkt0 rkt0Var, icw0 icw0Var, Integer num) {
        this.f34437a = vrw0Var;
        this.b = rkt0Var;
        this.c = icw0Var;
        this.d = num;
    }

    public static trw0 v(y60 y60Var, rkt0 rkt0Var, Integer num) throws GeneralSecurityException {
        icw0 icw0VarB;
        icw0 icw0Var = (icw0) rkt0Var.b;
        y60 y60Var2 = y60.m;
        if (y60Var != y60Var2 && num == null) {
            throw new GeneralSecurityException(kng0.l("For given Variant ", String.valueOf(y60Var), " the value of idRequirement must be non-null"));
        }
        if (y60Var == y60Var2 && num != null) {
            hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (icw0Var.f14556a.length != 32) {
            throw new GeneralSecurityException(twn.m(icw0Var.f14556a.length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        vrw0 vrw0Var = new vrw0(y60Var);
        if (y60Var == y60Var2) {
            icw0VarB = q6x0.f28222a;
        } else if (y60Var == y60.l) {
            icw0VarB = q6x0.a(num.intValue());
        } else {
            if (y60Var != y60.k) {
                jf4.n("Unknown Variant: ".concat(String.valueOf(y60Var)));
                return null;
            }
            icw0VarB = q6x0.b(num.intValue());
        }
        return new trw0(vrw0Var, rkt0Var, icw0VarB, num);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f34437a;
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
