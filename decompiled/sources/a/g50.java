package a;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class g50 implements jbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbj f10693a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public g50(jbj jbjVar, byte[] bArr, byte[] bArr2) {
        this.f10693a = jbjVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // a.jbj
    public final void c(rsj rsjVar) {
        rsjVar.getClass();
        this.f10693a.c(rsjVar);
    }

    @Override // a.jbj
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f10693a.close();
        }
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                lbj lbjVar = new lbj(this.f10693a, mbjVar);
                this.d = new CipherInputStream(lbjVar, cipher);
                if (lbjVar.d) {
                    return -1L;
                }
                lbjVar.f19757a.d(lbjVar.b);
                lbjVar.d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                ohq.p(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            ohq.p(e2);
            return 0L;
        }
    }

    @Override // a.jbj
    public final Map e() {
        return this.f10693a.e();
    }

    @Override // a.jbj
    public final Uri getUri() {
        return this.f10693a.getUri();
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
