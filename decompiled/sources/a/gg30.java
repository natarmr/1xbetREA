package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11234a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ gg30(ugd ugdVar, ugd ugdVar2, ugd ugdVar3, byte b) {
        this.f11234a = b;
        this.b = ugdVar;
        this.c = ugdVar2;
        this.d = ugdVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11234a;
        zhg0 zhg0Var = zhg0.f44392a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        ugd ugdVar = this.d;
        ugd ugdVar2 = this.c;
        ugd ugdVar3 = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    ugdVar3.F(zhg0Var, fetVar, 6);
                    ugdVar2.F(zhg0Var, fetVar, 6);
                    h97.p(6, ugdVar, zhg0Var, fetVar, true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1, gqw0.v);
                    ugdVar3.F(zhg0Var, fetVar, 6);
                    ugdVar2.F(zhg0Var, fetVar, 6);
                    h97.p(6, ugdVar, zhg0Var, fetVar, true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 72.0f);
                    thg0 thg0VarA3 = shg0.a(new qw3(36.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC2, gqw0.v);
                    ugdVar3.invoke(fetVar, 0);
                    ugdVar2.invoke(fetVar, 0);
                    ugdVar.invoke(fetVar, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
