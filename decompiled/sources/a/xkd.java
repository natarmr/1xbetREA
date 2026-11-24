package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xkd extends s88 {
    public final boolean e;

    public xkd(y78 y78Var, boolean z) {
        super((Object) y78Var, (byte) 5, false);
        this.e = z;
    }

    @Override // a.s88
    public final void n(byte b) {
        if (this.e) {
            o1t0 o1t0Var = p1t0.b;
            t(String.valueOf(b & 255));
        } else {
            o1t0 o1t0Var2 = p1t0.b;
            r(String.valueOf(b & 255));
        }
    }

    @Override // a.s88
    public final void p(int i) {
        if (this.e) {
            a2t0 a2t0Var = b2t0.b;
            t(Long.toString(((long) i) & 4294967295L, 10));
        } else {
            a2t0 a2t0Var2 = b2t0.b;
            r(Long.toString(((long) i) & 4294967295L, 10));
        }
    }

    @Override // a.s88
    public final void q(long j) {
        int i = 63;
        String str = "0";
        if (this.e) {
            g2t0 g2t0Var = h2t0.b;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            t(str);
            return;
        }
        g2t0 g2t0Var2 = h2t0.b;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        r(str);
    }

    @Override // a.s88
    public final void s(short s) {
        if (this.e) {
            p2t0 p2t0Var = q2t0.b;
            t(String.valueOf(s & 65535));
        } else {
            p2t0 p2t0Var2 = q2t0.b;
            r(String.valueOf(s & 65535));
        }
    }
}
