package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends j47 {
    public final /* synthetic */ byte u = 1;
    public final /* synthetic */ ldy v;
    public final /* synthetic */ String w;
    public final Object x;

    public u2(ldy ldyVar, String str) {
        this.v = ldyVar;
        this.w = str;
        this.x = ldyVar.b.b;
    }

    @Override // a.j47, a.bwn
    public void B(int i) {
        switch (this.u) {
            case 1:
                a2t0 a2t0Var = b2t0.b;
                J0(Long.toString(((long) i) & 4294967295L, 10));
                break;
            default:
                super.B(i);
                break;
        }
    }

    @Override // a.j47, a.bwn
    public void E(String str) {
        switch (this.u) {
            case 0:
                str.getClass();
                this.v.M(new xcy(str, false, (ugi0) this.x), this.w);
                break;
            default:
                super.E(str);
                break;
        }
    }

    public void J0(String str) {
        str.getClass();
        this.v.M(new xcy(str, false, null), this.w);
    }

    @Override // a.bwn
    public final qaj b() {
        switch (this.u) {
            case 0:
                return this.v.b.b;
            default:
                return (qaj) this.x;
        }
    }

    @Override // a.j47, a.bwn
    public void h(byte b) {
        switch (this.u) {
            case 1:
                o1t0 o1t0Var = p1t0.b;
                J0(String.valueOf(b & 255));
                break;
            default:
                super.h(b);
                break;
        }
    }

    @Override // a.j47, a.bwn
    public void l(long j) {
        String str;
        switch (this.u) {
            case 1:
                g2t0 g2t0Var = h2t0.b;
                if (j == 0) {
                    str = "0";
                } else if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
                J0(str);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // a.j47, a.bwn
    public void r(short s) {
        switch (this.u) {
            case 1:
                p2t0 p2t0Var = q2t0.b;
                J0(String.valueOf(s & 65535));
                break;
            default:
                super.r(s);
                break;
        }
    }

    public u2(ldy ldyVar, String str, ugi0 ugi0Var) {
        this.v = ldyVar;
        this.w = str;
        this.x = ugi0Var;
    }
}
