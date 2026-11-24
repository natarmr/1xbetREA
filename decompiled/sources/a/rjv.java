package a;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class rjv implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3v f30616a;
    public String b;
    public ncs0 c;
    public qjv d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final y850 g = new y850(32);
    public final y850 h = new y850(33);
    public final y850 i = new y850(34);
    public final y850 j = new y850(39);
    public final y850 k = new y850(40);
    public long m = -9223372036854775807L;
    public final fq80 n = new fq80();

    public rjv(y3v y3vVar) {
        this.f30616a = y3vVar;
    }

    @Override // a.trn
    public final void a(fq80 fq80Var) {
        int i;
        this.c.getClass();
        String str = vtt0.f38024a;
        while (fq80Var.a() > 0) {
            int i2 = fq80Var.b;
            int i3 = fq80Var.c;
            byte[] bArr = fq80Var.f9961a;
            this.l += (long) fq80Var.a();
            this.c.a(fq80Var.a(), fq80Var);
            while (i2 < i3) {
                int iA0 = ntr.a0(bArr, i2, i3, this.f);
                if (iA0 == i3) {
                    h(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iA0 + 3] & 126) >> 1;
                if (iA0 <= 0 || bArr[iA0 - 1] != 0) {
                    i = 3;
                } else {
                    iA0--;
                    i = 4;
                }
                int i5 = iA0;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    h(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                i(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        fp fpVar = (fp) this.f30616a.d;
        qjv qjvVar = this.d;
        boolean z = this.e;
        if (qjvVar.j && qjvVar.g) {
            qjvVar.m = qjvVar.c;
            qjvVar.j = false;
        } else if (qjvVar.h || qjvVar.g) {
            if (z && qjvVar.i) {
                qjvVar.a(i + ((int) (j - qjvVar.b)));
            }
            qjvVar.k = qjvVar.b;
            qjvVar.l = qjvVar.e;
            qjvVar.m = qjvVar.c;
            qjvVar.i = true;
        }
        if (!this.e) {
            y850 y850Var = this.g;
            y850Var.b(i2);
            y850 y850Var2 = this.h;
            y850Var2.b(i2);
            y850 y850Var3 = this.i;
            y850Var3.b(i2);
            if (y850Var.c && y850Var2.c && y850Var3.c) {
                String str = this.b;
                int i3 = y850Var.e;
                byte[] bArr = new byte[y850Var2.e + i3 + y850Var3.e];
                System.arraycopy(y850Var.d, 0, bArr, 0, i3);
                System.arraycopy(y850Var2.d, 0, bArr, y850Var.e, y850Var2.e);
                System.arraycopy(y850Var3.d, 0, bArr, y850Var.e + y850Var2.e, y850Var3.e);
                c950 c950VarN0 = ntr.n0(y850Var2.d, 3, y850Var2.e, null);
                a950 a950Var = c950VarN0.b;
                String strA = a950Var != null ? jyc.a(a950Var.f461a, a950Var.b, a950Var.c, a950Var.d, a950Var.e, a950Var.f) : null;
                awq awqVar = new awq();
                awqVar.f1587a = str;
                awqVar.n = mg40.n("video/mp2t");
                awqVar.o = mg40.n("video/hevc");
                awqVar.k = strA;
                awqVar.v = c950VarN0.e;
                awqVar.w = c950VarN0.f;
                awqVar.y = c950VarN0.g;
                awqVar.z = c950VarN0.h;
                awqVar.G = new c4d(c950VarN0.k, c950VarN0.l, c950VarN0.m, null, c950VarN0.c + 8, c950VarN0.d + 8);
                awqVar.D = c950VarN0.i;
                awqVar.q = c950VarN0.j;
                awqVar.H = c950VarN0.f3946a + 1;
                awqVar.r = Collections.singletonList(bArr);
                androidx.media3.common.b bVar = new androidx.media3.common.b(awqVar);
                this.c.c(bVar);
                int i4 = bVar.r;
                x0x.K(i4 != -1);
                fpVar.O(i4);
                this.e = true;
            }
        }
        y850 y850Var4 = this.j;
        boolean zB = y850Var4.b(i2);
        fq80 fq80Var = this.n;
        if (zB) {
            fq80Var.K(y850Var4.d, ntr.w0(y850Var4.d, y850Var4.e));
            fq80Var.N(5);
            fpVar.a(j2, fq80Var);
        }
        y850 y850Var5 = this.k;
        if (y850Var5.b(i2)) {
            fq80Var.K(y850Var5.d, ntr.w0(y850Var5.d, y850Var5.e));
            fq80Var.N(5);
            fpVar.a(j2, fq80Var);
        }
    }

    @Override // a.trn
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        ntr.Y(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        ((fp) this.f30616a.d).v(0);
        qjv qjvVar = this.d;
        if (qjvVar != null) {
            qjvVar.f = false;
            qjvVar.g = false;
            qjvVar.h = false;
            qjvVar.i = false;
            qjvVar.j = false;
        }
    }

    @Override // a.trn
    public final void d() {
        this.c.getClass();
        String str = vtt0.f38024a;
        ((fp) this.f30616a.d).v(0);
        b(0, 0, this.l, this.m);
        i(0, 48, this.l, this.m);
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.b = zrs0Var.e;
        zrs0Var.b();
        ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 2);
        this.c = ncs0VarQ;
        this.d = new qjv(ncs0VarQ);
        this.f30616a.b(huoVar, zrs0Var);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.m = j;
    }

    public final void h(byte[] bArr, int i, int i2) {
        qjv qjvVar = this.d;
        if (qjvVar.f) {
            int i3 = qjvVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                qjvVar.g = (bArr[i4] & 128) != 0;
                qjvVar.f = false;
            } else {
                qjvVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void i(int i, int i2, long j, long j2) {
        qjv qjvVar = this.d;
        boolean z = this.e;
        qjvVar.g = false;
        qjvVar.h = false;
        qjvVar.e = j2;
        qjvVar.d = 0;
        qjvVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (qjvVar.i && !qjvVar.j) {
                if (z) {
                    qjvVar.a(i);
                }
                qjvVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                qjvVar.h = !qjvVar.j;
                qjvVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        qjvVar.c = z2;
        qjvVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
