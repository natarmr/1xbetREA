package a;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class f6 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f8985a = new g6("audio/ac3");
    public final fq80 b = new fq80(2786);
    public boolean c;

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        fq80 fq80Var = this.b;
        int i = guoVar.read(fq80Var.f9961a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        fq80Var.M(0);
        fq80Var.L(i);
        boolean z = this.c;
        g6 g6Var = this.f8985a;
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
        this.f8985a.c();
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        guj gujVar;
        int iP;
        fq80 fq80Var = new fq80(10);
        int i = 0;
        while (true) {
            gujVar = (guj) guoVar;
            gujVar.b(fq80Var.f9961a, 0, 10, false);
            fq80Var.M(0);
            if (fq80Var.C() != 4801587) {
                break;
            }
            fq80Var.N(3);
            int iY = fq80Var.y();
            i += iY + 10;
            gujVar.f(iY, false);
        }
        gujVar.f = 0;
        gujVar.f(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            gujVar.b(fq80Var.f9961a, 0, 6, false);
            fq80Var.M(0);
            if (fq80Var.G() != 2935) {
                gujVar.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                gujVar.f(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = fq80Var.f9961a;
                if (bArr.length < 6) {
                    iP = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iP = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iP = ay3.P((b & 192) >> 6, b & 63);
                }
                if (iP == -1) {
                    break;
                }
                gujVar.f(iP - 6, false);
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f8985a.e(huoVar, new zrs0(0, 1));
        huoVar.o();
        huoVar.f(new ca5(-9223372036854775807L));
    }

    @Override // a.fuo
    public final void release() {
    }
}
