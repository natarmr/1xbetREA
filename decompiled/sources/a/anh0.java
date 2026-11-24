package a;

/* JADX INFO: loaded from: classes.dex */
public final class anh0 implements ass0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmh0 f1153a;
    public final fq80 b = new fq80(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public anh0(zmh0 zmh0Var) {
        this.f1153a = zmh0Var;
    }

    @Override // a.ass0
    public final void a(int i, fq80 fq80Var) {
        int iZ;
        boolean z = (i & 1) != 0;
        if (z) {
            iZ = fq80Var.b + fq80Var.z();
        } else {
            iZ = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            fq80Var.M(iZ);
            this.d = 0;
        }
        while (fq80Var.a() > 0) {
            int i2 = this.d;
            fq80 fq80Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iZ2 = fq80Var.z();
                    fq80Var.M(fq80Var.b - 1);
                    if (iZ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(fq80Var.a(), 3 - this.d);
                fq80Var.k(fq80Var2.f9961a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    fq80Var2.M(0);
                    fq80Var2.L(3);
                    fq80Var2.N(1);
                    int iZ3 = fq80Var2.z();
                    int iZ4 = fq80Var2.z();
                    this.e = (iZ3 & 128) != 0;
                    int i4 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.c = i4;
                    byte[] bArr = fq80Var2.f9961a;
                    if (bArr.length < i4) {
                        fq80Var2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(fq80Var.a(), this.c - this.d);
                fq80Var.k(fq80Var2.f9961a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        fq80Var2.L(i6);
                    } else {
                        if (vtt0.m(0, fq80Var2.f9961a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        fq80Var2.L(this.c - 4);
                    }
                    fq80Var2.M(0);
                    this.f1153a.a(fq80Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // a.ass0
    public final void b(coq0 coq0Var, huo huoVar, zrs0 zrs0Var) {
        this.f1153a.b(coq0Var, huoVar, zrs0Var);
        this.f = true;
    }

    @Override // a.ass0
    public final void c() {
        this.f = true;
    }
}
