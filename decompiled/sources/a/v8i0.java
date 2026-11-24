package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class v8i0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36985a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ v8i0(i4 i4Var, Function1 function1, byte b) {
        this.f36985a = b;
        this.b = i4Var;
        this.c = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f36985a;
        cl5 cl5Var = ukd.f35823a;
        i4 i4Var = this.b;
        boolean z = true;
        Function1 function1 = this.c;
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
                    e9i0 e9i0Var = (e9i0) i4Var.get(iIntValue);
                    fetVar.e0(543254230);
                    rqm rqmVar = new rqm((vui0) new tui0(e9i0Var.f7422a, null), (pui0) null, (pvi0) new nvi0(e9i0Var.b), (d4d) null, (tvi0) null, e9i0Var.c, false, (e900) null, 442);
                    boolean zG = fetVar.g(function1);
                    if ((((i & 112) ^ 48) <= 32 || !fetVar.e(iIntValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zG | z;
                    Object objP = fetVar.P();
                    if (z2 || objP == cl5Var) {
                        objP = new bp40(function1, iIntValue, (byte) 3);
                        fetVar.o0(objP);
                    }
                    obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 237);
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
                    ljq0 ljq0Var = (ljq0) i4Var.get(iIntValue3);
                    fetVar2.e0(1455837658);
                    rqm rqmVar2 = new rqm((vui0) new tui0(ljq0Var.f20165a, null), (pui0) null, (pvi0) new nvi0(ljq0Var.c), (d4d) null, (tvi0) null, ljq0Var.d, false, (e900) null, 442);
                    boolean zG2 = fetVar2.g(function1);
                    if ((((i2 & 112) ^ 48) <= 32 || !fetVar2.e(iIntValue3)) && (i2 & 48) != 32) {
                        z = false;
                    }
                    boolean z3 = zG2 | z;
                    Object objP2 = fetVar2.P();
                    if (z3 || objP2 == cl5Var) {
                        objP2 = new bp40(function1, iIntValue3, (byte) 4);
                        fetVar2.o0(objP2);
                    }
                    obc.q(null, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar2, 0, 237);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
