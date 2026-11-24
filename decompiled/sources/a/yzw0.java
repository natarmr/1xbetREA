package a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class yzw0 extends i1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0x0 f43537a;
    public final zas0 b;
    public final rkt0 c;

    public yzw0(f0x0 f0x0Var, zas0 zas0Var, rkt0 rkt0Var) {
        this.f43537a = f0x0Var;
        this.b = zas0Var;
        this.c = rkt0Var;
    }

    public static yzw0 v(f0x0 f0x0Var, zas0 zas0Var) throws GeneralSecurityException {
        ECPoint eCPoint = f0x0Var.b;
        if (eCPoint == null) {
            hny.o("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            return null;
        }
        BigInteger bigInteger = (BigInteger) zas0Var.b;
        vzw0 vzw0Var = f0x0Var.f8737a.f41775a;
        BigInteger order = x(vzw0Var).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            hny.o("Invalid private value");
            return null;
        }
        if (m4x0.f(bigInteger, x(vzw0Var)).equals(eCPoint)) {
            return new yzw0(f0x0Var, zas0Var, null);
        }
        hny.o("Invalid private value");
        return null;
    }

    public static yzw0 w(f0x0 f0x0Var, rkt0 rkt0Var) throws GeneralSecurityException {
        icw0 icw0Var = f0x0Var.c;
        if (icw0Var == null) {
            hny.o("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
            return null;
        }
        byte[] bArrB = ((icw0) rkt0Var.b).b();
        byte[] bArrB2 = icw0Var.b();
        if (bArrB.length != 32) {
            hny.o("Private key bytes length for X25519 curve must be 32");
            return null;
        }
        if (Arrays.equals(dem0.x(bArrB), bArrB2)) {
            return new yzw0(f0x0Var, null, rkt0Var);
        }
        hny.o("Invalid private key for public key.");
        return null;
    }

    public static ECParameterSpec x(vzw0 vzw0Var) {
        if (vzw0Var == vzw0.b) {
            return m4x0.f21196a;
        }
        if (vzw0Var == vzw0.c) {
            return m4x0.b;
        }
        if (vzw0Var == vzw0.d) {
            return m4x0.c;
        }
        jf4.o("Unable to determine NIST curve type for ".concat(String.valueOf(vzw0Var)));
        return null;
    }

    @Override // a.atm0
    public final /* synthetic */ fpw0 s() {
        return this.f43537a.f8737a;
    }

    @Override // a.i1x0
    public final /* synthetic */ atm0 u() {
        return this.f43537a;
    }
}
