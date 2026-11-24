package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class idr0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14599a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ idr0(ArrayList arrayList, float f, Function1 function1, byte b) {
        this.f14599a = b;
        this.b = arrayList;
        this.c = f;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f14599a;
        cl5 cl5Var = ukd.f35823a;
        float f = this.c;
        jm40 jm40Var = jm40.b;
        ArrayList arrayList = this.b;
        Function1 function1 = this.d;
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
                    qpo qpoVar = (qpo) arrayList.get(iIntValue);
                    fetVar.e0(-2031657782);
                    mm40 mm40VarE0 = o2e.e0(o7k0.s(jm40Var, f), "SPORT_EXPRESS_CARD");
                    npo npoVar = qpoVar.d;
                    String str = qpoVar.b;
                    a4x a4xVar = qpoVar.c;
                    chl0 chl0Var = qpoVar.e;
                    boolean zG = fetVar.g(function1) | fetVar.g(qpoVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new hdr0(function1, qpoVar, (byte) 0);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1) | fetVar.g(qpoVar);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new hdr0(function1, qpoVar, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    zdx.s(mm40VarE0, npoVar, str, a4xVar, chl0Var, function0, (Function0) objP2, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                k8z k8zVar = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(k8zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    upk0 upk0Var = (upk0) arrayList.get(iIntValue3);
                    fetVar2.e0(-1583455484);
                    mm40 mm40VarS = o7k0.s(jm40Var, f);
                    gy30 gy30Var = upk0Var.c;
                    boolean zG3 = fetVar2.g(function1) | fetVar2.g(upk0Var);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new ywm0(function1, upk0Var, (byte) 19);
                        fetVar2.o0(objP3);
                    }
                    jiq0.y(mm40VarS, gy30Var, (Function0) objP3, null, null, fetVar2, 0, 24);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
