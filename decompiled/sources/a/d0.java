package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5247a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;

    public /* synthetic */ d0(ugd ugdVar, ugd ugdVar2, byte b) {
        this.f5247a = b;
        this.b = ugdVar;
        this.c = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5247a;
        zhg0 zhg0Var = zhg0.f44392a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        ugd ugdVar = this.c;
        ugd ugdVar2 = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                ay3.l(ugdVar2, ugdVar, fetVar, x8x.L(55));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(s5x0.J(jm40Var, 12.0f), 24.0f);
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
                    ugdVar2.j(zhg0Var, mm40VarN, fetVar, 6);
                    ugdVar.j(zhg0Var, mm40VarN, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(s5x0.J(jm40Var, 12.0f), 24.0f);
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
                    ugdVar2.j(zhg0Var, mm40VarN2, fetVar, 6);
                    ugdVar.j(zhg0Var, mm40VarN2, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                int iIntValue3 = num.intValue();
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(s5x0.J(jm40Var, 12.0f), 24.0f);
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
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
                    ugdVar2.j(zhg0Var, mm40VarN3, fetVar, 6);
                    ugdVar.j(zhg0Var, mm40VarN3, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                ahy.K(ugdVar2, ugdVar, fetVar, x8x.L(55));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ d0(ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f5247a = b;
        this.b = ugdVar;
        this.c = ugdVar2;
    }
}
