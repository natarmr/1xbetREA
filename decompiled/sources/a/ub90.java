package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ub90 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35370a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ float d;

    public ub90(ArrayList arrayList, float f, Function2 function2) {
        this.f35370a = (byte) 2;
        this.b = arrayList;
        this.d = f;
        this.c = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        byte b = this.f35370a;
        float f = this.d;
        List list = this.b;
        Function2 function2 = this.c;
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
                    a2n a2nVar = (a2n) list.get(iIntValue);
                    fetVar.e0(-533447658);
                    ((ugd) function2).j(a2nVar, new ycl(f), fetVar, 0);
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
                    grh grhVar = (grh) list.get(iIntValue3);
                    fetVar2.e0(890803739);
                    ((ugd) function2).j(grhVar, new ycl(f), fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            default:
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
                    mzc0 mzc0Var = (mzc0) ((ArrayList) list).get(iIntValue5);
                    fetVar3.e0(-2043071722);
                    Object objP = fetVar3.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(null);
                        fetVar3.o0(objP);
                    }
                    pz40 pz40Var = (pz40) objP;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), f);
                    Object objP2 = fetVar3.P();
                    if (objP2 == cl5Var) {
                        objP2 = dw9.j(fetVar3);
                    }
                    gy40 gy40Var = (gy40) objP2;
                    boolean zG = fetVar3.g(function2) | fetVar3.i(mzc0Var);
                    Object objP3 = fetVar3.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new qzc0(function2, mzc0Var, pz40Var, (byte) 0);
                        fetVar3.o0(objP3);
                    }
                    mm40 mm40VarW = y860.W(mm40VarS, gy40Var, null, false, null, (Function0) objP3, 28);
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarU = g1t0.u();
                    d4d d4dVar = d4d.BACKGROUND_CONTENT;
                    Object objP4 = fetVar3.P();
                    if (objP4 == cl5Var) {
                        objP4 = new wta(pz40Var, (byte) 1);
                        fetVar3.o0(objP4);
                    }
                    n7x.h(mm40VarW, y9q0VarU, d4dVar, mzc0Var, (Function1) objP4, fetVar3, 24960);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ub90(List list, ugd ugdVar, float f, byte b) {
        this.f35370a = b;
        this.b = list;
        this.c = ugdVar;
        this.d = f;
    }
}
