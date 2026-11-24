package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lfn implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19965a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public lfn(List list) {
        this.f19965a = (byte) 0;
        this.f = list;
        this.g = new ncs0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // a.trn
    public final void a(fq80 fq80Var) {
        boolean z;
        boolean z2;
        switch (this.f19965a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (fq80Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (fq80Var.z() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (fq80Var.a() == 0) {
                            z = false;
                        } else {
                            if (fq80Var.z() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = fq80Var.b;
                    int iA = fq80Var.a();
                    for (ncs0 ncs0Var : (ncs0[]) this.g) {
                        fq80Var.M(i);
                        ncs0Var.a(iA, fq80Var);
                    }
                    this.e += iA;
                }
                break;
            default:
                fq80 fq80Var2 = (fq80) this.f;
                ((ncs0) this.g).getClass();
                if (this.b) {
                    int iA2 = fq80Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(fq80Var.f9961a, fq80Var.b, fq80Var2.f9961a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            fq80Var2.M(0);
                            if (73 == fq80Var2.z() && 68 == fq80Var2.z() && 51 == fq80Var2.z()) {
                                fq80Var2.N(3);
                                this.d = fq80Var2.y() + 10;
                            } else {
                                f1t0.g0("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((ncs0) this.g).a(iMin2, fq80Var);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // a.trn
    public final void c() {
        switch (this.f19965a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        switch (this.f19965a) {
            case 0:
                ncs0[] ncs0VarArr = (ncs0[]) this.g;
                for (int i = 0; i < ncs0VarArr.length; i++) {
                    yrs0 yrs0Var = (yrs0) ((List) this.f).get(i);
                    zrs0Var.a();
                    zrs0Var.b();
                    ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 3);
                    awq awqVar = new awq();
                    zrs0Var.b();
                    awqVar.f1587a = zrs0Var.e;
                    awqVar.n = mg40.n("video/mp2t");
                    awqVar.o = mg40.n("application/dvbsubs");
                    awqVar.r = Collections.singletonList(yrs0Var.b);
                    awqVar.d = yrs0Var.f43137a;
                    ohs0.w(awqVar, ncs0VarQ);
                    ncs0VarArr[i] = ncs0VarQ;
                }
                break;
            default:
                zrs0Var.a();
                zrs0Var.b();
                ncs0 ncs0VarQ2 = huoVar.q(zrs0Var.d, 5);
                this.g = ncs0VarQ2;
                awq awqVar2 = new awq();
                zrs0Var.b();
                awqVar2.f1587a = zrs0Var.e;
                awqVar2.n = mg40.n("video/mp2t");
                awqVar2.o = mg40.n("application/id3");
                ohs0.w(awqVar2, ncs0VarQ2);
                break;
        }
    }

    @Override // a.trn
    public final void f() {
        int i;
        switch (this.f19965a) {
            case 0:
                if (this.b) {
                    x0x.K(this.c != -9223372036854775807L);
                    for (ncs0 ncs0Var : (ncs0[]) this.g) {
                        ncs0Var.b(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((ncs0) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    x0x.K(this.c != -9223372036854775807L);
                    ((ncs0) this.g).b(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // a.trn
    public final void g(int i, long j) {
        switch (this.f19965a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public lfn() {
        this.f19965a = (byte) 1;
        this.f = new fq80(10);
        this.c = -9223372036854775807L;
    }
}
