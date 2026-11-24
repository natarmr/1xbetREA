package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fda implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9349a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ fda(ArrayList arrayList, Function2 function2, byte b) {
        this.f9349a = b;
        this.b = arrayList;
        this.c = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.f9349a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function2 function2 = this.c;
        ArrayList arrayList = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    mdp0 mdp0Var = (mdp0) arrayList.get(iIntValue);
                    fetVar.e0(1978547973);
                    zcl zclVar = qmk.f28987a;
                    kcp0.a(o7k0.e(jm40Var, 24.0f), mdp0Var, this.c, fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    mdp0 mdp0Var2 = (mdp0) arrayList.get(iIntValue3);
                    fetVar2.e0(-1518904580);
                    zcl zclVar2 = qmk.f28987a;
                    kcp0.a(o7k0.e(jm40Var, 24.0f), mdp0Var2, this.c, fetVar2, 0, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    ah7 ah7Var = (ah7) arrayList.get(iIntValue5);
                    fetVar3.e0(-871796546);
                    boolean zG = fetVar3.g(function2);
                    if ((((i3 & 112) ^ 48) <= 32 || !fetVar3.e(iIntValue5)) && (i3 & 48) != 32) {
                        z = false;
                    }
                    boolean zI = zG | z | fetVar3.i(ah7Var);
                    Object objP = fetVar3.P();
                    if (zI || objP == cl5Var) {
                        objP = new i5(function2, iIntValue5, ah7Var);
                        fetVar3.o0(objP);
                    }
                    sac.t(null, ah7Var, (Function0) objP, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    mzc0 mzc0Var = (mzc0) arrayList.get(iIntValue7);
                    fetVar4.e0(1092656781);
                    Object objP2 = fetVar4.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(null);
                        fetVar4.o0(objP2);
                    }
                    pz40 pz40Var = (pz40) objP2;
                    Object objP3 = fetVar4.P();
                    if (objP3 == cl5Var) {
                        objP3 = dw9.j(fetVar4);
                    }
                    gy40 gy40Var = (gy40) objP3;
                    boolean zG2 = fetVar4.g(function2) | fetVar4.i(mzc0Var);
                    Object objP4 = fetVar4.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new qzc0(function2, mzc0Var, pz40Var, (byte) 1);
                        fetVar4.o0(objP4);
                    }
                    mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP4, 28);
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    y9q0 y9q0VarJ = g1t0.j();
                    d4d d4dVar = d4d.BACKGROUND;
                    Object objP5 = fetVar4.P();
                    if (objP5 == cl5Var) {
                        objP5 = new wta(pz40Var, (byte) 2);
                        fetVar4.o0(objP5);
                    }
                    n7x.h(mm40VarW, y9q0VarJ, d4dVar, mzc0Var, (Function1) objP5, fetVar4, 24960);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
