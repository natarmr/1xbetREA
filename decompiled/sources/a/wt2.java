package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wt2 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39718a;
    public final /* synthetic */ float b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ l7m0 g;

    public /* synthetic */ wt2(float f, l7m0 l7m0Var, long j, ugd ugdVar, l7m0 l7m0Var2, l7m0 l7m0Var3, byte b) {
        this.f39718a = b;
        this.b = f;
        this.c = l7m0Var;
        this.d = j;
        this.e = ugdVar;
        this.f = l7m0Var2;
        this.g = l7m0Var3;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f39718a;
        pcy pcyVar = e7z.u1;
        long j = this.d;
        l7m0 l7m0Var = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(k7n0.H(lgb.J(s5x0.N(o7k0.c, 0.0f, hh80Var.d() - f, 0.0f, 0.0f, 13), vgg0.c(((ycl) l7m0Var.getValue()).f42389a, ((ycl) l7m0Var.getValue()).f42389a, 0.0f, 0.0f, 12)), 1.0f), j, jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    this.e.O(hh80Var, this.f, this.g, fetVar, Integer.valueOf(iIntValue & 14));
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(hh80Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarQ2 = i120.Q(k7n0.H(lgb.J(s5x0.N(o7k0.c, 0.0f, hh80Var2.d() - f, 0.0f, 0.0f, 13), vgg0.c(((ycl) l7m0Var.getValue()).f42389a, ((ycl) l7m0Var.getValue()).f42389a, 0.0f, 0.0f, 12)), 1.0f), j, jd8.n);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    this.e.O(hh80Var2, this.f, this.g, fetVar2, Integer.valueOf((iIntValue2 & 14) | 432));
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
