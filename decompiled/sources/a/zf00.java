package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44279a;
    public final /* synthetic */ udm0 b;

    public /* synthetic */ zf00(udm0 udm0Var, byte b) {
        this.f44279a = b;
        this.b = udm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44279a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        udm0 udm0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    yyw.h(udm0Var.f35487a, fetVar, 0);
                    zcl zclVar = qmk.f28987a;
                    zq8.a(0, fetVar, o7k0.e(jm40Var, 12.0f));
                    yyw.y(udm0Var.b, udm0Var.c, 0, gqw0.i, 2, fetVar, 28032);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, x5dVarA2, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    ucx.f(udm0Var.f35487a, fetVar2, 0);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    ucx.v(udm0Var.b, udm0Var.c, 2, fetVar2, 384);
                    fetVar2.r(true);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode4 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM4 = fetVar3.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC3, gqw0.v);
                    hfm0.c(udm0Var.f35487a, fetVar3, 0);
                    zcl zclVar3 = qmk.f28987a;
                    zq8.a(0, fetVar3, o7k0.e(jm40Var, 12.0f));
                    hfm0.l(udm0Var.b, udm0Var.c, 0, gqw0.i, 2, fetVar3, 28032);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
