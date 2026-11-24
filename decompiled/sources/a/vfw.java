package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vfw implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37355a;
    public final /* synthetic */ pa00 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vfw(pa00 pa00Var, Function1 function1, byte b) {
        this.f37355a = b;
        this.b = pa00Var;
        this.c = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f37355a;
        Function1 function1 = this.c;
        pa00 pa00Var = this.b;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        int i = iIntValue2 & 48;
        switch (b) {
            case 0:
                if (i == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1431656768, new n0n(pa00Var, iIntValue, function1), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (i == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    kcx.f(((p6m0) pa00Var.c.get(iIntValue)).b, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
