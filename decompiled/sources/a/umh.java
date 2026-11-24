package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class umh implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35919a;
    public final /* synthetic */ List b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;

    public umh(List list, Function1 function1, float f) {
        this.f35919a = (byte) 4;
        this.b = list;
        this.d = function1;
        this.c = f;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.f35919a;
        byte b2 = 10;
        float f = this.c;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.d;
        List list = this.b;
        switch (b) {
            case 0:
                k8z k8zVar = (k8z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(k8zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    smh smhVar = (smh) list.get(iIntValue);
                    fetVar.e0(-684535091);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.u(jm40Var, 0.0f, 400.0f, 1), f * 0.9f);
                    boolean zG = fetVar.g(function1) | fetVar.g(smhVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new lhf(function1, smhVar, (byte) 10);
                        fetVar.o0(objP);
                    }
                    xkb.i(mm40VarS, smhVar, (Function0) objP, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                g9z g9zVar = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    yrc0 yrc0Var = (yrc0) list.get(iIntValue3);
                    fetVar2.e0(-1264836379);
                    zcl zclVar2 = qmk.f28987a;
                    float f2 = f + 12.0f;
                    mm40 mm40VarN = s5x0.N(jm40.b, f2, iIntValue3 != 0 ? 8.0f : 0.0f, f2, 0.0f, 8);
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new v6a0(function1, b2);
                        fetVar2.o0(objP2);
                    }
                    q5x.v(mm40VarN, yrc0Var, (Function1) objP2, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(k8zVar2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    cuc0 cuc0Var = (cuc0) list.get(iIntValue5);
                    fetVar3.e0(-1859818323);
                    nnw0.t(o7k0.s(jm40Var, f), cuc0Var, guc0.b, this.d, fetVar3, 384, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                k8z k8zVar3 = (k8z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(k8zVar3) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    ger0 ger0Var = (ger0) list.get(iIntValue7);
                    fetVar4.e0(1039524678);
                    mm40 mm40VarS2 = o7k0.s(jm40Var, f);
                    zrm zrmVar = ger0Var.b;
                    boolean zG3 = fetVar4.g(function1) | fetVar4.g(ger0Var);
                    Object objP3 = fetVar4.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new sue0(function1, ger0Var, (byte) 23);
                        fetVar4.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG4 = fetVar4.g(function1) | fetVar4.g(ger0Var);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new pwe0(function1, ger0Var, (byte) 28);
                        fetVar4.o0(objP4);
                    }
                    agc.r(mm40VarS2, zrmVar, function0, null, null, (Function1) objP4, null, fetVar4, 0, 88);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                g9zVar2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(g9zVar2) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    deo0 deo0Var = (deo0) list.get(iIntValue9);
                    fetVar5.e0(-689729261);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 80.0f);
                    boolean zG5 = fetVar5.g(deo0Var);
                    Object objP5 = fetVar5.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new qeo0(deo0Var, (byte) 0);
                        fetVar5.o0(objP5);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP5);
                    boolean zG6 = fetVar5.g(function1) | fetVar5.g(deo0Var);
                    Object objP6 = fetVar5.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new reo0(function1, deo0Var, (byte) 0);
                        fetVar5.o0(objP6);
                    }
                    x0x.m(s5x0.N(yyw.W(0, 1, fetVar5, mm40VarK, (Function0) objP6, false), this.c, 0.0f, 8.0f, 0.0f, 10), deo0Var, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ umh(List list, float f, Function1 function1, byte b) {
        this.f35919a = b;
        this.b = list;
        this.c = f;
        this.d = function1;
    }
}
