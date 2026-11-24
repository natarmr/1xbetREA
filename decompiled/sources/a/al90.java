package a;

/* JADX INFO: loaded from: classes.dex */
public final class al90 implements ass0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trn f1058a;
    public final q8b b = new q8b(new byte[10], 10);
    public int c = 0;
    public int d;
    public coq0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public al90(trn trnVar) {
        this.f1058a = trnVar;
    }

    @Override // a.ass0
    public final void a(int i, fq80 fq80Var) {
        long jB;
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        trn trnVar = this.f1058a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    f1t0.g0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        v4i0.e();
                        return;
                    }
                    if (this.j != -1) {
                        f1t0.g0("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    trnVar.f();
                }
            }
            if (fq80Var.c == 0) {
                trnVar.d();
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (fq80Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                q8b q8bVar = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(fq80Var, q8bVar.b, Math.min(10, this.i)) && d(fq80Var, null, this.i)) {
                            q8bVar.m(0);
                            if (this.f) {
                                q8bVar.o(4);
                                long jG = ((long) q8bVar.g(3)) << 30;
                                q8bVar.o(1);
                                long jG2 = ((long) (q8bVar.g(15) << 15)) | jG;
                                q8bVar.o(1);
                                long jG3 = jG2 | ((long) q8bVar.g(15));
                                q8bVar.o(1);
                                if (!this.h && this.g) {
                                    q8bVar.o(4);
                                    long jG4 = ((long) q8bVar.g(3)) << 30;
                                    q8bVar.o(1);
                                    long jG5 = jG4 | ((long) (q8bVar.g(15) << 15));
                                    q8bVar.o(1);
                                    long jG6 = jG5 | ((long) q8bVar.g(15));
                                    q8bVar.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                jB = this.e.b(jG3);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i6 |= this.k ? 4 : 0;
                            trnVar.g(i6, jB);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            v4i0.e();
                            return;
                        }
                        int iA = fq80Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            fq80Var.L(fq80Var.b + iA);
                        }
                        trnVar.a(fq80Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                trnVar.f();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(fq80Var, q8bVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                fq80Var.N(fq80Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // a.ass0
    public final void b(coq0 coq0Var, huo huoVar, zrs0 zrs0Var) {
        this.e = coq0Var;
        this.f1058a.e(huoVar, zrs0Var);
    }

    @Override // a.ass0
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f1058a.c();
    }

    public final boolean d(fq80 fq80Var, byte[] bArr, int i) {
        int iMin = Math.min(fq80Var.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            fq80Var.N(iMin);
        } else {
            fq80Var.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        q8b q8bVar = this.b;
        q8bVar.m(0);
        int iG = q8bVar.g(24);
        if (iG != 1) {
            rw2.u(iG, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        q8bVar.o(8);
        int iG2 = q8bVar.g(16);
        q8bVar.o(5);
        this.k = q8bVar.f();
        q8bVar.o(2);
        this.f = q8bVar.f();
        this.g = q8bVar.f();
        q8bVar.o(6);
        int iG3 = q8bVar.g(8);
        this.i = iG3;
        if (iG2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (iG2 - 3) - iG3;
        this.j = i;
        if (i < 0) {
            f1t0.g0("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
