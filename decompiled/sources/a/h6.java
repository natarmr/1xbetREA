package a;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class h6 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f12505a = new g6((byte) 1, 0, null, "audio/ac4");
    public final fq80 b = new fq80(16384);
    public boolean c;

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        fq80 fq80Var = this.b;
        int i = guoVar.read(fq80Var.f9961a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        fq80Var.M(0);
        fq80Var.L(i);
        boolean z = this.c;
        g6 g6Var = this.f12505a;
        if (!z) {
            g6Var.o = 0L;
            this.c = true;
        }
        g6Var.a(fq80Var);
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.c = false;
        this.f12505a.c();
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        guj gujVar;
        int i;
        fq80 fq80Var = new fq80(10);
        int i2 = 0;
        while (true) {
            gujVar = (guj) guoVar;
            gujVar.b(fq80Var.f9961a, 0, 10, false);
            fq80Var.M(0);
            if (fq80Var.C() != 4801587) {
                break;
            }
            fq80Var.N(3);
            int iY = fq80Var.y();
            i2 += iY + 10;
            gujVar.f(iY, false);
        }
        gujVar.f = 0;
        gujVar.f(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            gujVar.b(fq80Var.f9961a, 0, 7, false);
            fq80Var.M(0);
            int iG = fq80Var.G();
            if (iG == 44096 || iG == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = fq80Var.f9961a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iG == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                gujVar.f(i - 7, false);
            } else {
                gujVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                gujVar.f(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f12505a.e(huoVar, new zrs0(0, 1));
        huoVar.o();
        huoVar.f(new ca5(-9223372036854775807L));
    }

    @Override // a.fuo
    public final void release() {
    }
}
