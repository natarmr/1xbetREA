package a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class lvb0 implements jvb0, r9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20707a;
    public final SecretKeySpec b;
    public final byte c;
    public final ThreadLocal d;

    public lvb0(String str, SecretKeySpec secretKeySpec, byte b) throws GeneralSecurityException {
        switch (b) {
            case 1:
                kvb0 kvb0Var = new kvb0(this, (byte) 2);
                this.d = kvb0Var;
                if (!esw0.b(2)) {
                    hny.o("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                    throw null;
                }
                this.f20707a = str;
                this.b = secretKeySpec;
                if (secretKeySpec.getEncoded().length < 16) {
                    throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
                }
                switch (str) {
                    case "HMACSHA1":
                        this.c = (byte) 20;
                        break;
                    case "HMACSHA224":
                        this.c = (byte) 28;
                        break;
                    case "HMACSHA256":
                        this.c = (byte) 32;
                        break;
                    case "HMACSHA384":
                        this.c = (byte) 48;
                        break;
                    case "HMACSHA512":
                        this.c = (byte) 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                kvb0Var.get();
                return;
            default:
                kvb0 kvb0Var2 = new kvb0(this, (byte) 0);
                this.d = kvb0Var2;
                if (!brm0.b(2)) {
                    hny.o("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                    throw null;
                }
                this.f20707a = str;
                this.b = secretKeySpec;
                if (secretKeySpec.getEncoded().length < 16) {
                    throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
                }
                switch (str) {
                    case "HMACSHA1":
                        this.c = (byte) 20;
                        break;
                    case "HMACSHA224":
                        this.c = (byte) 28;
                        break;
                    case "HMACSHA256":
                        this.c = (byte) 32;
                        break;
                    case "HMACSHA384":
                        this.c = (byte) 48;
                        break;
                    case "HMACSHA512":
                        this.c = (byte) 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                kvb0Var2.get();
                return;
        }
    }

    @Override // a.r9x0
    public byte[] e(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        kvb0 kvb0Var = (kvb0) this.d;
        if (i > this.c) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) kvb0Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) kvb0Var.get()).doFinal(), i);
    }

    @Override // a.jvb0
    public byte[] f(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        kvb0 kvb0Var = (kvb0) this.d;
        if (i > this.c) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) kvb0Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) kvb0Var.get()).doFinal(), i);
    }
}
