package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hja implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13152a;
    public final /* synthetic */ ugd b;

    public /* synthetic */ hja(ugd ugdVar, byte b) {
        this.f13152a = b;
        this.b = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13152a;
        pcy pcyVar = e7z.u1;
        ugd ugdVar = this.b;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar, iX, shdVar);
                    }
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    vqd.t(6, ugdVar, y5d.f42040a, fetVar, true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f = gak0.b;
                    mm40 mm40VarO = o7k0.o(qbc.i(gak0.c + f + f, 40.0f), jm40Var);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iX2 = e3c.x(fetVar2);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarO);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    shd shdVar2 = gqw0.y;
                    if (fetVar2.S || !Intrinsics.d(fetVar2.P(), Integer.valueOf(iX2))) {
                        rw2.t(iX2, fetVar2, iX2, shdVar2);
                    }
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    twn.v(0, ugdVar, fetVar2, true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
