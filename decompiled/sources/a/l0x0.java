package a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f19223a = new y6x0(e0x0.class, new epw0((byte) 25));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.HpkePrivateKey", new tow0((byte) 26));
    public static final j5x0 c = new j5x0(q0x0.class, new qow0((byte) 26));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.HpkePublicKey", new zow0((byte) 26));
    public static final j5x0 e = new j5x0(g0x0.class, new vow0((byte) 26));
    public static final e5x0 f = new e5x0("type.googleapis.com/google.crypto.tink.HpkePrivateKey", new cpw0((byte) 26));
    public static final okt0 g;
    public static final okt0 h;
    public static final okt0 i;

    static {
        fck0 fck0VarL = okt0.l();
        fck0VarL.A(cex0.DHKEM_P256_HKDF_SHA256, d0x0.c);
        fck0VarL.A(cex0.DHKEM_P384_HKDF_SHA384, d0x0.d);
        fck0VarL.A(cex0.DHKEM_P521_HKDF_SHA512, d0x0.e);
        fck0VarL.A(cex0.DHKEM_X25519_HKDF_SHA256, d0x0.f);
        fck0VarL.A(cex0.X_WING, d0x0.g);
        g = fck0VarL.p();
        fck0 fck0VarL2 = okt0.l();
        fck0VarL2.A(dex0.HKDF_SHA256, c0x0.c);
        fck0VarL2.A(dex0.HKDF_SHA384, c0x0.d);
        fck0VarL2.A(dex0.HKDF_SHA512, c0x0.e);
        h = fck0VarL2.p();
        fck0 fck0VarL3 = okt0.l();
        fck0VarL3.A(aex0.AES_128_GCM, b0x0.c);
        fck0VarL3.A(aex0.AES_256_GCM, b0x0.d);
        fck0VarL3.A(aex0.CHACHA20_POLY1305, b0x0.e);
        i = fck0VarL3.p();
    }

    public static icw0 a(d0x0 d0x0Var, byte[] bArr) throws GeneralSecurityException {
        int i2;
        BigInteger bigIntegerE = ibm0.E(bArr);
        byte[] bArr2 = c3x0.f3700a;
        if (d0x0Var == d0x0.f) {
            i2 = 32;
        } else if (d0x0Var == d0x0.c) {
            i2 = 65;
        } else if (d0x0Var == d0x0.d) {
            i2 = 97;
        } else if (d0x0Var == d0x0.e) {
            i2 = 133;
        } else {
            if (d0x0Var != d0x0.g) {
                hny.o("Unrecognized HPKE KEM identifier");
                return null;
            }
            i2 = 1216;
        }
        return icw0.a(ibm0.G(bigIntegerE, i2));
    }

    public static lpw0 b(m60 m60Var) {
        if (m60Var.equals(m60.m)) {
            return lpw0.e;
        }
        if (m60Var == m60.k) {
            return lpw0.c;
        }
        if (m60Var == m60.l) {
            return lpw0.f;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(m60Var)));
    }

    public static e0x0 c(lpw0 lpw0Var, jex0 jex0Var) {
        m60 m60Var;
        h0q0 h0q0VarB = e0x0.b();
        if (lpw0Var.equals(lpw0.e)) {
            m60Var = m60.m;
        } else if (lpw0Var == lpw0.c) {
            m60Var = m60.k;
        } else {
            if (lpw0Var != lpw0.f && lpw0Var != lpw0.d) {
                throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(lpw0Var)));
            }
            m60Var = m60.l;
        }
        h0q0VarB.d = m60Var;
        h0q0VarB.f12247a = (d0x0) g.o(jex0Var.y());
        h0q0VarB.b = (c0x0) h.o(jex0Var.x());
        h0q0VarB.c = (b0x0) i.o(jex0Var.t());
        return h0q0VarB.E();
    }

    public static tex0 d(q0x0 q0x0Var) {
        sex0 sex0VarA = tex0.A();
        sex0VarA.d();
        ((tex0) sex0VarA.b).zzf = 0;
        jex0 jex0VarE = e(q0x0Var.f27924a);
        sex0VarA.d();
        tex0.y((tex0) sex0VarA.b, jex0VarE);
        byte[] bArrB = q0x0Var.b.b();
        vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
        sex0VarA.d();
        tex0.x((tex0) sex0VarA.b, vjw0VarH);
        return (tex0) sex0VarA.c();
    }

    public static jex0 e(e0x0 e0x0Var) {
        iex0 iex0VarZ = jex0.z();
        cex0 cex0Var = (cex0) g.n(e0x0Var.f7012a);
        iex0VarZ.d();
        ((jex0) iex0VarZ.b).zze = cex0Var.zza();
        dex0 dex0Var = (dex0) h.n(e0x0Var.b);
        iex0VarZ.d();
        ((jex0) iex0VarZ.b).zzf = dex0Var.zza();
        aex0 aex0Var = (aex0) i.n(e0x0Var.c);
        iex0VarZ.d();
        ((jex0) iex0VarZ.b).zzg = aex0Var.zza();
        return (jex0) iex0VarZ.c();
    }
}
