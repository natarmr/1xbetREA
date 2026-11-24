package a;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class df60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef60 f5984a = new ef60();
    public final fq80 b = new fq80(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            ef60 ef60Var = this.f5984a;
            if (i5 >= ef60Var.c) {
                break;
            }
            int[] iArr = ef60Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(guo guoVar) {
        int i;
        x0x.K(guoVar != null);
        boolean z = this.e;
        fq80 fq80Var = this.b;
        if (z) {
            this.e = false;
            fq80Var.J(0);
        }
        while (!this.e) {
            int i2 = this.c;
            ef60 ef60Var = this.f5984a;
            if (i2 < 0) {
                if (ef60Var.b(guoVar, -1L) && ef60Var.a(guoVar, true)) {
                    int iA = ef60Var.d;
                    if ((ef60Var.f7707a & 1) == 1 && fq80Var.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        guoVar.m(iA);
                        this.c = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(i2);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                fq80Var.c(fq80Var.c + iA2);
                try {
                    guoVar.readFully(fq80Var.f9961a, fq80Var.c, iA2);
                    fq80Var.L(fq80Var.c + iA2);
                    this.e = ef60Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == ef60Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
