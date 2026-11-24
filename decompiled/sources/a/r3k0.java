package a;

/* JADX INFO: loaded from: classes.dex */
public final class r3k0 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29794a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public huo f;
    public ncs0 g;

    public r3k0(int i, int i2, String str) {
        this.f29794a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            v4i0.e();
            return 0;
        }
        ncs0 ncs0Var = this.g;
        ncs0Var.getClass();
        int iE = ncs0Var.e(guoVar, 1024, true);
        if (iE != -1) {
            this.d += iE;
            return 0;
        }
        this.e = (byte) 2;
        this.g.b(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = (byte) 1;
            this.d = 0;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        int i = this.b;
        int i2 = this.f29794a;
        x0x.K((i2 == -1 || i == -1) ? false : true);
        fq80 fq80Var = new fq80(i);
        ((guj) guoVar).b(fq80Var.f9961a, 0, i, false);
        return fq80Var.G() == i2;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f = huoVar;
        ncs0 ncs0VarQ = huoVar.q(1024, 4);
        this.g = ncs0VarQ;
        awq awqVar = new awq();
        String str = this.c;
        awqVar.n = mg40.n(str);
        awqVar.o = mg40.n(str);
        ohs0.w(awqVar, ncs0VarQ);
        this.f.o();
        this.f.f(new s3k0());
        this.e = (byte) 1;
    }

    @Override // a.fuo
    public final void release() {
    }
}
