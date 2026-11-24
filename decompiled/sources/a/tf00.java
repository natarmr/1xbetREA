package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33844a;
    public final /* synthetic */ sdm0 b;

    public /* synthetic */ tf00(sdm0 sdm0Var, byte b) {
        this.f33844a = b;
        this.b = sdm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33844a;
        jm40 jm40Var = jm40.b;
        sdm0 sdm0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yyw.h(sdm0Var.f32041a, fetVar, 0);
                    zcl zclVar = qmk.f28987a;
                    zq8.a(0, fetVar, o7k0.e(jm40Var, 12.0f));
                    yyw.y(sdm0Var.b, sdm0Var.c, 0, gqw0.i, 1, fetVar, 28032);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ucx.f(sdm0Var.f32041a, fetVar2, 0);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    ucx.v(sdm0Var.b, sdm0Var.c, 1, fetVar2, 384);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    hfm0.c(sdm0Var.f32041a, fetVar3, 0);
                    zcl zclVar3 = qmk.f28987a;
                    zq8.a(0, fetVar3, o7k0.e(jm40Var, 12.0f));
                    hfm0.l(sdm0Var.b, sdm0Var.c, 0, gqw0.i, 1, fetVar3, 28032);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
