package a;

/* JADX INFO: loaded from: classes.dex */
public final class wuv implements fuo {
    public huo b;
    public guo c;
    public hac d;
    public iv40 e;
    public int g;
    public long h;
    public int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f39809a = new fq80(16);
    public long j = -1;
    public byte f = 0;

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        while (true) {
            byte b = this.f;
            if (b == 0) {
                int i = this.i;
                fq80 fq80Var = this.f39809a;
                if (i == 0) {
                    if (!guoVar.h(fq80Var.f9961a, 0, 8, true)) {
                        huo huoVar = this.b;
                        huoVar.getClass();
                        huoVar.o();
                        this.b.f(new ca5(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    fq80Var.M(0);
                    this.h = fq80Var.B();
                    this.g = fq80Var.m();
                }
                if (this.h == 1) {
                    guoVar.readFully(fq80Var.f9961a, 8, 8);
                    this.i += 8;
                    this.h = fq80Var.F();
                }
                if (this.g == 1836086884) {
                    long position = guoVar.getPosition();
                    this.j = position;
                    long j = this.i;
                    st40 st40Var = new st40(0L, position - j, -9223372036854775807L, position, this.h - j);
                    huo huoVar2 = this.b;
                    huoVar2.getClass();
                    ncs0 ncs0VarQ = huoVar2.q(1024, 4);
                    awq awqVar = new awq();
                    awqVar.n = mg40.n("image/heic");
                    awqVar.l = new ed40(st40Var);
                    ohs0.w(awqVar, ncs0VarQ);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            } else if (b == 1) {
                guoVar.m((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = (byte) 0;
            } else {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            return -1;
                        }
                        v4i0.e();
                        return 0;
                    }
                    if (this.d == null || guoVar != this.c) {
                        this.c = guoVar;
                        this.d = new hac(guoVar, this.j);
                    }
                    iv40 iv40Var = this.e;
                    iv40Var.getClass();
                    int iA = iv40Var.a(this.d, mtcVar);
                    if (iA == 1) {
                        mtcVar.f22363a += this.j;
                    }
                    return iA;
                }
                if (this.e == null) {
                    this.e = new iv40(jfn0.f16437a, 8);
                }
                hac hacVar = new hac(guoVar, this.j);
                this.d = hacVar;
                if (this.e.c(hacVar)) {
                    iv40 iv40Var2 = this.e;
                    long j2 = this.j;
                    huo huoVar3 = this.b;
                    huoVar3.getClass();
                    iv40Var2.e(new hac(j2, huoVar3, (byte) 4));
                    this.f = (byte) 3;
                } else {
                    huo huoVar4 = this.b;
                    huoVar4.getClass();
                    huoVar4.o();
                    this.b.f(new ca5(-9223372036854775807L));
                    this.f = (byte) 4;
                }
            }
        }
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                iv40 iv40Var = this.e;
                iv40Var.getClass();
                iv40Var.b(j, j2);
                return;
            }
            return;
        }
        this.f = (byte) 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        return d5c.U(guoVar, true);
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.b = huoVar;
    }

    @Override // a.fuo
    public final void release() {
        iv40 iv40Var = this.e;
        if (iv40Var != null) {
            iv40Var.getClass();
            this.e = null;
        }
    }
}
