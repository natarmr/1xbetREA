package a;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class wv00 implements k2x0 {
    public static final Object b = new Object();
    public static volatile wv00 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f39816a;

    /* JADX WARN: Multi-variable type inference failed */
    public wv00(int i, byte b2) throws InvalidAlgorithmParameterException {
        switch (b2) {
            case 2:
                if (i != 16 && i != 32) {
                    throw new InvalidAlgorithmParameterException(twn.m(i, "Unsupported key length: "));
                }
                this.f39816a = i;
                return;
            default:
                this.f39816a = i;
                return;
        }
    }

    public static wv00 f() {
        wv00 wv00Var;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new wv00(3, (byte) 0);
                }
                wv00Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wv00Var;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2) {
        if (this.f39816a <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // a.k2x0
    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.f39816a) {
            throw new InvalidAlgorithmParameterException(twn.m(bArr.length, "Unexpected key length: "));
        }
        if (!esw0.b(2)) {
            hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecC = kvw0.c(bArr);
        if (bArr2.length != 12) {
            hny.o("iv is wrong size");
            return null;
        }
        if (bArr3.length < i + 16) {
            hny.o("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = kvw0.a(bArr2, 0, bArr2.length);
        Cipher cipherB = kvw0.b();
        cipherB.init(2, secretKeySpecC, algorithmParameterSpecA);
        if (bArr4.length != 0) {
            cipherB.updateAAD(bArr4);
        }
        return cipherB.doFinal(bArr3, i, bArr3.length - i);
    }

    public void c(String str, String str2, Throwable th) {
        if (this.f39816a <= 3) {
            Log.d(str, str2, th);
        }
    }

    public void d(String str, String str2) {
        if (this.f39816a <= 6) {
            Log.e(str, str2);
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (this.f39816a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public void g(String str, String str2) {
        if (this.f39816a <= 4) {
            Log.i(str, str2);
        }
    }

    public void i(Exception exc, String str, String str2) {
        if (this.f39816a <= 5) {
            Log.w(str, str2, exc);
        }
    }

    public void j(String str, String str2) {
        if (this.f39816a <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // a.k2x0
    public int zza() {
        return this.f39816a;
    }

    @Override // a.k2x0
    public byte[] zzc() throws GeneralSecurityException {
        byte b2 = this.f39816a;
        if (b2 == 16) {
            return c3x0.i;
        }
        if (b2 == 32) {
            return c3x0.j;
        }
        hny.o("Could not determine HPKE AEAD ID");
        return null;
    }
}
