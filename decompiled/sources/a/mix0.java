package a;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mix0 extends qbw0 {
    public final wgm0 b;
    public final wgm0 c;
    public final int[] d;
    public final int e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public mix0(wgm0 wgm0Var, wgm0 wgm0Var2) {
        this.b = wgm0Var;
        this.c = wgm0Var2;
        int iY = wgm0Var2.y();
        if (!(iY <= 28)) {
            jf4.o("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iY];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iY) {
            vgx0 vgx0VarD = d(i);
            long j2 = vgx0VarD.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (vgx0VarD.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = vgx0VarD.c ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // a.qbw0
    public final void a(cmt0 cmt0Var, whx0 whx0Var) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            vgx0 vgx0VarD = d(i2 & 31);
            if (vgx0VarD.c) {
                cmt0Var.g(vgx0VarD, new kix0(this, vgx0VarD, i2), whx0Var);
            } else {
                wgm0 wgm0Var = this.b;
                int iY = wgm0Var.y();
                if (i2 >= iY) {
                    wgm0Var = this.c;
                    i2 -= iY;
                }
                cmt0Var.f(vgx0VarD, vgx0VarD.b.cast(wgm0Var.B(i2)), whx0Var);
            }
        }
    }

    @Override // a.qbw0
    public final int b() {
        return this.e;
    }

    @Override // a.qbw0
    public final Set c() {
        return new ax3(this, (byte) 5);
    }

    public final vgx0 d(int i) {
        wgm0 wgm0Var = this.b;
        int iY = wgm0Var.y();
        return i >= iY ? this.c.A(i - iY) : wgm0Var.A(i);
    }
}
