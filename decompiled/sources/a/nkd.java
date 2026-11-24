package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nkd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23676a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ ugd c;

    public /* synthetic */ nkd(Function2 function2, ugd ugdVar, byte b) {
        this.f23676a = b;
        this.b = function2;
        this.c = ugdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23676a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Unit unit = null;
        ugd ugdVar = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (function2 == null) {
                        fetVar.e0(1146975003);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1146975004);
                        mm40 mm40VarK0 = j120.k0(jm40Var, (vhv0) function2.invoke(fetVar, 0));
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
                        ugdVar.invoke(fetVar, 0);
                        fetVar.r(true);
                        fetVar.r(false);
                        unit = Unit.f46060a;
                    }
                    if (unit == null) {
                        fetVar.e0(452646455);
                        ugdVar.invoke(fetVar, 0);
                    } else {
                        fetVar.e0(452640968);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40Var = s6t0.f31722a;
                    dem0.e(s6t0.b(), s6t0.c(), u1c.M(730928003, new nkd(function2, ugdVar, (byte) 3), fetVar2), fetVar2, 384, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    dem0.e(s6t0.b(), s6t0.c(), u1c.M(-2082208241, new nkd(function2, ugdVar, null == true ? 1 : 0), fetVar3), fetVar3, 384, 0);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (function2 == null) {
                        fetVar4.e0(-408026841);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-408026840);
                        mm40 mm40VarK1 = j120.k0(jm40Var, (vhv0) function2.invoke(fetVar4, 0));
                        tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM2 = fetVar4.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarK1);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC2, gqw0.x);
                        jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar4);
                        jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                        ugdVar.invoke(fetVar4, 0);
                        fetVar4.r(true);
                        fetVar4.r(false);
                        unit = Unit.f46060a;
                    }
                    if (unit == null) {
                        fetVar4.e0(-1952819541);
                        ugdVar.invoke(fetVar4, 0);
                    } else {
                        fetVar4.e0(-1952825028);
                    }
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
