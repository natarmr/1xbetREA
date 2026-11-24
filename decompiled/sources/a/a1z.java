package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class a1z implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f98a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ cgk0 d;

    public /* synthetic */ a1z(byte b, a4x a4xVar, cgk0 cgk0Var, Function1 function1) {
        this.f98a = b;
        this.b = a4xVar;
        this.c = function1;
        this.d = cgk0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f98a;
        Function1 function1 = this.c;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        a4x a4xVar = this.b;
        cgk0 cgk0Var = this.d;
        byte b2 = 1;
        byte b3 = 0;
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
                    ezy ezyVar = (ezy) a4xVar.get(iIntValue);
                    fetVar.e0(396828056);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.a(0.0f);
                        fetVar.o0(objP);
                    }
                    agk0 agk0Var = (agk0) objP;
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = jgk0.b(new z0z(agk0Var, cgk0Var, (byte) 0));
                        fetVar.o0(objP2);
                    }
                    l7m0 l7m0Var = (l7m0) objP2;
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new x0z(agk0Var, (byte) 0);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarD0 = ro4.d0(jm40Var, (Function1) objP3);
                    Object objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = new y0z(l7m0Var, cgk0Var, agk0Var, b3);
                        fetVar.o0(objP4);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarD0, (Function1) objP4);
                    zcl zclVar = qmk.f28987a;
                    xww.e(s5x0.L(mm40VarT, 8.0f, 0.0f, 2), ezyVar, function1, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
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
                    fzy fzyVar = (fzy) a4xVar.get(iIntValue3);
                    fetVar2.e0(-145051067);
                    Object objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = androidx.compose.runtime.e.a(0.0f);
                        fetVar2.o0(objP5);
                    }
                    agk0 agk0Var2 = (agk0) objP5;
                    Object objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = jgk0.b(new z0z(agk0Var2, cgk0Var, (byte) 1));
                        fetVar2.o0(objP6);
                    }
                    l7m0 l7m0Var2 = (l7m0) objP6;
                    Object objP7 = fetVar2.P();
                    if (objP7 == cl5Var) {
                        objP7 = new x0z(agk0Var2, (byte) 1);
                        fetVar2.o0(objP7);
                    }
                    mm40 mm40VarD1 = ro4.d0(jm40Var, (Function1) objP7);
                    Object objP8 = fetVar2.P();
                    if (objP8 == cl5Var) {
                        objP8 = new y0z(l7m0Var2, cgk0Var, agk0Var2, b2);
                        fetVar2.o0(objP8);
                    }
                    mm40 mm40VarT2 = i4w0.T(mm40VarD1, (Function1) objP8);
                    zcl zclVar2 = qmk.f28987a;
                    qxw.d(s5x0.N(mm40VarT2, 0.0f, 0.0f, 0.0f, 2.0f, 7), fzyVar, function1, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
