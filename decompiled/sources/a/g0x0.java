package a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g0x0 extends i1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0x0 f10482a;
    public final rkt0 b;

    public g0x0(q0x0 q0x0Var, rkt0 rkt0Var) {
        this.f10482a = q0x0Var;
        this.b = rkt0Var;
    }

    public static g0x0 v(q0x0 q0x0Var, rkt0 rkt0Var) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        e0x0 e0x0Var = q0x0Var.f27924a;
        icw0 icw0Var = (icw0) rkt0Var.b;
        d0x0 d0x0Var = e0x0Var.f7012a;
        int length = icw0Var.f14556a.length;
        String str = "Encoded private key byte length for " + String.valueOf(d0x0Var) + " must be %d, not " + length;
        d0x0 d0x0Var2 = d0x0.g;
        d0x0 d0x0Var3 = d0x0.f;
        d0x0 d0x0Var4 = d0x0.e;
        d0x0 d0x0Var5 = d0x0.d;
        d0x0 d0x0Var6 = d0x0.c;
        if (d0x0Var == d0x0Var6) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (d0x0Var == d0x0Var5) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (d0x0Var == d0x0Var4) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else if (d0x0Var == d0x0Var3) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            if (d0x0Var != d0x0Var2) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(d0x0Var)));
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] bArrB = q0x0Var.b.b();
        byte[] bArrB2 = icw0Var.b();
        if (d0x0Var == d0x0Var6 || d0x0Var == d0x0Var5 || d0x0Var == d0x0Var4) {
            if (d0x0Var == d0x0Var6) {
                eCParameterSpec = m4x0.f21196a;
            } else if (d0x0Var == d0x0Var5) {
                eCParameterSpec = m4x0.b;
            } else {
                if (d0x0Var != d0x0Var4) {
                    jf4.o("Unable to determine NIST curve params for ".concat(String.valueOf(d0x0Var)));
                    return null;
                }
                eCParameterSpec = m4x0.c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerE = ibm0.E(bArrB2);
            if (bigIntegerE.signum() <= 0 || bigIntegerE.compareTo(order) >= 0) {
                hny.o("Invalid private key.");
                return null;
            }
            if (!m4x0.f(bigIntegerE, eCParameterSpec).equals(ghm0.A(eCParameterSpec.getCurve(), eix0.f7881a, bArrB))) {
                hny.o("Invalid private key for public key.");
                return null;
            }
        } else if (d0x0Var == d0x0Var3) {
            if (!Arrays.equals(dem0.x(bArrB2), bArrB)) {
                hny.o("Invalid private key for public key.");
                return null;
            }
        } else if (d0x0Var != d0x0Var2) {
            jf4.o("Unable to validate key pair for ".concat(String.valueOf(d0x0Var)));
            return null;
        }
        return new g0x0(q0x0Var, rkt0Var);
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f10482a.f27924a;
    }

    @Override // a.i1x0
    public final /* synthetic */ atm0 u() {
        return this.f10482a;
    }
}
