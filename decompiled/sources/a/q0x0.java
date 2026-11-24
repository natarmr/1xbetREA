package a;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes2.dex */
public final class q0x0 extends m1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0x0 f27924a;
    public final icw0 b;
    public final icw0 c;
    public final Integer d;

    public q0x0(e0x0 e0x0Var, icw0 icw0Var, icw0 icw0Var2, Integer num) {
        this.f27924a = e0x0Var;
        this.b = icw0Var;
        this.c = icw0Var2;
        this.d = num;
    }

    public static q0x0 v(e0x0 e0x0Var, icw0 icw0Var, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        icw0 icw0VarB;
        m60 m60Var = e0x0Var.d;
        m60 m60Var2 = m60.m;
        if (!m60Var.equals(m60Var2) && num == null) {
            throw new GeneralSecurityException(kng0.l("'idRequirement' must be non-null for ", String.valueOf(m60Var), " variant."));
        }
        if (m60Var == m60Var2 && num != null) {
            hny.o("'idRequirement' must be null for NO_PREFIX variant.");
            return null;
        }
        d0x0 d0x0Var = e0x0Var.f7012a;
        int length = icw0Var.f14556a.length;
        String str = "Encoded public key byte length for " + String.valueOf(d0x0Var) + " must be %d, not " + length;
        d0x0 d0x0Var2 = d0x0.e;
        d0x0 d0x0Var3 = d0x0.d;
        d0x0 d0x0Var4 = d0x0.c;
        if (d0x0Var == d0x0Var4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (d0x0Var == d0x0Var3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (d0x0Var == d0x0Var2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else if (d0x0Var == d0x0.f) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            if (d0x0Var != d0x0.g) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(d0x0Var)));
            }
            if (length != 1216) {
                throw new GeneralSecurityException(String.format(str, 1216));
            }
        }
        if (d0x0Var == d0x0Var4 || d0x0Var == d0x0Var3 || d0x0Var == d0x0Var2) {
            if (d0x0Var == d0x0Var4) {
                curve = m4x0.f21196a.getCurve();
            } else if (d0x0Var == d0x0Var3) {
                curve = m4x0.b.getCurve();
            } else {
                if (d0x0Var != d0x0Var2) {
                    jf4.o("Unable to determine NIST curve type for ".concat(String.valueOf(d0x0Var)));
                    return null;
                }
                curve = m4x0.c.getCurve();
            }
            m4x0.g(ghm0.A(curve, eix0.f7881a, icw0Var.b()), curve);
        }
        if (m60Var == m60Var2) {
            icw0VarB = q6x0.f28222a;
        } else {
            if (num == null) {
                jf4.n("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(m60Var)));
                return null;
            }
            if (m60Var == m60.l) {
                icw0VarB = q6x0.a(num.intValue());
            } else {
                if (m60Var != m60.k) {
                    jf4.n("Unknown HpkeParameters.Variant: ".concat(String.valueOf(m60Var)));
                    return null;
                }
                icw0VarB = q6x0.b(num.intValue());
            }
        }
        return new q0x0(e0x0Var, icw0Var, icw0VarB, num);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f27924a;
    }

    @Override // a.atm0
    public final Integer t() {
        return this.d;
    }

    @Override // a.m1x0
    public final icw0 u() {
        return this.c;
    }
}
