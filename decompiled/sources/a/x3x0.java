package a;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes2.dex */
public final class x3x0 implements cnw0 {
    public static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKey f40241a;
    public final String b;
    public final int c;
    public final byte[] d;

    public x3x0(PublicKey publicKey, String str, int i, byte[] bArr) {
        this.f40241a = publicKey;
        this.b = str;
        this.c = i;
        this.d = bArr;
    }

    public static x3x0 a(q0x0 q0x0Var) {
        String str;
        if (!b()) {
            hny.o("Can't use X-Wing, as we might be in FIPS mode, Conscrypt is not available, or platform does not support X-Wing.");
            return null;
        }
        Provider providerA0 = hew0.a0();
        if (providerA0 == null) {
            hny.o("Can't use X-Wing as Conscrypt is not available");
            return null;
        }
        e0x0 e0x0Var = q0x0Var.f27924a;
        d0x0 d0x0Var = e0x0Var.f7012a;
        b0x0 b0x0Var = e0x0Var.c;
        c0x0 c0x0Var = e0x0Var.b;
        if (d0x0Var != d0x0.g) {
            throw new GeneralSecurityException("Currently unsupported KEM: ".concat(String.valueOf(d0x0Var)));
        }
        if (c0x0Var != c0x0.c) {
            throw new GeneralSecurityException("Currently unsupported KDF: ".concat(String.valueOf(c0x0Var)));
        }
        if (b0x0Var == b0x0.c) {
            str = "XWING/HKDF_SHA256/AES_128_GCM";
        } else if (b0x0Var == b0x0.d) {
            str = "XWING/HKDF_SHA256/AES_256_GCM";
        } else {
            if (b0x0Var != b0x0.e) {
                throw new GeneralSecurityException("Unknown AEAD ID: ".concat(String.valueOf(b0x0Var)));
            }
            str = "XWING/HKDF_SHA256/CHACHA20POLY1305";
        }
        return new x3x0(KeyFactory.getInstance("XWING", providerA0).generatePublic(new z3x0(q0x0Var.b.b(), (byte) 1)), str, c3x0.a(d0x0Var), q0x0Var.c.b());
    }

    public static boolean b() {
        Provider providerA0;
        if (!esw0.d(1) || x7x0.c() == null || x7x0.c().intValue() < 37 || (providerA0 = hew0.a0()) == null) {
            return false;
        }
        try {
            KeyFactory.getInstance("XWING", providerA0);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
