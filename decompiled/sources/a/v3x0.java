package a;

import android.crypto.hpke.Hpke;
import android.crypto.hpke.Message;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v3x0 implements dnw0 {
    public static final byte[] e = new byte[0];
    public static final byte[] f;
    public static final byte[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrivateKey f36752a;
    public final String b;
    public final int c;
    public final byte[] d;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f = "Workload".getBytes(charset);
        g = "ContextInfo".getBytes(charset);
    }

    public v3x0(PrivateKey privateKey, String str, int i, byte[] bArr) {
        this.f36752a = privateKey;
        this.b = str;
        this.c = i;
        this.d = bArr;
    }

    @Override // a.dnw0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        int length = bArr3.length + this.c;
        if (bArr.length < length) {
            hny.o("Ciphertext is too short");
            return null;
        }
        if (!x7x0.b(bArr3, bArr)) {
            hny.o("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, length);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length, bArr.length);
        return Hpke.getInstance(this.b).open(this.f36752a, bArr2, new Message(bArrCopyOfRange, bArrCopyOfRange2), e);
    }
}
