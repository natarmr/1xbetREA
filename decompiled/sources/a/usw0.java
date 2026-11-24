package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class usw0 extends qqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsw0 f36231a;
    public final icw0 b;
    public final Integer c;

    public usw0(tsw0 tsw0Var, icw0 icw0Var, Integer num) {
        this.f36231a = tsw0Var;
        this.b = icw0Var;
        this.c = num;
    }

    public static usw0 v(tsw0 tsw0Var, Integer num) throws GeneralSecurityException {
        icw0 icw0VarB;
        hbb hbbVar = tsw0Var.f34483a;
        if (hbbVar == hbb.o) {
            if (num != null) {
                hny.o("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            icw0VarB = q6x0.f28222a;
        } else {
            if (hbbVar != hbb.n) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(hbbVar)));
            }
            if (num == null) {
                hny.o("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            icw0VarB = q6x0.b(num.intValue());
        }
        return new usw0(tsw0Var, icw0VarB, num);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f36231a;
    }

    @Override // a.atm0
    public final Integer t() {
        return this.c;
    }

    @Override // a.qqw0
    public final icw0 u() {
        return this.b;
    }
}
