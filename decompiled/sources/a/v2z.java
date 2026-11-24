package a;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class v2z implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36710a;
    public final int b;
    public final fq80 c;
    public final q8b d;
    public ncs0 e;
    public String f;
    public androidx.media3.common.b g;
    public byte h;
    public int i;
    public int j;
    public short k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public v2z(String str, int i) {
        this.f36710a = str;
        this.b = i;
        fq80 fq80Var = new fq80(1024);
        this.c = fq80Var;
        byte[] bArr = fq80Var.f9961a;
        this.d = new q8b(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [int, short] */
    @Override // a.trn
    public final void a(fq80 fq80Var) throws kq80 {
        int iG;
        boolean zF;
        this.e.getClass();
        while (fq80Var.a() > 0) {
            byte b = this.h;
            if (b != 0) {
                if (b != 1) {
                    fq80 fq80Var2 = this.c;
                    q8b q8bVar = this.d;
                    if (b == 2) {
                        int iZ = ((this.k & (-225)) << 8) | fq80Var.z();
                        this.j = iZ;
                        if (iZ > fq80Var2.f9961a.length) {
                            fq80Var2.J(iZ);
                            byte[] bArr = fq80Var2.f9961a;
                            q8bVar.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = (byte) 3;
                    } else {
                        if (b != 3) {
                            v4i0.e();
                            return;
                        }
                        int iMin = Math.min(fq80Var.a(), this.j - this.i);
                        fq80Var.k(q8bVar.b, this.i, iMin);
                        int i = this.i + iMin;
                        this.i = i;
                        if (i == this.j) {
                            q8bVar.m(0);
                            if (q8bVar.f()) {
                                if (this.m) {
                                }
                                this.h = (byte) 0;
                            } else {
                                this.m = true;
                                int iG2 = q8bVar.g(1);
                                int iG3 = iG2 == 1 ? q8bVar.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw kq80.a(null, null);
                                }
                                if (iG2 == 1) {
                                    q8bVar.g((q8bVar.g(2) + 1) * 8);
                                }
                                if (!q8bVar.f()) {
                                    throw kq80.a(null, null);
                                }
                                this.o = q8bVar.g(6);
                                int iG4 = q8bVar.g(4);
                                int iG5 = q8bVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw kq80.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = q8bVar.e();
                                    int iB = q8bVar.b();
                                    cf60 cf60VarE = cy2.E(q8bVar, true);
                                    this.v = (String) cf60VarE.d;
                                    this.s = cf60VarE.b;
                                    this.u = cf60VarE.c;
                                    int iB2 = iB - q8bVar.b();
                                    q8bVar.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    q8bVar.h(bArr2, iB2);
                                    awq awqVar = new awq();
                                    awqVar.f1587a = this.f;
                                    awqVar.n = mg40.n("video/mp2t");
                                    awqVar.o = mg40.n("audio/mp4a-latm");
                                    awqVar.k = this.v;
                                    awqVar.I = this.u;
                                    awqVar.K = this.s;
                                    awqVar.r = Collections.singletonList(bArr2);
                                    awqVar.d = this.f36710a;
                                    awqVar.f = this.b;
                                    androidx.media3.common.b bVar = new androidx.media3.common.b(awqVar);
                                    if (!bVar.equals(this.g)) {
                                        this.g = bVar;
                                        this.t = 1024000000 / ((long) bVar.L);
                                        this.e.c(bVar);
                                    }
                                } else {
                                    int iG6 = q8bVar.g((q8bVar.g(2) + 1) * 8);
                                    int iB3 = q8bVar.b();
                                    cf60 cf60VarE2 = cy2.E(q8bVar, true);
                                    this.v = (String) cf60VarE2.d;
                                    this.s = cf60VarE2.b;
                                    this.u = cf60VarE2.c;
                                    q8bVar.o(iG6 - (iB3 - q8bVar.b()));
                                }
                                int iG7 = q8bVar.g(3);
                                this.p = iG7;
                                if (iG7 == 0) {
                                    q8bVar.o(8);
                                } else if (iG7 == 1) {
                                    q8bVar.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    q8bVar.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        v4i0.e();
                                        return;
                                    }
                                    q8bVar.o(1);
                                }
                                boolean zF2 = q8bVar.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = q8bVar.g((q8bVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = q8bVar.f();
                                            this.r = (this.r << 8) + ((long) q8bVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (q8bVar.f()) {
                                    q8bVar.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw kq80.a(null, null);
                            }
                            if (this.o != 0) {
                                throw kq80.a(null, null);
                            }
                            if (this.p != 0) {
                                throw kq80.a(null, null);
                            }
                            int i2 = 0;
                            do {
                                iG = q8bVar.g(8);
                                i2 += iG;
                            } while (iG == 255);
                            int iE2 = q8bVar.e();
                            if ((iE2 & 7) == 0) {
                                fq80Var2.M(iE2 >> 3);
                            } else {
                                q8bVar.h(fq80Var2.f9961a, i2 * 8);
                                fq80Var2.M(0);
                            }
                            this.e.a(i2, fq80Var2);
                            x0x.K(this.l != -9223372036854775807L);
                            this.e.b(this.l, 1, i2, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                q8bVar.o((int) this.r);
                            }
                            this.h = (byte) 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    ?? Z = fq80Var.z();
                    if ((Z & 224) == 224) {
                        this.k = Z;
                        this.h = (byte) 2;
                    } else if (Z != 86) {
                        this.h = (byte) 0;
                    }
                }
            } else if (fq80Var.z() == 86) {
                this.h = (byte) 1;
            }
        }
    }

    @Override // a.trn
    public final void c() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.e = huoVar.q(zrs0Var.d, 1);
        zrs0Var.b();
        this.f = zrs0Var.e;
    }

    @Override // a.trn
    public final void g(int i, long j) {
        this.l = j;
    }
}
