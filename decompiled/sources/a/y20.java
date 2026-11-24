package a;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class y20 implements fuo {
    public final fq80 c;
    public final q8b d;
    public huo e;
    public long f;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z20 f41884a = new z20(0, null, "audio/mp4a-latm", true);
    public final fq80 b = new fq80(2048);
    public long g = -1;

    public y20(int i) {
        fq80 fq80Var = new fq80(10);
        this.c = fq80Var;
        byte[] bArr = fq80Var.f9961a;
        this.d = new q8b(bArr, bArr.length);
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        this.e.getClass();
        guoVar.getLength();
        fq80 fq80Var = this.b;
        int i = guoVar.read(fq80Var.f9961a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.f(new ca5(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        fq80Var.M(0);
        fq80Var.L(i);
        boolean z2 = this.h;
        z20 z20Var = this.f41884a;
        if (!z2) {
            z20Var.u = this.f;
            this.h = true;
        }
        z20Var.a(fq80Var);
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.h = false;
        this.f41884a.c();
        this.f = j2;
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        fq80 fq80Var;
        int i = 0;
        while (true) {
            fq80Var = this.c;
            guoVar.n(fq80Var.f9961a, 0, 10);
            fq80Var.M(0);
            if (fq80Var.C() != 4801587) {
                break;
            }
            fq80Var.N(3);
            int iY = fq80Var.y();
            i += iY + 10;
            guoVar.j(iY);
        }
        guoVar.g();
        guoVar.j(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            guj gujVar = (guj) guoVar;
            gujVar.b(fq80Var.f9961a, 0, 2, false);
            fq80Var.M(0);
            if ((fq80Var.G() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                gujVar.b(fq80Var.f9961a, 0, 4, false);
                q8b q8bVar = this.d;
                q8bVar.m(14);
                int iG = q8bVar.g(13);
                if (iG <= 6) {
                    i4++;
                    gujVar.f = 0;
                    gujVar.f(i4, false);
                } else {
                    gujVar.f(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i4++;
                gujVar.f = 0;
                gujVar.f(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.e = huoVar;
        this.f41884a.e(huoVar, new zrs0(0, 1));
        huoVar.o();
    }

    @Override // a.fuo
    public final void release() {
    }
}
