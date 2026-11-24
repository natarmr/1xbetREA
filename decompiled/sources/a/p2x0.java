package a;

import android.crypto.hpke.Hpke;
import android.crypto.hpke.Message;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class p2x0 implements dnw0 {
    public static final byte[] g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fck0 f26272a;
    public final r2x0 b;
    public final h70 c;
    public final k2x0 d;
    public final int e;
    public final byte[] f;

    public p2x0(fck0 fck0Var, r2x0 r2x0Var, h70 h70Var, k2x0 k2x0Var, int i, icw0 icw0Var) {
        this.f26272a = fck0Var;
        this.b = r2x0Var;
        this.c = h70Var;
        this.d = k2x0Var;
        this.e = i;
        this.f = icw0Var.b();
    }

    public static dnw0 a(g0x0 g0x0Var) throws GeneralSecurityException {
        int i;
        String str;
        q0x0 q0x0Var = g0x0Var.f10482a;
        icw0 icw0Var = (icw0) g0x0Var.b.b;
        e0x0 e0x0Var = q0x0Var.f27924a;
        e0x0 e0x0Var2 = q0x0Var.f27924a;
        d0x0 d0x0Var = e0x0Var2.f7012a;
        d0x0 d0x0Var2 = d0x0.g;
        if (d0x0Var != d0x0Var2) {
            r2x0 r2x0VarL = w7n0.L(d0x0Var);
            h70 h70VarJ = w7n0.J(e0x0Var2.b);
            k2x0 k2x0VarK = w7n0.K(e0x0Var2.c);
            d0x0 d0x0Var3 = d0x0.f;
            boolean zEquals = d0x0Var.equals(d0x0Var3);
            d0x0 d0x0Var4 = d0x0.e;
            d0x0 d0x0Var5 = d0x0.d;
            d0x0 d0x0Var6 = d0x0.c;
            if (zEquals) {
                i = 32;
            } else if (d0x0Var == d0x0Var6) {
                i = 65;
            } else if (d0x0Var == d0x0Var5) {
                i = 97;
            } else {
                if (d0x0Var != d0x0Var4) {
                    hny.o("Unrecognized or not NIST HPKE KEM identifier");
                    return null;
                }
                i = 133;
            }
            d0x0 d0x0Var7 = e0x0Var.f7012a;
            if (d0x0Var7.equals(d0x0Var3) || d0x0Var7 == d0x0Var6 || d0x0Var7 == d0x0Var5 || d0x0Var7 == d0x0Var4) {
                return new p2x0(new fck0(icw0.a(icw0Var.b()), q0x0Var.b, (byte) 26), r2x0VarL, h70VarJ, k2x0VarK, i, ((m1x0) g0x0Var.u()).u());
            }
            hny.o("Unrecognized or not NIST HPKE KEM identifier");
            return null;
        }
        byte[] bArr = v3x0.e;
        if (!x3x0.b()) {
            hny.o("Can't use X-Wing, as we might be in FIPS mode, Conscrypt is not available, or platform does not support X-Wing.");
            return null;
        }
        Provider providerA0 = hew0.a0();
        if (providerA0 == null) {
            hny.o("Can't use X-Wing as Conscrypt is not available");
            return null;
        }
        d0x0 d0x0Var8 = e0x0Var.f7012a;
        b0x0 b0x0Var = e0x0Var.c;
        c0x0 c0x0Var = e0x0Var.b;
        if (d0x0Var8 != d0x0Var2) {
            throw new GeneralSecurityException("Currently unsupported KEM: ".concat(String.valueOf(d0x0Var8)));
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
        v3x0 v3x0Var = new v3x0(KeyFactory.getInstance("XWING", providerA0).generatePrivate(new z3x0(icw0Var.b(), (byte) 0)), str, c3x0.a(d0x0Var8), ((m1x0) g0x0Var.u()).u().b());
        x3x0 x3x0VarA = x3x0.a(q0x0Var);
        byte[] bArr2 = v3x0.f;
        byte[] bArr3 = v3x0.g;
        PublicKey publicKey = x3x0VarA.f40241a;
        String str2 = x3x0VarA.b;
        int i2 = x3x0VarA.c;
        byte[] bArr4 = x3x0VarA.d;
        Message messageSeal = Hpke.getInstance(str2).seal(publicKey, bArr3, bArr2, x3x0.e);
        byte[] encapsulated = messageSeal.getEncapsulated();
        if (encapsulated.length != i2) {
            jf4.n("Encapsulated key has wrong length");
            return null;
        }
        if (Arrays.equals(v3x0Var.b(egm0.B(bArr4, encapsulated, messageSeal.getCiphertext()), bArr3), bArr2)) {
            return v3x0Var;
        }
        hny.o("Public key and private key do not match, cannot create HybridDecrypt instance");
        return null;
    }

    @Override // a.dnw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        byte[] bArrA;
        byte[] bArr4 = this.f;
        int length = bArr4.length + this.e;
        if (bArr.length < length) {
            hny.o("Ciphertext is too short.");
            return null;
        }
        if (!x7x0.b(bArr4, bArr)) {
            hny.o("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        byte b = 0;
        byte[] bArr5 = new byte[0];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, length);
        fck0 fck0Var = this.f26272a;
        r2x0 r2x0Var = this.b;
        h70 h70Var = this.c;
        k2x0 k2x0Var = this.d;
        byte[] bArrJ = r2x0Var.j(bArrCopyOfRange, fck0Var);
        byte[] bArr6 = c3x0.f3700a;
        byte[] bArrZza = r2x0Var.zza();
        String str = h70Var.b;
        switch (str.hashCode()) {
            case 984523022:
                if (!str.equals("HmacSha256")) {
                    b = -1;
                }
                break;
            case 984524074:
                b = !str.equals("HmacSha384") ? (byte) -1 : (byte) 1;
                break;
            case 984525777:
                b = !str.equals("HmacSha512") ? (byte) -1 : (byte) 2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                bArr3 = c3x0.f;
                break;
            case 1:
                bArr3 = c3x0.g;
                break;
            case 2:
                bArr3 = c3x0.h;
                break;
            default:
                hny.o("Could not determine HPKE KDF ID");
                return null;
        }
        byte[] bArrB = egm0.B(c3x0.n, bArrZza, bArr3, k2x0Var.zzc());
        byte[] bArr7 = c3x0.l;
        byte[] bArr8 = phf0.d;
        byte[] bArr9 = c3x0.o;
        Charset charset = x7x0.f40437a;
        byte[] bArrB2 = egm0.B(bArr6, h70Var.b(egm0.B(bArr9, bArrB, "psk_id_hash".getBytes(charset), bArr8), bArr7), h70Var.b(egm0.B(bArr9, bArrB, "info_hash".getBytes(charset), bArr5), bArr7));
        byte[] bArrB3 = h70Var.b(egm0.B(bArr9, bArrB, "secret".getBytes(charset), bArr8), bArrJ);
        int iZza = k2x0Var.zza();
        byte[] bArrA2 = h70Var.a(iZza, bArrB3, egm0.B(c3x0.b(2, iZza), bArr9, bArrB, "key".getBytes(charset), bArrB2));
        byte[] bArrA3 = h70Var.a(12, bArrB3, egm0.B(c3x0.b(2, 12), bArr9, bArrB, "base_nonce".getBytes(charset), bArrB2));
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger.shiftLeft(96).subtract(bigInteger);
        phf0 phf0Var = new phf0();
        phf0Var.c = BigInteger.ZERO;
        phf0Var.b = bigIntegerSubtract;
        phf0Var.f26994a = k2x0Var;
        byte[] bArr10 = g;
        synchronized (phf0Var) {
            bArrA = egm0.A(bArrA3, ibm0.G((BigInteger) phf0Var.c, 12));
            if (((BigInteger) phf0Var.c).compareTo((BigInteger) phf0Var.b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            phf0Var.c = ((BigInteger) phf0Var.c).add(bigInteger);
        }
        return ((k2x0) phf0Var.f26994a).b(bArrA2, bArrA, bArr, length, bArr10);
    }
}
