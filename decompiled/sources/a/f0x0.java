package a;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes2.dex */
public final class f0x0 extends m1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzw0 f8737a;
    public final ECPoint b;
    public final icw0 c;
    public final icw0 d;
    public final Integer e;

    public f0x0(xzw0 xzw0Var, ECPoint eCPoint, icw0 icw0Var, icw0 icw0Var2, Integer num) {
        this.f8737a = xzw0Var;
        this.b = eCPoint;
        this.c = icw0Var;
        this.d = icw0Var2;
        this.e = num;
    }

    public static icw0 v(p50 p50Var, Integer num) {
        if (p50Var == p50.n) {
            return q6x0.f28222a;
        }
        if (num == null) {
            jf4.n("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(p50Var)));
            return null;
        }
        if (p50Var == p50.m) {
            return q6x0.a(num.intValue());
        }
        if (p50Var == p50.l) {
            return q6x0.b(num.intValue());
        }
        jf4.n("Unknown EciesParameters.Variant: ".concat(String.valueOf(p50Var)));
        return null;
    }

    public static f0x0 w(xzw0 xzw0Var, icw0 icw0Var, Integer num) throws GeneralSecurityException {
        vzw0 vzw0Var = xzw0Var.f41775a;
        p50 p50Var = xzw0Var.d;
        if (!vzw0Var.equals(vzw0.e)) {
            hny.o("createForCurveX25519 may only be called with parameters for curve X25519");
            return null;
        }
        y(p50Var, num);
        if (icw0Var.f14556a.length == 32) {
            return new f0x0(xzw0Var, null, icw0Var, v(p50Var, num), num);
        }
        hny.o("Encoded public point byte length for X25519 curve must be 32");
        return null;
    }

    public static f0x0 x(xzw0 xzw0Var, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        vzw0 vzw0Var = xzw0Var.f41775a;
        p50 p50Var = xzw0Var.d;
        if (vzw0Var.equals(vzw0.e)) {
            hny.o("createForNistCurve may only be called with parameters for NIST curve");
            return null;
        }
        y(p50Var, num);
        if (vzw0Var == vzw0.b) {
            curve = m4x0.f21196a.getCurve();
        } else if (vzw0Var == vzw0.c) {
            curve = m4x0.b.getCurve();
        } else {
            if (vzw0Var != vzw0.d) {
                jf4.o("Unable to determine NIST curve type for ".concat(String.valueOf(vzw0Var)));
                return null;
            }
            curve = m4x0.c.getCurve();
        }
        m4x0.g(eCPoint, curve);
        return new f0x0(xzw0Var, eCPoint, null, v(p50Var, num), num);
    }

    public static void y(p50 p50Var, Integer num) throws GeneralSecurityException {
        p50 p50Var2 = p50.n;
        if (!p50Var.equals(p50Var2) && num == null) {
            throw new GeneralSecurityException(kng0.l("'idRequirement' must be non-null for ", String.valueOf(p50Var), " variant."));
        }
        if (p50Var == p50Var2 && num != null) {
            hny.o("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f8737a;
    }

    @Override // a.atm0
    public final Integer t() {
        return this.e;
    }

    @Override // a.m1x0
    public final icw0 u() {
        return this.d;
    }
}
