package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e1h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7036a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ e1h0(Function2 function2, byte b) {
        this.f7036a = b;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7036a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iX = e3c.x(fetVar);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar, iX, shdVar);
                    }
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    h97.q(0, fetVar, function2, true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iX2 = e3c.x(fetVar2);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    shd shdVar2 = gqw0.y;
                    if (fetVar2.S || !Intrinsics.d(fetVar2.P(), Integer.valueOf(iX2))) {
                        rw2.t(iX2, fetVar2, iX2, shdVar2);
                    }
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    h97.q(0, fetVar2, function2, true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iX3 = e3c.x(fetVar3);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    shd shdVar3 = gqw0.y;
                    if (fetVar3.S || !Intrinsics.d(fetVar3.P(), Integer.valueOf(iX3))) {
                        rw2.t(iX3, fetVar3, iX3, shdVar3);
                    }
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    h97.q(0, fetVar3, function2, true);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                    int iX4 = e3c.x(fetVar4);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, jm40Var);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                    shd shdVar4 = gqw0.y;
                    if (fetVar4.S || !Intrinsics.d(fetVar4.P(), Integer.valueOf(iX4))) {
                        rw2.t(iX4, fetVar4, iX4, shdVar4);
                    }
                    jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                    h97.q(0, fetVar4, function2, true);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
