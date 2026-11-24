package a;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class acw0 implements xow0 {
    public static final byte[] e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9x0 f651a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public acw0(h8x0 h8x0Var) {
        p8x0 p8x0Var = h8x0Var.f12651a;
        this.f651a = new lvb0("HMAC".concat(String.valueOf(p8x0Var.d)), new SecretKeySpec(((icw0) h8x0Var.b.b).b(), "HMAC"), (byte) 1);
        this.b = p8x0Var.b;
        this.c = h8x0Var.c.b();
        if (p8x0Var.c.equals(arw0.j)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i = this.b;
        r9x0 r9x0Var = this.f651a;
        byte[] bArr3 = this.c;
        return length > 0 ? egm0.B(bArr3, r9x0Var.e(egm0.B(bArr, bArr2), i)) : egm0.B(bArr3, r9x0Var.e(bArr, i));
    }

    public acw0(v7x0 v7x0Var) {
        g8x0 g8x0Var = v7x0Var.f36952a;
        this.f651a = idm0.A(q9x0.u(o9x0.b(g8x0Var.f10885a), v7x0Var.b));
        this.b = g8x0Var.b;
        this.c = v7x0Var.c.b();
        if (g8x0Var.c.equals(hbb.r)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public acw0(lvb0 lvb0Var, int i) throws InvalidAlgorithmParameterException {
        this.f651a = lvb0Var;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        if (i >= 10) {
            lvb0Var.e(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
