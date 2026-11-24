package a;

/* JADX INFO: loaded from: classes.dex */
public final class lv40 implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f20701a;
    public final mv40 b;
    public final String c;
    public final int d;
    public final String e;
    public ncs0 f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public lv40(String str, int i, String str2) {
        fq80 fq80Var = new fq80(4);
        this.f20701a = fq80Var;
        fq80Var.f9961a[0] = -1;
        this.b = new mv40();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // a.trn
    public final void a(fq80 fq80Var) {
        this.f.getClass();
        while (fq80Var.a() > 0) {
            byte b = this.h;
            fq80 fq80Var2 = this.f20701a;
            if (b == 0) {
                byte[] bArr = fq80Var.f9961a;
                int i = fq80Var.b;
                int i2 = fq80Var.c;
                while (true) {
                    if (i >= i2) {
                        fq80Var.M(i2);
                        break;
                    }
                    byte b2 = bArr[i];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.k && (b2 & 224) == 224;
                    this.k = z;
                    if (z2) {
                        fq80Var.M(i + 1);
                        this.k = false;
                        fq80Var2.f9961a[1] = bArr[i];
                        this.i = 2;
                        this.h = (byte) 1;
                        break;
                    }
                    i++;
                }
            } else if (b == 1) {
                int iMin = Math.min(fq80Var.a(), 4 - this.i);
                fq80Var.k(fq80Var2.f9961a, this.i, iMin);
                int i3 = this.i + iMin;
                this.i = i3;
                if (i3 >= 4) {
                    fq80Var2.M(0);
                    int iM = fq80Var2.m();
                    mv40 mv40Var = this.b;
                    if (mv40Var.d(iM)) {
                        this.m = mv40Var.b;
                        if (!this.j) {
                            this.l = (((long) mv40Var.f) * 1000000) / ((long) mv40Var.c);
                            awq awqVar = new awq();
                            awqVar.f1587a = this.g;
                            awqVar.n = mg40.n(this.e);
                            awqVar.o = mg40.n((String) mv40Var.g);
                            awqVar.p = 4096;
                            awqVar.I = mv40Var.d;
                            awqVar.K = mv40Var.c;
                            awqVar.d = this.c;
                            awqVar.f = this.d;
                            this.f.c(new androidx.media3.common.b(awqVar));
                            this.j = true;
                        }
                        fq80Var2.M(0);
                        this.f.a(4, fq80Var2);
                        this.h = (byte) 2;
                    } else {
                        this.i = 0;
                        this.h = (byte) 1;
                    }
                }
            } else {
                if (b != 2) {
                    v4i0.e();
                    return;
                }
                int iMin2 = Math.min(fq80Var.a(), this.m - this.i);
                this.f.a(iMin2, fq80Var);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 >= this.m) {
                    x0x.K(this.n != -9223372036854775807L);
                    this.f.b(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = (byte) 0;
                }
            }
        }
    }

    @Override // a.trn
    public final void c() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.g = zrs0Var.e;
        zrs0Var.b();
        this.f = huoVar.q(zrs0Var.d, 1);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.n = j;
    }
}
