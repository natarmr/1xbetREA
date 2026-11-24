package a;

import android.util.Log;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class r60 implements a50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29912a;
    public final Object b;

    public r60(byte[] bArr, byte b) throws GeneralSecurityException {
        this.f29912a = b;
        switch (b) {
            case 2:
                this.b = new mfx(bArr, (byte) 0);
                return;
            case 3:
                this.b = new mfx(bArr, (byte) 1);
                return;
            default:
                if (brm0.b(2)) {
                    this.b = new jfx(bArr);
                    return;
                } else {
                    hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    throw null;
                }
        }
    }

    @Override // a.a50
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte b = this.f29912a;
        Object obj = this.b;
        switch (b) {
            case 0:
                byte[] bArrA = g1e0.a(12);
                jfx jfxVar = (jfx) obj;
                if (bArrA.length != 12) {
                    hny.o("iv is wrong size");
                    return null;
                }
                if (bArr.length > 2147483619) {
                    hny.o("plaintext too long");
                    return null;
                }
                byte[] bArr3 = new byte[bArr.length + 28];
                System.arraycopy(bArrA, 0, bArr3, 0, 12);
                AlgorithmParameterSpec algorithmParameterSpecA = jfx.a(bArrA);
                y50 y50Var = jfx.b;
                ((Cipher) y50Var.get()).init(1, jfxVar.f16451a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) y50Var.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) y50Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(ua80.e(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                try {
                    return d(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("r60", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return d(bArr, bArr2);
                }
            case 2:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = g1e0.a(12);
                byteBufferAllocate.put(bArrA2);
                ((mfx) obj).i(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = g1e0.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((mfx) obj).i(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // a.a50
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b = this.f29912a;
        Object obj = this.b;
        switch (b) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                jfx jfxVar = (jfx) obj;
                if (bArrCopyOf.length != 12) {
                    hny.o("iv is wrong size");
                    return null;
                }
                if (bArr.length < 28) {
                    hny.o("ciphertext too short");
                    return null;
                }
                if (!ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    hny.o("iv does not match prepended iv");
                    return null;
                }
                AlgorithmParameterSpec algorithmParameterSpecA = jfx.a(bArrCopyOf);
                y50 y50Var = jfx.b;
                ((Cipher) y50Var.get()).init(2, jfxVar.f16451a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) y50Var.get()).updateAAD(bArr2);
                }
                return ((Cipher) y50Var.get()).doFinal(bArr, 12, bArr.length - 12);
            case 1:
                if (bArr.length < 28) {
                    hny.o("ciphertext too short");
                    return null;
                }
                try {
                    return c(bArr, bArr2);
                } catch (ProviderException e) {
                    e = e;
                    Log.w("r60", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return c(bArr, bArr2);
                } catch (AEADBadTagException e2) {
                    throw e2;
                } catch (GeneralSecurityException e3) {
                    e = e3;
                    Log.w("r60", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    Thread.sleep((int) (Math.random() * 100.0d));
                    return c(bArr, bArr2);
                }
            case 2:
                if (bArr.length < 28) {
                    hny.o("ciphertext too short");
                    return null;
                }
                return ((mfx) obj).h(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    hny.o("ciphertext too short");
                    return null;
                }
                return ((mfx) obj).h(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            hny.o("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public r60(String str, KeyStore keyStore) throws InvalidKeyException {
        this.f29912a = (byte) 1;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }
}
