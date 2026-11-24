package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bf60 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public huo f2488a;
    public orm0 b;
    public boolean c;

    /* JADX WARN: Code duplicated, block: B:70:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        byte[] bArr;
        this.f2488a.getClass();
        if (this.b == null) {
            if (!g(guoVar)) {
                throw kq80.a("Failed to determine bitstream type", null);
            }
            guoVar.g();
        }
        if (!this.c) {
            ncs0 ncs0VarQ = this.f2488a.q(0, 1);
            this.f2488a.o();
            orm0 orm0Var = this.b;
            orm0Var.c = this.f2488a;
            orm0Var.b = ncs0VarQ;
            orm0Var.d(true);
            this.c = true;
        }
        orm0 orm0Var2 = this.b;
        df60 df60Var = orm0Var2.f25740a;
        fq80 fq80Var = df60Var.b;
        orm0Var2.b.getClass();
        String str = vtt0.f38024a;
        byte b = orm0Var2.h;
        if (b == 0) {
            while (df60Var.b(guoVar)) {
                long position = guoVar.getPosition();
                long j = orm0Var2.f;
                orm0Var2.k = position - j;
                if (!orm0Var2.c(fq80Var, j, orm0Var2.j)) {
                    androidx.media3.common.b bVar = (androidx.media3.common.b) orm0Var2.j.b;
                    orm0Var2.i = bVar.L;
                    if (!orm0Var2.m) {
                        orm0Var2.b.c(bVar);
                        orm0Var2.m = true;
                    }
                    dr8 dr8Var = (dr8) orm0Var2.j.c;
                    if (dr8Var == null) {
                        if (guoVar.getLength() == -1) {
                            orm0Var2.d = new s2m0();
                        } else {
                            ef60 ef60Var = df60Var.f5984a;
                            orm0Var2.d = new iwj(orm0Var2, orm0Var2.f, guoVar.getLength(), ef60Var.d + ef60Var.e, ef60Var.b, (ef60Var.f7707a & 4) != 0);
                        }
                        orm0Var2.h = 2;
                        bArr = fq80Var.f9961a;
                        if (bArr.length == 65025) {
                            return 0;
                        }
                        fq80Var.K(Arrays.copyOf(bArr, Math.max(65025, fq80Var.c)), fq80Var.c);
                        return 0;
                    }
                    orm0Var2.d = dr8Var;
                    orm0Var2.h = 2;
                    bArr = fq80Var.f9961a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    fq80Var.K(Arrays.copyOf(bArr, Math.max(65025, fq80Var.c)), fq80Var.c);
                    return 0;
                }
                orm0Var2.f = guoVar.getPosition();
            }
            orm0Var2.h = (byte) 3;
            return -1;
        }
        if (b == 1) {
            guoVar.m((int) orm0Var2.f);
            orm0Var2.h = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b == 3) {
                return -1;
            }
            v4i0.e();
            return 0;
        }
        long jD = orm0Var2.d.d(guoVar);
        if (jD >= 0) {
            mtcVar.f22363a = jD;
            return 1;
        }
        if (jD < -1) {
            orm0Var2.a(-(jD + 2));
        }
        if (!orm0Var2.l) {
            fvh0 fvh0VarI = orm0Var2.d.i();
            fvh0VarI.getClass();
            orm0Var2.c.f(fvh0VarI);
            orm0Var2.b.f(fvh0VarI.g());
            orm0Var2.l = true;
        }
        if (orm0Var2.k <= 0 && !df60Var.b(guoVar)) {
            orm0Var2.h = (byte) 3;
            return -1;
        }
        orm0Var2.k = 0L;
        long jB = orm0Var2.b(fq80Var);
        if (jB >= 0) {
            long j2 = orm0Var2.g;
            if (j2 + jB >= orm0Var2.e) {
                long j3 = (j2 * 1000000) / ((long) orm0Var2.i);
                orm0Var2.b.a(fq80Var.c, fq80Var);
                orm0Var2.b.b(j3, 1, fq80Var.c, 0, null);
                orm0Var2.e = -1L;
            }
        }
        orm0Var2.g += jB;
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        orm0 orm0Var = this.b;
        if (orm0Var != null) {
            df60 df60Var = orm0Var.f25740a;
            ef60 ef60Var = df60Var.f5984a;
            ef60Var.f7707a = (short) 0;
            ef60Var.b = 0L;
            ef60Var.c = (short) 0;
            ef60Var.d = 0;
            ef60Var.e = 0;
            df60Var.b.J(0);
            df60Var.c = -1;
            df60Var.e = false;
            if (j == 0) {
                orm0Var.d(!orm0Var.l);
                return;
            }
            if (orm0Var.h != 0) {
                long j3 = (((long) orm0Var.i) * j2) / 1000000;
                orm0Var.e = j3;
                ff60 ff60Var = orm0Var.d;
                String str = vtt0.f38024a;
                ff60Var.j(j3);
                orm0Var.h = (byte) 2;
            }
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        try {
            return g(guoVar);
        } catch (kq80 unused) {
            return false;
        }
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f2488a = huoVar;
    }

    public final boolean g(guo guoVar) {
        boolean zS;
        ef60 ef60Var = new ef60();
        if (ef60Var.a(guoVar, true) && (ef60Var.f7707a & 2) == 2) {
            int iMin = Math.min(ef60Var.e, 8);
            fq80 fq80Var = new fq80(iMin);
            guoVar.n(fq80Var.f9961a, 0, iMin);
            fq80Var.M(0);
            if (fq80Var.a() >= 5 && fq80Var.z() == 127 && fq80Var.B() == 1179402563) {
                this.b = new ziq();
                return true;
            }
            fq80Var.M(0);
            try {
                zS = dnm0.s(1, fq80Var, true);
            } catch (kq80 unused) {
                zS = false;
            }
            if (zS) {
                this.b = new ivu0();
            } else {
                fq80Var.M(0);
                if (c780.e(fq80Var, c780.o)) {
                    this.b = new c780();
                }
            }
            return true;
        }
        return false;
    }

    @Override // a.fuo
    public final void release() {
    }
}
