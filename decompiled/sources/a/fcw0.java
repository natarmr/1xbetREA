package a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class fcw0 implements tmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9331a;
    public final Object b;
    public final Object c;

    public fcw0(byte[] bArr, byte[] bArr2, byte b) {
        this.f9331a = b;
        switch (b) {
            case 4:
                this.c = new gxw0(bArr, (byte) 0);
                this.b = bArr2;
                break;
            default:
                this.c = new gxw0(bArr, (byte) 1);
                this.b = bArr2;
                break;
        }
    }

    public static fcw0 a(krw0 krw0Var) throws GeneralSecurityException {
        mrw0 mrw0Var = krw0Var.f18788a;
        if (mrw0Var.b != 12) {
            throw new GeneralSecurityException(twn.m(mrw0Var.b, "Expected IV Size 12, got "));
        }
        if (mrw0Var.c == 16) {
            return new fcw0(((icw0) krw0Var.b.b).b(), krw0Var.c);
        }
        throw new GeneralSecurityException(twn.m(mrw0Var.c, "Expected tag Size 16, got "));
    }

    @Override // a.tmw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b = this.f9331a;
        Object obj = this.c;
        Object obj2 = this.b;
        byte[] bArrB = null;
        switch (b) {
            case 0:
                byte[] bArr3 = (byte[]) obj2;
                if (bArr3.length == 0) {
                    return d(bArr, bArr2);
                }
                if (x7x0.b(bArr3, bArr)) {
                    return d(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                }
                hny.o("Decryption failed (OutputPrefix mismatch).");
                return null;
            case 1:
                tmw0 tmw0Var = (tmw0) obj;
                byte[] bArr4 = (byte[]) obj2;
                if (bArr4.length == 0) {
                    return tmw0Var.b(bArr, bArr2);
                }
                if (x7x0.b(bArr4, bArr)) {
                    return tmw0Var.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                hny.o("wrong prefix");
                return null;
            case 2:
                Iterator it = ((b7x0) obj2).a(bArr).iterator();
                while (it.hasNext()) {
                    try {
                        bArrB = ((sxw0) it.next()).f32999a.b(bArr, bArr2);
                        return bArrB;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                hny.o("decryption failed");
                return bArrB;
            case 3:
                byte[] bArr5 = (byte[]) obj2;
                if (bArr == null) {
                    hny.u("ciphertext is null");
                    return null;
                }
                if (bArr.length < bArr5.length + 28) {
                    hny.o("ciphertext too short");
                    return null;
                }
                if (!x7x0.b(bArr5, bArr)) {
                    hny.o("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                AlgorithmParameterSpec algorithmParameterSpecA = kvw0.a(bArr, bArr5.length, 12);
                Cipher cipherB = kvw0.b();
                cipherB.init(2, (SecretKeySpec) obj, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    cipherB.updateAAD(bArr2);
                }
                return cipherB.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
            default:
                byte[] bArr6 = (byte[]) obj2;
                if (bArr6.length == 0) {
                    return e(bArr, bArr2);
                }
                if (x7x0.b(bArr6, bArr)) {
                    return e(Arrays.copyOfRange(bArr, bArr6.length, bArr.length), bArr2);
                }
                hny.o("Decryption failed (OutputPrefix mismatch).");
                return null;
        }
    }

    @Override // a.tmw0
    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b = this.f9331a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA = s7x0.a(24);
                byteBufferAllocate.put(bArrA);
                ((gxw0) obj2).N(byteBufferAllocate, bArrA, bArr, bArr2);
                byte[] bArrArray = byteBufferAllocate.array();
                byte[] bArr3 = (byte[]) obj;
                return bArr3.length == 0 ? bArrArray : egm0.B(bArr3, bArrArray);
            case 1:
                byte[] bArr4 = (byte[]) obj;
                tmw0 tmw0Var = (tmw0) obj2;
                return bArr4.length == 0 ? tmw0Var.c(bArr, bArr2) : egm0.B(bArr4, tmw0Var.c(bArr, bArr2));
            case 2:
                byte[] bArrC = ((sxw0) obj2).f32999a.c(bArr, bArr2);
                int length = bArr.length;
                return bArrC;
            case 3:
                byte[] bArr5 = (byte[]) obj;
                if (bArr == null) {
                    hny.u("plaintext is null");
                    return null;
                }
                byte[] bArrA2 = s7x0.a(12);
                AlgorithmParameterSpec algorithmParameterSpecA = kvw0.a(bArrA2, 0, bArrA2.length);
                Cipher cipherB = kvw0.b();
                cipherB.init(1, (SecretKeySpec) obj2, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    cipherB.updateAAD(bArr2);
                }
                int outputSize = cipherB.getOutputSize(bArr.length);
                if (outputSize > 2147483635 - bArr5.length) {
                    hny.o("plaintext too long");
                    return null;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 12 + outputSize);
                System.arraycopy(bArrA2, 0, bArrCopyOf, bArr5.length, 12);
                if (cipherB.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr5.length + 12) == outputSize) {
                    return bArrCopyOf;
                }
                hny.o("not enough data written");
                return null;
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA3 = s7x0.a(12);
                byteBufferAllocate2.put(bArrA3);
                ((gxw0) obj2).N(byteBufferAllocate2, bArrA3, bArr, bArr2);
                byte[] bArrArray2 = byteBufferAllocate2.array();
                byte[] bArr6 = (byte[]) obj;
                return bArr6.length == 0 ? bArrArray2 : egm0.B(bArr6, bArrArray2);
        }
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            hny.o("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return ((gxw0) this.c).O(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    public byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            hny.o("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return ((gxw0) this.c).O(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    public fcw0(sxw0 sxw0Var, b7x0 b7x0Var) {
        this.f9331a = (byte) 2;
        this.c = sxw0Var;
        this.b = b7x0Var;
    }

    public fcw0(tmw0 tmw0Var, byte[] bArr) {
        this.f9331a = (byte) 1;
        this.c = tmw0Var;
        if (bArr.length != 0 && bArr.length != 5) {
            jf4.o("identifier has an invalid length");
            throw null;
        }
        this.b = bArr;
    }

    public fcw0(byte[] bArr, icw0 icw0Var) throws GeneralSecurityException {
        this.f9331a = (byte) 3;
        if (esw0.b(2)) {
            this.c = kvw0.c(bArr);
            this.b = icw0Var.b();
        } else {
            hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }
}
