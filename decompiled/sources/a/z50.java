package a;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class z50 {
    public static final y50 d = new y50((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f43796a;
    public final int b;
    public final int c;

    public z50(byte[] bArr, int i) throws GeneralSecurityException {
        if (!brm0.b(2)) {
            hny.o("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        twt0.a(bArr.length);
        this.f43796a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            hny.o("invalid IV size");
            throw null;
        }
        this.b = i;
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f43796a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        hny.o("stored output's length does not match input's length");
    }
}
