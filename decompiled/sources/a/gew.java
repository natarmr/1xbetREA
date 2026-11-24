package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gew implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11175a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ gew(a4x a4xVar, Function1 function1, byte b) {
        this.f11175a = b;
        this.b = a4xVar;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f11175a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    p6t0 p6t0Var = (p6t0) a4xVar.get(iIntValue);
                    if (p6t0Var == null) {
                        fetVar.e0(110379639);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof bew) {
                        fetVar.e0(108604052);
                        bew bewVar = (bew) p6t0Var;
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new dht(function1, (byte) 15);
                            fetVar.o0(objP);
                        }
                        wvb.B(bewVar, (Function1) objP, fetVar, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof t93) {
                        fetVar.e0(109007300);
                        t93 t93Var = (t93) p6t0Var;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new dht(function1, (byte) 16);
                            fetVar.o0(objP2);
                        }
                        Function1 function2 = (Function1) objP2;
                        boolean zG3 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new i8v(function1, (byte) 13);
                            fetVar.o0(objP3);
                        }
                        bsr0.c(t93Var, function2, (Function0) objP3, fetVar, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof yf60) {
                        fetVar.e0(109627920);
                        yf60 yf60Var = (yf60) p6t0Var;
                        boolean zG4 = fetVar.g(function1);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new i8v(function1, (byte) 14);
                            fetVar.o0(objP4);
                        }
                        ucx.s(yf60Var, (Function0) objP4, fetVar, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof idw) {
                        fetVar.e0(109859304);
                        idw idwVar = (idw) p6t0Var;
                        boolean zG5 = fetVar.g(function1);
                        Object objP5 = fetVar.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new dht(function1, (byte) 17);
                            fetVar.o0(objP5);
                        }
                        Function1 function3 = (Function1) objP5;
                        boolean zG6 = fetVar.g(function1);
                        Object objP6 = fetVar.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new dht(function1, (byte) 14);
                            fetVar.o0(objP6);
                        }
                        Function1 function4 = (Function1) objP6;
                        boolean zG7 = fetVar.g(function1) | fetVar.g(p6t0Var);
                        Object objP7 = fetVar.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new vwj(function1, p6t0Var, (byte) 4);
                            fetVar.o0(objP7);
                        }
                        m0x0.s(idwVar, function3, function4, (Function0) objP7, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(110379639);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    p6t0 p6t0Var2 = (p6t0) a4xVar.get(iIntValue3);
                    if (p6t0Var2 instanceof zog) {
                        fetVar2.e0(630709492);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                        zog zogVar = (zog) p6t0Var2;
                        m5m m5mVar = zogVar.b;
                        boolean zG8 = fetVar2.g(function1);
                        Object objP8 = fetVar2.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new rp30(function1, (byte) 14);
                            fetVar2.o0(objP8);
                        }
                        Function1 function5 = (Function1) objP8;
                        boolean zG9 = fetVar2.g(function1);
                        Object objP9 = fetVar2.P();
                        if (zG9 || objP9 == cl5Var) {
                            objP9 = new m040(function1, (byte) 22);
                            fetVar2.o0(objP9);
                        }
                        Function0 function0 = (Function0) objP9;
                        boolean zG10 = fetVar2.g(p6t0Var2) | fetVar2.g(function1);
                        Object objP10 = fetVar2.P();
                        if (zG10 || objP10 == cl5Var) {
                            objP10 = new mk40(function1, zogVar, (byte) 0);
                            fetVar2.o0(objP10);
                        }
                        Function0 function6 = (Function0) objP10;
                        boolean zG11 = fetVar2.g(function1);
                        Object objP11 = fetVar2.P();
                        if (zG11 || objP11 == cl5Var) {
                            objP11 = new rp30(function1, (byte) 13);
                            fetVar2.o0(objP11);
                        }
                        j5m.a(mm40VarN, m5mVar, null, function5, function0, function6, null, (Function1) objP11, null, fetVar2, 0, 324);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(631759338);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
